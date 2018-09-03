package com.example.itmaster.sqlpractica1.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.itmaster.sqlpractica1.Adapters.Adapter;
import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

import java.util.ArrayList;

public class VerRegistros extends AppCompatActivity {

    private ArrayList<Persona> personaArrayList;
    private SQLAgenda sqlAgenda;
    private Adapter adapter;
    private ListView listView;
    private Persona persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_registros);

        sqlAgenda = new SQLAgenda(this);

        personaArrayList = sqlAgenda.getPersona();
        adapter = new Adapter(personaArrayList,this);

        listView = findViewById(R.id.ListaPersonas);
        listView.setAdapter(adapter);

    }
}
