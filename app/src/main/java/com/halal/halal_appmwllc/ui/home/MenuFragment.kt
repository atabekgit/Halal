package com.halal.halal_appmwllc.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_o_prilojenie_.*

class MenuFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lichnuyKabinet.setOnClickListener{nextKabinet(view)}
        btn_settings.setOnClickListener{nextSettings(view)}
        voprosy_i_otvety.setOnClickListener{nextQuestions(view)}
        btn_sobytie.setOnClickListener{nextSobytye(view)}
        btn_app_O.setOnClickListener{nextApp(view)}
        btn_sertification_ob.setOnClickListener{nextSertification(view)}

    }
    fun nextKabinet(view: View){
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_menuFragment_to_lishnye_Kabinet_Fragment)
    }
    fun nextSettings(view: View){
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_menuFragment_to_settingsFragment2)
    }
    fun nextQuestions(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_menuFragment_to_questions_i_answersFragment)
    }
    fun nextSobytye(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_menuFragment_to_sobytie_Fragment)
    }
    fun nextApp(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_menuFragment_to_o_prilojenie_Fragment)
    }
    fun nextSertification(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_menuFragment_to_sertification_halal_Fragment)
    }
}