package com.example.flowermvvm.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FlowerRetrofit
{
    @Volatile
    private var Flower_Retrofit: Retrofit? = null
    const val BASE_URL = "https://services.hanselandpetal.com/"

    fun getFlowerClient() : Retrofit {
        return Flower_Retrofit ?: synchronized(this) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder()
                    .build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            Flower_Retrofit = retrofit
            retrofit
        }
    }

    fun<T> getFlowerServices(service: Class<T>): T {
        return getFlowerClient().create(service)
    }
}