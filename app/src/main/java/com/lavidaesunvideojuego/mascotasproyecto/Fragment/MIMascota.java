package com.lavidaesunvideojuego.mascotasproyecto.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lavidaesunvideojuego.mascotasproyecto.Adapter.MiMascotaAdaptador;
import com.lavidaesunvideojuego.mascotasproyecto.Pojo.InfoMascota;
import com.lavidaesunvideojuego.mascotasproyecto.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MIMascota extends Fragment {


    ArrayList<InfoMascota> mimascotas;
    private RecyclerView listaMiMascota;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mimascota, container, false);


        listaMiMascota = (RecyclerView) v.findViewById(R.id.RVMiMascota);

        GridLayoutManager manager = new GridLayoutManager(getContext(), 2);


        listaMiMascota.setLayoutManager(manager);
        inicializarinfomascotas();
        inicializarAdaptador();

        return v;
    }
    public void inicializarAdaptador(){

        MiMascotaAdaptador adaptador = new MiMascotaAdaptador(mimascotas);
        listaMiMascota.setAdapter(adaptador);
    }
    public void inicializarinfomascotas(){
        mimascotas = new ArrayList<InfoMascota>();

       mimascotas.add(new InfoMascota(R.drawable.jacobo1,"8"));
       mimascotas.add(new InfoMascota(R.drawable.jacobo2,"5"));
       mimascotas.add(new InfoMascota(R.drawable.jacobo3,"4"));
       mimascotas.add(new InfoMascota(R.drawable.jacobo4,"12"));
       mimascotas.add(new InfoMascota(R.drawable.jacobo5,"8"));
       mimascotas.add(new InfoMascota(R.drawable.jacobo6,"10"));


    }

}