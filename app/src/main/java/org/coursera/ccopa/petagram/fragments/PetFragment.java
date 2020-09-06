package org.coursera.ccopa.petagram.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.coursera.ccopa.petagram.R;
import org.coursera.ccopa.petagram.adapters.PetAdapter;
import org.coursera.ccopa.petagram.models.PetModel;

import java.util.ArrayList;
import java.util.List;

public class PetFragment extends Fragment {

    private List<PetModel> petModelList;

    private RecyclerView recyclerPet;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pet, container, false);

        recyclerPet = view.findViewById(R.id.recyclerPet);
        recyclerPet.setLayoutManager(new LinearLayoutManager(getContext()));

        generatePets();
        initPetAdapter();

        return view;
    }

    private void initPetAdapter() {
        PetAdapter petAdapter = new PetAdapter(petModelList);
        recyclerPet.setAdapter(petAdapter);
    }

    private void generatePets() {
        petModelList = new ArrayList<>();
        petModelList.add(new PetModel(R.drawable.cat1, "Bianca", 3, false));
        petModelList.add(new PetModel(R.drawable.cat2, "Garfield", 2, false));
        petModelList.add(new PetModel(R.drawable.cat3, "Azrael", 5, false));
        petModelList.add(new PetModel(R.drawable.dog1, "Blacky", 1, false));
        petModelList.add(new PetModel(R.drawable.dog2, "Suchard", 2, false));
        petModelList.add(new PetModel(R.drawable.dog3, "Kuroinu", 4, false));
    }
}