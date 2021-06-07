package com.example.finzper

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class categorias : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)

        val btnRegresar = findViewById<ImageButton>(R.id.btn_regresar)
        btnRegresar.setOnClickListener{
            showRegresar()
        }

        val btn_registro_gasto = findViewById<ImageButton>(R.id.btn_registro_gasto)
        btn_registro_gasto.setOnClickListener{
            showRegistroGasto()
        }

        val btn_registro_ingreso = findViewById<ImageButton>(R.id.btn_registro_ingreso)
        btn_registro_ingreso.setOnClickListener{
            showRegistroIngreso()
        }

    }
    private fun showRegresar(){
        val inicioIntent : Intent = Intent(this,MainActivity::class.java)
        startActivity(inicioIntent)

    }
    private fun showRegistroGasto(){
        val inicioIntent : Intent = Intent(this,nuevogasto::class.java)
        startActivity(inicioIntent)

    }
    private fun showRegistroIngreso(){
        val inicioIntent : Intent = Intent(this, nuegoingreso::class.java)
        startActivity(inicioIntent)

    }
}