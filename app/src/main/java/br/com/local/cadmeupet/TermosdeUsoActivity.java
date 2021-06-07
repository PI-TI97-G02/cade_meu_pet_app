package br.com.local.cadmeupet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TermosdeUsoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termosde_uso);
    }

    public void abrirCadUsuario(View view) {
        startActivity(new Intent(TermosdeUsoActivity.this, CadastroUsuActivity.class));
    }
}