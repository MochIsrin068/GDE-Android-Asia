package com.isrin.gdeasia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.isrin.gdeasia.R
import com.isrin.gdeasia.model.Gde

class GdeAdapter(val  listGde : ArrayList<Gde>) : RecyclerView.Adapter<GdeAdapter.GdeViewHolder>(){

    private lateinit var onClickItem : OnclickItem

    interface OnclickItem {
        fun onClickItem(listData : Gde)
    }

    fun setOnclickItem(onClickItem : OnclickItem){
        this.onClickItem  = onClickItem
    }


    inner class GdeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var names  : TextView = itemView.findViewById(R.id.tvName)
        var desc : TextView = itemView.findViewById(R.id.tvDesc)
        var photo : ImageView = itemView.findViewById(R.id.item_foto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GdeViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_gde, parent, false)
        return  GdeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGde.size
    }

    override fun onBindViewHolder(holder: GdeAdapter.GdeViewHolder, position: Int) {
        holder.names.text = listGde[position].name
        holder.desc.text = listGde[position].desc

        Glide.with(holder.itemView.context)
            .load(listGde[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.photo)

        holder.itemView.setOnClickListener {
            onClickItem.onClickItem(listGde[holder.adapterPosition])
        }
    }

}