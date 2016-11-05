package id.sch.smktelkom_mlg.learn.recyclerview1.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Norton on 04/11/2016.
 */

public class hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
