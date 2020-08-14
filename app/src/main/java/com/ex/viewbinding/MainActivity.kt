package com.ex.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ex.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // comment this line
        //setContentView(R.layout.activity_main)
        
        var activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = activityMainBinding.root

        // set this rootView to setContentView
        setContentView(rootView)

        activityMainBinding.textView1.text = "Hi..., Hello"
        activityMainBinding.textView2.text = "me too coming from view binding..."

        activityMainBinding.button.setOnClickListener{
            Toast.makeText(applicationContext, "Button click from view binding", Toast.LENGTH_SHORT).show()
        }
    }
}