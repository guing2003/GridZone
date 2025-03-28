package com.guilhermedelecrode.gridzone.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.guilhermedelecrode.gridzone.R
import com.guilhermedelecrode.gridzone.ui.view.fragment.CalendarioFragment
import com.guilhermedelecrode.gridzone.ui.view.fragment.CampeonatoFragment
import com.guilhermedelecrode.gridzone.ui.view.fragment.HomeFragment
import com.guilhermedelecrode.gridzone.ui.view.fragment.PilotosFragment
import com.guilhermedelecrode.gridzone.ui.view.fragment.EquipeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }

        bottomNavigationView.setOnItemSelectedListener { item ->
            val selectedFragment: Fragment = when (item.itemId) {
                R.id.nav_home -> HomeFragment()
                R.id.nav_calendario -> CalendarioFragment()
                R.id.nav_pilots -> PilotosFragment()
                R.id.nav_teams -> EquipeFragment()
                R.id.nav_championship -> CampeonatoFragment()
                else -> HomeFragment()
            }

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, selectedFragment)
                .commit()

            true
        }
    }
}
