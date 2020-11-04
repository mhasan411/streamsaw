package com.easyplex.ui.player.fsm.concrete;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.easyplex.ui.player.fsm.BaseState;
import com.easyplex.ui.player.fsm.Input;
import com.easyplex.ui.player.fsm.State;
import com.easyplex.ui.player.fsm.callback.AdInterface;
import com.easyplex.ui.player.fsm.callback.CuePointCallBack;
import com.easyplex.ui.player.fsm.concrete.factory.StateFactory;
import com.easyplex.ui.player.fsm.state_machine.FsmPlayer;
import com.easyplex.ui.player.fsm.state_machine.FsmPlayerImperial;
import com.easyplex.data.model.ads.CuePointsRetriever;
import com.easyplex.ui.player.utilities.ExoPlayerLogger;

import static com.easyplex.util.Constants.FSMPLAYER_TESTING;


/**
 * Created by allensun on 8/17/17.
 * on Tubitv.com, allengotstuff@gmail.com
 */
public class FetchCuePointState extends BaseState {

    @Nullable
    @Override
    public State transformToState(@NonNull Input input, @NonNull StateFactory factory) {

        if (input == Input.HAS_PREROLL_AD) {
            return factory.createState(MakingPrerollAdCallState.class);
        } else if (input == Input.NO_PREROLL_AD) {
            return factory.createState(MoviePlayingState.class);
        }

        return null;
    }

    @Override
    public void performWorkAndUpdatePlayerUI(@NonNull FsmPlayer fsmPlayer) {
        super.performWorkAndUpdatePlayerUI(fsmPlayer);

        if (isNull(fsmPlayer)) {
            return;
        }
        //does nothing with the UI.
        fetchCuePointCall(fsmPlayer.getAdServerInterface(), fsmPlayer.getCuePointsRetriever(),
                (FsmPlayerImperial) fsmPlayer);
    }

    private void fetchCuePointCall(AdInterface adInterface, CuePointsRetriever retriever, CuePointCallBack callBack) {
        if (adInterface != null && retriever != null && callBack != null) {
            adInterface.fetchQuePoint(retriever, callBack);
        } else {
            ExoPlayerLogger.e(FSMPLAYER_TESTING, "fetch Ad fail, adInterface or CuePointsRetriever is empty");
        }
    }

}
