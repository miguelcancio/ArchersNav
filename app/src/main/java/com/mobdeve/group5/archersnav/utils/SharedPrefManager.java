package com.mobdeve.group5.archersnav.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {

    private static SharedPrefManager instance;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private static final String PREF_NAME = "app_preferences";
    private static final int MODE = Context.MODE_PRIVATE;

    private SharedPrefManager(Context context) {
        // Initialize SharedPreferences
        sharedPreferences = context.getSharedPreferences(PREF_NAME, MODE);
        editor = sharedPreferences.edit();
    }

    // Get the singleton instance
    public static synchronized SharedPrefManager getInstance(Context context) {
        if (instance == null) {
            instance = new SharedPrefManager(context.getApplicationContext());
        }
        return instance;
    }

    // Save a String to SharedPreferences
    public void saveString(String key, String value) {
        editor.putString(key, value);
        editor.apply();
    }

    // Get a String from SharedPreferences
    public String getString(String key, String defaultValue) {
        return sharedPreferences.getString(key, defaultValue);
    }

    // Save an Integer to SharedPreferences
    public void saveInt(String key, int value) {
        editor.putInt(key, value);
        editor.apply();
    }

    // Get an Integer from SharedPreferences
    public int getInt(String key, int defaultValue) {
        return sharedPreferences.getInt(key, defaultValue);
    }

    // Save a Boolean to SharedPreferences
    public void saveBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.apply();
    }

    // Get a Boolean from SharedPreferences
    public boolean getBoolean(String key, boolean defaultValue) {
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    // Save a Float to SharedPreferences
    public void saveFloat(String key, float value) {
        editor.putFloat(key, value);
        editor.apply();
    }

    // Get a Float from SharedPreferences
    public float getFloat(String key, float defaultValue) {
        return sharedPreferences.getFloat(key, defaultValue);
    }

    // Save a Long to SharedPreferences
    public void saveLong(String key, long value) {
        editor.putLong(key, value);
        editor.apply();
    }

    // Get a Long from SharedPreferences
    public long getLong(String key, long defaultValue) {
        return sharedPreferences.getLong(key, defaultValue);
    }

    // Remove a key-value pair from SharedPreferences
    public void remove(String key) {
        editor.remove(key);
        editor.apply();
    }

    // Clear all values in SharedPreferences
    public void clear() {
        editor.clear();
        editor.apply();
    }
}
