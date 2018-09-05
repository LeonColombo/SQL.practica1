package com.example.itmaster.sqlpractica1.Interfaz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnRegistrar;
import com.example.itmaster.sqlpractica1.Listeners.ListenerBtnVerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;
import com.example.itmaster.sqlpractica1.R;

//Hacer Dos Activities -

//1era
// Nombre, Apellido, DNI, Calle, Altura, Piso Dto., Telefono
//**BOTON REGISTRAR**
//BTN REGISTRAR: Almacena en SQLite . Nombre de Base de Datos AGENDA, Nombre de la Tabla CLIENTE
//Termina de cargar y limpia los daros
//por defecto el campo ID autoincremental

//**BOTON VER REGISTROS**
//New Activity / Un ListView: en cada celda[nombre apellido tel dni calle altura piso dto email]

///hacer para el jueves: un mapa de interaccion de dependencias
// y un REFRESH apenas se borra la persona de ListView

public class MainActivity extends AppCompatActivity {

    private ListenerBtnRegistrar listenerBtnRegistrar;
    private ListenerBtnVerRegistros listenerBtnVerRegistros;
    private Button BtnRegistrar, BtnVerRegistros;
    private EditText Nombre, Apellido, DNI, Calle, Altura, PisoDto, Telefono;
    private Persona Persona;


    public ListenerBtnRegistrar getListenerBtnRegistrar() {
        return listenerBtnRegistrar;
    }

    public void setListenerBtnRegistrar(ListenerBtnRegistrar listenerBtnRegistrar) {
        this.listenerBtnRegistrar = listenerBtnRegistrar;
    }

    public ListenerBtnVerRegistros getListenerBtnVerRegistros() {
        return listenerBtnVerRegistros;
    }

    public void setListenerBtnVerRegistros(ListenerBtnVerRegistros listenerBtnVerRegistros) {
        this.listenerBtnVerRegistros = listenerBtnVerRegistros;
    }

    public Button getBtnRegistrar() {
        return BtnRegistrar;
    }

    public void setBtnRegistrar(Button btnRegistrar) {
        BtnRegistrar = btnRegistrar;
    }

    public Button getBtnVerRegistros() {
        return BtnVerRegistros;
    }

    public void setBtnVerRegistros(Button btnVerRegistros) {
        BtnVerRegistros = btnVerRegistros;
    }

    public EditText getNombre() {
        return Nombre;
    }

    public void setNombre(EditText nombre) {
        Nombre = nombre;
    }

    public EditText getApellido() {
        return Apellido;
    }

    public void setApellido(EditText apellido) {
        Apellido = apellido;
    }

    public EditText getDNI() {
        return DNI;
    }

    public void setDNI(EditText DNI) {
        this.DNI = DNI;
    }

    public EditText getCalle() {
        return Calle;
    }

    public void setCalle(EditText calle) {
        Calle = calle;
    }

    public EditText getAltura() {
        return Altura;
    }

    public void setAltura(EditText altura) {
        Altura = altura;
    }

    public EditText getPisoDto() {
        return PisoDto;
    }

    public void setPisoDto(EditText pisoDto) {
        PisoDto = pisoDto;
    }

    public EditText getTelefono() {
        return Telefono;
    }

    public void setTelefono(EditText telefono) {
        Telefono = telefono;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnRegistrar = findViewById(R.id.BtnRegistrar);
        BtnVerRegistros = findViewById(R.id.BtnVerRegistros);

        listenerBtnRegistrar = new ListenerBtnRegistrar(this);
        BtnRegistrar.setOnClickListener(listenerBtnRegistrar);

        listenerBtnVerRegistros = new ListenerBtnVerRegistros(this);
        BtnVerRegistros.setOnClickListener(listenerBtnVerRegistros);

        Nombre = findViewById(R.id.EdtNombre);
        Apellido = findViewById(R.id.EdtApellido);
        DNI = findViewById(R.id.EdtDNI);
        Calle = findViewById(R.id.EdtCalle);
        Altura = findViewById(R.id.EdtAltura);
        PisoDto = findViewById(R.id.EdtPiso);
        Telefono = findViewById(R.id.EdtTelefono);


    }
}
