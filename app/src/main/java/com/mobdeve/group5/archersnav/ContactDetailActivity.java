package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContactDetailActivity extends AppCompatActivity {

    // Declare views
    private TextView firstNameValue, lastNameValue, numberValue, emailValue, addressValue, relationshipValue;
    private Button editButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        // Initialize views
        firstNameValue = findViewById(R.id.contact_detail_first_name_value);
        lastNameValue = findViewById(R.id.contact_detail_last_name_value);
        numberValue = findViewById(R.id.contact_detail_number_value);
        emailValue = findViewById(R.id.contact_detail_email_value);
        addressValue = findViewById(R.id.contact_detail_address_value);
        relationshipValue = findViewById(R.id.contact_detail_relationship_value);
        editButton = findViewById(R.id.btn_edit_contact);

        // Get contact data from the Intent
        Contact contact = getIntent().getParcelableExtra("contact");

        if (contact != null) {
            // Set the data to the views
            firstNameValue.setText(contact.getFirstName());
            lastNameValue.setText(contact.getLastName());
            numberValue.setText(contact.getNumber());
            emailValue.setText(contact.getEmail());
            addressValue.setText(contact.getAddress());
            relationshipValue.setText(contact.getRelationship());
        }

        // Set up the Edit button to start an EditContactActivity
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(ContactDetailActivity.this, EditContactActivity.class);
                editIntent.putExtra("contact", contact); // Pass contact data to the edit activity
                startActivity(editIntent);
            }
        });
    }
}
