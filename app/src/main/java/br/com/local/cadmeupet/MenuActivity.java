package br.com.local.cadmeupet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btnSair, btnAdotar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnSair = findViewById(R.id.btnSair);
        btnAdotar = findViewById(R.id.btnAdotar);

        btnAdotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, AdotarPetActivity.class));
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, LoginActivity.class));
            }
        });
    }

    public void abrirBuscar(View view) {
        startActivity(new Intent(MenuActivity.this, BuscarActivity.class));
    }

    public void AbrirPefil(View view) {
        startActivity(new Intent(MenuActivity.this, PerfilActivity.class));
    }

    public void AbrirConfig(View view) {
    }

    public void AbrirRedeSocial(View view) {

        startActivity(new Intent(MenuActivity.this, SocialActivity.class));
    }
}