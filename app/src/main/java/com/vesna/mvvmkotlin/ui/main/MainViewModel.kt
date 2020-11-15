package com.vesna.mvvmkotlin.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    private val used_to_eu_rate = 0.74f

    var result:MutableLiveData<Float> = MutableLiveData(0.0f)
    var dollarText:MutableLiveData<String> = MutableLiveData("")

    fun convertValue(){
        dollarText.let {
            if (!it.value.equals("")){
                result.value = it.value?.toFloat()?.times(used_to_eu_rate)
            }else{
                result.value =0.0f
            }
        }
    }





}
