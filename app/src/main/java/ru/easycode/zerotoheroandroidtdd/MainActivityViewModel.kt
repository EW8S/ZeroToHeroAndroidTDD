package ru.easycode.zerotoheroandroidtdd

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private val _livedata = MutableLiveData<Int>(0)
    val liveData: LiveData<Int> = _livedata

    private val _livedataB = MutableLiveData<Boolean>(true)
    val liveDataB: LiveData<Boolean> = _livedataB

    var count = 0

    fun increment(){
        count += 2
        _livedata.value = count
        if(count > 2) _livedataB.value = false
    }
}