package com.example.unittesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var email:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = et_email.text.toString()

        btnValidate.setOnClickListener(){
            isValidate(email)
        }

    }

     fun isValidate(email: String):Boolean {
        if (emailIsValid(email))
            return false
        else if(emailIsEmpty(email))
            return false
         else if(!emailContainDot(email))
         return false
         else return !emailStartWith(email)
    }



    fun emailStartWith(email: String): Boolean {
         return !email.startsWith("@")
    }

    fun emailContainDot(email: String): Boolean {
        return email.contains(".")

    }

    fun emailIsEmpty(email:String):Boolean {
        return true
    }
    fun emailIsValid(email: String):Boolean{
        return !(!email.contains("@") && !(email.contains(".")))
    }


}