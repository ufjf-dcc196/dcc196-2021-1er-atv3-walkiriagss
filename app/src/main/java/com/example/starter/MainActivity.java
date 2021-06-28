package com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView saida;
    private EditText nome;
    private EditText starter;
    private Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //código
        saida = findViewById(R.id.saida); //
        saida.setText("Bem vinda!");
        nome = findViewById(R.id.editTextNumber1);
        starter = findViewById(R.id.editTextNumber2);
        botao = findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Convertemos e operamos os dados
                String nomestr = nome.getText().toString();
                String starterstr = starter.getText().toString();

                //Apresentamos a saída em outros componentes
                saida.setText(String.format("Olá treinador %s! Seu pokemon escolhido foi %s!",
                        nomestr, starterstr));
            }
        });
    }

}
