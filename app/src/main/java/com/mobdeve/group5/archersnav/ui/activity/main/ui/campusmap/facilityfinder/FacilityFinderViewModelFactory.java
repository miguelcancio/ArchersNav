package com.mobdeve.group5.archersnav.ui.activity.main.ui.campusmap.facilityfinder;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.mobdeve.group5.archersnav.utils.FavoritesRepository;

public class FacilityFinderViewModelFactory implements ViewModelProvider.Factory {

    private FavoritesRepository repository;

    public FacilityFinderViewModelFactory(Context context) {
        this.repository = new FavoritesRepository(context.getApplicationContext());
    }

    @SuppressWarnings("unchecked")
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(FacilityFinderViewModel.class)) {
            return (T) new FacilityFinderViewModel(repository); // Safe cast
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}

