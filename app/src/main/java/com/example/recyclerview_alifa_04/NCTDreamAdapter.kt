package com.example.recyclerview_alifa_04

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NCTDreamAdapter(private val context: Context, private val nctdream: List<NCTDream>, val listener: (NCTDream) -> Unit)
    :RecyclerView.Adapter<NCTDreamAdapter.NCTDreamViewHolder>() {

    class NCTDreamViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgNCTDream = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameNCTDream = view.findViewById<TextView>(R.id.tv_item_name)
        val descNCTDream = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(nctdream: NCTDream, listener: (NCTDream) -> Unit){
            imgNCTDream.setImageResource(nctdream.imgNCTDream)
            nameNCTDream.text = nctdream.nameNCTDream
            descNCTDream.text = nctdream.descNCTDream
            itemView.setOnClickListener {
                (listener(nctdream))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NCTDreamViewHolder {
        return NCTDreamViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NCTDreamViewHolder, position: Int) {
        holder.bindView(nctdream[position], listener)
    }

    override fun getItemCount(): Int = nctdream.size
    }