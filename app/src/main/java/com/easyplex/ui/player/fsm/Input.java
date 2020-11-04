package com.easyplex.ui.player.fsm;


import com.easyplex.ui.player.fsm.concrete.AdPlayingState;
import com.easyplex.ui.player.fsm.concrete.FetchCuePointState;
import com.easyplex.ui.player.fsm.concrete.MakingAdCallState;
import com.easyplex.ui.player.fsm.concrete.MakingPrerollAdCallState;
import com.easyplex.ui.player.fsm.concrete.MoviePlayingState;
import com.easyplex.ui.player.fsm.concrete.ReceiveAdState;
import com.easyplex.ui.player.fsm.concrete.VastAdInteractionSandBoxState;
import com.easyplex.ui.player.fsm.concrete.VpaidState;



/**
 * Created by allensun on 7/27/17.
 */
public enum Input {

    /**
     * Only expect inputs of {@link FetchCuePointState}
     */
    HAS_PREROLL_AD,
    NO_PREROLL_AD,

    /**
     * Only expect inputs of {@link MakingPrerollAdCallState}
     */
    PRE_ROLL_AD_RECEIVED,

    /**
     * Only expect inputs of {@link MakingAdCallState}
     */
    AD_RECEIVED,
    EMPTY_AD,

    /**
     * Only expect inputs of {@link ReceiveAdState}
     */
    SHOW_ADS,

    /**
     * Only expect inputs of {@link AdPlayingState}
     */
    NEXT_AD,
    AD_CLICK,
    AD_FINISH,
    VPAID_MANIFEST,

    /**
     * Only expect inputs of {@link VpaidState}
     */
    VPAID_FINISH,

    /**
     * Only expect inputs of {@link VastAdInteractionSandBoxState}
     */
    BACK_TO_PLAYER_FROM_VAST_AD,

    /**
     * Only expect inputs of {@link MoviePlayingState}
     */
    MAKE_AD_CALL,
    MOVIE_FINISH,

    /**
     * ERROR INPUT
     */
    ERROR,

    INITIALIZE,
}
