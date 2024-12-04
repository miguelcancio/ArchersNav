package com.mobdeve.group5.archersnav;

public class ActivityHistoryItem {
    private String activityName;
    private String timestamp;

    public ActivityHistoryItem(String activityName, String timestamp) {
        this.activityName = activityName;
        this.timestamp = timestamp;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
