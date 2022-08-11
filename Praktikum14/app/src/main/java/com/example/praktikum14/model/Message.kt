package com.example.praktikum14.model

class Message {
    data class Message(
        @SerializedName("message")
        var message: String? = null
    )
}