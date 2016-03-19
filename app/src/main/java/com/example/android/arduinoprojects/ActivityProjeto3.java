package com.example.android.arduinoprojects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityProjeto3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_projeto3);
    }

    public void voltar (View v) {
        Intent menu = new Intent(this, MenuPrincipal.class);
        startActivity(menu);
    }

}
