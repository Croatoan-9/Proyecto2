package com.lavidaesunvideojuego.mascotasproyecto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lavidaesunvideojuego.mascotasproyecto.Adapter.MascotasAdaptador;
import com.lavidaesunvideojuego.mascotasproyecto.Pojo.InfoMascota;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<InfoMascota> mascotasFavoritas;
    private RecyclerView listaMascotasFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotasFav = (RecyclerView) findViewById(R.id.RVmascotasFav);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutCompat.VERTICAL);

        listaMascotasFav.setLayoutManager(llm);
        inicializarinfomascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador() {

        MascotasAdaptador adaptador = new MascotasAdaptador(mascotasFavoritas);
        listaMascotasFav.setAdapter(adaptador);
    }

    public void inicializarinfomascotas() {
        mascotasFavoritas = new ArrayList<InfoMascota>();

        mascotasFavoritas = new ArrayList<InfoMascota>();
        mascotasFavoritas.add(new InfoMascota(R.drawable.perro1, "Mugre", "9"));
        mascotasFavoritas.add(new InfoMascota(R.drawable.gato1, "Max", "7"));
        mascotasFavoritas.add(new InfoMascota(R.drawable.gato2, "Rayas", "7"));
        mascotasFavoritas.add(new InfoMascota(R.drawable.perro2, "Firulais", "5"));
        mascotasFavoritas.add(new InfoMascota(R.drawable.perro3, "Orejas", "5"));


    }
}

