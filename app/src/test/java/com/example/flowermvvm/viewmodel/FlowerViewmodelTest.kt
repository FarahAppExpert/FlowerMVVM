package com.example.flowermvvm.viewmodel

import com.example.flowermvvm.model.FlowerModel
import org.junit.Before
import org.junit.Test

class FlowerViewmodelTest
{
    private lateinit var viewmodel: FlowerViewmodel
    private lateinit var model: FlowerModel
    @Before
    fun setUp()
    {
        viewmodel = FlowerViewmodel()
    }

    @Test
     fun displayFlowerView1 ()
     {
         viewmodel.displayFlowerToast(model)
     }


    @Test
    fun displayFlowerView2 ()
    {
        viewmodel.refreshList()
    }


}