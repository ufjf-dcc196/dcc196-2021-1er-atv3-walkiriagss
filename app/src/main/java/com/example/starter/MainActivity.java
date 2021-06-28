package com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //código
        TextView saida = findViewById(R.id.saida); //
        saida.setText("Bem vinda!");

    }

    public void clickBotao(View view){

        //Capturamos os componentes pelos ids
        TextView saida = findViewById(R.id.saida); //
        EditText nome = findViewById(R.id.editTextNome);
        EditText starter = findViewById(R.id.editTextStarter);

        //Convertemos e operamos os dados
        String nomestr = nome.getText().toString();
        String starterstr = starter.getText().toString();

        //Apresentamos a saída em outros componentes
        saida.setText(String.format("Olá treinador %s! Seu pokemon escolhido foi %s!",
                nomestr, starterstr));
    }
}
