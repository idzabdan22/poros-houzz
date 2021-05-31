package com.app.recyleviewhome.AddToMyHouse;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.recyleviewhome.R;

public class MyHouseFragment extends Fragment {

    View v;
    TextView designButton, furnitureButton;

    public MyHouseFragment() {
        // Required empty public constructor

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_myhouse, container, false);

        designButton = v.findViewById(R.id.myhousetext);
        furnitureButton = v.findViewById(R.id.funitureTextView);

        design_category_myhouse design = new design_category_myhouse();
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        ft.replace(R.id.framelayoutmyhouse, design);
        ft.addToBackStack(null);
        ft.commit();

        designButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                design_category_myhouse design = new design_category_myhouse();
                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.framelayoutmyhouse, design);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        furnitureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                furniture_category_myhouse furniture = new furniture_category_myhouse();
                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.framelayoutmyhouse, furniture);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return v;
    }

}