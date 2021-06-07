package com.example.finzper

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user_ingreso")
 class Ingreso (
    val cantidad:Int,
    val categoria: String,


    @PrimaryKey(autoGenerate = true)
    val id:Int = 0
):Serializable


@Entity(tableName = "user_gasto")
class Gasto (
    val cantidad:Int,
    val categoria: String,


    @PrimaryKey(autoGenerate = true)
    val id:Int = 0
):Serializable

@Entity(tableName = "user")
class User (
    val nombre: String,
    val apellidos: String,
    val correo: String,
    val contraseña: String,



    @PrimaryKey(autoGenerate = true)
    val id:Int = 0
):Serializable




