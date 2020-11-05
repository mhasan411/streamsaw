package com.streamsaw.ui.player.fsm.concrete;

import android.view.View;
import android.webkit.WebView;

import androidx.annotation.NonNull;

import com.streamsaw.util.Constants;
import com.google.android.exoplayer2.ExoPlayer;
import com.streamsaw.ui.player.controller.PlayerAdLogicController;
import com.streamsaw.ui.player.controller.PlayerUIController;
import com.streamsaw.ui.player.fsm.BaseState;
import com.streamsaw.ui.player.fsm.Input;
import com.streamsaw.ui.player.fsm.State;
import com.streamsaw.ui.player.fsm.concrete.factory.StateFactory;
import com.streamsaw.ui.player.fsm.state_machine.FsmPlayer;
import com.streamsaw.data.model.ads.AdMediaModel;
import com.streamsaw.data.model.media.MediaModel;
import com.streamsaw.ui.player.interfaces.VpaidClient;
import com.streamsaw.ui.player.utilities.ExoPlayerLogger;
import com.streamsaw.ui.player.views.TubiExoPlayerView;

/**
 * Created by allensun on 8/1/17.
 */
public class VpaidState extends BaseState {

    @Override
    public State transformToState(Input input, StateFactory factory) {

        switch (input) {
            case VPAID_FINISH:
                return factory.createState(MoviePlayingState.class);

            case VPAID_MANIFEST:
                return factory.createState(VpaidState.class);

            case NEXT_AD:
                return factory.createState(AdPlayingState.class);

            default:
        }
        return null;
    }

    // API level lower that certain, will disable vpaid.
    @Override
    public void performWorkAndUpdatePlayerUI(@NonNull FsmPlayer fsmPlayer) {
        super.performWorkAndUpdatePlayerUI(fsmPlayer);

        if (isNull(fsmPlayer)) {
            return;
        }

        pausePlayerAndSHowVpaid(controller, componentController, fsmPlayer, adMedia);
    }

    private void pausePlayerAndSHowVpaid(PlayerUIController controller, PlayerAdLogicController componentController,
                                         FsmPlayer fsmPlayer, AdMediaModel adMedia) {

        ExoPlayer moviePlayer = controller.getContentPlayer();

        if (moviePlayer != null && moviePlayer.getPlayWhenReady()) {
            moviePlayer.setPlayWhenReady(false);
        }

        ExoPlayer adPlayer = controller.getAdPlayer();
        if (adPlayer != null && adPlayer.getPlayWhenReady()) {
            adPlayer.setPlayWhenReady(false);
        }

        VpaidClient client = componentController.getVpaidClient();

        if (client != null) {

            MediaModel ad = adMedia.nextAD();

            if (ad == null) {
                ExoPlayerLogger.w(Constants.FSMPLAYER_TESTING, "Vpaid ad is null");
                return;
            }

            client.init(ad);

            controller.getExoPlayerView().setVisibility(View.INVISIBLE);

            WebView vpaidWebView = controller.getVpaidWebView();

            vpaidWebView.setVisibility(View.VISIBLE);
            vpaidWebView.bringToFront();
            vpaidWebView.invalidate();

            vpaidWebView.addJavascriptInterface(client, "TubiNativeJSInterface");
            vpaidWebView.loadUrl(fsmPlayer.getvpaidEndPoint());

            //hide the subtitle view when vpaid is playing
            ((TubiExoPlayerView) controller.getExoPlayerView()).getSubtitleView().setVisibility(View.INVISIBLE);
        } else {
            ExoPlayerLogger.w(Constants.FSMPLAYER_TESTING, "VpaidClient is null");
        }

    }

}
