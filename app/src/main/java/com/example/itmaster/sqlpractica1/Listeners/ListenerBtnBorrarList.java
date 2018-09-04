package com.example.itmaster.sqlpractica1.Listeners;

import android.content.Context;
import android.view.View;
import android.widget.ListView;

import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;

import java.util.ArrayList;

public class ListenerBtnBorrarList implements View.OnClickListener {
    private Context context;
    private SQLAgenda sqlAgenda;
    private ListView listView;
    private ArrayList<Persona> personaArrayList;

    public ListenerBtnBorrarList(Context context, ListView listView, ArrayList<Persona> personaArrayList) {
        this.context = context;
        this.sqlAgenda = sqlAgenda;
        this.listView = listView;
        this.personaArrayList = personaArrayList;
    }

    @Override
    public void onClick(View view) {
        sqlAgenda = new SQLAgenda(context);
        Integer i = listView.getPositionForView(view);
        sqlAgenda.borrarPersona(personaArrayList.get(i));

    }
}
