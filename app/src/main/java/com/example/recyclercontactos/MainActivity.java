package com.example.recyclercontactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contacto c1= new Contacto("Pepe","Perez" ,"Pepe@gmail.com", 23);
        Contacto c2= new Contacto("Ana", "Torrojas" ,"Ana@gmail.com", 23);
        Contacto c3= new Contacto("Lolo", "Manolo" ,"Lolo@gmail.com", 23);
        Contacto c4= new Contacto("Filomena", "Hijaputa" ,"Filomena@gmail.com", 23);
        Contacto c5= new Contacto("Toño", "Castaña" ,"toño@gmail.com", 23);
        Contacto c6= new Contacto("Mari", "ConPintas" ,"Mari@gmail.com", 23);
        Contacto c7= new Contacto("Jorge", "Nitales" ,"Jorge@gmail.com", 23);
        Contacto c8= new Contacto("Xavi", "Robles" ,"Xavi@gmail.com", 23);
        Contacto c9= new Contacto("almer", "Galarga" ,"Almer@gmail.com", 23);
        Contacto c10= new Contacto("Miguel", "Parra" ,"Miguel@gmail.com", 23);

        ArrayList<Contacto> lista = new ArrayList<Contacto>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        lista.add(c6);
        lista.add(c7);
        lista.add(c8);
        lista.add(c9);
        lista.add(c10);

        RecyclerView rec = findViewById(R.id.mi_Recycler);
        RecyclerView.LayoutManager gestor = new LinearLayoutManager(this);
        MiAdaptador adaptador = new MiAdaptador(lista);
        rec.setLayoutManager(gestor);
        rec.setAdapter(adaptador);

    }
}