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

public class BuscarActivity extends AppCompatActivity {
    ListView listView;
    String nomebPets[] = {"Dolly", "Milla", "Fenix", "Simba"};
    int imagensbPets[] = {R.drawable.dolly_app, R.drawable.milla_app, R.drawable.fenix_app, R.drawable.simba_app};
    String descbPets[] = {"Lhasa - 13 anos. Campo Limpo Paulista/SP", "Vira Lata - 14 anos. Tatuape/SP", "Vira Lata - 6 anos. Grajau/SP", "Mau egipcio - 4 anos. Taboao da Serra"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        listView = findViewById(R.id.ListbPets);
        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_buscar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mbAdicionar:
                Adicionar:
                Toast.makeText(getApplicationContext(),

                        "Cliquei em adicionar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mbPesquisar:
                Pesquisar:
                Toast.makeText(getApplicationContext(),

                        "Cliquei em pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mbCompartilhar:
                Toast.makeText(getApplicationContext(),

                        "Cliquei em Compartilhar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mbVoltar:
                startActivity(new Intent(BuscarActivity.this, MenuActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagensbPets.length;
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
            ImageView imgbPets;
            TextView txtbTituloImagem, txtbDescricaoRaca;
            Button btnReport;


            View view = getLayoutInflater().inflate(R.layout.modelo_lista_buscar, null);
            txtbTituloImagem = view.findViewById(R.id.txtbTituloImagem);
            imgbPets = view.findViewById(R.id.ImagembModelo);
            txtbTituloImagem.setText(nomebPets[position]);
            imgbPets.setImageResource(imagensbPets[position]);
            txtbDescricaoRaca = view.findViewById(R.id.txtbDescricaoRaca);
            txtbDescricaoRaca.setText(descbPets[position]);
            return view;
        }
    }

}