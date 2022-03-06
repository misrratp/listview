package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var frutas:ArrayList<String> = ArrayList()
        frutas.add("Manzana")
        frutas.add("Durazno")
        frutas.add("Platano")
        frutas.add("Sandia")

        val lista = findViewById<ListView>(R.id.lista)
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,frutas  )

        lista.adapter= adaptador
        lista.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText( this, frutas.get(position), Toast.LENGTH_SHORT).show()

    }  }}
