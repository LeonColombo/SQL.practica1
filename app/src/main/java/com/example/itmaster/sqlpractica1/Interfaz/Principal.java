package com.example.itmaster.sqlpractica1.Interfaz;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import com.example.itmaster.sqlpractica1.Adapters.AdapterRecicler;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnFloating;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnRecyclerList;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnRegistrar;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnVerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    private ListenerBtnRegistrar listenerBtnRegistrar;
    private ListenerBtnVerRegistros listenerBtnVerRegistros;
    private ListenerBtnRecyclerList listenerBtnRecyclerList;
    private ListenerBtnFloating listenerBtnFloating;

    private Button BtnRegistrar, BtnVerRegistros, BtnVerRecycler;
    private EditText Nombre, Apellido, DNI, Calle, Altura, PisoDto, Telefono;
    private com.example.itmaster.sqlpractica1.Models.Persona Persona;
    private RecyclerView reciclerViewCliente;
    private AdapterRecicler adapterRecicler;
    private ArrayList<Persona> personaArrayList;
    public static Principal interfaz;
    private FloatingActionButton btnFloating;

    public RecyclerView getReciclerViewCliente() {
        return reciclerViewCliente;
    }

    public ArrayList<com.example.itmaster.sqlpractica1.Models.Persona> getPersonaArrayList() {
        return personaArrayList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnFloating = findViewById(R.id.BtnFloating);
        BtnRegistrar = findViewById(R.id.BtnRegistrar);
        BtnVerRegistros = findViewById(R.id.BtnVerRegistros);
        BtnVerRecycler = findViewById(R.id.BtnVerRecyclerList);




        listenerBtnRecyclerList = new ListenerBtnRecyclerList(this);
        BtnVerRecycler.setOnClickListener(listenerBtnRecyclerList);

        listenerBtnRegistrar = new ListenerBtnRegistrar(this);
        BtnRegistrar.setOnClickListener(listenerBtnRegistrar);

        listenerBtnVerRegistros = new ListenerBtnVerRegistros(this);
        BtnVerRegistros.setOnClickListener(listenerBtnVerRegistros);

        listenerBtnFloating = new ListenerBtnFloating(this);
        btnFloating.setOnClickListener(listenerBtnRegistrar);

    }
}
