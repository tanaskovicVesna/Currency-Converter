package com.vesna.mvvmkotlin.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    private var dollarText = ""
    private val used_to_eu_rate = 0.74f


    // private  var result:Float = 0f

    private  var result:MutableLiveData<Float> = MutableLiveData()

    fun setAmount(value:String){
        this.dollarText = value

      //  result = value.toFloat() * used_to_eu_rate
       try {
           result.value = value.toFloat() * used_to_eu_rate
       }catch (e:NumberFormatException){

       }

    }


    fun getResult():MutableLiveData<Float> {
        return result
    }
//   fun getResult():Float? {
//      return result}


}
