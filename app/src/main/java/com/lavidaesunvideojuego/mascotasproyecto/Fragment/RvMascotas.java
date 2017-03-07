package com.lavidaesunvideojuego.mascotasproyecto.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lavidaesunvideojuego.mascotasproyecto.Adapter.MascotasAdaptador;
import com.lavidaesunvideojuego.mascotasproyecto.Pojo.InfoMascota;
import com.lavidaesunvideojuego.mascotasproyecto.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RvMascotas extends Fragment {

    ArrayList<InfoMascota> mascotas;
    private RecyclerView listaMascotas;
    public RvMascotas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_rv_mascotas, container, false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.RVmascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarinfomascotas();
        inicializarAdaptador();

        return v;
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
