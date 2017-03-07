package com.lavidaesunvideojuego.mascotasproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.lavidaesunvideojuego.mascotasproyecto.Adapter.PageAdapter;
import com.lavidaesunvideojuego.mascotasproyecto.Fragment.MIMascota;
import com.lavidaesunvideojuego.mascotasproyecto.Fragment.RvMascotas;
import com.lavidaesunvideojuego.mascotasproyecto.Pojo.AcercaDe;
import com.lavidaesunvideojuego.mascotasproyecto.Pojo.Contacto;

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

            case R.id.ItmContacto:
                Intent intent1 = new Intent(this,Contacto.class);
                startActivity(intent1);
                break;

            case R.id.ItmAcercade:
                Intent intent2 = new Intent(this,AcercaDe.class);
                startActivity(intent2);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }



    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout = (TabLayout) findViewById(R.id.TLmascotas);
        viewPager = (ViewPager) findViewById(R.id.VPmascotas);

        setUpViewPager();

    }
    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment>fragments = new ArrayList<>();
        fragments.add(new RvMascotas());
        fragments.add(new MIMascota());
        return fragments;
    }
    private void setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_name2);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_name);
    }


}
