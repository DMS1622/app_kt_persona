package com.example.person_out

import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName =  "Persona")
data class Persona(
    @DatabaseField(id = true)
    var id: Int = 0,
    @DatabaseField
    var nombre: String = ""
): Serializable {

}