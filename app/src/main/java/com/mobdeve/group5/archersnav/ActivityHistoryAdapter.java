package com.mobdeve.group5.archersnav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ActivityHistoryAdapter extends RecyclerView.Adapter<ActivityHistoryAdapter.ViewHolder> {

    private List<ActivityHistoryItem> activityHistoryList;

    public ActivityHistoryAdapter(List<ActivityHistoryItem> activityHistoryList) {
        this.activityHistoryList = activityHistoryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_history_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ActivityHistoryItem activity = activityHistoryList.get(position);
        holder.tvActivityName.setText(activity.getActivityName());
        holder.tvTimestamp.setText(activity.getTimestamp());
    }

    @Override
    public int getItemCount() {
        return activityHistoryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvActivityName, tvTimestamp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvActivityName = itemView.findViewById(R.id.tv_activity_name);
            tvTimestamp = itemView.findViewById(R.id.tv_timestamp);
        }
    }
}

