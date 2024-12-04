package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddContactActivity extends AppCompatActivity {

    private EditText etFirstName, etLastName, etNumber, etRelationship, etEmail, etAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        etFirstName = findViewById(R.id.et_first_name);
        etLastName = findViewById(R.id.et_last_name);
        etNumber = findViewById(R.id.et_number);
        etRelationship = findViewById(R.id.et_relationship);
        etEmail = findViewById(R.id.et_email);
        etAddress = findViewById(R.id.et_address);

        // Save Button
        findViewById(R.id.btn_save_contact).setOnClickListener(v -> {
            String firstName = etFirstName.getText().toString();
            String lastName = etLastName.getText().toString();
            String number = etNumber.getText().toString();
            String relationship = etRelationship.getText().toString();
            String email = etEmail.getText().toString();
            String address = etAddress.getText().toString();

            if (firstName.isEmpty() || lastName.isEmpty() || number.isEmpty()) {
                Toast.makeText(AddContactActivity.this, "Please fill in all required fields", Toast.LENGTH_SHORT).show();
            } else {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("contact_first_name", firstName);
                resultIntent.putExtra("contact_last_name", lastName);
                resultIntent.putExtra("contact_number", number);
                resultIntent.putExtra("contact_relationship", relationship);
                resultIntent.putExtra("contact_email", email);
                resultIntent.putExtra("contact_address", address);

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

        // Cancel Button
        findViewById(R.id.btn_cancel_contact).setOnClickListener(v -> {
            setResult(RESULT_CANCELED); // No data is returned
            finish(); // Close the activity
        });
    }
}
