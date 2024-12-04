package com.mobdeve.group5.archersnav.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.mobdeve.group5.archersnav.data.model.Building;
import com.mobdeve.group5.archersnav.data.model.User;

import java.util.List;

@Dao
public interface BuildingDao {

    // Insert a building
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    default void insertBuilding(Building building) {

    }

    // Insert a user
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(User user);

    // Fetch buildings by userId
    @Query("SELECT * FROM building WHERE dlsuEmail = :dlsuEmail")
    List<Building> getBuildingsByUser(String dlsuEmail);

    // Fetch all users
    @Query("SELECT * FROM users")
    List<User> getAllUsers();

    // Delete a building by name
    @Query("DELETE FROM building WHERE buildingName = :buildingName")
    void deleteBuilding(String buildingName);
}