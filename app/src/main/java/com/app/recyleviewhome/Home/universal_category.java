package com.app.recyleviewhome.Home;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.recyleviewhome.R;
import com.app.recyleviewhome.ui.customAdapter;
import com.app.recyleviewhome.ui.modalClass;

import java.util.ArrayList;


public class universal_category extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    View v;
    ArrayList<modalClass> mlist;
    customAdapter customAdapterobj;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_universal_category, container, false);
        recyclerView = v.findViewById(R.id.recycleviewhome_universal);
        customAdapterobj = new customAdapter(mlist, getContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(customAdapterobj);
        recyclerView.setHasFixedSize(true);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle saveInstaceState){
        super.onCreate(saveInstaceState);
        mlist = new ArrayList<>();
        mlist.add(new modalClass(R.drawable.bed1, R.string.bed1,R.string.descbedroom,"bedRoom"));
        mlist.add(new modalClass(R.drawable.bed2, R.string.bed2, R.string.descbedroom,"bedRoom"));
        mlist.add(new modalClass(R.drawable.bed3, R.string.bed3, R.string.descbedroom,"bedRoom"));
        mlist.add(new modalClass(R.drawable.dp1, R.string.dp1, R.string.desckitchen, "kitchen"));
        mlist.add(new modalClass(R.drawable.dp2, R.string.dp2, R.string.desckitchen,"kitchen"));
        mlist.add(new modalClass(R.drawable.dp3, R.string.dp3, R.string.desckitchen,"kitchen"));
        mlist.add(new modalClass(R.drawable.km1, R.string.km1, R.string.descbathroom,"bathRoom"));
        mlist.add(new modalClass(R.drawable.km2, R.string.km2, R.string.descbathroom,"bathRoom"));
        mlist.add(new modalClass(R.drawable.km3, R.string.km3, R.string.descbathroom,"bathRoom"));
        mlist.add(new modalClass(R.drawable.liv1, R.string.liv1, R.string.desclivingroom,"livingRoom"));
        mlist.add(new modalClass(R.drawable.liv2, R.string.liv2, R.string.desclivingroom,"livingRoom"));
        mlist.add(new modalClass(R.drawable.liv3, R.string.liv3, R.string.desclivingroom,"livingRoom"));

        mlist.add(new modalClass(R.drawable.chair1, R.string.chair1, R.string.chair_desc, "chair"));
        mlist.add(new modalClass(R.drawable.chair2, R.string.chair2, R.string.chair_desc, "chair"));
        mlist.add(new modalClass(R.drawable.chair3, R.string.chair3, R.string.chair_desc, "chair"));
        mlist.add(new modalClass(R.drawable.kasur1, R.string.kasur1, R.string.kasur_desc, "bed"));
        mlist.add(new modalClass(R.drawable.kasur2, R.string.kasur2, R.string.kasur_desc, "bed"));
        mlist.add(new modalClass(R.drawable.kasur3, R.string.kasur3, R.string.kasur_desc, "bed"));
        mlist.add(new modalClass(R.drawable.lamp1, R.string.lamp1, R.string.lamp_desc, "lamp"));
        mlist.add(new modalClass(R.drawable.lamp2, R.string.lamp2, R.string.lamp_desc, "lamp"));
        mlist.add(new modalClass(R.drawable.lamp3, R.string.lamp3, R.string.lamp_desc, "lamp"));
        mlist.add(new modalClass(R.drawable.meja1, R.string.table1, R.string.meja_desc, "table"));
        mlist.add(new modalClass(R.drawable.meja2, R.string.table2, R.string.meja_desc, "table"));
        mlist.add(new modalClass(R.drawable.meja3, R.string.table3, R.string.meja_desc, "table"));

    }

}

