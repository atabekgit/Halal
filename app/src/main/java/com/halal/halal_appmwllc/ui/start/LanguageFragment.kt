package com.halal.halal_appmwllc.ui.start

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.databinding.FragmentLanguageBinding
import com.halal.halal_appmwllc.model.Category
import com.halal.halal_appmwllc.ui.MainViewModel
import com.halal.halal_appmwllc.ui.MainViewModelFactory
import com.halal.halal_appmwllc.ui.startActivity.ChooseActivity
import com.halal.repository.Repository


class LanguageFragment : Fragment() {
    private lateinit var binding: FragmentLanguageBinding
    private lateinit var list: List<Category>
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLanguageBinding.inflate(layoutInflater)
        binding.btnBackFromLanguage.setOnClickListener {
            (activity as ChooseActivity).navController.navigate(R.id.action_languageFragment_to_chooseFragment)
        }
        return binding.root
    }

}