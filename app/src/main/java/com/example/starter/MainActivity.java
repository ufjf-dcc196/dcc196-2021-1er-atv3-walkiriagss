package com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView saida;
    private EditText numero1;
    private EditText numero2;
    private Button botaoSoma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //código
        saida = findViewById(R.id.saida); //
        saida.setText("Calculadora!");
        numero1 = findViewById(R.id.editTextNumber1);
        numero2 = findViewById(R.id.editTextNumber2);
        botaoSoma = findViewById(R.id.buttonSoma);

        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Convertemos e operamos os dados
                String nomestr = numero1.getText().toString();
                String starterstr = numero2.getText().toString();

                //Apresentamos a saída em outros componentes
                saida.setText(String.format("Olá treinador %s! Seu pokemon escolhido foi %s!",
                        nomestr, starterstr));
            }
        });
    }

}
