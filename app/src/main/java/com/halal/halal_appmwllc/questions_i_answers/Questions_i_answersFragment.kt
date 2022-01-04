package com.halal.halal_appmwllc.questions_i_answers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import kotlinx.android.synthetic.main.fragment_questions_i_answers.*


class Questions_i_answersFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_questions_i_answers, container, false)
        }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_back_menu_to_question.setOnClickListener {nextMenu(view)}

    }

    fun nextMenu(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_questions_i_answersFragment_to_menuFragment)
    }

    }

