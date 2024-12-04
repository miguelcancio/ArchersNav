package com.mobdeve.group5.archersnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActivityHistory extends AppCompatActivity {

    private RecyclerView rvActivityHistory;
    private ActivityHistoryAdapter activityHistoryAdapter;
    private List<ActivityHistoryItem> activityHistoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Initialize RecyclerView
        rvActivityHistory = findViewById(R.id.rv_activity_history);
        rvActivityHistory.setLayoutManager(new LinearLayoutManager(this));

        // Initialize data
        activityHistoryList = new ArrayList<>();
        activityHistoryList.add(new ActivityHistoryItem("Logged into the app", "12:00 PM"));
        activityHistoryList.add(new ActivityHistoryItem("Checked campus map", "12:30 PM"));
        activityHistoryList.add(new ActivityHistoryItem("Saved a location", "1:00 PM"));

        // Set Adapter
        activityHistoryAdapter = new ActivityHistoryAdapter(activityHistoryList);
        rvActivityHistory.setAdapter(activityHistoryAdapter);

        // Bottom navigation listeners (unchanged)
        ImageButton emergencyButton = findViewById(R.id.iv_emergency);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityHistory.this, EmergencyInfoActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton campusMapButton = findViewById(R.id.iv_campus_map);
        campusMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityHistory.this, CampusMapActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton savedButton = findViewById(R.id.iv_saved);
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityHistory.this, SavedLocationsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        ImageButton profileButton = findViewById(R.id.iv_profile);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityHistory.this, ProfileActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }
}
