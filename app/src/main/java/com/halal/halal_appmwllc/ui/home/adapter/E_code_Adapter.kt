package com.halal.halal_appmwllc.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.halal.halal_appmwllc.R
import com.halal.halal_appmwllc.model.ECode

class E_code_Adapter (val context: Context): RecyclerView.Adapter<E_code_Adapter.EcodeViewHolder>() {
    private var listOfEcode: List<ECode> = emptyList()
    class EcodeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textdescription: TextView = itemView.findViewById(R.id.txtDescription)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): EcodeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_e_cod, parent, false)
        return EcodeViewHolder(view)
    }

    override fun onBindViewHolder(holder: EcodeViewHolder, position: Int) {
        val list =listOfEcode [position]
        holder.textdescription.text = list.textDescription
    }

    override fun getItemCount(): Int {
        return listOfEcode.size
    }
    fun setListOfE_code(listOfCountry: List<ECode>) {
        this.listOfEcode = listOfEcode
        notifyDataSetChanged()
    }
}