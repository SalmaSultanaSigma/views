package com.example.viewcomponents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPageAdapter(
    val images: List<Int>
) : RecyclerView.Adapter<ViewPageAdapter.ViewPagerViwHolder>() {

    inner class ViewPagerViwHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val ivImage: ImageView= itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViwHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent,false)
        return ViewPagerViwHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViwHolder, position: Int) {
        val curImage=images[position]

        holder.ivImage.setImageResource(curImage)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}

