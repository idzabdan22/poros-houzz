package com.app.recyleviewhome.Home;

import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.app.recyleviewhome.R;

public class HomeFragment extends android.app.Fragment {
    View v;

    TextView designtextbut,furniturebut;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_home, container, false);
        designtextbut = v.findViewById(R.id.buttondesign);
        furniturebut = v.findViewById(R.id.buttonSave);


        universal_category universal = new universal_category();
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayoutHome, universal);
        ft.addToBackStack(null);
        ft.commit();

        designtextbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                design_category_fix desain = new design_category_fix();
                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayoutHome, desain);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        furniturebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                furniture_category_fix furniture = new furniture_category_fix();
                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayoutHome, furniture);
                ft.addToBackStack(null);
                ft.commit();

            }
        });
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle saveInstaceState){
        super.onCreate(saveInstaceState);
    }
}
