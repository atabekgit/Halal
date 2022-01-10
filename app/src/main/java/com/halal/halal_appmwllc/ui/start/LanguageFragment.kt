package com.halal.halal_appmwllc.ui.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.databinding.FragmentLanguageBinding
import com.halal.halal_appmwllc.model.Language
import com.halal.halal_appmwllc.ui.startActivity.ChooseActivity
import com.halal.halal_appmwllc.ui.start.adapter.LanguageAdapter


class LanguageFragment : Fragment() {
    private lateinit var binding: FragmentLanguageBinding
    private lateinit var list:List<Language>
    private val adapter by lazy {
        LanguageAdapter(requireContext())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLanguageBinding.inflate(layoutInflater)
        binding.recyclerViewLanguage.adapter = adapter
        binding.recyclerViewLanguage.layoutManager = LinearLayoutManager(activity)
        adapter.setListOfLanguage(list)


        binding.btnBackFromLanguage.setOnClickListener {
            (activity as ChooseActivity).navController.navigate(R.id.action_languageFragment_to_chooseFragment)
        }
        return binding.root
    }

}