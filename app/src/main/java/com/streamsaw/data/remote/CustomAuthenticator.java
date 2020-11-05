package com.streamsaw.data.remote;

import androidx.annotation.Nullable;
import com.streamsaw.ui.manager.TokenManager;
import com.streamsaw.data.model.auth.Login;
import java.io.IOException;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import retrofit2.Call;

/**
 * * CustomAuthenticator to send an X-AUTH-TOKEN header on each request.
 *
 * @author Yobex.
 */


public class CustomAuthenticator implements Authenticator {

    private TokenManager tokenManager;
    private static CustomAuthenticator instance;

    private CustomAuthenticator(TokenManager tokenManager){
        this.tokenManager = tokenManager;
    }

    static synchronized CustomAuthenticator getInstance(TokenManager tokenManager){
        if(instance == null){
            instance = new CustomAuthenticator(tokenManager);
        }

        return instance;
    }


    @Nullable
    @Override
    public Request authenticate(Route route, Response response) throws IOException {

        if(responseCount(response) >= 3){
            return null;
        }

        Login token = tokenManager.getToken();

        ApiInterface service = ServiceGenerator.createService(ApiInterface.class);
        Call<Login> call = service.refresh(token.getRefresh() + "a");
        retrofit2.Response<Login> res = call.execute();

        if(res.isSuccessful()){
            Login newToken = res.body();
            tokenManager.saveToken(newToken);

            return response.request().newBuilder().header("Authorization", "Bearer " + res.body().getAccessToken()).build();
        }else{

            tokenManager.deleteToken();

           return null;
        }
    }

    private int responseCount(Response response) {
        int result = 1;
        while ((response = response.priorResponse()) != null) {
            result++;
        }
        return result;
    }
}
