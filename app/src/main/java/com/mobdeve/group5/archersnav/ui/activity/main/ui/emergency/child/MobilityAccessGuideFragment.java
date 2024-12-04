package com.mobdeve.group5.archersnav.ui.activity.main.ui.emergency.child;

import static androidx.core.text.HtmlCompat.fromHtml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.Fragment;

import com.mobdeve.group5.archersnav.databinding.FragmentMobilityAccessGuideBinding;

public class MobilityAccessGuideFragment extends Fragment {

    private FragmentMobilityAccessGuideBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMobilityAccessGuideBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.procedureTextView.setText(
                fromHtml(getMobilityAccessGuideText(), HtmlCompat.FROM_HTML_MODE_COMPACT));

        return root;
    }

    private String getMobilityAccessGuideText() {
        return
                "<b>1. Ramps and Accessible Routes</b><br><br>" +
                        "• <b>Br. Andrew Hall:</b> <br>Ramp available at the main entrance.<br>" +
                        " <br><b>• St. La Salle Building:</b><br> Ramp located on the south side near the cafeteria.<br><br>" +

                        "<b>2. Elevators</b><br><br>" +
                        "• <b>Library Building:</b> <br>Elevators available on all floors with Braille labels and auditory signals.<br>" +
                        "<br><b>• Henry Sy Hall:</b> <br>Elevators located next to the main staircase.<br><br>" +

                        "<b>3. Accessible Restrooms</b><br><br>" +
                        "• <b>Chapel of the Most Blessed Sacrament:</b><br> Accessible restroom near the side entrance.<br>" +
                        "<br><b>• Learning Commons:</b><br> Wheelchair-accessible restrooms on each floor.<br><br>" +

                        "<b>4. Parking for Persons with Disabilities (PWD)</b><br><br>" +
                        "• <b>South Gate Parking:</b><br> 4 PWD-designated spaces near the main gate.<br>" +
                        "<br><b>• North Wing Parking Lot:</b><br> 2 accessible parking spaces close to the elevator entrance.<br><br>" +

                        "<b>5. Emergency Assistance</b><br><br>" +
                        "• Designated assistance points located near the east exit of Br. Andrew Hall.<br>" +
                        "<br>• Assistance teams available during emergencies at Henry Sy Hall.<br><br>" +

                        "<br><b>Contact Information</b><br>" +
                        "<br><b>Accessibility Services Office:</b><br> Call +63 2 524-4611 or email <a href=\"mailto:accessibility@university.com\">accessibility@university.com</a>";
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}