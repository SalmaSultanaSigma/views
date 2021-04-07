package com.example.viewcomponents

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder> (){

    private  var title= arrayOf("Chapter one","Chapter two","Chapter three", "Chapter four","Chapter five", "Chapter six", "Chapter seven", "Chapter eight")
    private  var details= arrayOf("Item one details","Item two details","Item three details","Item four details","Item five details","Item six details","Item seven details","Item eight details")
    private var images= intArrayOf(R.drawable.photos,R.drawable.photos,R.drawable.photos,R.drawable.photos,R.drawable.photos,R.drawable.photos,R.drawable.photos,R.drawable.photos)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        var v=LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text=title[position]
        holder.itemDetail.text= details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

       val itemImage: ImageView= itemView.findViewById(R.id.item_image)
        val itemTitle: TextView=itemView.findViewById(R.id.item_textView)
        val itemDetail: TextView=itemView.findViewById(R.id.item_details_textView)
        init {
            itemView.setOnClickListener {
                itemView.setBackgroundColor(Color.GRAY)

            }
        }

    }
}