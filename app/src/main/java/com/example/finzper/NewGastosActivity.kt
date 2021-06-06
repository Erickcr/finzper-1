package com.example.finzper

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_new_gastos.*
import kotlinx.android.synthetic.main.activity_new_ingresos.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.security.AccessController.getContext


class NewGastosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_gastos)








        val btnRegresar = findViewById<ImageButton>(R.id.btn_regresar)
        btnRegresar.setOnClickListener{
            showRegresar()
        }

        val btnAgregar= findViewById<Button>(R.id.btn_newgasto)
        btnAgregar.setOnClickListener{
            showAgregar()
        }


        val database = IngresoDatabase.getDatabase(this)
        btn_newgasto.setOnClickListener {
            val cantidad = ingresar_cantidad_gasto.text.toString().toInt()
            val categoria = ingresar_categoria_gasto.text.toString()
            val gasto = Gasto(cantidad, categoria)
            CoroutineScope(Dispatchers.IO).launch {
                database.ingresoDao().addGasto(gasto)
                this@NewGastosActivity.finish()
            }
        }
    }

    private fun showRegresar(){
        val inicioIntent : Intent = Intent(this,MainActivity::class.java)
        startActivity(inicioIntent)

    }
    private fun showAgregar(){
        val inicioIntent : Intent = Intent(this,MainActivity::class.java)
        startActivity(inicioIntent)

    }



}