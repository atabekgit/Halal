package com.halal.halal_appmwllc.o_prilojenie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import kotlinx.android.synthetic.main.fragment_o_prilojenie_.*
import kotlinx.android.synthetic.main.fragment_sobytie_.*
import kotlinx.android.synthetic.main.fragment_sobytie_.btn_ob_sobytye

class O_prilojenie_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_o_prilojenie_, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_ob_prilojenia.setOnClickListener {nextMenutoApp(view)}
    }
    fun nextMenutoApp(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_o_prilojenie_Fragment_to_menuFragment)
    }

}