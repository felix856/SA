package com.example.sa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Resultado extends AppCompatActivity {
    String resultado;
    Pontuações p = new Pontuações();
    ArrayList<Integer> num = new ArrayList();
    int maior = 0;
    TextView a;
    static int p1, p2, p3, p4, p5, p6, p7 ,p8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        getSupportActionBar().hide();


        montarResultado();


    }

    public void recomecar(View a){
        Intent i = new Intent(this, Comeco.class);
        startActivity(i);
    }

    public void montarResultado() {





        num.add(p1);
        num.add(p2);
        num.add(p3);
        num.add(p4);
        num.add(p5);
        num.add(p6);
        num.add(p7);
        num.add(p8);

        int tamanho = 0;

        for (Integer e : num) {
            if (e > maior) {
                maior = e;
            }
            tamanho++;
            if(tamanho == 8){
                resultadoa();
            }
        }

    }
    public void resultadoa(){

        int i = num.indexOf(maior);

       // Toast.makeText(this, ""+num, Toast.LENGTH_SHORT).show();



        switch (i) {
                    case 0:
                        resultado = ("Ciências Agrárias\n");
                        break
                                ;
                    case 1:
                        resultado = ("Ciências Biológicas\n");

                        break
                                ;
                   case 2:
                       resultado = ("Ciências da Saúde\n");

                        break
                              ;
                   case 3:
                       resultado = ("Ciências Exatas e da Terra\n");

                       break
                               ;
                    case 4:
                      resultado = ("Engenharias\n");

                        break
                              ;
                    case 5:
                        resultado = ("Ciências Humanas\n");

                        break
                                ;
                    case 6:
                        resultado = ("Ciências Sociais Aplicadas\n");

                        break
                                ;
                    case 7:
                        resultado = ("Linguística, Letras e Artes\n");

                        break
                               ;
                }


                a = findViewById(R.id.textViewResult);

                String resultadaaao = "Voce tirou : " + resultado;

                a.setText(resultadaaao);
    }

}
