package com.example.itmaster.sqlpractica1.Listeners;

import android.view.View;

import com.example.itmaster.sqlpractica1.DAO.SQLAgenda;
import com.example.itmaster.sqlpractica1.Interfaz.RegistrarActivity;
import com.example.itmaster.sqlpractica1.Models.Persona;

public class ListenerBtnGuardar implements View.OnClickListener {
    RegistrarActivity context;

    private SQLAgenda sqlAgenda;

    public ListenerBtnGuardar(RegistrarActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        sqlAgenda = new SQLAgenda(context);

        //  public Persona(String nombre, String apellido, String calle, Integer DNI, Integer altura, Integer pisoDto, Integer telefono, Integer ID)
        Persona persona = new Persona(String.valueOf(context.getNombre().getText()), String.valueOf(context.getApellido().getText()), String.valueOf(context.getCalle().getText()), Integer.valueOf(context.getDNI().getText().toString()), Integer.valueOf(context.getAltura().getText().toString()), Integer.valueOf(context.getPisoDto().getText().toString()), Integer.valueOf(context.getTelefono().getText().toString()), null);

        sqlAgenda.guardarPersona(persona);

    }

}
