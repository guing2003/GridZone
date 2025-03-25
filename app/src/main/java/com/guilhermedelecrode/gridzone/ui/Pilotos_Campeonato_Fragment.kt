package com.guilhermedelecrode.gridzone.ui

import PilotoCampeonatoFragmentAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.Piloto

class Pilotos_Campeonato_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pilotos_campeonato, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView_campeonato_piloto_fragment)

        val listaPilotos = listOf(
            Piloto("Lewis Hamilton", "HAM", "44","Ferrari"),
            Piloto("Charles Leclerc", "LEC", "16","Ferrari")
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = PilotoCampeonatoFragmentAdapter(listaPilotos)
    }

}
