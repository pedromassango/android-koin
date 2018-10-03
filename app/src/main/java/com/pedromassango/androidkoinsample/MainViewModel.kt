package com.pedromassango.androidkoinsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pedromassango.androidkoinsample.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {

    private var messageData: MutableLiveData<String>? = null

    fun loadData(): LiveData<String>?{
        if(messageData == null){
            messageData = MutableLiveData()
        }

        // getting message from repository
        messageData!!.postValue( repository.getMessage())
        return messageData
    }
}
