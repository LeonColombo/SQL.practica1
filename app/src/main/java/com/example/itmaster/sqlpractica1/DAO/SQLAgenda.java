package com.example.itmaster.sqlpractica1.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.itmaster.sqlpractica1.Models.Persona;

import java.util.ArrayList;

public class SQLAgenda extends SQLiteOpenHelper {

    private Context context;
    private SQLiteDatabase conexion;
    private ArrayList<Persona> personaArrayList;

    private static final String DB_NAME = "AGENDA";
    private static final Integer DB_VERSION = 1;

    public SQLAgenda(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE `CLIENTE` ( `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, `NOMBRE` TEXT NOT NULL, `APELLIDO` TEXT NOT NULL, `DNI` INTEGER NOT NULL, `CALLE` TEXT NOT NULL, `ALTURA` INTEGER NOT NULL, `PISO` INTEGER, `TELEFONO` INTEGER NOT NULL )";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }

    private void conectar(){
        conexion = getWritableDatabase();
    }
    private void desconectar(){
        conexion.close();
    }

    public void guardarPersona(Persona persona){
        this.conectar();
        ContentValues fila = new ContentValues();

        fila.put("NOMBRE",persona.getNombre());
        fila.put("APELLIDO", persona.getApellido());
        fila.put("DNI", persona.getDNI());
        fila.put("CALLE", persona.getCalle());
        fila.put("ALTURA",persona.getAltura());
        fila.put("PISO",persona.getPisoDto());
        fila.put("TELEFONO",persona.getTelefono());

        conexion.insert("CLIENTE",null,fila);
        this.desconectar();
    }

     public ArrayList<Persona> getPersona(){
        personaArrayList = new ArrayList<>();
        this.conectar();
        String query ="";
        query = "select NOMBRE, APELLIDO, CALLE, DNI, ALTURA, PISO, TELEFONO, ID from CLIENTE";
         Cursor cursor = conexion.rawQuery(query,null);
         while(cursor.moveToNext()){
            //Persona(String nombre, String apellido, String calle, Integer DNI, Integer altura, Integer pisoDto, Integer telefono, Integer ID)
             Persona unaPersona = new Persona (cursor.getString(cursor.getColumnIndex("NOMBRE")), cursor.getString(cursor.getColumnIndex("APELLIDO")),cursor.getString(cursor.getColumnIndex("CALLE")), cursor.getInt(cursor.getColumnIndex("DNI")),cursor.getInt(cursor.getColumnIndex("ALTURA")),cursor.getInt(cursor.getColumnIndex("PISO")),cursor.getInt(cursor.getColumnIndex("TELEFONO")),null);
             personaArrayList.add(unaPersona);
         }
        return personaArrayList;
     }



}
