package com.example.layoutapp


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

//        receive data from MainActivity using the intent
        val dataIntent = intent

//        get data from intent
        val username = dataIntent.getStringExtra("Username")
        val email = dataIntent.getStringExtra("Email")
        val phone = dataIntent.getStringExtra("Phone")
        val password = dataIntent.getStringExtra("Password")

//        Display data in the Userprofile page
        val results = findViewById<TextView>(R.id.tvResult)

//        put the data into the textview

        val data = "username: "+ username + "\nEmail: "+ email + "\nPhone" + phone +"\nPassword: " + password
        results.text = data





    }
}
