package com.halal.halal_appmwllc.ui.menu

import android.app.Dialog
import android.content.ContentValues.TAG
import android.content.res.Configuration
import android.media.MediaCodec.MetricsConstants.MODE
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation

import com.halal.halal_appmwllc.databinding.FragmentSettingsBinding
import kotlinx.android.synthetic.main.fragment_settings.*
import kotlinx.android.synthetic.main.theme.*
import android.view.WindowManager


import android.widget.TextView
import com.halal.halal_appmwllc.R
import android.widget.Toast
import com.halal.halal_appmwllc.R.id

class SettingsFragment() : Fragment() {
    private lateinit var binding: FragmentSettingsBinding
    private lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_back_tosettings.setOnClickListener { backMenu(view) }
        repair_theme.setOnClickListener {
            dialog = Dialog(requireActivity())
            dialog.setContentView(com.halal.halal_appmwllc.R.layout.theme)
            val width = WindowManager.LayoutParams.WRAP_CONTENT

            val height = WindowManager.LayoutParams.WRAP_CONTENT
            dialog.window!!.setLayout(width, height)
            dialog.getWindow()!!.setBackgroundDrawableResource(R.drawable.shape_radio)

            dialog.show()
            val textViewNo = dialog.findViewById<TextView>(R.id.btn_theme_otmena)
            val textViewYes = dialog.findViewById<TextView>(R.id.btn_theme_ok)






            textViewNo.setOnClickListener {
                dialog.dismiss()
            }
            textViewYes.setOnClickListener {
                val radioGroup: RadioGroup = dialog.findViewById<RadioGroup>(R.id.Theme_RadioGroup)
                val di = radioGroup.checkedRadioButtonId
                when (di) {
                    R.id.rb_Light -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                    R.id.rb_Dark -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
                dialog.dismiss()

            }


        }
    }

    fun backMenu(view: View) {
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_settingsFragment2_to_menuFragment)
    }


}

