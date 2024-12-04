package com.mobdeve.group5.archersnav;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MobilityAccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobility_access_activity);

        TextView procedureTextView = findViewById(R.id.procedureTextView);
        //procedureTextView.setText(Html.fromHtml(getMobilityAccessGuideText()));
    }
}