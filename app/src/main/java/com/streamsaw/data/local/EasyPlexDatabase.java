package com.streamsaw.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.streamsaw.data.local.converters.CastConverter;
import com.streamsaw.data.local.converters.GenreConverter;
import com.streamsaw.data.local.converters.MediaStreamConverter;
import com.streamsaw.data.local.converters.MediaSubstitlesConverter;
import com.streamsaw.data.local.converters.SaisonConverter;
import com.streamsaw.data.local.converters.VideosConverter;
import com.streamsaw.data.local.dao.FavoriteDao;
import com.streamsaw.data.local.dao.DownloadDao;
import com.streamsaw.data.local.dao.HistoryDao;
import com.streamsaw.data.local.dao.StreamListDao;
import com.streamsaw.data.local.entity.History;
import com.streamsaw.data.local.entity.Media;
import com.streamsaw.data.local.entity.Download;
import com.streamsaw.data.local.entity.Stream;


/**
 * The Room database that contains the Favorite Movies & Series & Animes table
 * Define an abstract class that extends RoomDatabase.
 * This class is annotated with @Database, lists the entities contained in the database,
 * and the DAOs which access them.
 */
@Database(entities = {Media.class, Download.class, History.class, Stream.class}, version = 16, exportSchema = false)
@TypeConverters({GenreConverter.class,
        CastConverter.class,
        VideosConverter.class,
        SaisonConverter.class,
        MediaSubstitlesConverter.class,
        MediaStreamConverter.class})
public abstract class EasyPlexDatabase extends RoomDatabase {

    public abstract FavoriteDao favoriteDao();
    public abstract DownloadDao progressDao();
    public abstract HistoryDao historyDao();
    public abstract StreamListDao streamListDao();
}
