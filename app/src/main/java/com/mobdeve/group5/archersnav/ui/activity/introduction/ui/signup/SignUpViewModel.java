package com.mobdeve.group5.archersnav.ui.activity.introduction.ui.signup;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mobdeve.group5.archersnav.data.local.AppDatabase;
import com.mobdeve.group5.archersnav.data.local.dao.UserDao;
import com.mobdeve.group5.archersnav.data.model.User;
import com.mobdeve.group5.archersnav.data.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class SignUpViewModel extends AndroidViewModel {

    private final UserRepository userRepository;
    private final MutableLiveData<User> userLiveData;
    private final MutableLiveData<List<String>> errorMessagesLiveData;

    public SignUpViewModel(Application application) {
        super(application);
        AppDatabase db = AppDatabase.getDatabase(application);
        UserDao userDao = db.userDao();
        userRepository = UserRepository.getInstance(userDao);
        userLiveData = new MutableLiveData<>();
        errorMessagesLiveData = new MutableLiveData<>();
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

    // LiveData to observe the user
    public LiveData<User> getUserLiveData() {
        return userLiveData;
    }

    // LiveData to observe the error messages
    public LiveData<List<String>> getErrorMessages() {
        return errorMessagesLiveData;
    }

    public boolean isInputValid(String fullName, String idNumber, String email,
                                String password, String confirmPassword, String role) {
        List<String> errorMessages = new ArrayList<>();
        boolean isValid = true;

        if (fullName.isEmpty()) {
            errorMessages.add("Full Name cannot be empty");
            isValid = false;
        }

        if (idNumber.isEmpty() || !isIdNumberValid(idNumber)) {
            errorMessages.add("Use your DLSU ID number. It should be 8 digits.");
            isValid = false;
        }

        if (email.isEmpty() || !isEmailValid(email)) {
            errorMessages.add("Use your DLSU email.");
            isValid = false;
        }

        if (password.isEmpty() || password.length() < 6) {
            errorMessages.add("Your password is too short. Try Again!");
            isValid = false;
        }

        if (confirmPassword.isEmpty() || !password.equals(confirmPassword)) {
            errorMessages.add("Passwords do not match");
            isValid = false;
        }

        if (role.equals("Select Role")) {
            errorMessages.add("Please select a role");
            isValid = false;
        }

        if (!isValid) {
            errorMessagesLiveData.postValue(errorMessages);
        }

        return isValid;
    }

    private boolean isIdNumberValid(String idNumber) {
        return idNumber.matches("\\d{8}");
    }

    private boolean isEmailValid(String email) {
        return email.endsWith("@dlsu.edu.ph");
    }
}
