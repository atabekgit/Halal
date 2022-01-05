package com.halal.halal_appmwllc.serticication_halal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_sertification_halal_.*
import kotlinx.android.synthetic.main.fragment_sobytie_.*

class Sertification_halal_Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sertification_halal_, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_sertificat_halal.setOnClickListener {nextMenutoSertification(view)}
    }
    fun nextMenutoSertification(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_sertification_halal_Fragment_to_menuFragment)
    }

}