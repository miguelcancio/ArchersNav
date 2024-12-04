package com.mobdeve.group5.archersnav.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.mobdeve.group5.archersnav.data.model.Building;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FavoritesRepository {

    private SharedPreferences sharedPreferences;

    public FavoritesRepository(Context context) {
        this.sharedPreferences = context.getSharedPreferences("FavoritesPrefs", Context.MODE_PRIVATE);
    }

    public void saveFavorite(String buildingName) {
        Set<String> favorites = sharedPreferences.getStringSet("favorites", new HashSet<>());
        Set<String> updatedFavorites = new HashSet<>(favorites);
        updatedFavorites.add(buildingName);
        sharedPreferences.edit().putStringSet("favorites", updatedFavorites).apply();
    }

    public void removeFavorite(String buildingName) {
        Set<String> favorites = sharedPreferences.getStringSet("favorites", new HashSet<>());
        Set<String> updatedFavorites = new HashSet<>(favorites);
        updatedFavorites.remove(buildingName);
        sharedPreferences.edit().putStringSet("favorites", updatedFavorites).apply();
    }

    public boolean isFavorite(String buildingName) {
        Set<String> favorites = sharedPreferences.getStringSet("favorites", new HashSet<>());
        return favorites.contains(buildingName);
    }

    public Set<String> getFavorites() {
        return sharedPreferences.getStringSet("favorites", new HashSet<>());
    }

    public List<Building> getBuildings(String dlsuEmail) {
        List<Building> buildings = new ArrayList<>();

        // Create Building instances with details as per the provided data
        buildings.add(new Building("Henry Sy Sr. Hall", dlsuEmail,
                "henry_sy", false,
                "Henry Sy Sr. Hall, also known as “Henry” among students, is a 14-story building located in the middle of the campus, and is situated in between two historical buildings, the St. La Salle Hall and the Velasco Hall. The HSSH was built on the concept of a “habitable tree,” illustrating the University’s growing role in education and its commitment to environmental sustainability. The construction of the building began in 2010 as part of the University’s Centennial Renewal Plan, and it has been considered as the “Most Prominent Project”. The building, and its grounds, which is known as the Corazon Aquino Democratic Space or CADS, were formally inaugurated in February 2012.",
                "14.5647 N, 120.9931 E", "14.5647 N, 120.9931 E"));

        buildings.add(new Building("St. Joseph Hall", dlsuEmail,
                "br_joseph", false,
                "The St. Joseph hall which is commonly called as “SJ” is a six-story structure home to the College of Science, It features classrooms and laboratories, and it formerly served as the university’s main library.",
                "14.5645 N, 120.9928 E", "14.5645 N, 120.9928 E"));

        buildings.add(new Building("St. Miguel Hall", dlsuEmail,
                "st_miguel", false,
                "The St. Miguel Hall, completed in 1969, contains academic departments and engineering laboratories. Originally called St. Benilde Hall, it was renamed in honor of St. Michael.",
                "14.5643 N, 120.9925 E", "14.5643 N, 120.9925 E"));

        buildings.add(new Building("Velasco Hall", dlsuEmail,
                "velasco", false,
                "It is a five-story building constructed in 1981, and houses the College of Engineering. It includes specialized laboratories and classrooms for engineering students. It also caters to students taking GE subjects.",
                "14.5641 N, 120.9922 E", "14.5641 N, 120.9922 E"));

        buildings.add(new Building("Br. John Hall", dlsuEmail,
                "br_john", false,
                "One of the “isolated” buildings on campus. It is located right beside South Gate, near McDonald’s. The building is named after Br. Celba John, FSC.",
                "N/A", "N/A"));

        buildings.add(new Building("St. La Salle Hall", dlsuEmail,
                "la_salle", false,
                "The St. La Salle Hall (LS) is the oldest building on campus, completed in 1924 and designed by Tomás Mapúa. This neoclassical, H-shaped structure is known for its white façade along Taft Avenue and serves as De La Salle University’s most historic building. The four-story hall houses classrooms, offices, and key areas like The Most Blessed Sacrament Chapel on the second floor and the Lasallian Brothers’ residence on the fourth. The ground floor features Perico’s cafeteria and Gate 1. Retrofitted between 2010-2012 for disaster resilience, the building hosts the College of Business and the School of Economics.",
                "14.5643 N, 120.9938 E", "14.5643 N, 120.9938 E"));

        buildings.add(new Building("Br. Connon Hall", dlsuEmail,
                "connon_hall", false,
                "The Br. Gabriel Connon Hall, named after former DLSU President Br. Hyacinth Gabriel Connon, FSC, is a 5-story building that houses various student services and administrative offices. These include the University Clinic, the Office for Counseling and Career Services (OCCS), and the Office of Student Affairs. The building also provides spaces for student organizations, including the University Student Government, the Council of Student Organizations, student media groups, and the University’s performing arts groups. On the ground floor, the Waldo Perfecto Seminar Room is also located.",
                "14.5640 N, 120.9935 E", "14.5640 N, 120.9935 E"));

        buildings.add(new Building("Don Enrique Yuchengco Hall", dlsuEmail,
                "yuchengco", false,
                "Don Enrique T. Yuchengco Hall, commonly called “Yuch,” was completed in 2002 and originally named the Central Administration Building. Students here are mixed but mostly shared by RVR-COB, SOE and CLA. This was built with support from Ambassador Alfonso Yuchengco in honor of his father, the building houses the University’s central administrative offices. It features an art gallery on the second floor and a state-of-the-art auditorium on the third. Described by Br. Rolando Dizon FSC as the “nerve center” of the University, it serves as a hub for university activities, including theater and teleconference rooms.",
                "14.5638 N, 120.9932 E", "14.5638 N, 120.9932 E"));

        buildings.add(new Building("Gokongwei Hall", dlsuEmail,
                "multien_marie", false,
                "The Gokongwei Hall commonly called “Goks” is home to the College of Computer Studies and features technology-focused facilities. It underwent major renovations in recent years to modernize its interiors.",
                "14.5636 N, 120.9929 E", "14.5636 N, 120.9929 E"));

        buildings.add(new Building("Br. Andrew Hall", dlsuEmail,
                "br_andrew", false,
                "Completed in 2006, is a 20-story building that serves the College of Education. It is the tallest academic building in the Philippines.",
                "14.5634 N, 120.9926 E", "14.5634 N, 120.9926 E"));

        buildings.add(new Building("Enrique Razon Sports Complex", dlsuEmail,
                "razon", false,
                "Built in 1998, this multi-purpose sports facility includes an Olympic-sized pool, track and field oval, table tennis tables and various courts.",
                "14.5630 N, 120.9920 E", "14.5630 N, 120.9920 E"));

        buildings.add(new Building("Science Technology Research Center", dlsuEmail,
                "strc", false,
                "A facility dedicated to advanced research, housing laboratories and supporting projects from the Colleges of Science and Engineering.",
                "14.5630 N, 120.9920 E", "14.5630 N, 120.9920 E"));

        buildings.add(new Building("Bloemen Hall", dlsuEmail,
                "bloemen_hall", false,
                "Named after Br. Alphonse Bloemen, FSC, serves as the University’s student center. It houses the University’s student entrepreneurship area known as the Animo Business Innovation Zone, or Animo BIZ, where student kiosks could be found. The building also features food and drink stalls, making it a spot for students to grab a bite or drink, much like a cafeteria.",
                "14.5641 N, 120.9931 E", "14.5641 N, 120.9931 E"));

        return buildings;
    }

    // Function to get all favorite buildings and update their isFavorite status
    public List<Building> getAllFavorites(String dlsuEmail) {
        List<Building> allBuildings = getBuildings(dlsuEmail); // Get all buildings
        Set<String> favoriteNames = sharedPreferences.getStringSet("favorites", new HashSet<>());
        List<Building> favoriteBuildings = new ArrayList<>();

        // Iterate over all buildings and check if they are favorites
        for (Building building : allBuildings) {
            if (favoriteNames.contains(building.getBuildingName())) {
                building.setIsFavorite(true); // Mark as favorite
                favoriteBuildings.add(building); // Add to the list of favorites
            } else {
                building.setIsFavorite(false); // Ensure non-favorite buildings are marked as such
            }
        }

        return favoriteBuildings;
    }
}
