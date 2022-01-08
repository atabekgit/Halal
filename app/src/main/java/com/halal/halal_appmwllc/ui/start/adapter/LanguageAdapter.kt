package com.halal.halal_appmwllc.ui.start.adapter

import android.content.Context
import android.content.Intent
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.model.Language
import com.halal.halal_appmwllc.ui.startActivity.ChooseActivity

class LanguageAdapter( context: Context) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {
    private var listOfLanguage: List<Language> = emptyList()
    private var lastCheckedPosition = -1
    private var isNewRadioButton: Boolean = false

    fun setListOfLanguage(listOfLanguage: List<Language>) {
        this.listOfLanguage = listOfLanguage
        notifyDataSetChanged()
    }

    class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameOfLanguage: TextView = itemView.findViewById(R.id.text_language)
        val checkBoxOfLanguage: RadioButton = itemView.findViewById(R.id.checkbox_language)
      //  val layoutLang: ConstraintLayout = itemView.findViewById(R.id.layoutLanguage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_language, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val language = listOfLanguage[position]
        holder.nameOfLanguage.text = language.nameOfLanguage

        if (isNewRadioButton){
            holder.checkBoxOfLanguage.isChecked = language.isSelected
        }else{
            if (holder.adapterPosition == 0){
                holder.checkBoxOfLanguage.isChecked = true
                lastCheckedPosition =0
            }
        }

         holder.checkBoxOfLanguage.setOnClickListener{
             handleRadioButtonChecks(holder.adapterPosition)
         }
    }

    override fun getItemCount(): Int {
        return listOfLanguage.size
    }

    private fun handleRadioButtonChecks(position: Int) {
        isNewRadioButton = true
        listOfLanguage[lastCheckedPosition].isSelected = false
        listOfLanguage[position].isSelected = true
        lastCheckedPosition = position
        notifyDataSetChanged()
    }
}
