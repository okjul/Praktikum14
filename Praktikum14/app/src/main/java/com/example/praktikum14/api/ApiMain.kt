package com.example.praktikum14.api

import android.app.Application
import androidx.viewbinding.BuildConfig
import java.util.concurrent.TimeUnit

class ApiMain {
    class ApiMain : Application() {
        private val client = OkHttpClient().newBuilder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else
                    HttpLoggingInterceptor.Level.NONE
            })
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
        private val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val services: ApiServices = retrofit.create(ApiServices::class.java)
    }

}