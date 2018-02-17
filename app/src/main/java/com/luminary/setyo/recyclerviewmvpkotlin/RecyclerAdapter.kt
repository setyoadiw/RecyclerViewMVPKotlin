package com.luminary.setyo.recyclerviewmvpkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luminary.setyo.recyclerviewmvpkotlin.model.Users
import kotlinx.android.synthetic.main.recyclerview_item.view.*

/**
 * Created by root on 17/02/18.
 */
class RecyclerAdapter (data : ArrayList<Users>) : RecyclerView.Adapter<RecyclerAdapter.MyHolder>() {

     var ambildata : ArrayList<Users>

    init {
        ambildata = data
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.bind(ambildata.get(position))

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_item,parent,false)

        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return ambildata.count()
    }


    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(ambildata: Users) {
            itemView.textName.text = ambildata.nama
            itemView.textAlamat.text = ambildata.alamat
        }

    }
}