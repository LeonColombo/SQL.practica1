package com.example.itmaster.sqlpractica1.Interfaz;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

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

    private android.support.v7.widget.Toolbar toolbar; //lo implemento tambien en el XML
    //en Values > Styles > pongo "NoActionBar" para poder implementar una custom
    //
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

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setTitle("REGISTRO");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //import android.view.Menu;
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            //acciones android puras

            case android.R.id.home:
                onBackPressed();
                break;
        }

        switch (item.getItemId()){
            //acciones CUSTOM definidas por el desarrolador
            case R.id.agregar_cli:
                Intent intent = new Intent(this, RegistrarActivity.class);
                intent.putExtra("ID", 0);
                this.startActivity(intent);
                break;

        }
        return true; //PARA QUE EL METODO ENTIENDA QUE LE PUSE METODOS (SWITCHES)
    }
}
