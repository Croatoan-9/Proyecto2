package com.lavidaesunvideojuego.mascotasproyecto.Pojo;

/**
 * Created by sebse on 22/01/2017.
 */

public class InfoMascota {

    private int  foto;
    private String Nombre;
    private String NoMG;

    public InfoMascota(int foto, String noMG){
        this.foto = foto;
        NoMG = noMG;
    }

    public InfoMascota(int foto, String nombre, String noMG) {
        this.foto = foto;
        Nombre = nombre;
        NoMG = noMG;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNoMG() {
        return NoMG;
    }

    public void setNoMG(String noMG) {
        NoMG = noMG;
    }
}
