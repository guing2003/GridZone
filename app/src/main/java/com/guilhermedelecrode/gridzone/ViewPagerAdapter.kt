package com.guilhermedelecrode.gridzone.ui

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Pilotos_Campeonato_Fragment()
            1 -> Equipe_Campeonato_Fragment()
            else -> Pilotos_Campeonato_Fragment()
        }
    }
}
