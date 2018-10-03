package com.pedromassango.androidkoinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // we get our viewModel from Koin
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        mainViewModel.loadData()?.observe(this, Observer{

            // show message coming from ViewModel -> Repository
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
    }

}
