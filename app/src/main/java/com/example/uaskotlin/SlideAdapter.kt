package com.example.uaskotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.example.uaskotlin.model.SlideItemModel
import com.smarteist.autoimageslider.SliderViewAdapter

class SlideAdapter(val ctx: Context, val slideItem : List<Int>):
    SliderViewAdapter<SlideAdapter.ViewHolder>() {


    inner class ViewHolder(view: View): SliderViewAdapter.ViewHolder(view){
        val image = itemView.findViewById<ImageView>(R.id.image_view)

    }
    override fun getCount(): Int {
        return slideItem.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): SlideAdapter.ViewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: SlideAdapter.ViewHolder, position: Int) {
        viewHolder.image.setImageResource(slideItem[position])
    }


}