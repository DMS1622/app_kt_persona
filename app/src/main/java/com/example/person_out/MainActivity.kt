package com.example.person_out

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    /*private val listP = listOf(
        Persona(3333, "Diego"),
        Persona(2222, "Lauti"),
        Persona(1111, "Walter"))*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p1 = Persona(1,"Diego")
        PersonaRepository(this).addPersona(p1)
        p1 = Persona(2,"Walter")
        PersonaRepository(this).addPersona(p1)
        p1 = Persona(3,"Lauti")
        PersonaRepository(this).addPersona(p1)
        val rvPersona = findViewById<RecyclerView>(R.id.rvPersona)
        val adapter = personaAdapter(PersonaRepository(this).getPersona())
        rvPersona.adapter = adapter

    }

}