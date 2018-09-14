package com.example.itmaster.sqlpractica1.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.itmaster.sqlpractica1.Interfaz.ReciclerActivity;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnRecyclerList;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

import java.util.ArrayList;

public class AdapterRecicler extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Persona> personaArrayList;
    private ListenerBtnRecyclerList listenerBtnRecyclerList;

    //public Adapter(ArrayList<Persona> personaArrayList, VerRegistros context, ListView listView)

    public AdapterRecicler(ArrayList<Persona> personaArrayList, ReciclerActivity context, RecyclerView recyclerView) {
        this.context = context;
        this.personaArrayList = personaArrayList;
        this.listenerBtnRecyclerList = listenerBtnRecyclerList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewDeLaCelda = layoutInflater.inflate(R.layout.celda_cliente,parent,false);
        ClienteViewHolder clienteViewHolder = new ClienteViewHolder(viewDeLaCelda);

        //viewDeLaCelda.setOnClick te reconoceria un click en el recyclerView
        
        return clienteViewHolder;


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Persona persona = personaArrayList.get(position);
        ClienteViewHolder clienteViewHolder = (ClienteViewHolder)holder; //casteo para heredar las funciones de mi clase ClienteViewHolder
        clienteViewHolder.cargarCliente(persona);//uso funcion cargarCliente

    }

    @Override
    public int getItemCount() {
        return personaArrayList.size();
    }


    //CREO CLASE ADENTRO DEL ADAPTER

    private class ClienteViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre, dni;


        public ClienteViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.recyclerNombre);
            dni = itemView.findViewById(R.id.recyclerDni);
        }

        public void cargarCliente (Persona persona){
            nombre.setText(persona.getNombre() + "  " + persona.getApellido());
            dni.setText(String.valueOf(persona.getDNI()));
        }

    }
}
