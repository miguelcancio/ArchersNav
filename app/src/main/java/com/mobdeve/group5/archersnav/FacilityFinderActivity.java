package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FacilityFinderActivity extends AppCompatActivity {

    private EditText searchFacilityEditText;
    private ImageButton searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facility_finder_activity);

        searchFacilityEditText = findViewById(R.id.search_facility);
        searchButton = findViewById(R.id.search_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String query = searchFacilityEditText.getText().toString().trim();

                if (query.isEmpty()) {
                    Toast.makeText(FacilityFinderActivity.this, "Please enter a facility name to search.", Toast.LENGTH_SHORT).show();
                } else {

                    performSearch(query);
                }
            }
        });

        ImageButton campusMapButton = findViewById(R.id.iv_campus_map);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilityFinderActivity.this, CampusMapActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton savedButton = findViewById(R.id.iv_saved);
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilityFinderActivity.this, SavedLocationsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton profileButton = findViewById(R.id.iv_profile);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilityFinderActivity.this, ProfileActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton emergencyButton = findViewById(R.id.iv_emergency);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilityFinderActivity.this, EmergencyInfoActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }

    private void performSearch(String query) {

        Toast.makeText(this, "Searching for: " + query, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(FacilityFinderActivity.this, SearchResultsActivity.class);

        intent.putExtra("SEARCH_QUERY", query);

        startActivity(intent);
    }
}
