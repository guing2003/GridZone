package com.guilhermedelecrode.gridzone.ui

import PilotoFragmentAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.DetalhesPilotoActivity
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.model.Piloto

class PilotosFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_piloto, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView_piloto_fragment)

        val listaPilotos = listOf(
            Piloto("Lewis Hamilton", "HAM", 44,"Ferrari" ),
            Piloto("Charles Leclerc", "LEC", 16, "Ferrari")
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        recyclerView.adapter = PilotoFragmentAdapter(listaPilotos) { piloto ->
            val intent = Intent(requireContext(), DetalhesPilotoActivity::class.java).apply {
                putExtra("NOME", piloto.nome)
                putExtra("SIGLA", piloto.sigla)
                putExtra("EQUIPE", piloto.equipe)
                putExtra("NUMERO", piloto.numero)
            }
            startActivity(intent)
        }
    }
}
