package com.example.itmaster.sqlpractica1.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.itmaster.sqlpractica1.Adapters.AdapterRecicler;
import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnRecyclerList;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

import java.util.ArrayList;

public class ReciclerActivity extends AppCompatActivity {


    private ArrayList<Persona> personaArrayList;
    private SQLAgenda sqlAgenda;
    private AdapterRecicler adapterRecicler;
    private RecyclerView recyclerView ;
    private Persona persona;
    private ListenerBtnRecyclerList listenerBtnRecyclerList;

    public ArrayList<Persona> getPersonaArrayList() {
        return personaArrayList;
    }

    public void setPersonaArrayList(ArrayList<Persona> personaArrayList) {
        this.personaArrayList = personaArrayList;
    }

    public AdapterRecicler getAdapterRecicler() {
        return adapterRecicler;
    }

    public void setAdapterRecicler(AdapterRecicler adapterRecicler) {
        this.adapterRecicler = adapterRecicler;
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicler);

        recyclerView = findViewById(R.id.rscCliente);

        sqlAgenda = new SQLAgenda(this);

        personaArrayList = sqlAgenda.getPersona();
        adapterRecicler = new AdapterRecicler(personaArrayList,this,recyclerView);

        recyclerView.setAdapter(adapterRecicler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);



         }





}
