package com.example.finzper

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_inicio.*

class InicioFragment : Fragment(){


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_inicio, container, false)




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        //INGRESO
        var listaIngreso = emptyList<Ingreso>()
        val database = IngresoDatabase.getDatabase(this.requireContext())

        database.ingresoDao().readAllData().observe(viewLifecycleOwner, Observer {
            listaIngreso = it

            val adapter = IngresosAdapter(this.requireContext(),listaIngreso)

            lista.adapter = adapter

        })


        //GASTO
        var listaGasto = emptyList<Gasto>()
        val databasegasto = IngresoDatabase.getDatabase(this.requireContext())

        databasegasto.ingresoDao().getAll().observe(viewLifecycleOwner, {
            listaGasto = it

            val adapter2 = GastoAdapter(this.requireContext(),listaGasto)

            lista.adapter = adapter2
        })













        btn_gastos.setOnClickListener {
            requireContext().let{
                it.startActivity(Intent(it, NewGastosActivity::class.java))
            }
        }

        btn_ingresos.setOnClickListener {
            requireContext().let{
                it.startActivity(Intent(it, NewIngresosActivity::class.java))
            }
        }

    }


    companion object {
        fun newInstance(): InicioFragment = InicioFragment()


    }
}