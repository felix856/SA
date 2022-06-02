package com.example.sa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {
    EditText user, senha;
    AlertDialog.Builder alerta;
    boolean aux = false;
    boolean sla = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        alerta = new AlertDialog.Builder(this);
        user = findViewById(R.id.logintxt);
        senha = findViewById(R.id.senhatxt);

    }

    public void cadastrar(){

        if(aux){
            String l = user.getText().toString();
            String s = senha.getText().toString();
            Usuario u = new Usuario(l, s);
            u.salvar_bd();
            Toast.makeText(this, "Usuário Criado!", Toast.LENGTH_SHORT).show();



        }else if(!aux){
            verifica_user_cadastro();
        }
    }


    public void botao_cadastro(View e){
        aux = false;

        FirebaseApp.initializeApp(this);
        cadastrar();



    }

    public void entrar(){

        if(!sla){
            verifica_user_login();
        }else if(sla){
            Toast.makeText(this, "Logado!", Toast.LENGTH_SHORT).show();
            mudaTela();
        }


    }

    public void botao_entrar(View v){
        sla = false;
        entrar();

    }


        public void mudaTela(){
            Intent i = new Intent(this, Comeco.class);
            startActivity(i);
        }

        public void print (String msg){
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        }

        public void verifica_user_cadastro(){
            DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Usuarios");
            ref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    String l = user.getText().toString();
                    String s = senha.getText().toString();
                    boolean olx = false;
                    for (DataSnapshot d: snapshot.getChildren()){
                        if(d.getValue(Usuario.class).getLogin().equals(l) && d.getValue(Usuario.class).getSenha().equals(s)){
                            String msg = "Esse usuário já existe";
                            olx = true;
                            print(msg);
                            entrar();
                            break;
                        }

                    }
                    if(!olx){

                        aux = true;


                        cadastrar();

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

        }

        //----------------------------------------------------------------------------------


    public void verifica_user_login(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Usuarios");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String l = user.getText().toString();
                String s = senha.getText().toString();
                for (DataSnapshot d: snapshot.getChildren()){
                    if(d.getValue(Usuario.class).getLogin().equals(l) && d.getValue(Usuario.class).getSenha().equals(s)){

                        sla = true;


                        entrar();
                        break;
                    }


                }
                if(!sla){
                    print("usuario não cadastrado");
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }


}
