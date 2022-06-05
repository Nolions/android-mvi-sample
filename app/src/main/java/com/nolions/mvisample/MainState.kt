package com.nolions.mvisample

sealed class MainState {
    data class User(
        val id: Int = 0,
        val name: String = "",
        val email: String = "",
        val avatar: String = ""
    ) : MainState()
}