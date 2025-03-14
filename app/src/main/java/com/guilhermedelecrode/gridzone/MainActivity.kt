package com.guilhermedelecrode.gridzone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.guilhermedelecrode.gridzone.ui.CalendarioFragment
import com.guilhermedelecrode.gridzone.ui.CampeonatoFragment
import com.guilhermedelecrode.gridzone.ui.HomeFragment
import com.guilhermedelecrode.gridzone.ui.PilotosFragment
import com.guilhermedelecrode.gridzone.ui.TeamsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // Define o fragmento inicial como HomeFragment
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
                R.id.nav_teams -> TeamsFragment()
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
