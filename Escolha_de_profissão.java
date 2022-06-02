package com.example.sa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class escolher extends AppCompatActivity {
    RadioButton cAgraria, cBiologica, cSaude, cExatas, engenharia, cHumanas, cSociais, linguisticas;
    Pontuações p = new Pontuações();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher);
        getSupportActionBar().hide();

        cAgraria = findViewById(R.id.Cagra);
        cBiologica = findViewById(R.id.Cbio);
        cSaude = findViewById(R.id.Csau);
        cExatas = findViewById(R.id.Cexa);
        engenharia = findViewById(R.id.Enge);
        cHumanas = findViewById(R.id.Chum);
        cSociais = findViewById(R.id.Csoc);
        linguisticas = findViewById(R.id.Ling);



    }

    public void começar(View c){
        if(cAgraria.isChecked()){
            p.pontuação_1 = (p.pontuação_1 + 1);
        }
        else if(cBiologica.isChecked()){
            p.pontuação_2 = (p.pontuação_2 + 1);
        }
        else if(cSaude.isChecked()){
            p.pontuação_3 = (p.pontuação_3 + 1);
        }
        else if(cExatas.isChecked()){
            p.pontuação_4 = (p.pontuação_4 + 1);
        }
        else if(engenharia.isChecked()){
            p.pontuação_5 = (p.pontuação_5 + 1);
        }
        else if(cHumanas.isChecked()){
            p.pontuação_6 = (p.pontuação_6 + 1);
        }
        else if(cSociais.isChecked()){
            p.pontuação_7 = (p.pontuação_7 + 1);
        }
        else if(linguisticas.isChecked()){
            p.pontuação_8 = (p.pontuação_8 + 1);
        }



        Intent i = new Intent(this, perguntas.class);
        startActivity(i);
    }
    public void cancelar(View e){
        Intent i = new Intent(this, Comeco.class);
        startActivity(i);

}

}
