package com.example.android.arduinoprojects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void verProjeto1 (View v) {
        Intent intentProjeto1 = new Intent(this, ActivityProjeto1.class);
        startActivity(intentProjeto1);
    }
}
