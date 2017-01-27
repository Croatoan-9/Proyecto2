package com.lavidaesunvideojuego.mascotasproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Mascotas extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.actionbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.ItmFav:
                Intent intent = new Intent(this,MascotasFavoritas.class);
                startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }

    ArrayList<InfoMascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listaMascotas = (RecyclerView) findViewById(R.id.RVmascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutCompat.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarinfomascotas();
        inicializarAdaptador();


    }
    public void inicializarAdaptador(){

        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarinfomascotas(){
         mascotas = new ArrayList<InfoMascota>();

        mascotas.add(new InfoMascota(R.drawable.perro1,"Mugre","9"));
        mascotas.add(new InfoMascota(R.drawable.gato1,"Max","7"));
        mascotas.add(new InfoMascota(R.drawable.perro2,"Firulais","5"));
        mascotas.add(new InfoMascota(R.drawable.gato3,"Motas","4"));
        mascotas.add(new InfoMascota(R.drawable.perro3,"Orejas","5"));
        mascotas.add(new InfoMascota(R.drawable.gato2,"Rayas","7"));
    }
}
