package com.example.wavesoffood.adapter

import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.PopularitemBinding

class PopularAdapter(private val items:List<String>,private val price:List<String>,private val image:List<Int>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopularitemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }


    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item=items[position]
        val price=price[position]
        val images=image[position]
        holder.bind(item,price,images)
    }
    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHolder (private val binding:PopularitemBinding):RecyclerView.ViewHolder(binding.root) {
        private val imagesView=binding.imageView6
        fun bind(item:String,price:String,images: Int) {
               binding.foodNamePopular.text=item
               binding.pricePopular.text=price
               imagesView.setImageResource(images)
        }

    }
}