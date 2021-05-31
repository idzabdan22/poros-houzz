package com.app.recyleviewhome.User;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.app.recyleviewhome.R;
import com.app.recyleviewhome.homeAppActivity;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button loginBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        loginBut = findViewById(R.id.login_bt);

        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin123")){
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            LoginActivity.this
                    );
                    builder.setIcon(R.drawable.ic_baseline_check_circle_24);
                    builder.setTitle("Login Successfully");

                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    openMainActivity();
                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "Invalid Username or Paswword!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, homeAppActivity.class);
        startActivity(intent);
    }
}