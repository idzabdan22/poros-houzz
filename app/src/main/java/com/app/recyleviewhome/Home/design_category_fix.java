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


public class design_category_fix extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    View v;
    ArrayList<modalClass> mlist;
    customAdapter customAdapterobj;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_design_category_fix, container, false);
        recyclerView = v.findViewById(R.id.recycleviewhome_design);
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
    }
}