package com.example.itmaster.sqlpractica1.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.itmaster.sqlpractica1.Adapters.Adapter;
import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnBorrarList;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnRegistrar;
import com.example.itmaster.sqlpractica1.Listeners.ListenerChkDni;
import com.example.itmaster.sqlpractica1.Listeners.ListenerChkListName;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

import java.util.ArrayList;

public class VerRegistros extends AppCompatActivity {

    private ArrayList<Persona> personaArrayList;
    private SQLAgenda sqlAgenda;
    private Adapter adapter;
    private ListView listView;
    private Persona persona;
    private ImageButton btnLstEditar, btnLstBorrar;
    private Button checkBoxName, checkBoxDNI;
    private ListenerChkListName listenerChkListName;
    private ListenerChkDni listenerChkDni;


    public Adapter getAdapter() {
        return adapter;
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_registros);
        listView = findViewById(R.id.ListaPersonas);
        btnLstBorrar = findViewById(R.id.btnLstBorrar);
        btnLstEditar = findViewById(R.id.btnLstEditar);

        checkBoxName = findViewById(R.id.checkboxName);
        checkBoxDNI = findViewById(R.id.checkboxDNI);


        listenerChkListName = new ListenerChkListName(this,listView,personaArrayList);
        checkBoxName.setOnClickListener(listenerChkListName);
        listenerChkDni = new ListenerChkDni(this,listView,personaArrayList);
        checkBoxDNI.setOnClickListener(listenerChkDni);


        sqlAgenda = new SQLAgenda(this);

        personaArrayList = sqlAgenda.getPersona();
        adapter = new Adapter(personaArrayList,this, listView);



        listView.setAdapter(adapter);

    }
}
