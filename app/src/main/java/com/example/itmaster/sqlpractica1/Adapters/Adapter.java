package com.example.itmaster.sqlpractica1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.itmaster.sqlpractica1.Interfaz.VerRegistros;
import com.example.itmaster.sqlpractica1.Models.Persona;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private ArrayList<Persona> personaArrayList;
    private VerRegistros context;

    @Override
    public int getCount() {
        return personaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return personaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater;
        layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        return view;
    }
}
