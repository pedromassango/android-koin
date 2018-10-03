package com.pedromassango.androidkoinsample

import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object DependeciesModule {

    val appModule = module {

        // a single instance for Repository class
        single { Repository() }

        // using factory we Koin will generate
        // a new instance for every call to the giving component
        viewModel { MainViewModel( get()) }
    }
}