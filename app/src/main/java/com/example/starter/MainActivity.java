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
        TextView saida = findViewById(R.id.saida); //
        EditText nome = findViewById(R.id.editTextNome);
        EditText starter = findViewById(R.id.editTextStarter);
        
        saida.setText(
                nome.getText().toString()
                        +starter.getText().toString());
    }
}
