package com.example.itmaster.sqlpractica1.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.itmaster.sqlpractica1.Interfaz.Principal;
import com.example.itmaster.sqlpractica1.Interfaz.RegistrarActivity;

public class ListenerBtnFloating implements View.OnClickListener {

    Principal context;

    public ListenerBtnFloating(Principal context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.context, RegistrarActivity.class);
        context.startActivity(intent);

    }
}
