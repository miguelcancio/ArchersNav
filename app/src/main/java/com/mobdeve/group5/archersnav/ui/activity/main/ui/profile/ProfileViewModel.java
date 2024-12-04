package com.mobdeve.group5.archersnav.ui.activity.main.ui.profile;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.mobdeve.group5.archersnav.data.local.AppDatabase;
import com.mobdeve.group5.archersnav.data.local.dao.UserDao;
import com.mobdeve.group5.archersnav.data.model.User;
import com.mobdeve.group5.archersnav.data.repository.UserRepository;

import java.util.Objects;

public class ProfileViewModel extends AndroidViewModel {

    private final UserRepository userRepository;
    private final MutableLiveData<User> userLiveData;
    FirebaseAuth firebaseAuth;
    public ProfileViewModel(Application application) {
        super(application);
        firebaseAuth = FirebaseAuth.getInstance();
        AppDatabase db = AppDatabase.getDatabase(application);
        UserDao userDao = db.userDao();
        userRepository = UserRepository.getInstance(userDao);
        userLiveData = new MutableLiveData<>();
        getUser(Objects.requireNonNull(firebaseAuth.getCurrentUser()).getEmail());
    }

    // Get user from the local database
    public void getUser(String email) {
        userRepository.getUserFromDatabase(email, new UserRepository.DataCallback() {
            @Override
            public void onDataReceived(User user) {
                userLiveData.postValue(user);  // Post the result to LiveData
            }
        });
    }

    // Save a user to the local database
    public void saveUser(User user) {
        userRepository.saveUserToDatabase(user);  // Save the user asynchronously
    }

    public void logoutUser() {
        firebaseAuth.signOut();
    }

    public void changePassword(String newPassword) {
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if (user != null) {
            user.updatePassword(newPassword)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            // Password updated successfully
                        } else {
                            // If an error occurs
                        }
                    });
        }
    }

    // LiveData to observe the user
    public LiveData<User> getUserLiveData() {
        return userLiveData;
    }

}
