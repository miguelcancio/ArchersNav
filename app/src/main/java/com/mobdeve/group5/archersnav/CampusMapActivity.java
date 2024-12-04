package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class CampusMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campus_map_activity);

        initializeBottomNavigation();

        initializeFeatureButtons();
    }

    private void initializeBottomNavigation() {
        // Navigate to Emergency Info
        ImageButton emergencyButton = findViewById(R.id.iv_emergency);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CampusMapActivity.this, EmergencyInfoActivity.class));
                overridePendingTransition(0, 0);
            }
        });

        // Navigate to Saved Locations
        ImageButton savedButton = findViewById(R.id.iv_saved);
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CampusMapActivity.this, SavedLocationsActivity.class));
                overridePendingTransition(0, 0);
            }
        });

        // Navigate to Profile
        ImageButton profileButton = findViewById(R.id.iv_profile);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CampusMapActivity.this, ProfileActivity.class));
                overridePendingTransition(0, 0);
            }
        });

        // Set Campus Map button to do nothing (since we're already on this activity)
        ImageButton campusMapButton = findViewById(R.id.iv_campus_map);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Do nothing
            }
        });
    }

    private void initializeFeatureButtons() {
        // Navigate to Facility Finder
        Button facilityFinderButton = findViewById(R.id.btn_facility_finder);
        facilityFinderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CampusMapActivity.this, FacilityFinderActivity.class));
            }
        });

        // Navigate to Real-Time Directions
        Button realTimeDirectionsButton = findViewById(R.id.btn_real_time_directions);
        realTimeDirectionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CampusMapActivity.this, RealTimeDirectionsActivity.class));
            }
        });
    }
}
