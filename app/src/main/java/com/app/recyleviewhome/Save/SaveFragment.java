package com.app.recyleviewhome.Save;

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

public class SaveFragment extends android.app.Fragment {
    View v;

    TextView designtextbut,furnituretextbut;

    public SaveFragment() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_save, container, false);
        designtextbut = v.findViewById(R.id.buttondesign_save);
        furnituretextbut = v.findViewById(R.id.buttonfurniture_save);
//        navButton = v.findViewById(R.id.home_fragment_but);


        universal_category_save universal = new universal_category_save();
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayoutHome_save, universal);
        ft.addToBackStack(null);
        ft.commit();

        furnituretextbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                furniture_category_save furniture = new furniture_category_save();
                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayoutHome_save, furniture);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        designtextbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                design_category_save desain = new design_category_save();
                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayoutHome_save, desain);
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
