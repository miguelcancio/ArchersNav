package com.mobdeve.group5.archersnav.ui.activity.main.ui.emergency;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.mobdeve.group5.archersnav.R;
import com.mobdeve.group5.archersnav.databinding.FragmentEmergencyBinding;

public class EmergencyInformationFragment extends Fragment {

    private FragmentEmergencyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EmergencyInformationViewModel emergencyInformationViewModel =
                new ViewModelProvider(this).get(EmergencyInformationViewModel.class);

        binding = FragmentEmergencyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnEmergencyProcedures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v)
                        .navigate(R.id.action_navigation_emergency_to_navigation_emergency_procedures);
            }
        });

        binding.btnEmergencyContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v)
                        .navigate(R.id.action_navigation_emergency_to_navigation_emergency_contact);
            }
        });

        binding.btnEvacuationAreas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v)
                        .navigate(R.id.action_navigation_emergency_to_navigation_evacuation_areas);
            }
        });

        binding.btnMobilityAccessGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v)
                        .navigate(R.id.action_navigation_emergency_to_navigation_mobility_access_guide);
            }
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