package com.mobdeve.group5.archersnav.ui.activity.main.ui.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mobdeve.group5.archersnav.databinding.FragmentLocationBinding;

public class LocationFragment extends Fragment {

    private FragmentLocationBinding binding;
    private LocationAdapter locationAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Create factory
        LocationViewModelFactory factory = new LocationViewModelFactory(requireContext());

        // Initialize ViewModel using the factory
        LocationViewModel locationViewModel =
                new ViewModelProvider(this, factory).get(LocationViewModel.class);

        binding = FragmentLocationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        binding.recyclerFavorites.setLayoutManager(new LinearLayoutManager(getContext()));

        // Observe favorites
        locationViewModel.getFavoriteBuildingsLiveData().observe(getViewLifecycleOwner(), favorites -> {
            locationAdapter = new LocationAdapter(
                    getContext(),
                    favorites,
                    locationViewModel
            );
            binding.recyclerFavorites.setAdapter(locationAdapter);
        });

        return root;
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