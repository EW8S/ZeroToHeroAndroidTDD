package ru.easycode.zerotoheroandroidtdd

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {


    private val _livedata = MutableLiveData<String>("0")
    val liveData: LiveData<String> = _livedata

    private val count = Count.Base(2)

    fun increment(text: String) {
        _livedata.value = count.increment(text)
    }
}