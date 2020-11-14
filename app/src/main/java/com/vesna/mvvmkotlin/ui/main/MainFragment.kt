package com.vesna.mvvmkotlin.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.vesna.mvvmkotlin.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {



    companion object {
        fun newInstance() = MainFragment()

    }


    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        resultText.text = viewModel.getResult().toString()
        convertButton.setOnClickListener {
            if (dollarText.text.isNotEmpty()){
                viewModel.setAmount(dollarText.text.toString())
                resultText.text = viewModel.getResult().toString()
            }else{
                resultText.text = getString(R.string.no_value)
            }
        }

    }


}