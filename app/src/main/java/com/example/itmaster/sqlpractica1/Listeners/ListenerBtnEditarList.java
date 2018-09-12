package com.example.itmaster.sqlpractica1.Listeners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Interfaz.RegistrarActivity;
import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;

import java.util.ArrayList;


public class ListenerBtnEditarList implements View.OnClickListener {

    VerRegistros context;

    SQLAgenda sqlAgenda;
    ListView listView;
    ArrayList<Persona> personaArrayList;
    Persona persona;

    public ListenerBtnEditarList(VerRegistros context, ListView listView, ArrayList<Persona> personaArrayList) {
        this.context = context;
        this.sqlAgenda = sqlAgenda;
        this.listView = listView;
        this.personaArrayList = personaArrayList;
    }

    //hace un new intent igual que el btnregistrar
    //intent putint ID dif 0
    @Override
    public void onClick(View view) {

        //  @Override
        //    public void onClick(View view) {
        //        SqliteAgenda sqliteAgenda=new SqliteAgenda(context);
        //        Integer posicion=listView.getPositionForView(view);
        //        sqliteAgenda.EditarAgendaSql(agendaArrayList.get(posicion));
        //
        //        Agenda agendaEdit=agendaArrayList.get(posicion);
        //
        //        Intent intentActivity2=new Intent(context, Activity2.class);
        //
        //        Bundle bundleEditar=new Bundle();
        //        bundleEditar.putSerializable("Agenda",agendaEdit);
        //
        //        intentActivity2.putExtras(bundleEditar);
        //        context.startActivity(intentActivity2);
        //    }


        
        SQLAgenda sqlAgenda = new SQLAgenda(context);
        Integer posicion = listView.getPositionForView(view);

        Persona personaEditada =personaArrayList.get(posicion);
        //dame todos los datos del obj q esta en esa posicion//

        Intent intent = new Intent (this.context, RegistrarActivity.class);

        Bundle bundleEditar=new Bundle();
        bundleEditar.putInt("PersonaID", personaEditada.getID());
        intent.putExtras(bundleEditar);

        context.startActivity(intent);


        context.getAdapter().notifyDataSetChanged();




    }
}
