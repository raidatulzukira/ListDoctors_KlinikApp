package com.zukira.klinikapp_zukira.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zukira.klinikapp_zukira.PageDetailDokterActivity
import com.zukira.klinikapp_zukira.PageDisplayListActivity
import com.zukira.klinikapp_zukira.R
import com.zukira.klinikapp_zukira.model.ModelDokter

class AdapterDokter (
    val itemList: ArrayList<ModelDokter>,
    val getActivity: PageDisplayListActivity
): RecyclerView.Adapter<AdapterDokter.MyViewHolder>()
{
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        var itemGambar : ImageView
        var itemNama : TextView
        var itemSpesialis : TextView
        var itemReview : TextView
        var itemNilai : TextView

        init {
            itemGambar = itemView.findViewById(R.id.imgDokter) as ImageView
            itemNama = itemView.findViewById(R.id.txtNamaDokter) as TextView
            itemSpesialis = itemView.findViewById(R.id.txtSpesialis) as TextView
            itemReview = itemView.findViewById(R.id.txtReview) as TextView
            itemNilai = itemView.findViewById(R.id.txtNilai) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_itemdoctor, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemGambar.setImageResource(itemList[position].gambar)
        holder.itemNama.setText(itemList[position].nama_dokter)
        holder.itemSpesialis.setText(itemList[position].spesialis)
        holder.itemReview.setText(itemList[position].review)
        holder.itemNilai.setText(itemList[position].nilai)

        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity, PageDetailDokterActivity::class.java)

            intent.putExtra("gambar",itemList[position].gambar)
            intent.putExtra("nama_dokter",itemList[position].nama_dokter)
            intent.putExtra("spesialis",itemList[position].spesialis)
            intent.putExtra("review",itemList[position].review)
            intent.putExtra("nilai",itemList[position].nilai)

            getActivity.startActivity(intent)
        }

    }
}