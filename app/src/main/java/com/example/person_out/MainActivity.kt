package com.example.person_out

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val listP = listOf(
        Persona("Diego", 3333),
        Persona("Lauti", 22222),
        Persona("Walter", 11111))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        val rvPersona = findViewById<RecyclerView>(R.id.rvPersona)
        val adapter = personaAdapter(listP)
        rvPersona.adapter = adapter

    }

}