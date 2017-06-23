package com.example.khunchansopheak.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val result = findViewById(R.id.result) as TextView
        val btn1 = findViewById(R.id.btn_add) as Button
        val btn2 = findViewById(R.id.btn_minus) as Button
        val btn3 = findViewById(R.id.btn_mul) as Button
        val btn4 = findViewById(R.id.btn_div) as Button

        btn1.setOnClickListener {
            result.text = (getNum1() + getNum2()).toString()
        }

        btn2.setOnClickListener {
            result.text = (getNum1() - getNum2()).toString()
        }

        btn3.setOnClickListener {
            result.text = (getNum1() * getNum2()).toString()
        }

        btn4.setOnClickListener {
            if (getNum2() <= 0)
                result.text = getString(R.string.cannot_divide)
            else
                result.text = "%.2f".format(getNum1() / getNum2())

        }
    }

    fun getNum1(): Float {
        val edt_num1 = findViewById(R.id.num1) as EditText
        if (TextUtils.isDigitsOnly(edt_num1.text.toString()))
            return edt_num1.text.toString().toFloat()
        else
            return 0f
    }

    fun getNum2(): Float {
        val edt_num2 = findViewById(R.id.num2) as EditText

        if (TextUtils.isDigitsOnly(edt_num2.text.toString()))
            return edt_num2.text.toString().toFloat()
        else
            return 0f
    }
}
