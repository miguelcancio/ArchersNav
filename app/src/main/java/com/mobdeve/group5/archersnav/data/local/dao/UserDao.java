package com.mobdeve.group5.archersnav.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.mobdeve.group5.archersnav.data.model.User;

@Dao
public interface UserDao {

    @Insert
    void insert(User user); // Insert user into the local database

    @Query("SELECT * FROM users WHERE dlsuEmail = :email")
    User getUserByEmail(String email); // Get user from local database by userId
}
