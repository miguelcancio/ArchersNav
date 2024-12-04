package com.mobdeve.group5.archersnav.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.mobdeve.group5.archersnav.data.local.dao.UserDao;
import com.mobdeve.group5.archersnav.data.model.Building;
import com.mobdeve.group5.archersnav.data.model.User;

@Database(entities = {User.class, Building.class}, version = 4)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase INSTANCE;

    public abstract UserDao userDao(); // Abstract method for UserDao

    // Singleton pattern for Room Database instance
    public static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                                    context.getApplicationContext(),
                                    AppDatabase.class,
                                    "user_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}