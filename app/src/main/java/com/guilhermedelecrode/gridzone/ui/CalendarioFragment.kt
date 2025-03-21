package com.guilhermedelecrode.gridzone.ui

import CalendarioFragmentAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.Calendario
import com.guilhermedelecrode.gridzone.model.Piloto

class CalendarioFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calendario, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView_calendario_fragment)

        val listaCalendario = listOf(
            Calendario("GP Da Australia","Domingo, 16 de Março - 1:00h"),
            Calendario("GP da China", "Domingo, 22 de Março - 4:00h"),
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = CalendarioFragmentAdapter(listaCalendario)
    }
}
