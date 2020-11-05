package com.streamsaw.ui.player.fsm.concrete;

import com.streamsaw.ui.player.fsm.BaseState;
import com.streamsaw.ui.player.fsm.Input;
import com.streamsaw.ui.player.fsm.State;
import com.streamsaw.ui.player.fsm.concrete.factory.StateFactory;

/**
 * Created by allensun on 7/31/17.
 */
public class FinishState extends BaseState {

    @Override
    public State transformToState(Input input, StateFactory factory) {
        return null;
    }
}
