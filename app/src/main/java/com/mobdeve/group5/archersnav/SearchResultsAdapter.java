package com.mobdeve.group5.archersnav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SearchResultsAdapter extends RecyclerView.Adapter<SearchResultsAdapter.ViewHolder> {

    private List<String> results;

    public SearchResultsAdapter(List<String> results) {
        this.results = results;
    }

    public void updateResults(List<String> newResults) {
        this.results = newResults;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_result, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.resultTextView.setText(results.get(position));
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView resultTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            resultTextView = itemView.findViewById(R.id.tv_search_result);
        }
    }
}
