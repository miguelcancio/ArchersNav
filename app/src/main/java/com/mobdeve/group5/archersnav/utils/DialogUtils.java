package com.mobdeve.group5.archersnav.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.mobdeve.group5.archersnav.R;

public class DialogUtils {

    /**
     * Shows a dialog with building information.
     *
     * @param context        The context in which the dialog should be shown.
     * @param buildingName   The name of the building to display in the dialog.
     * @param buildingDetails The details of the building to display in the dialog.
     */
    public static void showBuildingInfoDialog(Context context, String buildingName, String buildingDetails) {
        // Inflate the custom layout
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.dialog_building_info, null);

        // Reference the views in the dialog layout
        TextView tvBuildingName = dialogView.findViewById(R.id.tvBuildingName);
        TextView tvBuildingDetails = dialogView.findViewById(R.id.tvBuildingDetails);

        // Set the data
        tvBuildingName.setText(buildingName);
        tvBuildingDetails.setText(buildingDetails);

        // Build and show the dialog
        AlertDialog dialog = new AlertDialog.Builder(context)
                .setView(dialogView)
                .setCancelable(true)
                .setPositiveButton("Close", (dialogInterface, which) -> dialogInterface.dismiss())
                .create();

        // Add a transparent background to make rounded corners visible
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        dialog.show();
    }
}

