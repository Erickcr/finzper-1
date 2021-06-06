package com.example.finzper

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_ingreso.view.*

class IngresosAdapter(private val mContext: Context, private val listaIngresos: List<Ingreso>) : ArrayAdapter<Ingreso>(mContext,0, listaIngresos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_ingreso,parent,false)

        val ingreso = listaIngresos[position]

        layout.Cantidad.text = "$${ingreso.cantidad}"
        layout.Categoria.text = ingreso.categoria
        layout.Tipo.text = "INGRESO"


        return layout
    }



}