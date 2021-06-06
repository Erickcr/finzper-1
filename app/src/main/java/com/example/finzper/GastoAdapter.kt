package com.example.finzper

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_ingreso.view.*

class GastoAdapter(private val mContext: Context, private val listaIngresos: List<Gasto>) : ArrayAdapter<Gasto>(mContext,0, listaIngresos) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_ingreso,parent,false)

        val gasto = listaIngresos[position]

        layout.Cantidad.text = "$${gasto.cantidad}"
        layout.Categoria.text = gasto.categoria
        layout.Tipo.text = "GASTO"


        return layout
    }

}