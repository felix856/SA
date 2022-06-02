package com.example.sa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Comeco extends AppCompatActivity {
    Pontuações p = new Pontuações();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comeco);
        getSupportActionBar().hide();


    }


    public void escolhe(View v){
        mudaTelaescolhe();
    }

    public void entrar(View q){
        mudaTelacomeco();
    }


    public void mudaTelaescolhe(){
        Intent i = new Intent(this, escolher.class);
        startActivity(i);
    }

    public void mudaTelacomeco(){
        Intent i = new Intent(this, perguntas.class);
        startActivity(i);
    }
}
