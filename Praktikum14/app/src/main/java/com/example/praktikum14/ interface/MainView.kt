package com.example.praktikum14.interface

import com.example.praktikum14.model.Login
import com.example.praktikum14.model.Quote

class MainView {
    interface MainView {
        fun showMessage(messsage : String)
        fun resultQuote(data: ArrayList<Quote.Quote>)
        fun resultLogin(data: Login.Login)
    }
}