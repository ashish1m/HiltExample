package com.example.hiltexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltApp : Application() {

    companion object {
        lateinit var mInstance: HiltApp
    }

    override fun onCreate() {
        super.onCreate()

        mInstance = this
    }
}