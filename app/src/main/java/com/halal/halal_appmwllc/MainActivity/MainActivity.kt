package com.halal.halal_appmwllc.MainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.namazAdapter.ViewPagerAdaper
import com.halal.halal_appmwllc.namaz_fragment.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        val navController = navHostFragment?.findNavController()
        if (navController != null) {
            bottomNavigationView.setupWithNavController(navController)
        }

    }
    //abdurahim
    //atashli
    //atatats
}