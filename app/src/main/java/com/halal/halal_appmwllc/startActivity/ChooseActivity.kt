package com.halal.halal_appmwllc.startActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.databinding.ActivityChooseBinding

class ChooseActivity : AppCompatActivity() {
    lateinit var navController: NavController
    private lateinit var binding:ActivityChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.start_fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

    }
}