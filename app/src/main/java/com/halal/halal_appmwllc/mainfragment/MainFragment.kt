package com.halal.halal_appmwllc.mainfragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
      return  binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Izbrannoe.setOnClickListener{nextIzbranny(view)}
        val navController = Navigation.findNavController(view)
        namazubakyty.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_bagymdatFragment)
        }
        E_cod.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_e_CodeFragment)

        }

    }
    fun nextIzbranny(view: View){
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_mainFragment_to_izbrannyFragment)
    }
}