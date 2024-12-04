package com.mobdeve.group5.archersnav.ui.activity.main.ui.campusmap.facilityfinder;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.firebase.auth.FirebaseAuth;
import com.mobdeve.group5.archersnav.data.model.Building;
import com.mobdeve.group5.archersnav.utils.FavoritesRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FacilityFinderViewModel extends ViewModel {
    private FirebaseAuth firebaseAuth;
    private String dlsuEmail;
    private FavoritesRepository repository;
    private MutableLiveData<Set<String>> favoritesLiveData;
    public FacilityFinderViewModel(@NonNull FavoritesRepository favoritesRepository) {
        firebaseAuth = FirebaseAuth.getInstance();
        dlsuEmail = firebaseAuth.getCurrentUser().getEmail();
        this.repository = favoritesRepository;
        this.favoritesLiveData = new MutableLiveData<>();
        loadFavorites();
    }

    private void loadFavorites() {
        favoritesLiveData.setValue(repository.getFavorites());
    }

    public LiveData<Set<String>> getFavoritesLiveData() {
        return favoritesLiveData;
    }

    public void addFavorite(String buildingName) {
        repository.saveFavorite(buildingName);
        loadFavorites(); // Refresh live data
    }

    public void removeFavorite(String buildingName) {
        repository.removeFavorite(buildingName);
        loadFavorites(); // Refresh live data
    }

    public boolean isFavorite(String buildingName) {
        return repository.isFavorite(buildingName);
    }

    public List<Building> getBuildings() {
        List<Building> buildings = new ArrayList<>();

        // Create Building instances with details as per the provided data
        buildings.add(new Building("Henry Sy Sr. Hall", dlsuEmail,
                "henry_sy", false,
                "Henry Sy Sr. Hall, also known as “Henry” among students, is a 14-story building located in the middle of the campus, and is situated in between two historical buildings, the St. La Salle Hall and the Velasco Hall. The HSSH was built on the concept of a “habitable tree,” illustrating the University’s growing role in education and its commitment to environmental sustainability. The construction of the building began in 2010 as part of the University’s Centennial Renewal Plan, and it has been considered as the “Most Prominent Project”. The building, and its grounds, which is known as the Corazon Aquino Democratic Space or CADS, were formally inaugurated in February 2012.",
                "14.565027260853652", "120.99323769189832"));

        buildings.add(new Building("St. Joseph Hall", dlsuEmail,
                "br_joseph", false,
                "The St. Joseph hall which is commonly called as “SJ” is a six-story structure home to the College of Science, It features classrooms and laboratories, and it formerly served as the university’s main library.",
                "14.565016636927929", "120.99256268515158"));

        buildings.add(new Building("St. Miguel Hall", dlsuEmail,
                "st_miguel", false,
                "The St. Miguel Hall, completed in 1969, contains academic departments and engineering laboratories. Originally called St. Benilde Hall, it was renamed in honor of St. Michael.",
                "14.56582945253645", "120.99261032073383"));

        buildings.add(new Building("Velasco Hall", dlsuEmail,
                "velasco", false,
                "It is a five-story building constructed in 1981, and houses the College of Engineering. It includes specialized laboratories and classrooms for engineering students. It also caters to students taking GE subjects.",
                "14.565613319584632", "120.99323339139542"));

        buildings.add(new Building("Br. John Hall", dlsuEmail,
                "br_john", false,
                "One of the “isolated” buildings on campus. It is located right beside South Gate, near McDonald’s. The building is named after Br. Celba John, FSC.",
                "14.563719415754267", "120.99379349485774"));

        buildings.add(new Building("St. La Salle Hall", dlsuEmail,
                "la_salle", false,
                "The St. La Salle Hall (LS) is the oldest building on campus, completed in 1924 and designed by Tomás Mapúa. This neoclassical, H-shaped structure is known for its white façade along Taft Avenue and serves as De La Salle University’s most historic building. The four-story hall houses classrooms, offices, and key areas like The Most Blessed Sacrament Chapel on the second floor and the Lasallian Brothers’ residence on the fourth. The ground floor features Perico’s cafeteria and Gate 1. Retrofitted between 2010-2012 for disaster resilience, the building hosts the College of Business and the School of Economics.",
                "14.564212367626459", "120.99418446602213"));

        buildings.add(new Building("Br. Connon Hall", dlsuEmail,
                "connon_hall", false,
                "The Br. Gabriel Connon Hall, named after former DLSU President Br. Hyacinth Gabriel Connon, FSC, is a 5-story building that houses various student services and administrative offices. These include the University Clinic, the Office for Counseling and Career Services (OCCS), and the Office of Student Affairs. The building also provides spaces for student organizations, including the University Student Government, the Council of Student Organizations, student media groups, and the University’s performing arts groups. On the ground floor, the Waldo Perfecto Seminar Room is also located.",
                "14.564971866910504", "120.99318665252875"));

        buildings.add(new Building("Don Enrique Yuchengco Hall", dlsuEmail,
                "yuchengco", false,
                "Don Enrique T. Yuchengco Hall, commonly called “Yuch,” was completed in 2002 and originally named the Central Administration Building. Students here are mixed but mostly shared by RVR-COB, SOE and CLA. This was built with support from Ambassador Alfonso Yuchengco in honor of his father, the building houses the University’s central administrative offices. It features an art gallery on the second floor and a state-of-the-art auditorium on the third. Described by Br. Rolando Dizon FSC as the “nerve center” of the University, it serves as a hub for university activities, including theater and teleconference rooms.",
                "14.564760574055162", "120.99317964012648"));

        buildings.add(new Building("Gokongwei Hall", dlsuEmail,
                "multien_marie", false,
                "The Gokongwei Hall commonly called “Goks” is home to the College of Computer Studies and features technology-focused facilities. It underwent major renovations in recent years to modernize its interiors.",
                "14.566478865489819", "120.99294303718678"));

        buildings.add(new Building("Br. Andrew Hall", dlsuEmail,
                "br_andrew", false,
                "Completed in 2006, is a 20-story building that serves the College of Education. It is the tallest academic building in the Philippines.",
                "14.567462620012863", "120.9929274813643"));

        buildings.add(new Building("Enrique Razon Sports Complex", dlsuEmail,
                "razon", false,
                "Built in 1998, this multi-purpose sports facility includes an Olympic-sized pool, track and field oval, table tennis tables and various courts.",
                "14.567169877135315", "120.99213985379528"));

        buildings.add(new Building("Science Technology Research Center", dlsuEmail,
                "strc", false,
                "A facility dedicated to advanced research, housing laboratories and supporting projects from the Colleges of Science and Engineering.",
                "14.566505581421826", "120.99215799612408"));

        buildings.add(new Building("Bloemen Hall", dlsuEmail,
                "bloemen_hall", false,
                "Named after Br. Alphonse Bloemen, FSC, serves as the University’s student center. It houses the University’s student entrepreneurship area known as the Animo Business Innovation Zone, or Animo BIZ, where student kiosks could be found. The building also features food and drink stalls, making it a spot for students to grab a bite or drink, much like a cafeteria.",
                "14.565472214288288", "120.99264283845275"));

        return buildings;
    }
}