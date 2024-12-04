package com.mobdeve.group5.archersnav;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SearchResultsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SearchResultsAdapter adapter;
    private List<String> allResults;
    private List<String> filteredResults;
    private EditText searchEditText;
    private ImageView searchIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        searchEditText = findViewById(R.id.et_search);
        searchIcon = findViewById(R.id.iv_search_icon);
        recyclerView = findViewById(R.id.rv_search_results);
        TextView searchQueryTextView = findViewById(R.id.tv_search_query);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        allResults = new ArrayList<>();
        allResults.add(getString(R.string.bloemen_hall));
        allResults.add(getString(R.string.br_andrew));
        allResults.add(getString(R.string.br_joseph));
        allResults.add(getString(R.string.connon_hall));
        allResults.add(getString(R.string.la_salle));
        allResults.add(getString(R.string.mutien_marie));
        allResults.add(getString(R.string.razon));
        allResults.add(getString(R.string.st_miguel));
        allResults.add(getString(R.string.strc));
        allResults.add(getString(R.string.velasco));
        allResults.add(getString(R.string.william_hall));
        allResults.add(getString(R.string.henry_sy));
        allResults.add(getString(R.string.br_john));
        allResults.add(getString(R.string.yuchengco));

        adapter = new SearchResultsAdapter(allResults);
        recyclerView.setAdapter(adapter);

        String query = getIntent().getStringExtra("SEARCH_QUERY");
        if (!TextUtils.isEmpty(query)) {
            searchEditText.setText(query);
            searchQueryTextView.setText("Results for: " + query);
            filteredResults = filterResults(query);
            adapter.updateResults(filteredResults);
        }

        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String query = searchEditText.getText().toString().trim();

                if (!TextUtils.isEmpty(query)) {
                    filteredResults = filterResults(query);
                    searchQueryTextView.setText("Results for: " + query);
                } else {

                    filteredResults = allResults;
                    searchQueryTextView.setText("All Buildings");
                }

                adapter.updateResults(filteredResults);
            }
        });
    }
    
    private List<String> filterResults(String query) {
        List<String> filteredList = new ArrayList<>();
        for (String item : allResults) {
            if (item.toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}
