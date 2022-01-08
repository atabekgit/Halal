package com.halal.halal_appmwllc.ui.start

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.halal.halal_appmwllc.ui.main.MainActivity
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.databinding.FragmentChooseBinding
import com.halal.halal_appmwllc.ui.startActivity.ChooseActivity


class ChooseFragment : Fragment() {
    private lateinit var binding: FragmentChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooseBinding.inflate(layoutInflater)
        binding.btnCountry.setOnClickListener {
            (activity as ChooseActivity).navController.navigate(R.id.action_chooseFragment_to_countryFragment)
        }
        binding.btnLanguage.setOnClickListener {
            (activity as ChooseActivity).navController.navigate(R.id.action_chooseFragment_to_languageFragment)
        }
        binding.btnNext.setOnClickListener {
            val intent = Intent(activity?.application, MainActivity::class.java)
            startActivity(intent)
            (activity as Activity?)!!.overridePendingTransition(0, 0)
        }
        return binding.root
    }

}