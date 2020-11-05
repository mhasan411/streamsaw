package com.streamsaw.data.local.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.streamsaw.data.local.converters.GenreConverter;
import com.streamsaw.data.local.converters.MediaStreamConverter;
import com.streamsaw.data.local.converters.MediaSubstitlesConverter;
import com.streamsaw.data.local.converters.SaisonConverter;
import com.streamsaw.data.local.entity.Download;
import com.streamsaw.data.local.entity.Media;
import com.streamsaw.data.model.genres.Genre;
import com.streamsaw.data.model.serie.Season;
import com.streamsaw.data.model.stream.MediaStream;
import com.streamsaw.data.model.substitles.MediaSubstitle;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteDao_Impl implements FavoriteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Media> __insertionAdapterOfMedia;

  private final EntityInsertionAdapter<Download> __insertionAdapterOfDownload;

  private final EntityDeletionOrUpdateAdapter<Media> __deletionAdapterOfMedia;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMediaFromFavorite;

  public FavoriteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMedia = new EntityInsertionAdapter<Media>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite` (`id`,`tmdbId`,`title`,`name`,`overview`,`posterPath`,`backdropPath`,`previewPath`,`voteAverage`,`voteCount`,`live`,`premuim`,`vip`,`link`,`resumeWindow`,`resumePosition`,`isAnime`,`popularity`,`views`,`status`,`substitles`,`seasons`,`runtime`,`releaseDate`,`genre`,`firstAirDate`,`trailerId`,`createdAt`,`updatedAt`,`hd`,`videos`,`genres`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Media value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTmdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTmdbId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBackdropPath());
        }
        if (value.getPreviewPath() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPreviewPath());
        }
        stmt.bindDouble(9, value.getVoteAverage());
        if (value.getVoteCount() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getVoteCount());
        }
        stmt.bindLong(11, value.getLive());
        stmt.bindLong(12, value.getPremuim());
        stmt.bindLong(13, value.getVip());
        if (value.getLink() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getLink());
        }
        stmt.bindLong(15, value.getResumeWindow());
        stmt.bindLong(16, value.getResumePosition());
        stmt.bindLong(17, value.getIsAnime());
        if (value.getPopularity() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getPopularity());
        }
        if (value.getViews() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindLong(19, value.getViews());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getStatus());
        }
        final String _tmp;
        _tmp = MediaSubstitlesConverter.convertListToString(value.getSubstitles());
        if (_tmp == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = SaisonConverter.convertListToString(value.getSeasons());
        if (_tmp_1 == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, _tmp_1);
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getRuntime());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getReleaseDate());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getGenre());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getFirstAirDate());
        }
        if (value.getTrailerId() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getTrailerId());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getUpdatedAt());
        }
        if (value.getHd() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindLong(30, value.getHd());
        }
        final String _tmp_2;
        _tmp_2 = MediaStreamConverter.convertListToString(value.getVideos());
        if (_tmp_2 == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = GenreConverter.fromArrayList(value.getGenres());
        if (_tmp_3 == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, _tmp_3);
        }
      }
    };
    this.__insertionAdapterOfDownload = new EntityInsertionAdapter<Download>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `download` (`download_id`,`tmdbId_download`,`title_download`,`backdropPath_download`,`link_download`,`id`,`tmdbId`,`title`,`name`,`overview`,`posterPath`,`backdropPath`,`previewPath`,`voteAverage`,`voteCount`,`live`,`premuim`,`vip`,`link`,`resumeWindow`,`resumePosition`,`isAnime`,`popularity`,`views`,`status`,`substitles`,`seasons`,`runtime`,`releaseDate`,`genre`,`firstAirDate`,`trailerId`,`createdAt`,`updatedAt`,`hd`,`videos`,`genres`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Download value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTmdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTmdbId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackdropPath());
        }
        if (value.getLink() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLink());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getId());
        }
        if (value.getTmdbId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTmdbId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTitle());
        }
        if (value.getName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getName());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getBackdropPath());
        }
        if (value.getPreviewPath() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getPreviewPath());
        }
        stmt.bindDouble(14, value.getVoteAverage());
        if (value.getVoteCount() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getVoteCount());
        }
        stmt.bindLong(16, value.getLive());
        stmt.bindLong(17, value.getPremuim());
        stmt.bindLong(18, value.getVip());
        if (value.getLink() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getLink());
        }
        stmt.bindLong(20, value.getResumeWindow());
        stmt.bindLong(21, value.getResumePosition());
        stmt.bindLong(22, value.getIsAnime());
        if (value.getPopularity() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getPopularity());
        }
        if (value.getViews() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindLong(24, value.getViews());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getStatus());
        }
        final String _tmp;
        _tmp = MediaSubstitlesConverter.convertListToString(value.getSubstitles());
        if (_tmp == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = SaisonConverter.convertListToString(value.getSeasons());
        if (_tmp_1 == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, _tmp_1);
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getRuntime());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getReleaseDate());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getGenre());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getFirstAirDate());
        }
        if (value.getTrailerId() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getTrailerId());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getUpdatedAt());
        }
        if (value.getHd() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindLong(35, value.getHd());
        }
        final String _tmp_2;
        _tmp_2 = MediaStreamConverter.convertListToString(value.getVideos());
        if (_tmp_2 == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = GenreConverter.fromArrayList(value.getGenres());
        if (_tmp_3 == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, _tmp_3);
        }
      }
    };
    this.__deletionAdapterOfMedia = new EntityDeletionOrUpdateAdapter<Media>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favorite` WHERE `tmdbId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Media value) {
        if (value.getTmdbId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTmdbId());
        }
      }
    };
    this.__preparedStmtOfDeleteMediaFromFavorite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favorite";
        return _query;
      }
    };
  }

  @Override
  public void saveMediaToFavorite(final Media mediaDetail) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMedia.insert(mediaDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void saveMediaToFavorite1(final Download mediaDetail) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDownload.insert(mediaDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMediaFromFavorite(final Media mediaDetail) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMedia.handle(mediaDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMediaFromFavorite() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMediaFromFavorite.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteMediaFromFavorite.release(_stmt);
    }
  }

  @Override
  public Flowable<List<Media>> getFavoriteMovies() {
    final String _sql = "SELECT * FROM favorite";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"favorite"}, new Callable<List<Media>>() {
      @Override
      public List<Media> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "tmdbId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfPreviewPath = CursorUtil.getColumnIndexOrThrow(_cursor, "previewPath");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final int _cursorIndexOfLive = CursorUtil.getColumnIndexOrThrow(_cursor, "live");
          final int _cursorIndexOfPremuim = CursorUtil.getColumnIndexOrThrow(_cursor, "premuim");
          final int _cursorIndexOfVip = CursorUtil.getColumnIndexOrThrow(_cursor, "vip");
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
          final int _cursorIndexOfResumeWindow = CursorUtil.getColumnIndexOrThrow(_cursor, "resumeWindow");
          final int _cursorIndexOfResumePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "resumePosition");
          final int _cursorIndexOfIsAnime = CursorUtil.getColumnIndexOrThrow(_cursor, "isAnime");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfViews = CursorUtil.getColumnIndexOrThrow(_cursor, "views");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubstitles = CursorUtil.getColumnIndexOrThrow(_cursor, "substitles");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstAirDate");
          final int _cursorIndexOfTrailerId = CursorUtil.getColumnIndexOrThrow(_cursor, "trailerId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfHd = CursorUtil.getColumnIndexOrThrow(_cursor, "hd");
          final int _cursorIndexOfVideos = CursorUtil.getColumnIndexOrThrow(_cursor, "videos");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final List<Media> _result = new ArrayList<Media>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Media _item;
            _item = new Media();
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpTmdbId;
            _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
            _item.setTmdbId(_tmpTmdbId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            _item.setOverview(_tmpOverview);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            _item.setPosterPath(_tmpPosterPath);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            _item.setBackdropPath(_tmpBackdropPath);
            final String _tmpPreviewPath;
            _tmpPreviewPath = _cursor.getString(_cursorIndexOfPreviewPath);
            _item.setPreviewPath(_tmpPreviewPath);
            final float _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            _item.setVoteAverage(_tmpVoteAverage);
            final String _tmpVoteCount;
            _tmpVoteCount = _cursor.getString(_cursorIndexOfVoteCount);
            _item.setVoteCount(_tmpVoteCount);
            final int _tmpLive;
            _tmpLive = _cursor.getInt(_cursorIndexOfLive);
            _item.setLive(_tmpLive);
            final int _tmpPremuim;
            _tmpPremuim = _cursor.getInt(_cursorIndexOfPremuim);
            _item.setPremuim(_tmpPremuim);
            final int _tmpVip;
            _tmpVip = _cursor.getInt(_cursorIndexOfVip);
            _item.setVip(_tmpVip);
            final String _tmpLink;
            _tmpLink = _cursor.getString(_cursorIndexOfLink);
            _item.setLink(_tmpLink);
            final int _tmpResumeWindow;
            _tmpResumeWindow = _cursor.getInt(_cursorIndexOfResumeWindow);
            _item.setResumeWindow(_tmpResumeWindow);
            final long _tmpResumePosition;
            _tmpResumePosition = _cursor.getLong(_cursorIndexOfResumePosition);
            _item.setResumePosition(_tmpResumePosition);
            final int _tmpIsAnime;
            _tmpIsAnime = _cursor.getInt(_cursorIndexOfIsAnime);
            _item.setIsAnime(_tmpIsAnime);
            final String _tmpPopularity;
            _tmpPopularity = _cursor.getString(_cursorIndexOfPopularity);
            _item.setPopularity(_tmpPopularity);
            final Integer _tmpViews;
            if (_cursor.isNull(_cursorIndexOfViews)) {
              _tmpViews = null;
            } else {
              _tmpViews = _cursor.getInt(_cursorIndexOfViews);
            }
            _item.setViews(_tmpViews);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            _item.setStatus(_tmpStatus);
            final List<MediaSubstitle> _tmpSubstitles;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfSubstitles);
            _tmpSubstitles = MediaSubstitlesConverter.convertStringToList(_tmp);
            _item.setSubstitles(_tmpSubstitles);
            final List<Season> _tmpSeasons;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfSeasons);
            _tmpSeasons = SaisonConverter.convertStringToList(_tmp_1);
            _item.setSeasons(_tmpSeasons);
            final String _tmpRuntime;
            _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            _item.setRuntime(_tmpRuntime);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            _item.setReleaseDate(_tmpReleaseDate);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            _item.setGenre(_tmpGenre);
            final String _tmpFirstAirDate;
            _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            _item.setFirstAirDate(_tmpFirstAirDate);
            final String _tmpTrailerId;
            _tmpTrailerId = _cursor.getString(_cursorIndexOfTrailerId);
            _item.setTrailerId(_tmpTrailerId);
            final String _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            _item.setCreatedAt(_tmpCreatedAt);
            final String _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            _item.setUpdatedAt(_tmpUpdatedAt);
            final Integer _tmpHd;
            if (_cursor.isNull(_cursorIndexOfHd)) {
              _tmpHd = null;
            } else {
              _tmpHd = _cursor.getInt(_cursorIndexOfHd);
            }
            _item.setHd(_tmpHd);
            final List<MediaStream> _tmpVideos;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfVideos);
            _tmpVideos = MediaStreamConverter.convertStringToList(_tmp_2);
            _item.setVideos(_tmpVideos);
            final List<Genre> _tmpGenres;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfGenres);
            _tmpGenres = GenreConverter.fromString(_tmp_3);
            _item.setGenres(_tmpGenres);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Media> isFavoriteMovie(final int tmdbId) {
    final String _sql = "SELECT * FROM favorite WHERE tmdbId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tmdbId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"favorite"}, false, new Callable<Media>() {
      @Override
      public Media call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTmdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "tmdbId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfPreviewPath = CursorUtil.getColumnIndexOrThrow(_cursor, "previewPath");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final int _cursorIndexOfLive = CursorUtil.getColumnIndexOrThrow(_cursor, "live");
          final int _cursorIndexOfPremuim = CursorUtil.getColumnIndexOrThrow(_cursor, "premuim");
          final int _cursorIndexOfVip = CursorUtil.getColumnIndexOrThrow(_cursor, "vip");
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
          final int _cursorIndexOfResumeWindow = CursorUtil.getColumnIndexOrThrow(_cursor, "resumeWindow");
          final int _cursorIndexOfResumePosition = CursorUtil.getColumnIndexOrThrow(_cursor, "resumePosition");
          final int _cursorIndexOfIsAnime = CursorUtil.getColumnIndexOrThrow(_cursor, "isAnime");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfViews = CursorUtil.getColumnIndexOrThrow(_cursor, "views");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubstitles = CursorUtil.getColumnIndexOrThrow(_cursor, "substitles");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstAirDate");
          final int _cursorIndexOfTrailerId = CursorUtil.getColumnIndexOrThrow(_cursor, "trailerId");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfHd = CursorUtil.getColumnIndexOrThrow(_cursor, "hd");
          final int _cursorIndexOfVideos = CursorUtil.getColumnIndexOrThrow(_cursor, "videos");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final Media _result;
          if(_cursor.moveToFirst()) {
            _result = new Media();
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            _result.setId(_tmpId);
            final String _tmpTmdbId;
            _tmpTmdbId = _cursor.getString(_cursorIndexOfTmdbId);
            _result.setTmdbId(_tmpTmdbId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _result.setTitle(_tmpTitle);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _result.setName(_tmpName);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            _result.setOverview(_tmpOverview);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            _result.setPosterPath(_tmpPosterPath);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            _result.setBackdropPath(_tmpBackdropPath);
            final String _tmpPreviewPath;
            _tmpPreviewPath = _cursor.getString(_cursorIndexOfPreviewPath);
            _result.setPreviewPath(_tmpPreviewPath);
            final float _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            _result.setVoteAverage(_tmpVoteAverage);
            final String _tmpVoteCount;
            _tmpVoteCount = _cursor.getString(_cursorIndexOfVoteCount);
            _result.setVoteCount(_tmpVoteCount);
            final int _tmpLive;
            _tmpLive = _cursor.getInt(_cursorIndexOfLive);
            _result.setLive(_tmpLive);
            final int _tmpPremuim;
            _tmpPremuim = _cursor.getInt(_cursorIndexOfPremuim);
            _result.setPremuim(_tmpPremuim);
            final int _tmpVip;
            _tmpVip = _cursor.getInt(_cursorIndexOfVip);
            _result.setVip(_tmpVip);
            final String _tmpLink;
            _tmpLink = _cursor.getString(_cursorIndexOfLink);
            _result.setLink(_tmpLink);
            final int _tmpResumeWindow;
            _tmpResumeWindow = _cursor.getInt(_cursorIndexOfResumeWindow);
            _result.setResumeWindow(_tmpResumeWindow);
            final long _tmpResumePosition;
            _tmpResumePosition = _cursor.getLong(_cursorIndexOfResumePosition);
            _result.setResumePosition(_tmpResumePosition);
            final int _tmpIsAnime;
            _tmpIsAnime = _cursor.getInt(_cursorIndexOfIsAnime);
            _result.setIsAnime(_tmpIsAnime);
            final String _tmpPopularity;
            _tmpPopularity = _cursor.getString(_cursorIndexOfPopularity);
            _result.setPopularity(_tmpPopularity);
            final Integer _tmpViews;
            if (_cursor.isNull(_cursorIndexOfViews)) {
              _tmpViews = null;
            } else {
              _tmpViews = _cursor.getInt(_cursorIndexOfViews);
            }
            _result.setViews(_tmpViews);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            _result.setStatus(_tmpStatus);
            final List<MediaSubstitle> _tmpSubstitles;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfSubstitles);
            _tmpSubstitles = MediaSubstitlesConverter.convertStringToList(_tmp);
            _result.setSubstitles(_tmpSubstitles);
            final List<Season> _tmpSeasons;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfSeasons);
            _tmpSeasons = SaisonConverter.convertStringToList(_tmp_1);
            _result.setSeasons(_tmpSeasons);
            final String _tmpRuntime;
            _tmpRuntime = _cursor.getString(_cursorIndexOfRuntime);
            _result.setRuntime(_tmpRuntime);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            _result.setReleaseDate(_tmpReleaseDate);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            _result.setGenre(_tmpGenre);
            final String _tmpFirstAirDate;
            _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            _result.setFirstAirDate(_tmpFirstAirDate);
            final String _tmpTrailerId;
            _tmpTrailerId = _cursor.getString(_cursorIndexOfTrailerId);
            _result.setTrailerId(_tmpTrailerId);
            final String _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            _result.setCreatedAt(_tmpCreatedAt);
            final String _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            _result.setUpdatedAt(_tmpUpdatedAt);
            final Integer _tmpHd;
            if (_cursor.isNull(_cursorIndexOfHd)) {
              _tmpHd = null;
            } else {
              _tmpHd = _cursor.getInt(_cursorIndexOfHd);
            }
            _result.setHd(_tmpHd);
            final List<MediaStream> _tmpVideos;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfVideos);
            _tmpVideos = MediaStreamConverter.convertStringToList(_tmp_2);
            _result.setVideos(_tmpVideos);
            final List<Genre> _tmpGenres;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfGenres);
            _tmpGenres = GenreConverter.fromString(_tmp_3);
            _result.setGenres(_tmpGenres);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public boolean isFeaturedFavoriteMovie(final int tmdbId) {
    final String _sql = "SELECT * FROM favorite WHERE tmdbId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, tmdbId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
