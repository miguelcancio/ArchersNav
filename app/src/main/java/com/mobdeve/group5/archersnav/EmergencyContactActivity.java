package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class EmergencyContactActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContactAdapter contactAdapter;
    private ArrayList<Contact> contactList;
    private static final int REQUEST_CODE_ADD_CONTACT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_contacts_activity);

        recyclerView = findViewById(R.id.recycler_view_contacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        contactList = new ArrayList<>();
        contactAdapter = new ContactAdapter(contactList);
        recyclerView.setAdapter(contactAdapter);

        findViewById(R.id.fab_add_contact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyContactActivity.this, AddContactActivity.class);
                startActivityForResult(intent, REQUEST_CODE_ADD_CONTACT);
            }
        });

        // Bottom navigation buttons
        ImageButton campusMapButton = findViewById(R.id.iv_campus_map);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyContactActivity.this, CampusMapActivity.class);
                startActivity(intent);
            }
        });

        ImageButton savedButton = findViewById(R.id.iv_saved);
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyContactActivity.this, SavedLocationsActivity.class);
                startActivity(intent);
            }
        });

        ImageButton profileButton = findViewById(R.id.iv_profile);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyContactActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        ImageButton emergencyButton = findViewById(R.id.iv_emergency);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyContactActivity.this, EmergencyInfoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_ADD_CONTACT && resultCode == RESULT_OK && data != null) {
            String firstName = data.getStringExtra("contact_first_name");
            String lastName = data.getStringExtra("contact_last_name");
            String number = data.getStringExtra("contact_number");
            String relationship = data.getStringExtra("contact_relationship");
            String email = data.getStringExtra("contact_email");
            String address = data.getStringExtra("contact_address");

            Contact newContact = new Contact(firstName, lastName, number, relationship, email, address);

            contactList.add(newContact);
            contactAdapter.notifyItemInserted(contactList.size() - 1);

            recyclerView.scrollToPosition(contactList.size() - 1);

            Toast.makeText(this, "Contact added: " + firstName, Toast.LENGTH_SHORT).show();
        }
    }
}
