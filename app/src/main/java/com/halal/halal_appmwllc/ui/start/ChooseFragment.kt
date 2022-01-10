package com.halal.halal_appmwllc.ui.start

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.halal.halal_appmwllc.ui.main.MainActivity
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.databinding.FragmentChooseBinding
import com.halal.halal_appmwllc.ui.startActivity.ChooseActivity
import com.halal.halal_appmwllc.ui.MainViewModel


class ChooseFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel



    private lateinit var binding: FragmentChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooseBinding.inflate(layoutInflater)


        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        GetAllQuestion()


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
     fun GetAllQuestion() {
        mainViewModel.questionList.observe(requireActivity(), Observer {
            if (it.isSuccessful && it.body() != null) {
                val a:Int = 3
                if (a<it.body()!!.size) {
                    Log.d("TAG", "GetAllQuestion: " + it.body()!![a].author)
                }else{
                    Toast.makeText(requireActivity(),"Error",Toast.LENGTH_SHORT).show()
                }

            }})
    }
}