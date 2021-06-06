package com.example.finzper

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface IngresoDao {


//INGRESOS
    @Query("SELECT * FROM user_ingreso")
    fun readAllData(): LiveData<List<Ingreso>>

    @Insert
    fun addIngreso(vararg ingreso: Ingreso)


    @Query("SELECT SUM (cantidad) FROM user_ingreso")
    fun getsum(): Int


    //GASTOS
    @Query("SELECT * FROM user_gasto")
    fun getAll():LiveData<List<Gasto>>

    @Insert
    fun addGasto(vararg gasto: Gasto)


}