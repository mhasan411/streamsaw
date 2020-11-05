package com.streamsaw.ui.player.fsm.concrete;

import com.streamsaw.ui.player.fsm.BaseState;
import com.streamsaw.ui.player.fsm.Input;
import com.streamsaw.ui.player.fsm.State;
import com.streamsaw.ui.player.fsm.concrete.factory.StateFactory;

/**
 * Created by allensun on 7/31/17.
 */
public class VastAdInteractionSandBoxState extends BaseState {

    @Override
    public State transformToState(Input input, StateFactory factory) {

        if (input == Input.BACK_TO_PLAYER_FROM_VAST_AD) {
            return factory.createState(AdPlayingState.class);
        }
        return null;
    }
}
