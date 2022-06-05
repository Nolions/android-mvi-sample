package com.nolions.mvisample

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initViewModel()
    }

    private fun initView() {
        btn.setOnClickListener {
            viewModel.dispatch(MainIntent.GetUser)
        }
    }

    private fun initViewModel() {
        viewModel.viewStates.observe(this) {
            when(it) {
                is MainState.User -> {
                    Log.d("mviSample", "User:$it")
                }
            }
        }
    }
}