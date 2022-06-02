package com.example.sa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;


public class perguntas extends AppCompatActivity {
    Pontuações p = new Pontuações();
    RadioButton um, dois, tres, quatro, cinco, seis, sete;
    TextView texto;
    int area;
    ArrayList<Integer> numeros = new ArrayList<>();
    RadioGroup rg;
    int numero = 0;
    int size = 25;
    AlertDialog.Builder alerta;
    int p1, p2, p3, p4, p5, p6, p7 ,p8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);
        getSupportActionBar().hide();

        texto = findViewById(R.id.textView4);

        um = findViewById(R.id.rb1);
        dois = findViewById(R.id.rb2);
        tres = findViewById(R.id.rb3);
        quatro = findViewById(R.id.rb4);
        cinco = findViewById(R.id.rb5);
        seis = findViewById(R.id.rb6);
        sete = findViewById(R.id.rb7);

        alerta = new AlertDialog.Builder(this);




        rg = findViewById(R.id.RG);

        texto.setText("Você se sente atraído por zonas rurais? \n");
        area = 1;

    }
    public void cancelar(View e){
        Intent i = new Intent(this, Comeco.class);
        startActivity(i);
    }

    public void selecionar(View a){



        switch (area){
            case 1:
                if (um.isChecked()) {
                    p1 = (p.pontuação_1 + 1);
                    rg.clearCheck();
                } else if (dois.isChecked()) {
                    p1 = (p.pontuação_1 + 2);
                    rg.clearCheck();

                } else if (tres.isChecked()) {
                    p1 = (p.pontuação_1 + 3);
                    rg.clearCheck();

                } else if (quatro.isChecked()) {
                    p1 = (p.pontuação_1 + 4);
                    rg.clearCheck();

                } else if (cinco.isChecked()) {
                    p1 = (p.pontuação_1 + 5);
                    rg.clearCheck();

                } else if (seis.isChecked()) {
                    p1 = (p.pontuação_1 + 6);
                    rg.clearCheck();

                } else if (sete.isChecked()) {
                    p1 = (p.pontuação_1 + 7);
                    rg.clearCheck();
                }else {
                    alerta.setTitle("Erro");
                    alerta.setMessage("Por favor, selecione uma das opções");
                    alerta.show();
                }
                continuar();
                break;
            case 2:
                if (um.isChecked()) {
                    p2 = (p.pontuação_2 + 1);
                    rg.clearCheck();
                } else if (dois.isChecked()) {

                    p2 = (p.pontuação_2 + 2);
                    rg.clearCheck();

                } else if (tres.isChecked()) {
                    p2 = (p.pontuação_2 + 3);
                    rg.clearCheck();

                } else if (quatro.isChecked()) {
                    p2 = (p.pontuação_2 + 4);
                    rg.clearCheck();

                } else if (cinco.isChecked()) {
                    p2 = (p.pontuação_2 + 5);
                    rg.clearCheck();

                } else if (seis.isChecked()) {
                    p2 = (p.pontuação_2 + 6);
                    rg.clearCheck();

                } else if (sete.isChecked()) {
                    p2 = (p.pontuação_2 + 7);
                    rg.clearCheck();
                }else {
                    alerta.setTitle("Erro");
                    alerta.setMessage("Por favor, selecione uma das opções");
                    alerta.show();
                }
                continuar();
                break;
            case 3:

                if (um.isChecked()) {
                    p3 = (p.pontuação_3 + 1);
                    rg.clearCheck();
                } else if (dois.isChecked()) {
                    p3 = (p.pontuação_3 + 2);
                    rg.clearCheck();

                } else if (tres.isChecked()) {
                    p3 = (p.pontuação_3 + 3);
                    rg.clearCheck();

                } else if (quatro.isChecked()) {
                    p3 = (p.pontuação_3 + 4);
                    rg.clearCheck();

                } else if (cinco.isChecked()) {
                    p3 = (p.pontuação_3 + 5);
                    rg.clearCheck();

                } else if (seis.isChecked()) {
                    p3 = (p.pontuação_3 + 6);
                    rg.clearCheck();

                } else if (sete.isChecked()) {
                    p3 = (p.pontuação_3 + 7);
                    rg.clearCheck();
                }else {
                    alerta.setTitle("Erro");
                    alerta.setMessage("Por favor, selecione uma das opções");
                    alerta.show();
                }
                continuar();
                break;
            case 4:

                if (um.isChecked()) {
                    p4 = (p.pontuação_4 = +1);
                    rg.clearCheck();
                } else if (dois.isChecked()) {
                    p4 = (p.pontuação_4 + 2);
                    rg.clearCheck();

                } else if (tres.isChecked()) {
                    p4 = (p.pontuação_4 + 3);
                    rg.clearCheck();

                } else if (quatro.isChecked()) {
                    p4 = (p.pontuação_4 + 4);
                    rg.clearCheck();

                } else if (cinco.isChecked()) {
                    p4 = (p.pontuação_4 + 5);
                    rg.clearCheck();

                } else if (seis.isChecked()) {
                    p4 = (p.pontuação_4 + 6);
                    rg.clearCheck();

                } else if (sete.isChecked()) {
                    p4 = (p.pontuação_4 + 7);
                    rg.clearCheck();
                }else {
                    alerta.setTitle("Erro");
                    alerta.setMessage("Por favor, selecione uma das opções");
                    alerta.show();
                }
                continuar();
                break;
            case 5:

                if (um.isChecked()) {
                    p5 = (p.pontuação_5 + 1);
                    rg.clearCheck();
                } else if (dois.isChecked()) {
                    p5 = (p.pontuação_5 + 2);
                    rg.clearCheck();

                } else if (tres.isChecked()) {
                    p5 = (p.pontuação_5 + 3);
                    rg.clearCheck();

                } else if (quatro.isChecked()) {
                    p5 = (p.pontuação_5 + 4);
                    rg.clearCheck();

                } else if (cinco.isChecked()) {
                    p5 = (p.pontuação_5 + 5);
                    rg.clearCheck();

                } else if (seis.isChecked()) {
                    p5 = (p.pontuação_5 + 6);
                    rg.clearCheck();

                } else if (sete.isChecked()) {
                    p5 = (p.pontuação_5 + 7);
                    rg.clearCheck();
                }else {
                    alerta.setTitle("Erro");
                    alerta.setMessage("Por favor, selecione uma das opções");
                    alerta.show();
                }
                continuar();
                break;
            case 6:

                if (um.isChecked()) {
                    p6 = (p.pontuação_6 + 1);
                    rg.clearCheck();
                } else if (dois.isChecked()) {
                    p6 = (p.pontuação_6 + 2);
                    rg.clearCheck();

                } else if (tres.isChecked()) {
                    p6 = (p.pontuação_6 + 3);
                    rg.clearCheck();

                } else if (quatro.isChecked()) {
                    p6 = (p.pontuação_6 + 4);
                    rg.clearCheck();

                } else if (cinco.isChecked()) {
                    p6 = (p.pontuação_6 + 5);
                    rg.clearCheck();

                } else if (seis.isChecked()) {
                    p6 = (p.pontuação_6 + 6);
                    rg.clearCheck();

                } else if (sete.isChecked()) {
                    p6 = (p.pontuação_6 + 7);
                    rg.clearCheck();
                }else {
                    alerta.setTitle("Erro");
                    alerta.setMessage("Por favor, selecione uma das opções");
                    alerta.show();
                }
                continuar();
                break;
            case 7:

                if (um.isChecked()) {
                    p7 = (p.pontuação_7 + 1);
                    rg.clearCheck();
                } else if (dois.isChecked()) {
                    p7 = (p.pontuação_7 + 2);

                    rg.clearCheck();

                } else if (tres.isChecked()) {
                    p7 = (p.pontuação_7 + 3);
                    rg.clearCheck();

                } else if (quatro.isChecked()) {
                    p7 = (p.pontuação_7 + 4);
                    rg.clearCheck();

                } else if (cinco.isChecked()) {
                    p7 = (p.pontuação_7 + 5);
                    rg.clearCheck();

                } else if (seis.isChecked()) {
                    p7 = (p.pontuação_7 + 6);
                    rg.clearCheck();

                } else if (sete.isChecked()) {
                    p7 = (p.pontuação_7 + 7);
                    rg.clearCheck();
                }else {
                    alerta.setTitle("Erro");
                    alerta.setMessage("Por favor, selecione uma das opções");
                    alerta.show();
                }
                continuar();
                break;
            case 8:

                if (um.isChecked()) {
                    p8 = (p.pontuação_8 + 1);
                    rg.clearCheck();
                } else if (dois.isChecked()) {
                    p8 = (p.pontuação_8 + 2);
                    rg.clearCheck();

                } else if (tres.isChecked()) {
                    p8 = (p.pontuação_8 + 3);
                    rg.clearCheck();

                } else if (quatro.isChecked()) {
                    p8 = (p.pontuação_8 + 4);
                    rg.clearCheck();

                } else if (cinco.isChecked()) {
                    p8 = (p.pontuação_8 + 5);
                    rg.clearCheck();

                } else if (seis.isChecked()) {
                    p8 = (p.pontuação_8 + 6);
                    rg.clearCheck();

                } else if (sete.isChecked()) {
                    p8 = (p.pontuação_8 + 7);
                    rg.clearCheck();
                }else{
                    alerta.setTitle("Erro");
                    alerta.setMessage("Por favor, selecione uma das opções");
                    alerta.show();
                }
                continuar();
                break;

            default:

        }

    }


    public boolean verificaNumLista(int num){
        for(int n : numeros){
            if(n == num){
                return true;
            }
        }
        return false;
    }

    public void mudatela(){
        Intent i = new Intent(this, Resultado.class);
        startActivity(i);
    }


    public void continuar() {

        Random randNum = new Random();


        numero = randNum.nextInt(23)+1;
        while(verificaNumLista(numero)){
            numero = randNum.nextInt(23)+1;
        }
        numeros.add(numero);
        int tamanho = numeros.size();

        if(tamanho == 23){
            Resultado.p1 = p1;
            Resultado.p2 = p2;
            Resultado.p3 = p3;
            Resultado.p4 = p4;
            Resultado.p5 = p5;
            Resultado.p6 = p6;
            Resultado.p7 = p7;
            Resultado.p8 = p8;
            mudatela();
        }

        switch (numero) {
                case 1: //Pergunta 1
                    texto.setText("Você sente vontade de estar rodeado por plantas e animais?\n");
                    area = 1;


                    break;
                case 2:
                    texto.setText("Você ajudaria um animal indefeso, por menor que seja a contribuição?\n");
                    area=1;


                    break;
                case 3:
                    texto.setText("Você sente facilidade em entender coisas microscópicas?\n");
                    area=2;


                    break;
                case 4:
                    texto.setText("Você já teve vontade de ter um formigueiro como seu projeto de ciências?\n");
                    area=2;


                    break;
                case 5:
                    texto.setText("Você tem curiosidade sobre como a natureza funciona?\n");
                    area=2;
                    break;
                case 6:
                    texto.setText("O quanto você gosta de ter contato com pessoas \n");
                    area=3;

                    break;
                case 7:
                    texto.setText("O quanto você gosta de cuidar da sua saúde \n");
                    area=3;

                    break;
                case 8:
                    texto.setText("O quanto diariamente você procura aprender coisas novas \n");
                    area=3;

                    break;
                case 9:
                    texto.setText("Você é criativo para propor alternativas inovadoras e curioso para descobrir novas possibilidades?\n");
                    area=4;


                    break;
                case 10:
                    texto.setText("Você gosta de cálculos físico-matemáticos?\n");
                    area=4;


                    break;
                case 11:
                    texto.setText("Você costuma jogar jogos que te fazem fazer ter uma resolução de problemas melhor, que envolvam lógica\n");
                    area=4;


                    break;
                case 12:
                    texto.setText("Você aprecia no dia a dia processos sistemáticos(Ex: Criar ,melhorar,reparar) que resultam em um produto,aplicação ,manutenção e melhoria de estruturas ou de algum produto?\n");
                    area=5;


                    break;
                case 13:
                    texto.setText("Uma estrutura pronta lhe deixa curioso para saber como foi construído , o quanto de detalhes teve para a perfeição da estrutura?\n");
                    area=5;

                    break;
                case 14:
                    texto.setText("Você faz o próprio café da manhã?\n");
                    area=5;

                    break;
                case 15:
                    texto.setText("O quanto de contato voce tem com meio ambiente?\n");
                    area=6;
                    break;
                case 16:
                    texto.setText("O quanto você gosta de ter contato com pessoas\n");
                    area=6;

                    break;
                case 17:
                    texto.setText("Se você visse alguém precisando de ajuda e você estivesse atrasado para algum compromisso você ajudaria\n");
                    area=6;

                    break;
                case 18:
                    texto.setText("Você sempre teve aquela vontade de fazer mais pela sociedade e de ajudar as pessoas\n");
                    area=7;
                    break;
                case 19:
                    texto.setText("Você sente que tem um forte senso crítico?\n");
                    area=7;

                    break;
                case 20:
                    texto.setText("Você gosta de ler?\n");
                    area=7;

                    break;
                case 21:
                    texto.setText("Você costuma expressar suas emoções de uma forma diferente? (por exemplo com desenhos, fotografias, danças, vídeos etc)\n");
                    area=8;
                    break;
                case 22:
                    texto.setText("Você gosta de interpretar personagens?\n");
                    area=8;
                    break;
                case 23:
                    texto.setText("Tem uma boa comunicação com as pessoas à sua volta?\n");
                    area=8;

                    break;
                default:

            }



        }


    }
