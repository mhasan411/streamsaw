package com.easyplex.ui.player.fsm.callback;


import com.easyplex.data.model.ads.AdRetriever;
import com.easyplex.data.model.ads.CuePointsRetriever;

/**
 * Created by allensun on 8/2/17.
 */
public interface AdInterface {

    /**
     * make call to network server to call ad
     *
     * @param retriever information to provide when retrieving ad
     * @param callback  the callback to be notify
     */
    void fetchAd(AdRetriever retriever, RetrieveAdCallback callback);

    void fetchQuePoint(CuePointsRetriever retriever, CuePointCallBack callBack);

}
