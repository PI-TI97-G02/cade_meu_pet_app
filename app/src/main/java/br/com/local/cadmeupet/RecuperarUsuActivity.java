package br.com.local.cadmeupet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class RecuperarUsuActivity extends AppCompatActivity {
    Button btnRecuSenha, btnVoltarLogin;
    TextInputEditText txtRecuSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_usu);
        txtRecuSenha = findViewById(R.id.txtRecuEmail);

        btnRecuSenha = findViewById(R.id.btnRecuperar);
        btnVoltarLogin = findViewById(R.id.btnVoltarLogin);
        btnVoltarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecuperarUsuActivity.this, LoginActivity.class));
            }
        });
        btnRecuSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Email de recuperação enviado",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}