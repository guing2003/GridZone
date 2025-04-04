package com.guilhermedelecrode.gridzone.ui.view.fragment

import NoticiasFragmentAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.data.model.Noticia

class NoticiasFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_noticias, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerview_fragment_noticias)

        val listaNoticia = listOf(
            Noticia("1", "Titulo da Noticia", "Subtitulo da Noticia", ""),
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        recyclerView.adapter = NoticiasFragmentAdapter(listaNoticia)

    }
}
