package com.codeeraayush.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

//var count:Int=0    -->this will be declared to the MainViewModel.kt class
lateinit var textView:TextView
lateinit var button: Button
lateinit var mainViewModel: MainViewModel
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel= ViewModelProvider(this,mainViewModelFactory(10)).get(MainViewModel::class.java)
        textView=findViewById(R.id.textView)
        button=findViewById(R.id.button)

    }
    fun inc(v:View){
        mainViewModel.inc()
        setText()
    }
    fun setText() {
        textView.text= mainViewModel.count.toString()
    }
    //Both functions will move to the MainViewModel.kt class

    /*

    fun inc(v:View) {
        count++
        setText()
    }
    */
}