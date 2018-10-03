package com.pedromassango.androidkoinsample

import android.app.Application
import org.koin.android.ext.android.startKoin

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        // call this to setup Koin with your modules
        startKoin(this, listOf(DependeciesModule.appModule) )
    }
}