package com.example.person_out

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
import com.j256.ormlite.support.ConnectionSource
import com.j256.ormlite.table.TableUtils

class DBHelper( context:Context
) : OrmLiteSqliteOpenHelper(context,NOMBRE_DB,null,VERSION_DB){

    private companion object
    {
        const val NOMBRE_DB = "Persona"
        const val VERSION_DB = 1
    }

    override fun onCreate(p0: SQLiteDatabase?, p1: ConnectionSource?) {
        TableUtils.createTableIfNotExists(connectionSource,Persona::class.java)

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: ConnectionSource?, p2: Int, p3: Int) {

    }


}