package com.mobdeve.group5.archersnav.ui.activity.main.ui.emergency.child;

import static androidx.core.text.HtmlCompat.fromHtml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.Fragment;

import com.mobdeve.group5.archersnav.R;
import com.mobdeve.group5.archersnav.databinding.FragmentEmergencyProceduresBinding;
import com.mobdeve.group5.archersnav.utils.DialogUtils;

public class EmergencyProceduresFragment extends Fragment {

    private FragmentEmergencyProceduresBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentEmergencyProceduresBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.fire_emergency),
                        fromHtml(getString(R.string.fire_emergency_procedure),
                                HtmlCompat.FROM_HTML_MODE_COMPACT).toString()
                );
            }
        });

        binding.earthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.earthquake_emergency),
                        fromHtml(getString(R.string.earthquake_procedure_text),
                                HtmlCompat.FROM_HTML_MODE_COMPACT).toString()
                );
            }
        });

        binding.bullying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.bullying_emergency),
                        fromHtml(getString(R.string.bullying_prevention_procedure_text),
                                HtmlCompat.FROM_HTML_MODE_COMPACT).toString()
                );
            }
        });

        binding.bombThreat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.bomb_threat_emergency),
                        fromHtml(getString(R.string.bomb_threat_procedure_text),
                                HtmlCompat.FROM_HTML_MODE_COMPACT).toString()
                );
            }
        });

        binding.healthEmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showBuildingInfoDialog(
                        getContext(),
                        getString(R.string.health_emergency),
                        fromHtml(getString(R.string.health_emergency_procedure_text),
                                HtmlCompat.FROM_HTML_MODE_COMPACT).toString()
                );
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}