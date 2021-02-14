package com.example.flowermvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil

import androidx.recyclerview.widget.RecyclerView;

import com.example.flowermvvm.R
import com.example.flowermvvm.databinding.FlowerViewBinding
import com.example.flowermvvm.model.FlowerModel;


class FlowerAdapter(val flowerListener: FlowerClick): RecyclerView.Adapter<FlowerViewHolder>()  {

        var flowerList: List<FlowerModel> = emptyList()
        set(value) {
                field = value
                notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
                val withDataBinding: FlowerViewBinding = DataBindingUtil.inflate(

                        LayoutInflater.from(parent.context),

                        FlowerViewHolder.LAYOUT,

                        parent,
                        false
                )
                return FlowerViewHolder(withDataBinding)
        }

        override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
                holder.viewDatabinding.also {
                        it.flowerModels = flowerList[position]
                        it.flowerClickBack = flowerListener
                }
        }

        override fun getItemCount(): Int {
                return flowerList.size
        }
}

class FlowerViewHolder(val viewDatabinding: FlowerViewBinding): RecyclerView.ViewHolder(viewDatabinding.root) {
        companion object {
                @LayoutRes
                val LAYOUT = R.layout.flower_view
        }
}

class FlowerClick(val block: (FlowerModel)->Unit) {
        fun onClick(cake: FlowerModel) = block(cake)
}