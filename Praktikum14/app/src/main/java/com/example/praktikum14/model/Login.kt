package com.example.praktikum14.model

class Login {
    data class Login(
        @SerializedName("token")
        var token: String? = null,
        @SerializedName("message")
        var message: String? = null
    )
}