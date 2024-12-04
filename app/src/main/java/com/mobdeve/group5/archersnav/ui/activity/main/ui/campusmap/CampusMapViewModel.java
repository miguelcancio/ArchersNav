package com.mobdeve.group5.archersnav.ui.activity.main.ui.campusmap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CampusMapViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CampusMapViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}