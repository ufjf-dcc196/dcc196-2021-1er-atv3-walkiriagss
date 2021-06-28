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
        saidaCalculo = findViewById(R.id.saida);
        saidaCalculo.setText("Calculadora");
        numero1 = findViewById(R.id.editTextNumber1);
        numero2 = findViewById(R.id.editTextNumber2);
        botaoSoma = findViewById(R.id.buttonSoma);
    }

    public void soma(View view){
        Double numberNumero1 = 0.0;
        Double numberNumero2 = 0.0;
        try {
            numberNumero1 = Double.parseDouble(numero1.getText().toString());
            numberNumero2 = Double.parseDouble(numero2.getText().toString());
            Double numberSaida = numberNumero1 + numberNumero2;
            saidaCalculo.setText(("Resultado: " +numberNumero1 + " + "+ numberNumero2 + " = " + numberSaida.toString()));
        }catch (Exception e){
            saidaCalculo.setText("Digite os dois números");
        }
    }

    public void subtracao(View view){
        Double numberNumero1 = 0.0;
        Double numberNumero2 = 0.0;
        try {
            numberNumero1 = Double.parseDouble(numero1.getText().toString());
            numberNumero2 = Double.parseDouble(numero2.getText().toString());
            Double numberSaida = numberNumero1 - numberNumero2;
            saidaCalculo.setText(("Resultado: " +numberNumero1 + " - "+ numberNumero2 + " = " + numberSaida.toString()));
        }catch (Exception e){
            saidaCalculo.setText("Digite os dois números");
        }
    }

    public void multiplicacao(View view){
        Double numberNumero1 = 0.0;
        Double numberNumero2 = 0.0;
        try {
            numberNumero1 = Double.parseDouble(numero1.getText().toString());
            numberNumero2 = Double.parseDouble(numero2.getText().toString());
            Double numberSaida = numberNumero1 * numberNumero2;
            saidaCalculo.setText(("Resultado: " +numberNumero1 + " x "+ numberNumero2 + " = " + numberSaida.toString()));
        }catch (Exception e){
            saidaCalculo.setText("Digite os dois números");
        }
    }

    public void divisao(View view){
        Double numberNumero1 = 0.0;
        Double numberNumero2 = 0.0;
        try {
            numberNumero1 = Double.parseDouble(numero1.getText().toString());
            numberNumero2 = Double.parseDouble(numero2.getText().toString());
            if(numberNumero2 == 0.0){
                saidaCalculo.setText("Denominador inválido");
            }
            else {
                Double numberSaida = numberNumero1 / numberNumero2;
                saidaCalculo.setText(("Resultado: " + numberNumero1 + " / " + numberNumero2 + " = " + numberSaida.toString()));
            }
        }catch (Exception e){
            saidaCalculo.setText("Digite os dois números");
        }
    }
}