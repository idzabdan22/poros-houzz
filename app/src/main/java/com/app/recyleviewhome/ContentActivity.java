package com.app.recyleviewhome;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.app.recyleviewhome.PassingData.DataApps;
import com.app.recyleviewhome.ui.modalClass;

public class ContentActivity extends AppCompatActivity {

    private TextView newjudul_design;
    private TextView newdeskrip_design;
    private ImageView newgambar_design;
    private Button newAddMyHouse, save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        newAddMyHouse = findViewById(R.id.addMyhousebut);
        save = findViewById(R.id.saveBut);

        newjudul_design = (TextView)findViewById(R.id.judulCon);
        newdeskrip_design = (TextView)findViewById(R.id.desCon);
        newgambar_design = (ImageView)findViewById(R.id.contentImg);
        newAddMyHouse = (Button)findViewById(R.id.addMyhousebut);


        Intent intent = getIntent();
        int judul_konten = intent.getExtras().getInt("text");
        int deskripsi_konten = intent.getExtras().getInt("desc");
        int gambar_konten = intent.getExtras().getInt("image");
        String type = intent.getExtras().getString("type");

        TextView designorfurn = findViewById(R.id.textView9);
        TextView jenisKonten = findViewById(R.id.textView10);

        if(type.equals("lamp")||type.equals("chair")||type.equals("bed")||type.equals("table")) {
            designorfurn.setText("Furniture");
        } else if(type.equals("bedRoom")||type.equals("bathRoom")||type.equals("kitchen")||type.equals("livingRoom")){
            designorfurn.setText("Design & Decoration");
        }

        if(type.equals("bedRoom")){
            jenisKonten.setText("Bedroom");
            if(DataApps.getInstance().designState[0]==true) newAddMyHouse.setBackgroundColor(Color.RED);
        } else if(type.equals("bathRoom")){
            jenisKonten.setText("Bathroom");
            if(DataApps.getInstance().designState[1]==true) newAddMyHouse.setBackgroundColor(Color.RED);
        } else if(type.equals("kitchen")){
            jenisKonten.setText("Kitchen");
            if(DataApps.getInstance().designState[2]==true) newAddMyHouse.setBackgroundColor(Color.RED);
        } else if(type.equals("livingRoom")){
            jenisKonten.setText("Livingroom");
            if(DataApps.getInstance().designState[3]==true) newAddMyHouse.setBackgroundColor(Color.RED);
        } else if(type.equals("lamp")){
            jenisKonten.setText("Lamp");
            if(DataApps.getInstance().furnitureState[0]==true) newAddMyHouse.setBackgroundColor(Color.RED);
        } else if(type.equals("chair")){
            jenisKonten.setText("Chair");
            if(DataApps.getInstance().furnitureState[1]==true) newAddMyHouse.setBackgroundColor(Color.RED);
        } else if(type.equals("bed")){
            jenisKonten.setText("Bed");
            if(DataApps.getInstance().furnitureState[2]==true) newAddMyHouse.setBackgroundColor(Color.RED);
        } else if(type.equals("table")){
            jenisKonten.setText("Table");
            if(DataApps.getInstance().furnitureState[3]==true) newAddMyHouse.setBackgroundColor(Color.RED);
        }

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("lamp")||type.equals("chair")||type.equals("bed")||type.equals("table")) {
                    modalClass outputSave = new modalClass(gambar_konten, judul_konten, deskripsi_konten, type);
                    DataApps.getInstance().save.add(outputSave);
                    DataApps.getInstance().saveFurniture.add(outputSave);
                    save.setBackgroundColor(Color.RED);
                } else if(type.equals("bedRoom")||type.equals("bathRoom")||type.equals("kitchen")||type.equals("livingRoom")){
                    modalClass outputSave = new modalClass(gambar_konten, judul_konten, deskripsi_konten, type);
                    DataApps.getInstance().save.add(outputSave);
                    DataApps.getInstance().saveDesign.add(outputSave);
                    save.setBackgroundColor(Color.RED);
                }
            }
        });

        newAddMyHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("bedRoom")){
                    DataApps.getInstance().add[0] = new modalClass(gambar_konten,judul_konten,deskripsi_konten,type);
                    if(DataApps.getInstance().designState[0]==false) newAddMyHouse.setBackgroundColor(Color.RED);
                    DataApps.getInstance().designState[0] = true;
                } else if(type.equals("bathRoom")){
                    DataApps.getInstance().add[1] = new modalClass(gambar_konten,judul_konten,deskripsi_konten,type);
                    if(DataApps.getInstance().designState[1]==false) newAddMyHouse.setBackgroundColor(Color.RED);
                    DataApps.getInstance().designState[1] = true;
                } else if(type.equals("kitchen")){
                    DataApps.getInstance().add[2] = new modalClass(gambar_konten,judul_konten,deskripsi_konten,type);
                    if(DataApps.getInstance().designState[2]==false) newAddMyHouse.setBackgroundColor(Color.RED);
                    DataApps.getInstance().designState[2] = true;
                } else if(type.equals("livingRoom")){
                    DataApps.getInstance().add[3] = new modalClass(gambar_konten,judul_konten,deskripsi_konten,type);
                    if(DataApps.getInstance().designState[3]==false) newAddMyHouse.setBackgroundColor(Color.RED);
                    DataApps.getInstance().designState[3] = true;
                } else if(type.equals("lamp")){
                    DataApps.getInstance().addFurniture.add(new modalClass(gambar_konten,judul_konten,deskripsi_konten,type));
                    if(DataApps.getInstance().furnitureState[0]==false) newAddMyHouse.setBackgroundColor(Color.RED);
                    DataApps.getInstance().furnitureState[0] = true;
                } else if(type.equals("chair")){
                    DataApps.getInstance().addFurniture.add(new modalClass(gambar_konten,judul_konten,deskripsi_konten,type));
                    if(DataApps.getInstance().furnitureState[1]==false) newAddMyHouse.setBackgroundColor(Color.RED);
                    DataApps.getInstance().furnitureState[1] = true;
                } else if(type.equals("bed")){
                    DataApps.getInstance().addFurniture.add(new modalClass(gambar_konten,judul_konten,deskripsi_konten,type));
                    if(DataApps.getInstance().furnitureState[2]==false) newAddMyHouse.setBackgroundColor(Color.RED);
                    DataApps.getInstance().furnitureState[2] = true;
                } else if(type.equals("table")){
                    DataApps.getInstance().addFurniture.add(new modalClass(gambar_konten,judul_konten,deskripsi_konten,type));
                    if(DataApps.getInstance().furnitureState[3]==false) newAddMyHouse.setBackgroundColor(Color.RED);
                    DataApps.getInstance().furnitureState[3] = true;
                }
            }
        });

        newjudul_design.setText(judul_konten);
        newdeskrip_design.setText(deskripsi_konten);
        newgambar_design.setImageResource(gambar_konten);
    }
}