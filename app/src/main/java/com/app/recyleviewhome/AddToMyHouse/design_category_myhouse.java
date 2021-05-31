package com.app.recyleviewhome.AddToMyHouse;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.app.recyleviewhome.PassingData.DataApps;
import com.app.recyleviewhome.R;
import com.app.recyleviewhome.ui.modalClass;

public class design_category_myhouse extends Fragment {

    ImageView bedRoom, bathRoom, kitchen, livingRoom;
    modalClass[] design = DataApps.getInstance().add;

    public design_category_myhouse() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_design_category_myhouse, container, false);
        bedRoom = v.findViewById(R.id.bedroom_myhouse);
        bathRoom = v.findViewById(R.id.bathroom_myhouse);
        kitchen = v.findViewById(R.id.kitchen_myhouse);
        livingRoom = v.findViewById(R.id.living_myhouse);
//
        if(design[0] != (null))bedRoom.setImageResource(design[0].getImage());
        if(design[1] != (null))bathRoom.setImageResource(design[1].getImage());
        if(design[2] != (null))kitchen.setImageResource(design[2].getImage());
        if(design[3] != (null))livingRoom.setImageResource(design[3].getImage());

        return v;
    }
}