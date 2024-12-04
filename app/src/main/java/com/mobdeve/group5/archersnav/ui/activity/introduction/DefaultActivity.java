package com.mobdeve.group5.archersnav.ui.activity.introduction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.mobdeve.group5.archersnav.R;
import com.mobdeve.group5.archersnav.ui.activity.introduction.ui.signin.SignInActivity;
import com.mobdeve.group5.archersnav.ui.activity.introduction.ui.signup.SignUpActivity;

public class DefaultActivity extends AppCompatActivity {

    private Button btnSignIn;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_activity);

        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DefaultActivity.this, SignInActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DefaultActivity.this, SignUpActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }
}
