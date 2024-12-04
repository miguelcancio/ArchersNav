package com.mobdeve.group5.archersnav.ui.activity.introduction.ui.signin;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.mobdeve.group5.archersnav.data.local.AppDatabase;
import com.mobdeve.group5.archersnav.data.local.dao.UserDao;
import com.mobdeve.group5.archersnav.data.repository.UserRepository;
import com.mobdeve.group5.archersnav.utils.SharedPrefManager;

public class SignInViewModel extends AndroidViewModel {

    private final UserRepository userRepository;
    private FirebaseAuth mAuth;
    private MutableLiveData<FirebaseUser> userLiveData;
    private MutableLiveData<String> errorLiveData;

    private final SharedPrefManager sharedPrefManager;

    public SignInViewModel(Application application) {
        super(application);
        AppDatabase db = AppDatabase.getDatabase(application);
        sharedPrefManager = SharedPrefManager
                .getInstance(application.getApplicationContext());
        UserDao userDao = db.userDao();
        userRepository = UserRepository.getInstance(userDao);
        userLiveData = new MutableLiveData<>();
        mAuth = FirebaseAuth.getInstance();
        errorLiveData = new MutableLiveData<>();
    }
    // Sign in with email and password
    public void signIn(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // Sign-in success, update the LiveData with the user
                        FirebaseUser user = mAuth.getCurrentUser();
                        userLiveData.setValue(user);
                        sharedPrefManager.saveString("email", email);
                    } else {
                        // Sign-in failed, update the error LiveData with the error message
                        errorLiveData.setValue(task.getException() != null ? task.getException().getMessage() : "Unknown error");
                    }
                });
    }

    // LiveData for the authenticated user
    public LiveData<FirebaseUser> getUser() {
        return userLiveData;
    }

    // LiveData for any authentication errors
    public LiveData<String> getError() {
        return errorLiveData;
    }
}
