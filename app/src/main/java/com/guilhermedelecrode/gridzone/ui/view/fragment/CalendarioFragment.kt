package com.guilhermedelecrode.gridzone.ui.view.fragment

import CalendarioFragmentAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.data.model.Calendario
import com.guilhermedelecrode.gridzone.ui.view.DetalhesCorridaActivity

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
        recyclerView.adapter = CalendarioFragmentAdapter(listaCalendario) { calendario ->
            val intent = Intent(requireContext(), DetalhesCorridaActivity::class.java).apply {
                putExtra("NOME", calendario.nome)
                putExtra("DATA", calendario.data)
            }
            startActivity(intent)
        }
    }
}
