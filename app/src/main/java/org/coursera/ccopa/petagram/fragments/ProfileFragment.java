package org.coursera.ccopa.petagram.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.coursera.ccopa.petagram.R;
import org.coursera.ccopa.petagram.adapters.PetProfileAdapter;
import org.coursera.ccopa.petagram.models.PetModel;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    private List<PetModel> petModelList;

    private RecyclerView recyclerPetProfile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        recyclerPetProfile = view.findViewById(R.id.recyclerPetProfile);
        recyclerPetProfile.setLayoutManager(new GridLayoutManager(getContext(), 3));

        generatePets();
        initPetAdapter();

        return view;
    }

    private void initPetAdapter() {
        PetProfileAdapter petProfileAdapter = new PetProfileAdapter(petModelList);
        recyclerPetProfile.setAdapter(petProfileAdapter);
    }

    private void generatePets() {
        petModelList = new ArrayList<>();
        petModelList.add(new PetModel(R.drawable.jiffpom1, "Jiffpom1", 3, false));
        petModelList.add(new PetModel(R.drawable.jiffpom2, "Jiffpom2", 2, false));
        petModelList.add(new PetModel(R.drawable.jiffpom3, "Jiffpom3", 5, false));
        petModelList.add(new PetModel(R.drawable.jiffpom4, "Jiffpom4", 1, false));
        petModelList.add(new PetModel(R.drawable.jiffpom5, "Jiffpom5", 2, false));
        petModelList.add(new PetModel(R.drawable.jiffpom6, "Jiffpom6", 4, false));
        petModelList.add(new PetModel(R.drawable.jiffpom7, "Jiffpom7", 2, false));
        petModelList.add(new PetModel(R.drawable.jiffpom8, "Jiffpom8", 4, false));
        petModelList.add(new PetModel(R.drawable.jiffpom9, "Jiffpom9", 5, false));
    }
}