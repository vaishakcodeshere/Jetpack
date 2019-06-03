package com.architecture.jetpack.arch.livedata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.architecture.jetpack.R.layout
import kotlinx.android.synthetic.main.custom_view_room.view.*

class RecyclerViewAdapter(private val students: List<Student>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : ViewHolder {
        val v: View = LayoutInflater.from(parent.context)
            .inflate(layout.custom_view_room, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text = students[position].id.toString()
        holder.name.text = students[position].name
    }

    override fun getItemCount(): Int {
        return students.size
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val id = itemView.uniqueID
        val name = itemView.uniqueNAME
    }
}