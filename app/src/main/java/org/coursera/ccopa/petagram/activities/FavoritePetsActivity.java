package org.coursera.ccopa.petagram.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.coursera.ccopa.petagram.R;
import org.coursera.ccopa.petagram.adapters.PetAdapter;
import org.coursera.ccopa.petagram.models.PetModel;

import java.util.ArrayList;
import java.util.List;

public class FavoritePetsActivity extends AppCompatActivity {

    private List<PetModel> petModelList;

    private RecyclerView recyclerFavoritePets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_pets);

        Toolbar toolbarFavoritePets = findViewById(R.id.toolbarFavoritePets);
        toolbarFavoritePets.setNavigationOnClickListener(view -> finish());

        recyclerFavoritePets = findViewById(R.id.recyclerFavoritePets);
        recyclerFavoritePets.setLayoutManager(new LinearLayoutManager(this));

        generatePets();
        initPetAdapter();
    }

    private void initPetAdapter() {
        PetAdapter petAdapter = new PetAdapter(petModelList);
        recyclerFavoritePets.setAdapter(petAdapter);
    }

    private void generatePets() {
        petModelList = new ArrayList<>();
        petModelList.add(new PetModel(R.drawable.dog3, "Pluto", 2, false));
        petModelList.add(new PetModel(R.drawable.cat2, "Michi", 3, false));
        petModelList.add(new PetModel(R.drawable.dog1, "Docky", 1, false));
        petModelList.add(new PetModel(R.drawable.cat1, "Roro", 5, false));
    }
}