package com.app.recyleviewhome.PassingData;

import com.app.recyleviewhome.ui.modalClass;

import java.util.ArrayList;

public class DataApps {
    private static DataApps instance = null;

    public static DataApps getInstance(){

        if(instance==null){
            instance = new DataApps();
        }

        return instance;
    }

    public ArrayList<modalClass> save = new ArrayList<>();
    public ArrayList<modalClass> saveFurniture = new ArrayList<>();
    public ArrayList<modalClass> saveDesign = new ArrayList<>();

    public modalClass[] add = new modalClass[4];
    public boolean[] designState = {false,false,false,false};

    public ArrayList<modalClass> addFurniture = new ArrayList<>();
    public boolean[] furnitureState = {false,false,false,false};
}
