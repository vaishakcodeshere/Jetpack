package com.architecture.jetpack.arch.databinding

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.architecture.jetpack.databinding.RecyclerItemBinding

class HomeAdapter(var data: ArrayList<Games>) : androidx.recyclerview.widget.RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerItemBinding.inflate(inflater)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) = holder.bind(data[position])

    class MyViewHolder(private val binding: RecyclerItemBinding) : androidx.recyclerview.widget.RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Games) {
            binding.gamedata = item
            binding.executePendingBindings()
        }
    }
}