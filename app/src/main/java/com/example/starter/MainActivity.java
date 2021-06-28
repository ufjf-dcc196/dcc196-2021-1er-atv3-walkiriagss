package com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView saidaCalculo;
    private EditText numero1;
    private EditText numero2;
    private Button botaoSoma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //código
        saidaCalculo = findViewById(R.id.saida); //
        numero1 = findViewById(R.id.editTextNumber1);
        numero2 = findViewById(R.id.editTextNumber2);
        botaoSoma = findViewById(R.id.buttonSoma);
    }

    public void soma(View view){
        Double numberNumero1 = Double.parseDouble(numero1.getText().toString());
        Double numberNumero2 = Double.parseDouble(numero2.getText().toString());
        Double numberSaida = numberNumero1 + numberNumero2;
        saidaCalculo.setText((numberSaida.toString()));
    }
}