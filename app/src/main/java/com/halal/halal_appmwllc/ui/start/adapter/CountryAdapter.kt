package com.halal.halal_appmwllc.ui.start.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.model.Country
import kotlinx.coroutines.handleCoroutineException

class CountryAdapter (requireContext: Context) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    private var listOfCountry: List<Country> = emptyList()
  private  var lastCheckedPosition: Int = -1
     private var isNewRadioButton:Boolean = false

    fun getListOgCountry(position: Int):Country{
        return listOfCountry[position]
    }

    fun setListOfCountry(listOfCountry: List<Country>) {
        this.listOfCountry = listOfCountry
        notifyDataSetChanged()
    }

    class CountryViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val nameOfCountry: TextView = itemView.findViewById(R.id.text_country)
        val checkBoxCountry: RadioButton = itemView.findViewById(R.id.checkbox_country)
      val layoutCountry:ConstraintLayout = itemView.findViewById(R.id.layout_country)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = listOfCountry[position]
        holder.nameOfCountry.text = country.nameOfCountry

        if (isNewRadioButton){
            holder.checkBoxCountry.isChecked = country.isSelected
        }else{
            if (holder.adapterPosition == 0){
                holder.checkBoxCountry.isChecked = true
                lastCheckedPosition =0
            }
        }
        holder.checkBoxCountry.setOnClickListener {
handleRadioButtonChecks(holder.adapterPosition)
        }

    }
    override fun getItemCount(): Int {
        return listOfCountry.size
    }
    private fun handleRadioButtonChecks(position: Int){
isNewRadioButton = true
        listOfCountry[lastCheckedPosition].isSelected = false
        listOfCountry[position].isSelected =true
        lastCheckedPosition = position
        notifyDataSetChanged()
    }
}
