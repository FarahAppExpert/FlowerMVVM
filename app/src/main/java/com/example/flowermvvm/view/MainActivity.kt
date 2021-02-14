package com.example.flowermvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flowermvvm.R
import com.example.flowermvvm.adapter.FlowerAdapter
import com.example.flowermvvm.adapter.FlowerClick
import com.example.flowermvvm.databinding.ActivityMainBinding
import com.example.flowermvvm.model.FlowerModel
import com.example.flowermvvm.viewmodel.FlowerViewmodel


class MainActivity : AppCompatActivity(), FlowerListener {
    private var flowerAdapter: FlowerAdapter? = null
    private val viewModel by lazy {
        ViewModelProvider(this).get(FlowerViewmodel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.setLifecycleOwner(this)
        binding.flowerViewModel = viewModel
        viewModel.flowerListener = this

        flowerAdapter = FlowerAdapter(FlowerClick {
            viewModel.displayFlowerToast(it)
        })

        binding.FlowerRecyclerview.apply {
            layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
            adapter = flowerAdapter
        }

        viewModel.flowerList?.observe(this,
                {
                    cakesList ->
                    cakesList?.apply {
                        flowerAdapter?.flowerList = this
                    }
                })
    }

    override fun onFailure(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onItemClick(flowerModel: FlowerModel) {
        Toast.makeText(this, flowerModel.name, Toast.LENGTH_LONG).show()
    }
}