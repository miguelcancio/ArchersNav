package com.mobdeve.group5.archersnav.data.repository;

import com.mobdeve.group5.archersnav.data.local.dao.UserDao;
import com.mobdeve.group5.archersnav.data.model.User;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class UserRepository {

    private static UserRepository INSTANCE;
    private final UserDao userDao;
    private final Executor executor;  // Executor to manage background tasks

    private UserRepository(UserDao userDao) {
        this.userDao = userDao;
        this.executor = Executors.newSingleThreadExecutor(); // Using a single thread for DB tasks
    }

    public static UserRepository getInstance(UserDao userDao) {
        if (INSTANCE == null) {
            INSTANCE = new UserRepository(userDao);
        }
        return INSTANCE;
    }

    // Fetch user data from the local database (Room) in a background thread
    public void getUserFromDatabase(String email, DataCallback callback) {
        executor.execute(() -> {
            User user = userDao.getUserByEmail(email);  // Query the database
            callback.onDataReceived(user);  // Return the result via callback
        });
    }

    // Save user data to the local database in a background thread
    public void saveUserToDatabase(User user) {
        executor.execute(() -> userDao.insert(user));  // Insert into the database in background
    }

    // Callback interface to return data asynchronously
    public interface DataCallback {
        void onDataReceived(User user);
    }
}
