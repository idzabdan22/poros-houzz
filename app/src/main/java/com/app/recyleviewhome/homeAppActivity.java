package com.app.recyleviewhome;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.app.recyleviewhome.AddToMyHouse.MyHouseFragment;
import com.app.recyleviewhome.AddToMyHouse.design_category_myhouse;
import com.app.recyleviewhome.AddToMyHouse.furniture_category_myhouse;
import com.app.recyleviewhome.Home.HomeFragment;
import com.app.recyleviewhome.Save.SaveFragment;
import com.app.recyleviewhome.User.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homeAppActivity extends AppCompatActivity {

    BottomNavigationView btmnavId;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_app);
        btmnavId = findViewById(R.id.navButton);
        frameLayout = findViewById(R.id.frameLayout);


        btmnavId.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                android.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                switch (item.getItemId()){
                    case R.id.home_fragment_but:
                        fragmentTransaction.replace(R.id.frameLayout, new HomeFragment());
                        fragmentTransaction.commit();
                        break;
                    case R.id.myhouse_fragment_but:
                        fragmentTransaction.replace(R.id.frameLayout, new design_category_myhouse());
                        fragmentTransaction.commit();
                        break;
                    case R.id.myhouse_funiture_but:
                        fragmentTransaction.replace(R.id.frameLayout, new furniture_category_myhouse());
                        fragmentTransaction.commit();
                        break;
                    case R.id.save_fragment_but:
                        fragmentTransaction.replace(R.id.frameLayout, new SaveFragment());
                        fragmentTransaction.commit();
                        break;
                    case R.id.user_fragment_but:
                        fragmentTransaction.replace(R.id.frameLayout, new UserFragment());
                        fragmentTransaction.commit();
                        break;
                    default:
                        return false;
                }

                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.searchbox, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit(String query){
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText){
//                recycleViewAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }



}