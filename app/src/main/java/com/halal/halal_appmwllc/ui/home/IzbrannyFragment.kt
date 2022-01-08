package com.halal.halal_appmwllc.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import kotlinx.android.synthetic.main.fragment_izbranny.*
import kotlinx.android.synthetic.main.fragment_settings.*
import kotlinx.android.synthetic.main.fragment_settings.btn_back_tosettings


class IzbrannyFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_izbranny, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_back_izbranny.setOnClickListener{backMenu(view)}

    }
    fun backMenu(view: View){
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_izbrannyFragment_to_mainFragment)
    }
}