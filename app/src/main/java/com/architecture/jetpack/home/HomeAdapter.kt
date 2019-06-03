package com.architecture.jetpack.home

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.architecture.jetpack.R
import com.architecture.jetpack.arch.databinding.Arch
import com.architecture.jetpack.arch.home.Architecture
import com.architecture.jetpack.arch.livedata.Live

class HomeAdapter (var dataset: ArrayList<String>) : androidx.recyclerview.widget.RecyclerView.Adapter<HomeAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item, parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindItems(dataset[position])
    }

    class ViewHolder(itemview: View): androidx.recyclerview.widget.RecyclerView.ViewHolder(itemview){

        fun bindItems(data: String){

            val title = itemView.findViewById(R.id.title) as TextView

            title.text = data

            itemView.setOnClickListener {

                when (data) {
                    "Architecture" -> itemView.context.startActivity(Intent(itemView.context, Architecture::class.java))
                    "Databinding" -> itemView.context.startActivity(Intent(itemView.context, Arch::class.java))
                    "LiveData" -> itemView.context.startActivity(Intent(itemView.context, Live::class.java))
                }

            }

        }

    }


}