package com.example.itmaster.sqlpractica1.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.itmaster.sqlpractica1.Interfaz.MainActivity;
import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;

public class ListenerBtnVerRegistros implements View.OnClickListener {
    MainActivity context;

    public ListenerBtnVerRegistros(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.context, VerRegistros.class);
        context.startActivity(intent);

    }
}
