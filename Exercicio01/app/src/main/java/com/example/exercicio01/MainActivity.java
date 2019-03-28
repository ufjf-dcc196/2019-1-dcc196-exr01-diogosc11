package com.example.exercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nome_usuario = findViewById(R.id.nome_usuario);
        final EditText sobrenome_usuario = findViewById(R.id.sobrenome_usuario);
        final TextView nome_completo = findViewById(R.id.nome_completo);
        Button botao_nome = findViewById(R.id.botao_nome);
        botao_nome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome_completo.setText(nome_usuario.getText() + " " + sobrenome_usuario.getText());
            }
        });
    }
}
