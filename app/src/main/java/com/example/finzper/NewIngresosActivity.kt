package com.example.finzper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_new_ingresos.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewIngresosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_ingresos)


        val btnRegresar = findViewById<ImageButton>(R.id.btn_regresar)
        btnRegresar.setOnClickListener{
            showRegresar()
        }

        val btnAgregar= findViewById<Button>(R.id.btn_newingreso)
        btnAgregar.setOnClickListener{
            showAgregar()
        }



        val database = IngresoDatabase.getDatabase(this)
        btn_newingreso.setOnClickListener {
            val cantidad = ingresar_cantidad.text.toString().toInt()
            val categoria = ingresar_categoria.text.toString()
            val ingreso = Ingreso(cantidad, categoria)
            CoroutineScope(Dispatchers.IO).launch {
                database.ingresoDao().addIngreso(ingreso)
                this@NewIngresosActivity.finish()
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