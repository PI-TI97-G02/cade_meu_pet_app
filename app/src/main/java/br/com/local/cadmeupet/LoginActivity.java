package br.com.local.cadmeupet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin, btnFinal;
    TextInputEditText txtEmail, txtSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnFinal = findViewById(R.id.btnFinal);

        btnLogin = findViewById(R.id.btnLogin);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, senha;
                email = txtEmail.getText().toString();
                senha = txtSenha.getText().toString();
                if (email.equals("usuario@sp.senac.br") && senha.equals("senac")) {
                    startActivity(new Intent(LoginActivity.this, MenuActivity.class));

                } else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!",
                            Toast.LENGTH_SHORT).show();
                    limparTela();
                }

            }
        });


    }

    public void limparTela() {
        txtEmail.setText("");
        txtSenha.setText("");
        txtEmail.requestFocus();
    }

    public void abrirCadUsuario(View view) {
        startActivity(new Intent(LoginActivity.this, CadastroUsuActivity.class));
    }

    public void abrirRecuSenha(View view) {
        startActivity(new Intent(LoginActivity.this, RecuperarUsuActivity.class));
    }
}