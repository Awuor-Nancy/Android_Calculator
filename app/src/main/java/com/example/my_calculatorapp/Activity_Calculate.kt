package com.example.my_calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity_Calculate : AppCompatActivity() {
    lateinit var btn_Add: Button
    lateinit var btn_Subtract: Button
    lateinit var btn_Multiply: Button
    lateinit var btn_Modulus: Button
    lateinit var et_Num1: EditText
    lateinit var et_Num2: EditText
    lateinit var txt_Img: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        txt_Img = findViewById(R.id.txt_Img)


        et_Num1=findViewById(R.id.et_Num1)
        et_Num2=findViewById(R.id.et_Num2)

        btn_Add = findViewById(R.id.btn_Add)
        btn_Add.setOnClickListener {
            val number = et_Num1.text.toString()
            val num = et_Num2.text.toString()
            if (number.isBlank()) {
                et_Num1.setError("number is required")
                return@setOnClickListener
            } else if (num.isBlank()) {
                et_Num2.setError("number is required")
                return@setOnClickListener
            }
            sum(num.toDouble(),num.toDouble())
        }
            btn_Subtract = findViewById(R.id.btn_Subtract)
            btn_Subtract.setOnClickListener {
                val number = et_Num1.text.toString()
                val num = et_Num2.text.toString()
                if (number.isBlank()) {
                    et_Num1.setError("number is required")
                    return@setOnClickListener
                }
                else if (num.isBlank()){
                    et_Num2.setError("number is required")
                    return@setOnClickListener
                }
                difference(num.toDouble(),num.toDouble())
            }
            btn_Multiply = findViewById(R.id.btn_Multiply)
            btn_Multiply.setOnClickListener {
                val number = et_Num1.text.toString()
                val num = et_Num2.text.toString()
                if (number.isBlank()) {
                    et_Num1.setError("number is required")
                    return@setOnClickListener
                } else if (num.isBlank()) {
                    et_Num2.setError("number is required")
                    return@setOnClickListener
                }
                product(num.toDouble(),num.toDouble())
            }

            btn_Modulus = findViewById(R.id.btn_Modulus)
            btn_Modulus.setOnClickListener {
                val number = et_Num1.text.toString()
                val num = et_Num2.text.toString()
                if (number.isBlank()) {
                    et_Num1.setError("number is required")
                    return@setOnClickListener
                }
                else if (num.isBlank()){
                    et_Num2.setError("number is required")
                    return@setOnClickListener
                }
                modulus(num.toDouble(),num.toDouble())
                }
            }


        fun sum(number1: Double, number2: Double) {
            var sum = number1 + number2
            txt_Img.text = sum.toString()
        }
        fun difference(number1: Double, number2: Double) {
            var diff = number1 - number2
            txt_Img.text= diff.toString()

        }
        fun product(number1: Double, number2: Double) {
            var prod = number1 * number2
            txt_Img.text = prod.toString()
        }
        fun modulus(number1: Double, number2: Double) {
            var mod = number1 % number2
            txt_Img.text =  mod.toString()
        }
}