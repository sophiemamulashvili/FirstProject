package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.util.Log.i
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import java.lang.NumberFormatException
import java.nio.file.Files.find

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    init()}

    private fun init(){
        val randomnumberbutton = findViewById<Button>(R.id.randomnumberbutton)
        val randomnumbertextview = findViewById<TextView>(R.id.randomnumbertextview)
        val yesorno =findViewById<TextView>(R.id.yesorno)
        randomnumberbutton.setOnClickListener{
            val number = randomnumber()
            d("RandomNumber", "This is random number ${xutisjeradi(number)})" )
            randomnumbertextview.text=number.toString()
            yesorno.text= xutisjeradi(number)


        }

    }
     private fun randomnumber()=(-100..100).random()


    fun xutisjeradi(randomnumber: Int):String =
            if(randomnumber%5==0&&randomnumber/5>0){ "yes"
    } else {
        "no"
    }











}



