package com.example.flowermvvm.repository


import com.example.flowermvvm.model.FlowerModel
import com.example.flowermvvm.api.FlowerInterface
import com.example.flowermvvm.api.FlowerRetrofit


import retrofit2.Response

class FlowerRepository() {
    suspend fun getFlower(): Response<List<FlowerModel>> {
        return FlowerRetrofit.getFlowerServices(FlowerInterface::class.java).getFlowerList()
    }
}