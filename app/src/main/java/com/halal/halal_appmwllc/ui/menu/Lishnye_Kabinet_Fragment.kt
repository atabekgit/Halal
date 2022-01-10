package com.halal.halal_appmwllc.ui.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.databinding.FragmentLishnyeKabinetBinding
import com.halal.halal_appmwllc.model.User
import com.halal.halal_appmwllc.ui.MainViewModel
import com.halal.halal_appmwllc.ui.MainViewModelFactory
import com.halal.repository.Repository
import kotlinx.android.synthetic.main.fragment_lishnye__kabinet_.*
import kotlinx.android.synthetic.main.fragment_menu.*


class Lishnye_Kabinet_Fragment : Fragment() {

    private lateinit var binding:FragmentLishnyeKabinetBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLishnyeKabinetBinding.inflate(layoutInflater)

        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_back_menu.setOnClickListener {backMenu(view)}
    }
    fun backMenu(view: View){
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_lishnye_Kabinet_Fragment_to_menuFragment)
    }

}