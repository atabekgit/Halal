package com.halal.halal_appmwllc.ob_organe_po_serticition_halal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import kotlinx.android.synthetic.main.fragment_ob_organe_po_sertification_.*


class Ob_organe_po_sertification_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_ob_organe_po_sertification_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_ob_sertificat.setOnClickListener{nextMain(view)}

    }

    private fun nextMain(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_ob_organe_po_sertification_Fragment_to_mainFragment)

    }
}