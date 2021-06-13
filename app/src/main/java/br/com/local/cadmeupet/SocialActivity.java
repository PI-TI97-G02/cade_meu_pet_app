package br.com.local.cadmeupet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SocialActivity extends AppCompatActivity {
    ListView listView;
    String nomePets[] = {"Claire", "Sandro", "Lilica", "Mew"};
    int imagemPets[] = {R.drawable.claire_app, R.drawable.sandro_app, R.drawable.lilica_app, R.drawable.mew_app};
    String descPets[] = {"Fila Brasileiro - 7 Anos", "Ramirezi - 8 meses", "Vira lata - 6 anos", "Vira Lata - 1 ano"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        listView = findViewById(R.id.ListPets);
        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_social, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.msAdicionar:
                Toast.makeText(getApplicationContext(),

                        "Cliquei em adicionar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.msPesquisar:
                Toast.makeText(getApplicationContext(),

                        "Cliquei em pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.msVoltar:
                startActivity(new Intent(SocialActivity.this, MenuActivity.class));


        }


        return super.onOptionsItemSelected(item);
    }


    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemPets.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imgPets, imgSocialLike;
            TextView txtTituloImagem, txtDescricaoRaca;



            View view = getLayoutInflater().inflate(R.layout.modelo_lista_pets, null);
            txtTituloImagem = view.findViewById(R.id.txtTituloImagem);
            imgPets = view.findViewById(R.id.ImagemModelo);
            txtTituloImagem.setText(nomePets[position]);
            imgPets.setImageResource(imagemPets[position]);
            txtDescricaoRaca = view.findViewById(R.id.txtDescricaoRaca);
            txtDescricaoRaca.setText(descPets[position]);
            imgSocialLike = view.findViewById(R.id.SocialLike);


            return view;
        }
    }
}
