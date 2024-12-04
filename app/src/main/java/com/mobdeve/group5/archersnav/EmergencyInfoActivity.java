package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class EmergencyInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_info_activity);

        // ImageButton Navigation
        ImageButton campusMapButton = findViewById(R.id.iv_campus_map);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyInfoActivity.this, CampusMapActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton savedButton = findViewById(R.id.iv_saved);
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyInfoActivity.this, SavedLocationsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton profileButton = findViewById(R.id.iv_profile);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyInfoActivity.this, ProfileActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton emergencyButton = findViewById(R.id.iv_emergency);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyInfoActivity.this, EmergencyInfoActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        // Button Navigation for Emergency Information
        Button emergencyProceduresButton = findViewById(R.id.btn_emergency_procedures);
        emergencyProceduresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyInfoActivity.this, EmergencyProceduresActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        Button emergencyContactsButton = findViewById(R.id.btn_emergency_contact);
        emergencyContactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyInfoActivity.this, EmergencyContactActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        Button emergencyExitsButton = findViewById(R.id.btn_evacuation_areas);
        emergencyExitsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyInfoActivity.this, EvacuationAreasActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        Button mobilityAccessButton = findViewById(R.id.btn_mobility_access_guide);
        mobilityAccessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyInfoActivity.this, MobilityAccessActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }

        });
    }
}
