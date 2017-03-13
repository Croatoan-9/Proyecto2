package com.lavidaesunvideojuego.mascotasproyecto.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lavidaesunvideojuego.mascotasproyecto.Pojo.InfoMascota;
import com.lavidaesunvideojuego.mascotasproyecto.R;

import java.util.ArrayList;

/**
 * Created by sebse on 3/03/2017.
 */

public class MiMascotaAdaptador extends RecyclerView.Adapter<MiMascotaAdaptador.MiMascotaViewHolder>{

    ArrayList<InfoMascota> mimascotas;


    public MiMascotaAdaptador(ArrayList<InfoMascota> mimascotas){

        this.mimascotas = mimascotas;
    }


    @Override
    public MiMascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View vx = LayoutInflater.from(parent.getContext()).inflate(R.layout.mimascota, parent,false);

        return new MiMascotaViewHolder(vx);
    }

    @Override
    public void onBindViewHolder(MiMascotaAdaptador.MiMascotaViewHolder mimascotasViewHolder, int position) {

        InfoMascota mimascota = mimascotas.get(position);
        mimascotasViewHolder.IVhueso5.setImageResource(R.drawable.dog_bone_filled_50);
        mimascotasViewHolder.TVmegustas1.setText(mimascota.getNoMG());
        mimascotasViewHolder.IMGJacobo.setImageResource(mimascota.getFoto());

    }

    @Override
    public int getItemCount() {
        return mimascotas.size();
    }

    public static class MiMascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView IMGJacobo;
        private TextView TVmegustas1;
        private ImageView IVhueso5;


        public MiMascotaViewHolder(View itemView) {
            super(itemView);

            IMGJacobo = (ImageView) itemView.findViewById(R.id.IMGJacobo);
            TVmegustas1 = (TextView) itemView.findViewById(R.id.TVmegustas1);
            IVhueso5 = (ImageView) itemView.findViewById(R.id.IVhueso5);


        }
    }
}


