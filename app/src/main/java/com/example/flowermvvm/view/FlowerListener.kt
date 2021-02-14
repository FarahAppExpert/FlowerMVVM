package com.example.flowermvvm.view


import com.example.flowermvvm.model.FlowerModel

interface FlowerListener {
    fun onItemClick(flowerModel: FlowerModel)
    fun onFailure(message: String)
}