package com.example.catsafe;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.app.AlertDialog; // Importar AlertDialog
import android.content.DialogInterface; // Importar DialogInterface

public class AlterarInformacoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_informacoes);

        Button button_salvarAlteracoes = findViewById(R.id.button_salvarAlteracoes);
        ImageButton imageButton2_voltar = findViewById(R.id.imageButton2_voltar);

        //Botão Salvar alterações
        button_salvarAlteracoes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent it=new Intent(AlterarInformacoes.this, MainActivity.class);
                // Crear AlertDialog
                AlertDialog.Builder confirmaAlteracao = new AlertDialog.Builder(AlterarInformacoes.this);
                confirmaAlteracao.setMessage("¿Desea guardar los cambios?");
                confirmaAlteracao.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Aquí puedes poner el código para guardar los cambios
                        startActivity(it); // Iniciar la otra actividad
                    }
                });
                confirmaAlteracao.setNegativeButton("No", null);
                confirmaAlteracao.show();
            }
        });

        //Botão Salvar alterações
        imageButton2_voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it=new Intent(AlterarInformacoes.this, TelaInicial.class);
                
            }
        });



    }
}