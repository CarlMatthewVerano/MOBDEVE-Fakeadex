package com.mobdeve.s11.verano.carl.mobdevefakeadex

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.Adapter

class MyAdapter(private val data: ArrayList<PokemonModel>): Adapter<MyViewHolder>() {
    lateinit var deleteBtn: Button;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        deleteBtn = holder.itemView.findViewById(R.id.delete)
        holder.bindData(data.get(position))

        var selected = data.get(position).name

        deleteBtn.setOnClickListener {
            data.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, data.size)
            val t = Toast.makeText(
                holder.itemView.context,
                "$selected has been deleted",
                Toast.LENGTH_LONG
            )
            t.show()
        }
    }

}