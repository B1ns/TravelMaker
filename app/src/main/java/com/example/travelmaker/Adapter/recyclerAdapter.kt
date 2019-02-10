package com.example.travelmaker.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelmaker.Data.recyclerviewItem
import com.example.travelmaker.R

class recyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val recyclerviewItem = ArrayList<recyclerviewItem>()

    init {
        recyclerviewItem.add(recyclerviewItem(R.drawable.seoul))
        recyclerviewItem.add(recyclerviewItem(R.drawable.busan))
        recyclerviewItem.add(recyclerviewItem(R.drawable.gwangju))
        recyclerviewItem.add(recyclerviewItem(R.drawable.daejeon))
        recyclerviewItem.add(recyclerviewItem(R.drawable.ulsan))
        recyclerviewItem.add(recyclerviewItem(R.drawable.incheon))
        recyclerviewItem.add(recyclerviewItem(R.drawable.jeonlado))
        recyclerviewItem.add(recyclerviewItem(R.drawable.chungcheongdo))
        recyclerviewItem.add(recyclerviewItem(R.drawable.gyeong_gido))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_item, parent, false)
        return RowCell(view)
    }

    override fun getItemCount(): Int {
        return recyclerviewItem.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RowCell).imageView.setImageResource(recyclerviewItem[position].imageView)
    }

    private inner class RowCell(view: View) : RecyclerView.ViewHolder(view) {

        var imageView: ImageView = view.findViewById(R.id.imageView)

    }

}