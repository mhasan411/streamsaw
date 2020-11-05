package com.streamsaw;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.streamsaw.databinding.ActivityEasyplexPlayerBindingImpl;
import com.streamsaw.databinding.ActivityEditProfileBindingImpl;
import com.streamsaw.databinding.ActivityMainBindingImpl;
import com.streamsaw.databinding.ActivityPaymentDetailsBindingImpl;
import com.streamsaw.databinding.ActivitySettingBindingImpl;
import com.streamsaw.databinding.ActivitySplashBindingImpl;
import com.streamsaw.databinding.BrowseFragmentBindingImpl;
import com.streamsaw.databinding.DialogAboutNoDownloadBindingImpl;
import com.streamsaw.databinding.DialogAboutNoDownloadEpisodeBindingImpl;
import com.streamsaw.databinding.DialogAboutNoStreamBindingImpl;
import com.streamsaw.databinding.DialogAboutNoStreamEpisodeBindingImpl;
import com.streamsaw.databinding.DownloadActivityBindingImpl;
import com.streamsaw.databinding.FragmentFavouriteMoviesBindingImpl;
import com.streamsaw.databinding.FragmentHomeBindingImpl;
import com.streamsaw.databinding.FragmentSearchBindingImpl;
import com.streamsaw.databinding.FragmentStreamingBindingImpl;
import com.streamsaw.databinding.FragmentUpcomingBindingImpl;
import com.streamsaw.databinding.ItemAnimeBindingImpl;
import com.streamsaw.databinding.ItemAnimeDetailBindingImpl;
import com.streamsaw.databinding.ItemFavBindingImpl;
import com.streamsaw.databinding.ItemGenreBindingImpl;
import com.streamsaw.databinding.ItemHistoryBindingImpl;
import com.streamsaw.databinding.ItemMovieBindingImpl;
import com.streamsaw.databinding.ItemMovieDetailBindingImpl;
import com.streamsaw.databinding.ItemPlansBindingImpl;
import com.streamsaw.databinding.ItemRelatedsBindingImpl;
import com.streamsaw.databinding.ItemSearchBindingImpl;
import com.streamsaw.databinding.ItemShowStreamFavoriteBindingImpl;
import com.streamsaw.databinding.ItemShowStreamingBindingImpl;
import com.streamsaw.databinding.ItemStreamingGenreBindingImpl;
import com.streamsaw.databinding.ItemUpcomingBindingImpl;
import com.streamsaw.databinding.LayoutGenresBindingImpl;
import com.streamsaw.databinding.ListItemCastBindingImpl;
import com.streamsaw.databinding.ListItemDownloadBindingImpl;
import com.streamsaw.databinding.PaymentActivityBindingImpl;
import com.streamsaw.databinding.PaymentSuccessBindingImpl;
import com.streamsaw.databinding.RegistrationSucessBindingImpl;
import com.streamsaw.databinding.RowItemFeaturedBindingImpl;
import com.streamsaw.databinding.RowItemFeaturedStreamingBindingImpl;
import com.streamsaw.databinding.RowItemSeriesBindingImpl;
import com.streamsaw.databinding.RowPlayerEpisodesBindingImpl;
import com.streamsaw.databinding.RowPlayerLivetvBindingImpl;
import com.streamsaw.databinding.RowPlayerMoviesEndedBindingImpl;
import com.streamsaw.databinding.RowPlayerMoviesListBindingImpl;
import com.streamsaw.databinding.RowSeasonsBindingImpl;
import com.streamsaw.databinding.RowSubstitleBindingImpl;
import com.streamsaw.databinding.SerieDetailsBindingImpl;
import com.streamsaw.databinding.UiControllerViewBindingImpl;
import com.streamsaw.databinding.UpcomingTitlesOverviewBindingImpl;
import com.streamsaw.databinding.ViewNextMediaItemBindingImpl;
import com.streamsaw.databinding.ViewTubiRadioButtonBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYEASYPLEXPLAYER = 1;

  private static final int LAYOUT_ACTIVITYEDITPROFILE = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYPAYMENTDETAILS = 4;

  private static final int LAYOUT_ACTIVITYSETTING = 5;

  private static final int LAYOUT_ACTIVITYSPLASH = 6;

  private static final int LAYOUT_BROWSEFRAGMENT = 7;

  private static final int LAYOUT_DIALOGABOUTNODOWNLOAD = 8;

  private static final int LAYOUT_DIALOGABOUTNODOWNLOADEPISODE = 9;

  private static final int LAYOUT_DIALOGABOUTNOSTREAM = 10;

  private static final int LAYOUT_DIALOGABOUTNOSTREAMEPISODE = 11;

  private static final int LAYOUT_DOWNLOADACTIVITY = 12;

  private static final int LAYOUT_FRAGMENTFAVOURITEMOVIES = 13;

  private static final int LAYOUT_FRAGMENTHOME = 14;

  private static final int LAYOUT_FRAGMENTSEARCH = 15;

  private static final int LAYOUT_FRAGMENTSTREAMING = 16;

  private static final int LAYOUT_FRAGMENTUPCOMING = 17;

  private static final int LAYOUT_ITEMANIME = 18;

  private static final int LAYOUT_ITEMANIMEDETAIL = 19;

  private static final int LAYOUT_ITEMFAV = 20;

  private static final int LAYOUT_ITEMGENRE = 21;

  private static final int LAYOUT_ITEMHISTORY = 22;

  private static final int LAYOUT_ITEMMOVIE = 23;

  private static final int LAYOUT_ITEMMOVIEDETAIL = 24;

  private static final int LAYOUT_ITEMPLANS = 25;

  private static final int LAYOUT_ITEMRELATEDS = 26;

  private static final int LAYOUT_ITEMSEARCH = 27;

  private static final int LAYOUT_ITEMSHOWSTREAMFAVORITE = 28;

  private static final int LAYOUT_ITEMSHOWSTREAMING = 29;

  private static final int LAYOUT_ITEMSTREAMINGGENRE = 30;

  private static final int LAYOUT_ITEMUPCOMING = 31;

  private static final int LAYOUT_LAYOUTGENRES = 32;

  private static final int LAYOUT_LISTITEMCAST = 33;

  private static final int LAYOUT_LISTITEMDOWNLOAD = 34;

  private static final int LAYOUT_PAYMENTACTIVITY = 35;

  private static final int LAYOUT_PAYMENTSUCCESS = 36;

  private static final int LAYOUT_REGISTRATIONSUCESS = 37;

  private static final int LAYOUT_ROWITEMFEATURED = 38;

  private static final int LAYOUT_ROWITEMFEATUREDSTREAMING = 39;

  private static final int LAYOUT_ROWITEMSERIES = 40;

  private static final int LAYOUT_ROWPLAYEREPISODES = 41;

  private static final int LAYOUT_ROWPLAYERLIVETV = 42;

  private static final int LAYOUT_ROWPLAYERMOVIESENDED = 43;

  private static final int LAYOUT_ROWPLAYERMOVIESLIST = 44;

  private static final int LAYOUT_ROWSEASONS = 45;

  private static final int LAYOUT_ROWSUBSTITLE = 46;

  private static final int LAYOUT_SERIEDETAILS = 47;

  private static final int LAYOUT_UICONTROLLERVIEW = 48;

  private static final int LAYOUT_UPCOMINGTITLESOVERVIEW = 49;

  private static final int LAYOUT_VIEWNEXTMEDIAITEM = 50;

  private static final int LAYOUT_VIEWTUBIRADIOBUTTON = 51;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(51);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.activity_easyplex_player, LAYOUT_ACTIVITYEASYPLEXPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.activity_edit_profile, LAYOUT_ACTIVITYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.activity_payment_details, LAYOUT_ACTIVITYPAYMENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.activity_setting, LAYOUT_ACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.browse_fragment, LAYOUT_BROWSEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.dialog_about_no_download, LAYOUT_DIALOGABOUTNODOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.dialog_about_no_download_episode, LAYOUT_DIALOGABOUTNODOWNLOADEPISODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.dialog_about_no_stream, LAYOUT_DIALOGABOUTNOSTREAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.dialog_about_no_stream_episode, LAYOUT_DIALOGABOUTNOSTREAMEPISODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.download_activity, LAYOUT_DOWNLOADACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.fragment_favourite_movies, LAYOUT_FRAGMENTFAVOURITEMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.fragment_streaming, LAYOUT_FRAGMENTSTREAMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.fragment_upcoming, LAYOUT_FRAGMENTUPCOMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_anime, LAYOUT_ITEMANIME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_anime_detail, LAYOUT_ITEMANIMEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_fav, LAYOUT_ITEMFAV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_genre, LAYOUT_ITEMGENRE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_history, LAYOUT_ITEMHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_movie, LAYOUT_ITEMMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_movie_detail, LAYOUT_ITEMMOVIEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_plans, LAYOUT_ITEMPLANS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_relateds, LAYOUT_ITEMRELATEDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_search, LAYOUT_ITEMSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_show_stream_favorite, LAYOUT_ITEMSHOWSTREAMFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_show_streaming, LAYOUT_ITEMSHOWSTREAMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_streaming_genre, LAYOUT_ITEMSTREAMINGGENRE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.item_upcoming, LAYOUT_ITEMUPCOMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.layout_genres, LAYOUT_LAYOUTGENRES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.list_item_cast, LAYOUT_LISTITEMCAST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.list_item_download, LAYOUT_LISTITEMDOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.payment_activity, LAYOUT_PAYMENTACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.payment_success, LAYOUT_PAYMENTSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.registration_sucess, LAYOUT_REGISTRATIONSUCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_item_featured, LAYOUT_ROWITEMFEATURED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_item_featured_streaming, LAYOUT_ROWITEMFEATUREDSTREAMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_item_series, LAYOUT_ROWITEMSERIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_player_episodes, LAYOUT_ROWPLAYEREPISODES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_player_livetv, LAYOUT_ROWPLAYERLIVETV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_player_movies_ended, LAYOUT_ROWPLAYERMOVIESENDED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_player_movies_list, LAYOUT_ROWPLAYERMOVIESLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_seasons, LAYOUT_ROWSEASONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.row_substitle, LAYOUT_ROWSUBSTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.serie_details, LAYOUT_SERIEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.ui_controller_view, LAYOUT_UICONTROLLERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.upcoming_titles_overview, LAYOUT_UPCOMINGTITLESOVERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.view_next_media_item, LAYOUT_VIEWNEXTMEDIAITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.streamsaw.R.layout.view_tubi_radio_button, LAYOUT_VIEWTUBIRADIOBUTTON);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYEASYPLEXPLAYER: {
        if ("layout/activity_easyplex_player_0".equals(tag)) {
          return new ActivityEasyplexPlayerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_easyplex_player is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEDITPROFILE: {
        if ("layout/activity_edit_profile_0".equals(tag)) {
          return new ActivityEditProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_edit_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPAYMENTDETAILS: {
        if ("layout/activity_payment_details_0".equals(tag)) {
          return new ActivityPaymentDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_payment_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSETTING: {
        if ("layout/activity_setting_0".equals(tag)) {
          return new ActivitySettingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSPLASH: {
        if ("layout/activity_splash_0".equals(tag)) {
          return new ActivitySplashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
      }
      case  LAYOUT_BROWSEFRAGMENT: {
        if ("layout/browse_fragment_0".equals(tag)) {
          return new BrowseFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for browse_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTNODOWNLOAD: {
        if ("layout/dialog_about_no_download_0".equals(tag)) {
          return new DialogAboutNoDownloadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_no_download is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTNODOWNLOADEPISODE: {
        if ("layout/dialog_about_no_download_episode_0".equals(tag)) {
          return new DialogAboutNoDownloadEpisodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_no_download_episode is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTNOSTREAM: {
        if ("layout/dialog_about_no_stream_0".equals(tag)) {
          return new DialogAboutNoStreamBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_no_stream is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTNOSTREAMEPISODE: {
        if ("layout/dialog_about_no_stream_episode_0".equals(tag)) {
          return new DialogAboutNoStreamEpisodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_no_stream_episode is invalid. Received: " + tag);
      }
      case  LAYOUT_DOWNLOADACTIVITY: {
        if ("layout/download_activity_0".equals(tag)) {
          return new DownloadActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for download_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFAVOURITEMOVIES: {
        if ("layout/fragment_favourite_movies_0".equals(tag)) {
          return new FragmentFavouriteMoviesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_favourite_movies is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEARCH: {
        if ("layout/fragment_search_0".equals(tag)) {
          return new FragmentSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTREAMING: {
        if ("layout/fragment_streaming_0".equals(tag)) {
          return new FragmentStreamingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_streaming is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUPCOMING: {
        if ("layout/fragment_upcoming_0".equals(tag)) {
          return new FragmentUpcomingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_upcoming is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMANIME: {
        if ("layout/item_anime_0".equals(tag)) {
          return new ItemAnimeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_anime is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMANIMEDETAIL: {
        if ("layout/item_anime_detail_0".equals(tag)) {
          return new ItemAnimeDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_anime_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMFAV: {
        if ("layout/item_fav_0".equals(tag)) {
          return new ItemFavBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_fav is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMGENRE: {
        if ("layout/item_genre_0".equals(tag)) {
          return new ItemGenreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_genre is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHISTORY: {
        if ("layout/item_history_0".equals(tag)) {
          return new ItemHistoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_history is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMOVIE: {
        if ("layout/item_movie_0".equals(tag)) {
          return new ItemMovieBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_movie is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMOVIEDETAIL: {
        if ("layout/item_movie_detail_0".equals(tag)) {
          return new ItemMovieDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_movie_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPLANS: {
        if ("layout/item_plans_0".equals(tag)) {
          return new ItemPlansBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_plans is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMRELATEDS: {
        if ("layout/item_relateds_0".equals(tag)) {
          return new ItemRelatedsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_relateds is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSEARCH: {
        if ("layout/item_search_0".equals(tag)) {
          return new ItemSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSHOWSTREAMFAVORITE: {
        if ("layout/item_show_stream_favorite_0".equals(tag)) {
          return new ItemShowStreamFavoriteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_show_stream_favorite is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSHOWSTREAMING: {
        if ("layout/item_show_streaming_0".equals(tag)) {
          return new ItemShowStreamingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_show_streaming is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSTREAMINGGENRE: {
        if ("layout/item_streaming_genre_0".equals(tag)) {
          return new ItemStreamingGenreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_streaming_genre is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMUPCOMING: {
        if ("layout/item_upcoming_0".equals(tag)) {
          return new ItemUpcomingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_upcoming is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTGENRES: {
        if ("layout/layout_genres_0".equals(tag)) {
          return new LayoutGenresBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_genres is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMCAST: {
        if ("layout/list_item_cast_0".equals(tag)) {
          return new ListItemCastBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_cast is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMDOWNLOAD: {
        if ("layout/list_item_download_0".equals(tag)) {
          return new ListItemDownloadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_download is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYMENTACTIVITY: {
        if ("layout/payment_activity_0".equals(tag)) {
          return new PaymentActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for payment_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYMENTSUCCESS: {
        if ("layout/payment_success_0".equals(tag)) {
          return new PaymentSuccessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for payment_success is invalid. Received: " + tag);
      }
      case  LAYOUT_REGISTRATIONSUCESS: {
        if ("layout/registration_sucess_0".equals(tag)) {
          return new RegistrationSucessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for registration_sucess is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMFEATURED: {
        if ("layout/row_item_featured_0".equals(tag)) {
          return new RowItemFeaturedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_featured is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMFEATUREDSTREAMING: {
        if ("layout/row_item_featured_streaming_0".equals(tag)) {
          return new RowItemFeaturedStreamingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_featured_streaming is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMSERIES: {
        if ("layout/row_item_series_0".equals(tag)) {
          return new RowItemSeriesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_series is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLAYEREPISODES: {
        if ("layout/row_player_episodes_0".equals(tag)) {
          return new RowPlayerEpisodesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_player_episodes is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLAYERLIVETV: {
        if ("layout/row_player_livetv_0".equals(tag)) {
          return new RowPlayerLivetvBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_player_livetv is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLAYERMOVIESENDED: {
        if ("layout/row_player_movies_ended_0".equals(tag)) {
          return new RowPlayerMoviesEndedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_player_movies_ended is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLAYERMOVIESLIST: {
        if ("layout/row_player_movies_list_0".equals(tag)) {
          return new RowPlayerMoviesListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_player_movies_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWSEASONS: {
        if ("layout/row_seasons_0".equals(tag)) {
          return new RowSeasonsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_seasons is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWSUBSTITLE: {
        if ("layout/row_substitle_0".equals(tag)) {
          return new RowSubstitleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_substitle is invalid. Received: " + tag);
      }
      case  LAYOUT_SERIEDETAILS: {
        if ("layout/serie_details_0".equals(tag)) {
          return new SerieDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for serie_details is invalid. Received: " + tag);
      }
      case  LAYOUT_UICONTROLLERVIEW: {
        if ("layout/ui_controller_view_0".equals(tag)) {
          return new UiControllerViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ui_controller_view is invalid. Received: " + tag);
      }
      case  LAYOUT_UPCOMINGTITLESOVERVIEW: {
        if ("layout/upcoming_titles_overview_0".equals(tag)) {
          return new UpcomingTitlesOverviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upcoming_titles_overview is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWNEXTMEDIAITEM: {
        if ("layout/view_next_media_item_0".equals(tag)) {
          return new ViewNextMediaItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_next_media_item is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_VIEWTUBIRADIOBUTTON: {
        if ("layout/view_tubi_radio_button_0".equals(tag)) {
          return new ViewTubiRadioButtonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_tubi_radio_button is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.tubitv.ui.vaud_text_view.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "controller");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(51);

    static {
      sKeys.put("layout/activity_easyplex_player_0", com.streamsaw.R.layout.activity_easyplex_player);
      sKeys.put("layout/activity_edit_profile_0", com.streamsaw.R.layout.activity_edit_profile);
      sKeys.put("layout/activity_main_0", com.streamsaw.R.layout.activity_main);
      sKeys.put("layout/activity_payment_details_0", com.streamsaw.R.layout.activity_payment_details);
      sKeys.put("layout/activity_setting_0", com.streamsaw.R.layout.activity_setting);
      sKeys.put("layout/activity_splash_0", com.streamsaw.R.layout.activity_splash);
      sKeys.put("layout/browse_fragment_0", com.streamsaw.R.layout.browse_fragment);
      sKeys.put("layout/dialog_about_no_download_0", com.streamsaw.R.layout.dialog_about_no_download);
      sKeys.put("layout/dialog_about_no_download_episode_0", com.streamsaw.R.layout.dialog_about_no_download_episode);
      sKeys.put("layout/dialog_about_no_stream_0", com.streamsaw.R.layout.dialog_about_no_stream);
      sKeys.put("layout/dialog_about_no_stream_episode_0", com.streamsaw.R.layout.dialog_about_no_stream_episode);
      sKeys.put("layout/download_activity_0", com.streamsaw.R.layout.download_activity);
      sKeys.put("layout/fragment_favourite_movies_0", com.streamsaw.R.layout.fragment_favourite_movies);
      sKeys.put("layout/fragment_home_0", com.streamsaw.R.layout.fragment_home);
      sKeys.put("layout/fragment_search_0", com.streamsaw.R.layout.fragment_search);
      sKeys.put("layout/fragment_streaming_0", com.streamsaw.R.layout.fragment_streaming);
      sKeys.put("layout/fragment_upcoming_0", com.streamsaw.R.layout.fragment_upcoming);
      sKeys.put("layout/item_anime_0", com.streamsaw.R.layout.item_anime);
      sKeys.put("layout/item_anime_detail_0", com.streamsaw.R.layout.item_anime_detail);
      sKeys.put("layout/item_fav_0", com.streamsaw.R.layout.item_fav);
      sKeys.put("layout/item_genre_0", com.streamsaw.R.layout.item_genre);
      sKeys.put("layout/item_history_0", com.streamsaw.R.layout.item_history);
      sKeys.put("layout/item_movie_0", com.streamsaw.R.layout.item_movie);
      sKeys.put("layout/item_movie_detail_0", com.streamsaw.R.layout.item_movie_detail);
      sKeys.put("layout/item_plans_0", com.streamsaw.R.layout.item_plans);
      sKeys.put("layout/item_relateds_0", com.streamsaw.R.layout.item_relateds);
      sKeys.put("layout/item_search_0", com.streamsaw.R.layout.item_search);
      sKeys.put("layout/item_show_stream_favorite_0", com.streamsaw.R.layout.item_show_stream_favorite);
      sKeys.put("layout/item_show_streaming_0", com.streamsaw.R.layout.item_show_streaming);
      sKeys.put("layout/item_streaming_genre_0", com.streamsaw.R.layout.item_streaming_genre);
      sKeys.put("layout/item_upcoming_0", com.streamsaw.R.layout.item_upcoming);
      sKeys.put("layout/layout_genres_0", com.streamsaw.R.layout.layout_genres);
      sKeys.put("layout/list_item_cast_0", com.streamsaw.R.layout.list_item_cast);
      sKeys.put("layout/list_item_download_0", com.streamsaw.R.layout.list_item_download);
      sKeys.put("layout/payment_activity_0", com.streamsaw.R.layout.payment_activity);
      sKeys.put("layout/payment_success_0", com.streamsaw.R.layout.payment_success);
      sKeys.put("layout/registration_sucess_0", com.streamsaw.R.layout.registration_sucess);
      sKeys.put("layout/row_item_featured_0", com.streamsaw.R.layout.row_item_featured);
      sKeys.put("layout/row_item_featured_streaming_0", com.streamsaw.R.layout.row_item_featured_streaming);
      sKeys.put("layout/row_item_series_0", com.streamsaw.R.layout.row_item_series);
      sKeys.put("layout/row_player_episodes_0", com.streamsaw.R.layout.row_player_episodes);
      sKeys.put("layout/row_player_livetv_0", com.streamsaw.R.layout.row_player_livetv);
      sKeys.put("layout/row_player_movies_ended_0", com.streamsaw.R.layout.row_player_movies_ended);
      sKeys.put("layout/row_player_movies_list_0", com.streamsaw.R.layout.row_player_movies_list);
      sKeys.put("layout/row_seasons_0", com.streamsaw.R.layout.row_seasons);
      sKeys.put("layout/row_substitle_0", com.streamsaw.R.layout.row_substitle);
      sKeys.put("layout/serie_details_0", com.streamsaw.R.layout.serie_details);
      sKeys.put("layout/ui_controller_view_0", com.streamsaw.R.layout.ui_controller_view);
      sKeys.put("layout/upcoming_titles_overview_0", com.streamsaw.R.layout.upcoming_titles_overview);
      sKeys.put("layout/view_next_media_item_0", com.streamsaw.R.layout.view_next_media_item);
      sKeys.put("layout/view_tubi_radio_button_0", com.streamsaw.R.layout.view_tubi_radio_button);
    }
  }
}
