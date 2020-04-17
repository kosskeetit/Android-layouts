package com.example.layoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.nio.file.attribute.UserPrincipal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        get views in activity_main.xml using their id
        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)

//        grab the button
        val buttonAddData = findViewById<Button>(R.id.buttonAddData)

//        handle a click event on a button
        buttonAddData.setOnClickListener {
            //            grap actual data from the edit texts
            val username = editTextUsername.text.toString()
            val email = editTextEmail.text.toString()
            val phone = editTextPhone.text.toString()
            val password = editTextPassword.text.toString()
//            trim(): removes white spaces
//            isEmpty(): checks if field is empty
            if (username.trim().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter username", Toast.LENGTH_SHORT).show()

            }
            else if (email.trim().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter email", Toast.LENGTH_SHORT).show()

            }
            else if (phone.trim().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter phone number", Toast.LENGTH_SHORT).show()

            }
            else if (password.trim().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter Password", Toast.LENGTH_SHORT).show()

            }else{
//                Display data to the user
//                val message = "Username: $username, Email: $phone, password: $password"
//                Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
//                create intent (a tag in HTML)
                val goToProfile = Intent(this@MainActivity, UserProfile::class.java)
//                set Intent in motion use (startActivity(intent))

//                PASSING DATA FROM MAINACTIVITY INTO USERPROFILE ACT USING goToProfile
//                load goToProfile with use data

//                "key" => "value"
                goToProfile.putExtra("Username",username)
                goToProfile.putExtra("Email", email)
                goToProfile.putExtra("Phone", phone)
                goToProfile.putExtra("Password", password)
                startActivity(goToProfile)
            }
        }
    }
}
