package com.example.res

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.rv_evement.view.*

class RvAdapter(var list: List<Actor>) : RecyclerView.Adapter<RvAdapter.RvView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvView {
        Log.d("RvAdapter","onCreateViewHolder")
        return RvView(LayoutInflater.from(parent.context).inflate(R.layout.rv_evement, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RvView, position: Int) {
        Log.d("RvAdapter","onBindViewHolder")

        val actor = list[position]
        holder.itemView.text.text = actor.name
        Glide.with(holder.itemView.context)
            .load(actor.avatar)
            .into(holder.itemView.avatar)
        holder.itemView.hasOskar.isChecked = actor.has0scar
    }

    class RvView (view: View) : RecyclerView.ViewHolder(view)
}