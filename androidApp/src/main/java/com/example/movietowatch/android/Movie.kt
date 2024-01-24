package com.example.movietowatch.android

import android.app.Application
import com.example.movietowatch.android.di.appModule
import com.example.movietowatch.di.getSharedModule
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(appModule + getSharedModule())
        }
    }
}