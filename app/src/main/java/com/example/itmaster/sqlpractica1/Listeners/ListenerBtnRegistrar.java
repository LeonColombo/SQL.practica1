package com.example.itmaster.sqlpractica1.Listeners;

import android.view.View;
import android.widget.Toast;

import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Interfaz.MainActivity;
import com.example.itmaster.sqlpractica1.Models.Persona;

public class ListenerBtnRegistrar implements View.OnClickListener{
    MainActivity context;
    private SQLAgenda sqlAgenda;

    public ListenerBtnRegistrar(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        sqlAgenda = new SQLAgenda(context);

        //  public Persona(String nombre, String apellido, String calle, Integer DNI, Integer altura, Integer pisoDto, Integer telefono, Integer ID)
        Persona persona = new Persona (String.valueOf(context.getNombre().getText()), String.valueOf(context.getApellido().getText()),String.valueOf(context.getCalle().getText()),Integer.valueOf(context.getDNI().getText().toString()),Integer.valueOf(context.getAltura().getText().toString()),Integer.valueOf(context.getPisoDto().getText().toString()), Integer.valueOf(context.getTelefono().getText().toString()),null);

        sqlAgenda.guardarPersona(persona);
        Toast toast = new Toast(this.context);
        toast.setText("GUARDADO");
        toast.setDuration(Toast.LENGTH_LONG);
    }
}
