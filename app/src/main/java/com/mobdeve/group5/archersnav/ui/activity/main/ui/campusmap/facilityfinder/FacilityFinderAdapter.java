package com.mobdeve.group5.archersnav.ui.activity.main.ui.campusmap.facilityfinder;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mobdeve.group5.archersnav.R;
import com.mobdeve.group5.archersnav.data.model.Building;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FacilityFinderAdapter extends RecyclerView.Adapter<FacilityFinderAdapter.BuildingViewHolder> {

    private Context context;
    private List<Building> buildingList;

    private Set<String> favorites = new HashSet<>();
    private FacilityFinderViewModel viewModel;

    // Constructor
    public FacilityFinderAdapter(Context context,
                                 List<Building> buildingList,
                                 FacilityFinderViewModel viewModel) {
        this.context = context;
        this.buildingList = buildingList;
        this.viewModel = viewModel;
    }

    @NonNull
    @Override
    public BuildingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_building, parent, false);
        return new BuildingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuildingViewHolder holder, int position) {
        Building building = buildingList.get(position);
        if (building != null) {
            holder.buildingName.setText(building.getBuildingName());
            // Set favorite icon
            holder.favoriteButton.setImageResource(
                    building.getIsFavorite() ? R.drawable.ic_star_filled : R.drawable.ic_star_outline
            );

            // Dynamically load the image
            String imageName = building.getBuildingImage();  // Get the image resource name from the model
            int imageResId = holder.itemView.getContext().getResources()
                    .getIdentifier(imageName, "drawable", holder.itemView.getContext().getPackageName());

            // Check if the drawable resource exists and set the image
            if (imageResId != 0) {
                holder.buildingImage.setImageResource(imageResId);  // Set the image dynamically
            } else {
                // Set a default image if resource is not found
                holder.buildingImage.setImageResource(R.drawable.campus_map);  // Use a default image if the resource doesn't exist
            }


            // Update favorite button icon
            if (favorites.contains(building.getBuildingName())) {
                holder.favoriteButton.setImageResource(R.drawable.ic_star_filled); // Filled star
            } else {
                holder.favoriteButton.setImageResource(R.drawable.ic_star_outline); // Outline star
            }

            // Handle favorite button click
            holder.favoriteButton.setOnClickListener(v -> {
                if (favorites.contains(building.getBuildingName())) {
                    viewModel.removeFavorite(building.getBuildingName());
                } else {
                    viewModel.addFavorite(building.getBuildingName());
                }
            });

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openGoogleMapsInBrowser(building.getLatitude(), building.getLongitude());
                }
            });
        }
    }

    // Method to open Google Maps in the browser
    private void openGoogleMapsInBrowser(String latitude, String longitude) {
        // Build the Google Maps URL
        String uri = "https://www.google.com/maps?q=" + latitude + "," + longitude;

        // Create an Intent to open the URL in the browser
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        context.startActivity(browserIntent);
    }

    public void setFavorites(Set<String> favorites) {
        this.favorites = favorites;
        notifyDataSetChanged(); // Refresh the UI
    }

    @Override
    public int getItemCount() {
        return buildingList.size();
    }

    // ViewHolder class
    public static class BuildingViewHolder extends RecyclerView.ViewHolder {
        ImageView buildingImage;
        TextView buildingName;
        ImageButton favoriteButton;

        public BuildingViewHolder(@NonNull View itemView) {
            super(itemView);
            buildingImage = itemView.findViewById(R.id.imageBuilding);
            buildingName = itemView.findViewById(R.id.textBuildingName);
            favoriteButton = itemView.findViewById(R.id.btnFavorite);
        }
    }
}

