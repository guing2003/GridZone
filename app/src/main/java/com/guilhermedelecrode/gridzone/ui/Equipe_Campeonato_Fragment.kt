package com.guilhermedelecrode.gridzone.ui

import EquipeCampeonatoFragmentAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.EquipeCampeonato
import com.guilhermedelecrode.gridzone.model.PilotoCampeonato

class Equipe_Campeonato_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_equipe_campeonato, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView_campeonato_equipe_fragment)

        val listaEquipe = listOf(
            EquipeCampeonato("McLaren", 78.0),
            EquipeCampeonato("Mercedes", 57.0)
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = EquipeCampeonatoFragmentAdapter(listaEquipe)
    }
}