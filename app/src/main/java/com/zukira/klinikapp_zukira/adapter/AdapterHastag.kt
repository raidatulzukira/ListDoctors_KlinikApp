package com.zukira.klinikapp_zukira.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zukira.klinikapp_zukira.PageDisplayListActivity
import com.zukira.klinikapp_zukira.R
import com.zukira.klinikapp_zukira.model.ModelHastag

class AdapterHastag (
    val itemList: ArrayList<ModelHastag>,
    val getActivity : PageDisplayListActivity
): RecyclerView.Adapter<AdapterHastag.MyViewHolder>()
{
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemHastag : TextView

        init {
            itemHastag = itemView.findViewById(R.id.txtHastag) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_hastag, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemHastag.setText(itemList[position].hastag)
    }

}