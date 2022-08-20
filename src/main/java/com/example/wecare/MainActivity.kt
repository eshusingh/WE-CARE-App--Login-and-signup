package com.example.wecare

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     signup.setOnClickListener {
         signup.background = resources.getDrawable(R.drawable.switch_tricks,null)
         signup.setTextColor(resources.getColor(R.color.textcolor,null))
         login.background = null
         signuplayout.visibility = View.VISIBLE
         loginlayout.visibility = View.GONE
         login.setTextColor(resources.getColor(R.color.pinkcolor,null))

     }
        login.setOnClickListener {
            signup.background = null
            signup.setTextColor(resources.getColor(R.color.pinkcolor,null))
            login.background = resources.getDrawable(R.drawable.switch_tricks,null)
            signuplayout.visibility = View.GONE
            loginlayout.visibility = View.VISIBLE
            login.setTextColor(resources.getColor(R.color.textcolor,null))

        }
        signin.setOnClickListener {
            startActivity(Intent(this@MainActivity,Newactivity::class.java))
        }


    }
}