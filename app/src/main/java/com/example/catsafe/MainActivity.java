package com.example.catsafe;
import static com.example.catsafe.R.id.button2_continuar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewCadastro = findViewById(R.id.textView_cadastro);
        Button button_continuar = findViewById(R.id.button_continuar);


        // Clique aqui - cadastro
        textViewCadastro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Criar uma Intent para iniciar a atividade Login
                Intent it = new Intent(MainActivity.this, Cadastro.class);
                // Iniciar a atividade Login
                startActivity(it);
            }
        });

        // Botão Continuar - Tela Conecte-se
        button_continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, TelaInicial.class);
                startActivity(it);
            }
        });

    }
}