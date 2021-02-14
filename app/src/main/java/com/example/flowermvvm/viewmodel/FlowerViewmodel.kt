package com.example.flowermvvm.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.flowermvvm.model.FlowerModel
import com.example.flowermvvm.repository.FlowerRepository
import com.example.flowermvvm.util.FlowerCoroutines
import com.example.flowermvvm.view.FlowerListener


class FlowerViewmodel: ViewModel(
) {
    var flowerList = MutableLiveData<List<FlowerModel>>()
    var flowerListener: FlowerListener? = null

    init {
        refreshList()
    }

    fun refreshList() {


        FlowerCoroutines.main {
            val flowerResponse = FlowerRepository().getFlower()
            if (flowerResponse.isSuccessful) {
                flowerResponse.body()?.let {
                    //this is where we add or change the mutable livedata value
                    flowerList?.value = it
                    Log.d("flower_list", flowerList.toString())
                }
            } else {
                flowerListener?.onFailure(flowerResponse.message())
            }
        }
    }

    fun displayFlowerToast(flowerModel: FlowerModel) {
        flowerListener?.onItemClick(flowerModel)
    }
}