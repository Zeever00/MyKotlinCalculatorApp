package com.maideveloper.mykotlincalculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Sum(view: View){
        val num1=number1.text.toString().toInt()
        val num2=number2.text.toString().toInt()
        val sum = sum(num1,num2).toString()
        resultView.text="Sum: "+sum

    }
    fun Subtract(view: View){
        val num1=number1.text.toString().toInt()
        val num2=number2.text.toString().toInt()
        val sub = subtract(num1,num2).toString()
        resultView.text="Subtraction: "+sub

    }
    fun Multiply(view: View){
        val num1=number1.text.toString().toInt()
        val num2=number2.text.toString().toInt()
        val mul=multiply(num1,num2).toString()
        resultView.text="Multiplication: "+mul

    }
    fun Divide(view: View){
        val num1=number1.text.toString().toDouble()
        val num2=number2.text.toString().toDouble()
        val div= divide(num1,num2).toString()
        resultView.text="Division: "+div

    }

}
