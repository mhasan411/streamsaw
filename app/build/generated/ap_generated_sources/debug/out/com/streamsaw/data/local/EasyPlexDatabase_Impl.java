package com.streamsaw.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.streamsaw.data.local.dao.DownloadDao;
import com.streamsaw.data.local.dao.DownloadDao_Impl;
import com.streamsaw.data.local.dao.FavoriteDao;
import com.streamsaw.data.local.dao.FavoriteDao_Impl;
import com.streamsaw.data.local.dao.HistoryDao;
import com.streamsaw.data.local.dao.HistoryDao_Impl;
import com.streamsaw.data.local.dao.StreamListDao;
import com.streamsaw.data.local.dao.StreamListDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EasyPlexDatabase_Impl extends EasyPlexDatabase {
  private volatile FavoriteDao _favoriteDao;

  private volatile DownloadDao _downloadDao;

  private volatile HistoryDao _historyDao;

  private volatile StreamListDao _streamListDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(16) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite` (`id` TEXT NOT NULL, `tmdbId` TEXT NOT NULL, `title` TEXT, `name` TEXT, `overview` TEXT, `posterPath` TEXT, `backdropPath` TEXT, `previewPath` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `link` TEXT, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` INTEGER, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `videos` TEXT, `genres` TEXT, PRIMARY KEY(`tmdbId`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_favorite_tmdbId` ON `favorite` (`tmdbId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `download` (`download_id` TEXT NOT NULL, `tmdbId_download` TEXT NOT NULL, `title_download` TEXT, `backdropPath_download` TEXT, `link_download` TEXT, `id` TEXT NOT NULL, `tmdbId` TEXT NOT NULL, `title` TEXT, `name` TEXT, `overview` TEXT, `posterPath` TEXT, `backdropPath` TEXT, `previewPath` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `link` TEXT, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` INTEGER, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `videos` TEXT, `genres` TEXT, PRIMARY KEY(`tmdbId`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_download_tmdbId` ON `download` (`tmdbId`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_download_tmdbId_download` ON `download` (`tmdbId_download`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `history` (`history_id` TEXT NOT NULL, `tmdbId_history` TEXT NOT NULL, `posterpath_download` TEXT, `title_history` TEXT, `backdrop_path_download` TEXT, `link_download` TEXT, `tv_download` TEXT, `seasonId_download` TEXT, `id` TEXT NOT NULL, `tmdbId` TEXT NOT NULL, `title` TEXT, `name` TEXT, `overview` TEXT, `posterPath` TEXT, `backdropPath` TEXT, `previewPath` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `link` TEXT, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` INTEGER, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `videos` TEXT, `genres` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_history_id` ON `history` (`id`)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_history_tmdbId` ON `history` (`tmdbId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `stream` (`stream_id` TEXT NOT NULL, `stream_tmdb` TEXT NOT NULL, `posterpath_stream` TEXT, `title_stream` TEXT, `backdrop_path_stream` TEXT, `link_stream` TEXT, `id` TEXT NOT NULL, `tmdbId` TEXT NOT NULL, `title` TEXT, `name` TEXT, `overview` TEXT, `posterPath` TEXT, `backdropPath` TEXT, `previewPath` TEXT, `voteAverage` REAL NOT NULL, `voteCount` TEXT, `live` INTEGER NOT NULL, `premuim` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `link` TEXT, `resumeWindow` INTEGER NOT NULL, `resumePosition` INTEGER NOT NULL, `isAnime` INTEGER NOT NULL, `popularity` TEXT, `views` INTEGER, `status` TEXT, `substitles` TEXT, `seasons` TEXT, `runtime` TEXT, `releaseDate` TEXT, `genre` TEXT, `firstAirDate` TEXT, `trailerId` TEXT, `createdAt` TEXT, `updatedAt` TEXT, `hd` INTEGER, `videos` TEXT, `genres` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_stream_id` ON `stream` (`id`)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_stream_tmdbId` ON `stream` (`tmdbId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '43dddd8d68511ce30b8737dd611ec447')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `favorite`");
        _db.execSQL("DROP TABLE IF EXISTS `download`");
        _db.execSQL("DROP TABLE IF EXISTS `history`");
        _db.execSQL("DROP TABLE IF EXISTS `stream`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFavorite = new HashMap<String, TableInfo.Column>(32);
        _columnsFavorite.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("tmdbId", new TableInfo.Column("tmdbId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("views", new TableInfo.Column("views", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavorite = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavorite = new HashSet<TableInfo.Index>(1);
        _indicesFavorite.add(new TableInfo.Index("index_favorite_tmdbId", true, Arrays.asList("tmdbId")));
        final TableInfo _infoFavorite = new TableInfo("favorite", _columnsFavorite, _foreignKeysFavorite, _indicesFavorite);
        final TableInfo _existingFavorite = TableInfo.read(_db, "favorite");
        if (! _infoFavorite.equals(_existingFavorite)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite(com.streamsaw.data.local.entity.Media).\n"
                  + " Expected:\n" + _infoFavorite + "\n"
                  + " Found:\n" + _existingFavorite);
        }
        final HashMap<String, TableInfo.Column> _columnsDownload = new HashMap<String, TableInfo.Column>(37);
        _columnsDownload.put("download_id", new TableInfo.Column("download_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("tmdbId_download", new TableInfo.Column("tmdbId_download", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("title_download", new TableInfo.Column("title_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("backdropPath_download", new TableInfo.Column("backdropPath_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("link_download", new TableInfo.Column("link_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("tmdbId", new TableInfo.Column("tmdbId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("views", new TableInfo.Column("views", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDownload.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDownload = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDownload = new HashSet<TableInfo.Index>(2);
        _indicesDownload.add(new TableInfo.Index("index_download_tmdbId", true, Arrays.asList("tmdbId")));
        _indicesDownload.add(new TableInfo.Index("index_download_tmdbId_download", false, Arrays.asList("tmdbId_download")));
        final TableInfo _infoDownload = new TableInfo("download", _columnsDownload, _foreignKeysDownload, _indicesDownload);
        final TableInfo _existingDownload = TableInfo.read(_db, "download");
        if (! _infoDownload.equals(_existingDownload)) {
          return new RoomOpenHelper.ValidationResult(false, "download(com.streamsaw.data.local.entity.Download).\n"
                  + " Expected:\n" + _infoDownload + "\n"
                  + " Found:\n" + _existingDownload);
        }
        final HashMap<String, TableInfo.Column> _columnsHistory = new HashMap<String, TableInfo.Column>(40);
        _columnsHistory.put("history_id", new TableInfo.Column("history_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("tmdbId_history", new TableInfo.Column("tmdbId_history", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("posterpath_download", new TableInfo.Column("posterpath_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("title_history", new TableInfo.Column("title_history", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("backdrop_path_download", new TableInfo.Column("backdrop_path_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("link_download", new TableInfo.Column("link_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("tv_download", new TableInfo.Column("tv_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("seasonId_download", new TableInfo.Column("seasonId_download", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("tmdbId", new TableInfo.Column("tmdbId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("views", new TableInfo.Column("views", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistory.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHistory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHistory = new HashSet<TableInfo.Index>(2);
        _indicesHistory.add(new TableInfo.Index("index_history_id", true, Arrays.asList("id")));
        _indicesHistory.add(new TableInfo.Index("index_history_tmdbId", true, Arrays.asList("tmdbId")));
        final TableInfo _infoHistory = new TableInfo("history", _columnsHistory, _foreignKeysHistory, _indicesHistory);
        final TableInfo _existingHistory = TableInfo.read(_db, "history");
        if (! _infoHistory.equals(_existingHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "history(com.streamsaw.data.local.entity.History).\n"
                  + " Expected:\n" + _infoHistory + "\n"
                  + " Found:\n" + _existingHistory);
        }
        final HashMap<String, TableInfo.Column> _columnsStream = new HashMap<String, TableInfo.Column>(38);
        _columnsStream.put("stream_id", new TableInfo.Column("stream_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("stream_tmdb", new TableInfo.Column("stream_tmdb", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("posterpath_stream", new TableInfo.Column("posterpath_stream", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("title_stream", new TableInfo.Column("title_stream", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("backdrop_path_stream", new TableInfo.Column("backdrop_path_stream", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("link_stream", new TableInfo.Column("link_stream", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("tmdbId", new TableInfo.Column("tmdbId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("previewPath", new TableInfo.Column("previewPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("voteCount", new TableInfo.Column("voteCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("live", new TableInfo.Column("live", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("premuim", new TableInfo.Column("premuim", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("vip", new TableInfo.Column("vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("resumeWindow", new TableInfo.Column("resumeWindow", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("resumePosition", new TableInfo.Column("resumePosition", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("isAnime", new TableInfo.Column("isAnime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("popularity", new TableInfo.Column("popularity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("views", new TableInfo.Column("views", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("substitles", new TableInfo.Column("substitles", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("seasons", new TableInfo.Column("seasons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("runtime", new TableInfo.Column("runtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("genre", new TableInfo.Column("genre", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("trailerId", new TableInfo.Column("trailerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("createdAt", new TableInfo.Column("createdAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("hd", new TableInfo.Column("hd", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("videos", new TableInfo.Column("videos", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStream.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStream = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStream = new HashSet<TableInfo.Index>(2);
        _indicesStream.add(new TableInfo.Index("index_stream_id", true, Arrays.asList("id")));
        _indicesStream.add(new TableInfo.Index("index_stream_tmdbId", true, Arrays.asList("tmdbId")));
        final TableInfo _infoStream = new TableInfo("stream", _columnsStream, _foreignKeysStream, _indicesStream);
        final TableInfo _existingStream = TableInfo.read(_db, "stream");
        if (! _infoStream.equals(_existingStream)) {
          return new RoomOpenHelper.ValidationResult(false, "stream(com.streamsaw.data.local.entity.Stream).\n"
                  + " Expected:\n" + _infoStream + "\n"
                  + " Found:\n" + _existingStream);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "43dddd8d68511ce30b8737dd611ec447", "f4678e4d2114fe0e6cf1cf50de5bc9a4");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favorite","download","history","stream");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favorite`");
      _db.execSQL("DELETE FROM `download`");
      _db.execSQL("DELETE FROM `history`");
      _db.execSQL("DELETE FROM `stream`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FavoriteDao favoriteDao() {
    if (_favoriteDao != null) {
      return _favoriteDao;
    } else {
      synchronized(this) {
        if(_favoriteDao == null) {
          _favoriteDao = new FavoriteDao_Impl(this);
        }
        return _favoriteDao;
      }
    }
  }

  @Override
  public DownloadDao progressDao() {
    if (_downloadDao != null) {
      return _downloadDao;
    } else {
      synchronized(this) {
        if(_downloadDao == null) {
          _downloadDao = new DownloadDao_Impl(this);
        }
        return _downloadDao;
      }
    }
  }

  @Override
  public HistoryDao historyDao() {
    if (_historyDao != null) {
      return _historyDao;
    } else {
      synchronized(this) {
        if(_historyDao == null) {
          _historyDao = new HistoryDao_Impl(this);
        }
        return _historyDao;
      }
    }
  }

  @Override
  public StreamListDao streamListDao() {
    if (_streamListDao != null) {
      return _streamListDao;
    } else {
      synchronized(this) {
        if(_streamListDao == null) {
          _streamListDao = new StreamListDao_Impl(this);
        }
        return _streamListDao;
      }
    }
  }
}
