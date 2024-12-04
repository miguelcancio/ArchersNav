package com.mobdeve.group5.archersnav.data.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "building",
        foreignKeys = @ForeignKey(
                entity = User.class,
                parentColumns = "dlsuEmail",
                childColumns = "dlsuEmail",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index(value = "dlsuEmail")} // Improves query performance
)
public class Building {
    @PrimaryKey
    @NonNull
    private String buildingName;

    @NonNull
    private String dlsuEmail; // Foreign key

    private String buildingImage;
    private boolean isFavorite;
    private String buildingDetails;
    private String latitude;
    private String longitude;

    public Building(@NonNull String buildingName,
                    @NonNull String dlsuEmail,
                    String buildingImage,
                    boolean isFavorite,
                    String buildingDetails,
                    String latitude,
                    String longitude)
    {
        this.buildingName = buildingName;
        this.dlsuEmail = dlsuEmail;
        this.buildingImage = buildingImage;
        this.isFavorite = isFavorite;
        this.buildingDetails = buildingDetails;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters and Setters
    @NonNull
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(@NonNull String buildingName) {
        this.buildingName = buildingName;
    }

    @NonNull
    public String getDlsuEmail() {
        return dlsuEmail;
    }

    public void setDlsuEmail(@NonNull String dlsuEmail) {
        this.dlsuEmail = dlsuEmail;
    }

    public String getBuildingImage() {
        return buildingImage;
    }

    public void setBuildingImage(String buildingImage) {
        this.buildingImage = buildingImage;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public String getBuildingDetails() {
        return buildingDetails;
    }

    public void setBuildingDetails(String buildingDetails) {
        this.buildingDetails = buildingDetails;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
