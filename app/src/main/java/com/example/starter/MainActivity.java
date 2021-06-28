package com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        TextView saida = findViewById(R.id.saida); //
        saida.setText("Botão clicado!");

    }
}
