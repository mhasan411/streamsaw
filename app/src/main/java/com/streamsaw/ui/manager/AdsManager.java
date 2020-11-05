package com.streamsaw.ui.manager;

import android.content.SharedPreferences;
import com.streamsaw.data.model.ads.Ads;
import static com.streamsaw.util.Constants.ADS_CLICKTHROUGHURL;
import static com.streamsaw.util.Constants.ADS_LINK;


/**
 * EasyPlex - Android Movie Portal App
 * @package     EasyPlex - Android Movie Portal App
 * @author      @Y0bEX
 * @copyright   Copyright (c) 2020 Y0bEX,
 * @license     http://codecanyon.net/wiki/support/legal-terms/licensing-terms/
 * @profile     https://codecanyon.net/user/yobex
 * @link        yobexd@gmail.com
 * @skype       yobexd@gmail.com
 **/



public class AdsManager {



    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    public AdsManager(SharedPreferences prefs){
        this.prefs = prefs;
        this.editor = prefs.edit();
    }

    public void saveSettings(Ads ads){
        editor.putString(ADS_LINK, ads.getLink()).commit();
        editor.putString(ADS_CLICKTHROUGHURL, ads.getClickThroughUrl()).commit();
        editor.apply();
    }

    public void deleteAds(){
        editor.remove(ADS_LINK).commit();
        editor.remove(ADS_CLICKTHROUGHURL).commit();
    }

    public Ads getAds(){
        Ads ads = new Ads();
        ads.setLink(prefs.getString(ADS_LINK, null));
        ads.setClickThroughUrl(prefs.getString(ADS_CLICKTHROUGHURL, null));
        return ads;
    }




}
