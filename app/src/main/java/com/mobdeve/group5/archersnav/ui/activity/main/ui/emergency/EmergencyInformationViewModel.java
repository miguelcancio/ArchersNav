package com.mobdeve.group5.archersnav.ui.activity.main.ui.emergency;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EmergencyInformationViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EmergencyInformationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}