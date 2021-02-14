package com.example.flowermvvm.api


import com.example.flowermvvm.model.FlowerModel
import retrofit2.Response
import retrofit2.http.GET

interface FlowerInterface {

    @GET("/feeds/flowers.json")
    suspend fun getFlowerList(): Response<List<FlowerModel>>
}