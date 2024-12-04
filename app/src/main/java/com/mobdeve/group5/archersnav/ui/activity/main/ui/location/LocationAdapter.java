package com.mobdeve.group5.archersnav.ui.activity.main.ui.location;

import android.content.Context;
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

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private Context context;
    private List<Building> buildingList;

    private Set<String> favorites = new HashSet<>();
    private LocationViewModel viewModel;

    // Constructor
    public LocationAdapter(Context context,
                                 List<Building> buildingList,
                                 LocationViewModel viewModel) {
        this.context = context;
        this.buildingList = buildingList;
        this.viewModel = viewModel;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_building, parent, false);
        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
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
        }
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
    public static class LocationViewHolder extends RecyclerView.ViewHolder {
        ImageView buildingImage;
        TextView buildingName;
        ImageButton favoriteButton;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);
            buildingImage = itemView.findViewById(R.id.imageBuilding);
            buildingName = itemView.findViewById(R.id.textBuildingName);
            favoriteButton = itemView.findViewById(R.id.btnFavorite);
        }
    }
}