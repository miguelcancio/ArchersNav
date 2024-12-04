package com.mobdeve.group5.archersnav.ui.activity.introduction.ui.signin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.google.firebase.auth.FirebaseAuth;
import com.mobdeve.group5.archersnav.ForgotPasswordActivity;
import com.mobdeve.group5.archersnav.R;
import com.mobdeve.group5.archersnav.ui.activity.introduction.ui.signup.SignUpActivity;
import com.mobdeve.group5.archersnav.ui.activity.main.HomeActivity;

public class SignInActivity extends AppCompatActivity {

    private EditText emailInput, passwordInput;
    private Button btnSignIn;
    private CheckBox rememberMeCheckbox;
    private TextView signUpText, forgotPasswordText;
    private SharedPreferences sharedPreferences;
    private FirebaseAuth mAuth;
    private SignInViewModel signInViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);
        mAuth = FirebaseAuth.getInstance();
        signInViewModel = new ViewModelProvider(this).get(SignInViewModel.class);

        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        btnSignIn = findViewById(R.id.btnSignIn);
        rememberMeCheckbox = findViewById(R.id.rememberMeCheckbox);
        signUpText = findViewById(R.id.signUpText);
        forgotPasswordText = findViewById(R.id.forgotPasswordText);

        sharedPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE);
        //checkRememberMe();

        // Observe the user LiveData (for successful login)
        signInViewModel.getUser().observe(this, user -> {
            if (user != null) {
                // Successfully signed in
                Toast.makeText(SignInActivity.this, "Welcome, " + user.getEmail(), Toast.LENGTH_SHORT).show();

                // Navigate to the Main Activity (or any other screen)
                Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                startActivity(intent);

                // Finish the Login Activity to prevent the user from going back
                finish();
            }
        });

        // Observe the error LiveData (for failed login)
        signInViewModel.getError().observe(this, error -> {
            if (error != null) {
                // Show error message
                Toast.makeText(SignInActivity.this, "Error: " + error, Toast.LENGTH_SHORT).show();
            }
        });

        emailInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailInput.requestFocus();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null) {
                    imm.showSoftInput(emailInput, InputMethodManager.SHOW_IMPLICIT);
                }
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignInActivity.this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
                } else {
                    signInViewModel.signIn(email, password);
                }
            }
        });

        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });


        forgotPasswordText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignInActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }

}
