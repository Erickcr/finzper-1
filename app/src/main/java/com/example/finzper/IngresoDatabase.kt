package com.example.finzper

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Ingreso::class,Gasto::class], version = 2,exportSchema = false)
abstract class IngresoDatabase : RoomDatabase() {

    abstract fun ingresoDao(): IngresoDao

    companion object {
        @Volatile
        private var INSTANCE: IngresoDatabase? = null

        fun getDatabase(context: Context): IngresoDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    IngresoDatabase::class.java,
                    "ingreso_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}