package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class EditContactActivity extends AppCompatActivity {

    private EditText editFirstName, editLastName, editNumber, editEmail, editAddress, editRelationship;
    private Button btnSaveContact, btnDeleteContact;
    private Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        // Initialize views
        editFirstName = findViewById(R.id.edit_first_name);
        editLastName = findViewById(R.id.edit_last_name);
        editNumber = findViewById(R.id.edit_number);
        editEmail = findViewById(R.id.edit_email);
        editAddress = findViewById(R.id.edit_address);
        editRelationship = findViewById(R.id.edit_relationship);
        btnSaveContact = findViewById(R.id.btn_save_contact);
        btnDeleteContact = findViewById(R.id.btn_delete_contact);

        // Retrieve the contact data from the Intent
        contact = getIntent().getParcelableExtra("contact");

        if (contact != null) {
            // Set existing contact data into the EditText fields
            editFirstName.setText(contact.getFirstName());
            editLastName.setText(contact.getLastName());
            editNumber.setText(contact.getNumber());
            editEmail.setText(contact.getEmail());
            editAddress.setText(contact.getAddress());
            editRelationship.setText(contact.getRelationship());
        }

        // Save button functionality
        btnSaveContact.setOnClickListener(v -> {
            // Get the edited values from the EditText fields
            String updatedFirstName = editFirstName.getText().toString();
            String updatedLastName = editLastName.getText().toString();
            String updatedNumber = editNumber.getText().toString();
            String updatedEmail = editEmail.getText().toString();
            String updatedAddress = editAddress.getText().toString();
            String updatedRelationship = editRelationship.getText().toString();

            if (contact != null) {
                contact.setFirstName(updatedFirstName);
                contact.setLastName(updatedLastName);
                contact.setNumber(updatedNumber);
                contact.setEmail(updatedEmail);
                contact.setAddress(updatedAddress);
                contact.setRelationship(updatedRelationship);

                // Return the updated contact back to the parent activity
                Intent resultIntent = new Intent();
                resultIntent.putExtra("updated_contact", contact);
                setResult(RESULT_OK, resultIntent);

                Toast.makeText(EditContactActivity.this, "Contact saved successfully!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        // Delete button functionality
        btnDeleteContact.setOnClickListener(v -> showDeleteConfirmationDialog());
    }

    // Show a confirmation dialog before deleting the contact
    private void showDeleteConfirmationDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Delete Contact")
                .setMessage("Are you sure you want to delete this contact?")
                .setPositiveButton("Delete", (dialog, which) -> deleteContact())
                .setNegativeButton("Cancel", null)
                .show();
    }

    // Delete the contact and return to the previous activity
    private void deleteContact() {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("deleted_contact_id", contact.getId()); // Pass the contact ID for deletion
        setResult(RESULT_OK, resultIntent);

        Toast.makeText(EditContactActivity.this, "Contact deleted successfully!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
