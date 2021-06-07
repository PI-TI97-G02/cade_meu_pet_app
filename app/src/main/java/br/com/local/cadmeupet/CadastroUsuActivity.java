package br.com.local.cadmeupet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CadastroUsuActivity extends AppCompatActivity {
    Button btnVoltar, btnCadUsu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usu);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnCadUsu = findViewById(R.id.btnCadUsu);
        btnCadUsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Em processo de codificação",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CadastroUsuActivity.this, LoginActivity.class));
                finish();
            }
        });
    }

    public void abrirTermosdeUso(View view) {
        startActivity(new Intent(CadastroUsuActivity.this, TermosdeUsoActivity.class));
        
    }
}