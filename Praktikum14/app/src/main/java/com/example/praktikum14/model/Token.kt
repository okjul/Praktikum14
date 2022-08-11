package com.example.praktikum14.model

import android.os.Parcelable

class Token {
    @Parcelize
    data class Token (
        var token: String? = null
    ): Parcelable

}