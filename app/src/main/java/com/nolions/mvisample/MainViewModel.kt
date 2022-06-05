package com.nolions.mvisample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel() {
    private val _viewStates: MutableLiveData<MainState> = MutableLiveData()
    val viewStates = _viewStates
    fun dispatch(intent: MainIntent) {
        when (intent) {
            is MainIntent.GetUser -> {
                viewStates.value = MainState.User(
                    id = 1,
                    name = "John",
                    email = "John@test.com",
                    avatar = "John avatar"
                )
            }
        }
    }
}