package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class EmergencyProceduresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_procedures_activity);

        Button fireButton = findViewById(R.id.fire);
        fireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, FireEmergencyActivity.class);
                startActivity(intent);
            }
        });

        // Earthquake emergency button
        Button earthquakeButton = findViewById(R.id.earthquake);
        earthquakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, EarthquakeEmergencyActivity.class);
                startActivity(intent);
            }
        });

        // Violence or Bullying emergency button
        Button violenceButton = findViewById(R.id.bullying);
        violenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, BullyingActivity.class);
                startActivity(intent);
            }
        });

        // Bomb threat emergency button
        Button bombThreatButton = findViewById(R.id.bomb_threat);
        bombThreatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, BombThreatActivity.class);
                startActivity(intent);
            }
        });

        // Health emergency button
        Button healthButton = findViewById(R.id.health_emer);
        healthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, HealthEmergencyActivity.class);
                startActivity(intent);
            }
        });

        // Bottom navigation buttons
        ImageButton campusMapButton = findViewById(R.id.iv_campus_map);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, CampusMapActivity.class);
                startActivity(intent);
            }
        });

        ImageButton savedButton = findViewById(R.id.iv_saved);
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, SavedLocationsActivity.class);
                startActivity(intent);
            }
        });

        ImageButton profileButton = findViewById(R.id.iv_profile);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        ImageButton emergencyButton = findViewById(R.id.iv_emergency);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencyProceduresActivity.this, EmergencyInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
