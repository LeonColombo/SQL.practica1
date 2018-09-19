package com.example.itmaster.sqlpractica1.Listeners;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioGroup;

import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;

import java.util.ArrayList;

public class ListenerChkDni implements View.OnClickListener {

    private VerRegistros context;
    private SQLAgenda sqlAgenda;
    private ListView listView;
    private ArrayList<Persona> personaArrayList;
    private Persona persona;

    public ListenerChkDni(VerRegistros context, ListView listView, ArrayList<Persona> personaArrayList) {
        this.context = context;
        this.sqlAgenda = sqlAgenda;
        this.listView = listView;
        this.personaArrayList = personaArrayList;
    }


    @Override
    public void onClick(View view) {


        sqlAgenda = new SQLAgenda(context);
        personaArrayList = new ArrayList<Persona> () ;




        personaArrayList = sqlAgenda.ordenarPersonasDni();


        context.getAdapter().setPersonaArrayList(personaArrayList);
        context.getAdapter().notifyDataSetChanged();
    }
}
