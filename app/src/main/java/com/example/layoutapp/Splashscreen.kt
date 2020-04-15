package com.example.layoutapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val background = object: Thread(){
            override fun run() {
                try {
                    Thread.sleep(5000)//Delays the screen for 5000 milliseconds
//                    intent below is an action/code that defines where to go / which action to take
//                    intent below defines movement from splash screen to MainActivity
                    val intent = Intent(baseContext, MainActivity::class.java)
//                    baseContext:SplashScreen
//                    MainActivity::class.java : MainActivity
                    startActivity(intent)
                }catch (e:Exception){//If there was an error in the try{} block
                    e.printStackTrace()
                }
            }
        }
        background.start()

    }
}