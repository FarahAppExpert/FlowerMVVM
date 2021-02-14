package com.example.flowermvvm.util

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object FlowerCoroutines {
    fun main(Flower: suspend (()->Unit)) {

        CoroutineScope(Dispatchers.Main).launch {

            Flower()
        }
    }
}