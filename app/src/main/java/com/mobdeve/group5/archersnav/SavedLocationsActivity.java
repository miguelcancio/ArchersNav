package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SavedLocationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_locations_activity);

        // Star button for location1 (Br. Andrew)
        ImageButton starLocation1 = findViewById(R.id.btn_star_location1);
        starLocation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (starLocation1.getTag() == null || starLocation1.getTag().equals("outline")) {
                    starLocation1.setImageResource(R.drawable.ic_star_filled);
                    starLocation1.setTag("filled");
                } else {
                    starLocation1.setImageResource(R.drawable.ic_star_outline);
                    starLocation1.setTag("outline");
                }
            }
        });

        // Star button for location2 (Bloemen)
        ImageButton starLocation2 = findViewById(R.id.btn_star_location2);
        starLocation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (starLocation2.getTag() == null || starLocation2.getTag().equals("outline")) {
                    starLocation2.setImageResource(R.drawable.ic_star_filled);
                    starLocation2.setTag("filled");
                } else {
                    starLocation2.setImageResource(R.drawable.ic_star_outline);
                    starLocation2.setTag("outline");
                }
            }
        });

        // Button redirection for location1 (Br. Andrew) to CampusMapActivity
        Button btnLocation1 = findViewById(R.id.btn_location1);
        btnLocation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SavedLocationsActivity.this, CampusMapActivity.class);
                startActivity(intent);
            }
        });

        // Button redirection for location2 (Bloemen) to CampusMapActivity
        Button btnLocation2 = findViewById(R.id.btn_location2);
        btnLocation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SavedLocationsActivity.this, CampusMapActivity.class);
                startActivity(intent);
            }
        });

        // **Redirection for Left Button (ActivityHistory)**
        Button leftButton = findViewById(R.id.btn_activity_history);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SavedLocationsActivity.this, ActivityHistory.class);
                startActivity(intent);
            }
        });


        // Other existing code for emergency, map, profile, and saved buttons
        ImageButton emergencyButton = findViewById(R.id.iv_emergency);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SavedLocationsActivity.this, EmergencyInfoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton campusMapButton = findViewById(R.id.iv_campus_map);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SavedLocationsActivity.this, CampusMapActivity.class);
                startActivity(intent);
            }
        });

        ImageButton profileButton = findViewById(R.id.iv_profile);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SavedLocationsActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        ImageButton savedButton = findViewById(R.id.iv_saved);
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SavedLocationsActivity.this, SavedLocationsActivity.class);
                startActivity(intent);
            }
        });
    }
}
