package com.halal.halal_appmwllc.ui.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import kotlinx.android.synthetic.main.fragment_sobytie_.*

class Sobytie_Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_sobytie_, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_ob_sobytye.setOnClickListener {nextMenutoSobytye(view)}
    }
    fun nextMenutoSobytye(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_sobytie_Fragment_to_menuFragment)
    }
}