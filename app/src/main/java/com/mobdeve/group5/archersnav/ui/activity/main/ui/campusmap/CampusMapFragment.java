package com.mobdeve.group5.archersnav.ui.activity.main.ui.campusmap;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.mobdeve.group5.archersnav.R;
import com.mobdeve.group5.archersnav.databinding.FragmentCampusMapBinding;
import com.mobdeve.group5.archersnav.utils.DialogUtils;

public class CampusMapFragment extends Fragment {

    private FragmentCampusMapBinding binding;
    private FusedLocationProviderClient fusedLocationProviderClient;
    private ActivityResultLauncher<String> requestPermissionLauncher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the launcher for a single permission
        requestPermissionLauncher = registerForActivityResult(
                new ActivityResultContracts.RequestPermission(),
                isGranted -> {
                    if (isGranted) {
                        // Permission granted - Fetch location
                        getCurrentLocation();
                    } else {
                        // Permission denied
                        Toast.makeText(requireContext(), "Location permission denied", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CampusMapViewModel campusMapViewModel =
                new ViewModelProvider(this).get(CampusMapViewModel.class);
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(requireContext());

        binding = FragmentCampusMapBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnFacilityFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrentLocation();
                Navigation.findNavController(v)
                        .navigate(R.id.action_campusMapFragment_to_facilityFinderFragment);
            }
        });



        binding.btnRealTimeDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.btnHenrySy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.henry_sy),
                        getString(R.string.henry_sy_details)
                );
            }
        });

        binding.btnStJoseph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.br_joseph),
                        getString(R.string.st_joseph_hall_details)
                );
            }
        });

        binding.btnStMiguel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.st_miguel),
                        getString(R.string.st_miguel_hall_details)
                );
            }
        });

        binding.btnVelasco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.velasco),
                        getString(R.string.velasco_hall_details)
                );
            }
        });

        binding.btnBrJohn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.br_john),
                        getString(R.string.br_john_hall_details)
                );
            }
        });

        binding.btnStLaSalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.la_salle),
                        getString(R.string.st_la_salle_hall_details)
                );
            }
        });

        binding.btnBrConnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.connon_hall),
                        getString(R.string.br_connon_hall_details)
                );
            }
        });

        binding.btnEnriqueYuchengco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.yuchengco),
                        getString(R.string.yuchengco_hall_details)
                );
            }
        });

        binding.btnGokongwei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.yuchengco),
                        getString(R.string.gokongwei_hall_details)
                );
            }
        });

        binding.btnBrAndrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.br_andrew),
                        getString(R.string.br_andrew_hall_details)
                );
            }
        });

        binding.btnEnriqueRazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.razon),
                        getString(R.string.enrique_razon_hall_details)
                );
            }
        });

        binding.btnScienceTechResearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.strc),
                        getString(R.string.science_technology_research_center_details)
                );
            }
        });

        binding.btnBloemen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.bloemen_hall),
                        getString(R.string.bloemen_hall_details)
                );
            }
        });

        return root;
    }

    private boolean isLocationPermissionGranted() {
        return ContextCompat.checkSelfPermission(
                requireContext(), Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED;
    }

    private void requestLocationPermission() {
        requestPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION);
    }

    private void getCurrentLocation() {
        // Check if location permission is granted
        if (!isLocationPermissionGranted()) {
            requestLocationPermission();
            return;
        }

        // Initialize Fused Location Provider
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(requireContext());

        try {
            // Check for last known location first
            fusedLocationProviderClient.getLastLocation()
                    .addOnSuccessListener(location -> {
                        if (location != null) {
                            // Use the location (lat, long)
                            double latitude = location.getLatitude();
                            double longitude = location.getLongitude();
                            Toast.makeText(requireContext(), "Lat: " + latitude + ", Lng: " + longitude, Toast.LENGTH_LONG).show();
                        } else {
                            // Request fresh location if last location is null
                            requestFreshLocation();
                        }
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(requireContext(), "Failed to fetch location: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    });
        } catch (SecurityException e) {
            Toast.makeText(requireContext(), "Location access denied", Toast.LENGTH_SHORT).show();
        }
    }

    private void requestFreshLocation() {
        LocationRequest locationRequest = LocationRequest.create()
                .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
                .setInterval(10000)  // Update every 10 seconds
                .setFastestInterval(5000);  // Minimum 5 seconds

        LocationCallback locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                if (locationResult == null) {
                    Toast.makeText(requireContext(), "Failed to fetch updated location", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Retrieve the updated location
                double latitude = locationResult.getLastLocation().getLatitude();
                double longitude = locationResult.getLastLocation().getLongitude();
                //Toast.makeText(requireContext(), "Updated Lat: " + latitude + ", Lng: " + longitude, Toast.LENGTH_LONG).show();

                // Stop location updates after fetching the first location
                fusedLocationProviderClient.removeLocationUpdates(this);
            }
        };

        // Request location updates
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, null);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onPause() {
        super.onPause();
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.getBackStackEntryCount() > 0) {
            childFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
    }
}