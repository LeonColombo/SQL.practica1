package com.example.itmaster.sqlpractica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//Hacer Dos Activities -

//1era
// Nombre, Apellido, DNI, Calle, Altura, Piso Dto., Telefono
//**BOTON REGISTRAR**
//BTN REGISTRAR: Almacena en SQLite . Nombre de Base de Datos AGENDA, Nombre de la Tabla CLIENTE
//Termina de cargar y limpia los daros
//por defecto el campo ID autoincremental

//**BOTON VER REGISTROS**
//New Activity / Un ListView: en cada celda[nombre apellido tel dni calle altura piso dto email]

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
