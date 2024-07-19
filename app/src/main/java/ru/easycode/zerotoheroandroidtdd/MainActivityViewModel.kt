package ru.easycode.zerotoheroandroidtdd

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private val _livedata = MutableLiveData<Boolean>(true)
    val liveData: LiveData<Boolean> = _livedata

    fun removeTextView(){
        _livedata.value = false
    }
}