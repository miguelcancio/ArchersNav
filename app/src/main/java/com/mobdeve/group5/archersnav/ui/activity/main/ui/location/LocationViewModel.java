package com.mobdeve.group5.archersnav.ui.activity.main.ui.location;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.firebase.auth.FirebaseAuth;
import com.mobdeve.group5.archersnav.data.local.dao.BuildingDao;
import com.mobdeve.group5.archersnav.data.model.Building;
import com.mobdeve.group5.archersnav.utils.FavoritesRepository;

import java.util.List;

public class LocationViewModel extends ViewModel {

    private FavoritesRepository favoritesRepository;
    private MutableLiveData<List<Building>> favoritesLiveData;
    private BuildingDao buildingDao;
    private FirebaseAuth firebaseAuth;
    private String dlsuEmail;

    public LocationViewModel(FavoritesRepository repository) {
        firebaseAuth = FirebaseAuth.getInstance();
        dlsuEmail = firebaseAuth.getCurrentUser().getEmail();
        favoritesRepository = repository;
        this.buildingDao = buildingDao;
        favoritesLiveData = new MutableLiveData<>();
        loadFavorites();
    }

    private void loadFavorites() {
        favoritesLiveData.setValue(favoritesRepository.getAllFavorites(dlsuEmail));
    }

    public LiveData<List<Building>> getFavoriteBuildingsLiveData() {
        return favoritesLiveData;
    }

    public void addFavorite(String buildingName) {
        favoritesRepository.saveFavorite(buildingName);
        loadFavorites(); // Refresh the list of favorite buildings
    }

    public void removeFavorite(String buildingName) {
        favoritesRepository.removeFavorite(buildingName);
        loadFavorites(); // Refresh the list of favorite buildings
    }
}