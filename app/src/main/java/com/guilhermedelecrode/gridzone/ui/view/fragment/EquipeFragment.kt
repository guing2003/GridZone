package com.guilhermedelecrode.gridzone.ui.view.fragment

import EquipeFragmentAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.data.model.Equipe
import com.guilhermedelecrode.gridzone.ui.view.DetalhesEquipeActivity

class EquipeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_equipe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView_equipe_fragment)

        val listaEquipes = listOf(
            Equipe("Ferrari", "Ferrari"),
            Equipe("Red Bull", "Honda")
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = EquipeFragmentAdapter(listaEquipes) { equipe ->
            val intent = Intent(requireContext(), DetalhesEquipeActivity::class.java).apply {
                putExtra("NOME", equipe.nome)
                putExtra("MOTOR", equipe.motor)
            }
            startActivity(intent)
        }
    }
}
