package com.example.recyclercontactos;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiContenedorDeVistas> {

    private ArrayList<Contacto> lista_contactos = new ArrayList<>();

    public MiAdaptador(ArrayList<Contacto> lista_contactos) {
        this.lista_contactos = lista_contactos;
    }

    @NonNull
    @Override
    public MiContenedorDeVistas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_contacto, parent, false);
        TextView tv_nombre = vista.findViewById(R.id.textNombre);
        TextView tv_apellido = vista.findViewById(R.id.textApellido);
        TextView tv_email = vista.findViewById(R.id.textEmail);
        TextView tv_edad = vista.findViewById(R.id.textEdad);
        MiContenedorDeVistas contenerdor = new MiContenedorDeVistas(vista);
        Log.d("contenedor", "creando contenedor de vistas");
        return contenerdor;
    }

    @Override
    public void onBindViewHolder(@NonNull MiContenedorDeVistas holder, int position) {
        Contacto c = lista_contactos.get(position);
        holder.tv_nombre.setText((c.getNombre()));
        holder.tv_apellido.setText(c.getApellido());
        holder.tv_email.setText(c.getEmail());
        holder.tv_edad.setText(String.valueOf(c.getEdad()));
        Log.d("contenedor", "vinculando position" + position);
    }

    @Override
    public int getItemCount() {
        return lista_contactos.size();
    }

    public static class MiContenedorDeVistas extends RecyclerView.ViewHolder {
        public TextView tv_nombre, tv_email, tv_edad, tv_apellido;

        public MiContenedorDeVistas(View vista) {
            super(vista);
            this.tv_nombre = vista.findViewById(R.id.textNombre);
            this.tv_apellido = vista.findViewById(R.id.textApellido);
            this.tv_email = vista.findViewById(R.id.textEmail);
            this.tv_edad = vista.findViewById(R.id.textEdad);
        }

    }


}