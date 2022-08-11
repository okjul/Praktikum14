package com.example.praktikum14

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

class CoroutineContextProvider {
    open class CoroutineContextProvider {
        open val main: CoroutineContext by lazy { Dispatchers.Main }
    }
}