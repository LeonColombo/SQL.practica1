package com.example.itmaster.sqlpractica1.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.itmaster.sqlpractica1.Interfaz.Principal;
import com.example.itmaster.sqlpractica1.Interfaz.ReciclerActivity;
import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;

public class ListenerBtnRecyclerList implements View.OnClickListener {
Principal context;

    public ListenerBtnRecyclerList(Principal context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

//Integer posicionTocada = Principal.interfaz.getReciclerViewCliente().getChildAdapterPosition(view);
//Persona personaAux = Principal.interfaz.getPersonaArrayList().get(posicionTocada);
        Intent intent = new Intent(this.context, ReciclerActivity.class);
        context.startActivity(intent);
    }
}
