package com.example.person_out

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class personaAdapter(private val lista : List<Persona>):RecyclerView.Adapter<personaAdapter.personaVH>(){



    public final class personaVH(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var nombreTxtView = itemView.findViewById<TextView>(R.id.nombre_persona)
        var dniTxtView = itemView.findViewById<TextView>(R.id.dni_persona)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): personaVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_persona,parent,false)
        return  personaVH(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: personaVH, position: Int) {
        val usr = lista[position]
        holder.nombreTxtView.text = usr.nombre
        holder.dniTxtView.text = usr.id.toString()
    }

    override fun getItemCount(): Int = lista.size

}