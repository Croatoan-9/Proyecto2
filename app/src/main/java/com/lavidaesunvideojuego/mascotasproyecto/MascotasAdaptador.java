package com.lavidaesunvideojuego.mascotasproyecto;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sebse on 22/01/2017.
 */

public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotasViewHolder>{

    ArrayList<InfoMascota> mascotas;


    public MascotasAdaptador(ArrayList<InfoMascota> mascotas){

        this.mascotas = mascotas;
    }


    @Override
    public MascotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent,false);

        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotasViewHolder mascotasViewHolder, int position) {

        InfoMascota mascota = mascotas.get(position);
        mascotasViewHolder.IMGperro.setImageResource(mascota.getFoto());
        mascotasViewHolder.TVnombre.setText(mascota.getNombre());
        mascotasViewHolder.TVmegustas.setText(mascota.getNoMG());
        mascotasViewHolder.IVhueso.setImageResource(R.drawable.dog_bone_50);
        mascotasViewHolder.IVhueso2.setImageResource(R.drawable.dog_bone_filled_50);

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        private ImageView IMGperro;
        private TextView TVnombre;
        private TextView TVmegustas;
        private ImageView IVhueso;
        private ImageView IVhueso2;


        public MascotasViewHolder(View itemView) {
            super(itemView);

            IMGperro = (ImageView) itemView.findViewById(R.id.IMGperro);
            TVnombre = (TextView) itemView.findViewById(R.id.TVnombre);
            TVmegustas = (TextView)itemView.findViewById(R.id.TVmegustas);
            IVhueso = (ImageView) itemView.findViewById(R.id.IVhueso);
            IVhueso2 = (ImageView)itemView.findViewById(R.id.IVhueso2);
        }
    }
}
