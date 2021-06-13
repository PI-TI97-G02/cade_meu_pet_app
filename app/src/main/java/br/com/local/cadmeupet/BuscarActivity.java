package br.com.local.cadmeupet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
    String descbPets[] = {"Lhasa - 13 anos. Perdida em Campo Limpo Paulista/SP no bairro Jardim Europa.", "Vira Lata - 14 anos. Perdida em Tatuape/SP no bairro Vila Zilda.", "Vira Lata - 6 anos. Perdida em Grajau/SP no bairro Jardim Edith.", "Mau egipcio - 4 anos. Perdido em Taboao da Serra/SP no bairro Jardim Henriquetta."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        listView = findViewById(R.id.ListbPets);
        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BuscarActivity.this, PetPerdidoActivity.class);
                intent.putExtra("nomebPets", nomebPets[position]);
                intent.putExtra("imagembPets", imagensbPets[position]);
                intent.putExtra("descbPpet", descbPets[position]);


            }
        });


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
                startActivity(new Intent(BuscarActivity.this, FazerPublicacaoActivity.class));
            case R.id.mbPesquisar:
                Pesquisar:
                Toast.makeText(getApplicationContext(),

                        "Cliquei em pesquisar",
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
            ImageView imgbPets, imgBuscarCompartilhar;
            TextView txtbTituloImagem, txtbDescricaoRaca;
            Button btnReport;


            View view = getLayoutInflater().inflate(R.layout.modelo_lista_buscar, null);
            txtbTituloImagem = view.findViewById(R.id.txtbTituloImagem);
            imgbPets = view.findViewById(R.id.ImagembModelo);
            txtbTituloImagem.setText(nomebPets[position]);
            imgbPets.setImageResource(imagensbPets[position]);
            txtbDescricaoRaca = view.findViewById(R.id.txtbDescricaoRaca);
            txtbDescricaoRaca.setText(descbPets[position]);
            btnReport = view.findViewById(R.id.btnReport);
            btnReport.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BuscarActivity.this, PetPerdidoActivity.class));
                }
            });


            imgBuscarCompartilhar = view.findViewById(R.id.BuscarCompartilhar);


            return view;
        }
    }

}