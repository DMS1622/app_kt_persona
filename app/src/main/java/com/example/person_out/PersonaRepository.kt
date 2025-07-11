package com.example.person_out

import android.content.Context
import android.widget.Toast
import com.j256.ormlite.android.apptools.OpenHelperManager
import com.j256.ormlite.dao.Dao
import java.sql.SQLException


class PersonaRepository( context: Context) {
    private lateinit var personaDao: Dao<Persona, Int>
    init {
        val helper = OpenHelperManager.getHelper(context,DBHelper::class.java)
        try {
            personaDao = helper.getDao(Persona::class.java)
        }
        catch (e: SQLException)
        {
            e.printStackTrace()
        }
    }
    fun getPersona():List<Persona>
    {
        return personaDao.queryForAll()
    }
    fun addPersona( p:Persona)
    {
        personaDao.create(p)
    }
    fun getOne()
    {
        
    }
}
