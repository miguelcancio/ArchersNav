package com.mobdeve.group5.archersnav.ui.activity.introduction.ui.signup;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.google.firebase.auth.FirebaseAuth;
import com.mobdeve.group5.archersnav.R;
import com.mobdeve.group5.archersnav.data.model.User;
import com.mobdeve.group5.archersnav.ui.activity.introduction.ui.signin.SignInActivity;

import java.util.List;
import java.util.Objects;

public class SignUpActivity extends AppCompatActivity {

    private EditText etFullName, etEmail, etPassword, etConfirmPassword, etIdNumber;
    private Button btnRegister;
    private TextView tvSignInBold;
    private Spinner spinnerRole;
    private FirebaseAuth mAuth;
    private SignUpViewModel signUpViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);
        mAuth = FirebaseAuth.getInstance();
        signUpViewModel = new ViewModelProvider(this).get(SignUpViewModel.class);

        initViews();
        setupRoleSpinner();

        btnRegister.setOnClickListener(v -> handleRegister());
        tvSignInBold.setOnClickListener(v -> navigateToSignIn());
    }

    // Initialize UI elements
    private void initViews() {
        etFullName = findViewById(R.id.et_full_name);
        etIdNumber = findViewById(R.id.id_number);
        etEmail = findViewById(R.id.email);
        etPassword = findViewById(R.id.password);
        etConfirmPassword = findViewById(R.id.et_confirm_password);
        btnRegister = findViewById(R.id.btn_register);
        tvSignInBold = findViewById(R.id.tv_sign_in_bold);
        spinnerRole = findViewById(R.id.spinner_role);

    }

    private void setupRoleSpinner() {
        String[] roles = {"Select Role", "Student", "Professor"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, roles) {
            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView textView = view.findViewById(android.R.id.text1);
                textView.setTextColor(position == 0 ? Color.parseColor("#969696") : Color.BLACK);
                return view;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = view.findViewById(android.R.id.text1);
                textView.setTextColor(position == 0 ? Color.parseColor("#969696") : Color.BLACK);
                return view;
            }
        };

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRole.setAdapter(adapter);
    }

    private void handleRegister() {
        String fullName = etFullName.getText().toString().trim();
        String idNumber = etIdNumber.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String confirmPassword = etConfirmPassword.getText().toString().trim();
        String role = spinnerRole.getSelectedItem().toString();

        User user = new User(fullName, idNumber, email, role, password);

        if (signUpViewModel.isInputValid(fullName, idNumber, email, password, confirmPassword, role)) {
            createUser(user);
        } else {
            showErrorDialog(Objects.requireNonNull(signUpViewModel.getErrorMessages().getValue()));
        }
    }

    private void createUser(User user) {
        mAuth.createUserWithEmailAndPassword(user.getDlsuEmail(), user.getPassword())
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        signUpViewModel.saveUser(user);
                        Toast.makeText(SignUpActivity.this,
                                "Registration Successful", Toast.LENGTH_SHORT).show();
                        // Navigate to login or main activity
                        navigateToSignIn();
                    } else {
                        Toast.makeText(SignUpActivity.this,
                                "Registration Failed: " + task.getException(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void showErrorDialog(List<String> errorMessages) {
        StringBuilder message = new StringBuilder("Please fix the following issues:\n");
        for (String errorMessage : errorMessages) {
            message.append("- ").append(errorMessage).append("\n");
        }

        new AlertDialog.Builder(this)
                .setTitle("Input Errors")
                .setMessage(message.toString())
                .setPositiveButton("OK", null)
                .show();
    }

    private void navigateToSignIn() {
        Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
        startActivity(intent);
        finish();
    }

    public void onSignInClick(View view) {
        navigateToSignIn();
    }
}
