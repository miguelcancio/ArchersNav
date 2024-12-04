package com.mobdeve.group5.archersnav.ui.activity.main.ui.campusmap.facilityfinder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mobdeve.group5.archersnav.data.model.Building;
import com.mobdeve.group5.archersnav.databinding.FragmentFacilityFinderBinding;

import java.util.List;

public class FacilityFinderFragment extends Fragment {

    private FragmentFacilityFinderBinding binding;
    private List<Building> buildingList;
    private FacilityFinderAdapter facilityFinderAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Create factory
        FacilityFinderViewModelFactory factory = new FacilityFinderViewModelFactory(requireContext());

        // Initialize ViewModel using the factory
        FacilityFinderViewModel facilityFinderViewModel =
                new ViewModelProvider(this, factory).get(FacilityFinderViewModel.class);

        binding = FragmentFacilityFinderBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.buildingRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        // Set up the adapter
        facilityFinderAdapter = new FacilityFinderAdapter(
                getContext(),
                facilityFinderViewModel.getBuildings(),
                facilityFinderViewModel
        );
        binding.buildingRecyclerView.setAdapter(facilityFinderAdapter);

        // Observe favorites
        facilityFinderViewModel.getFavoritesLiveData().observe(getViewLifecycleOwner(), favorites -> {
            facilityFinderAdapter.setFavorites(favorites);
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onPrimaryNavigationFragmentChanged(boolean isPrimaryNavigationFragment) {
        super.onPrimaryNavigationFragmentChanged(isPrimaryNavigationFragment);
    }
}