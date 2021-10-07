package com.polonsky.tempconvert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tempEditText = findViewById<EditText>(R.id.temp)
        var resultTextView = findViewById<TextView>(R.id.result)

        val calculateBtn = findViewById<Button>(R.id.calculate)
        calculateBtn.setOnClickListener{
            var temperature = Temperature(tempEditText.text.toString().toDouble())
            if((temperature.getCelsius() < -50)||(temperature.getCelsius() > 50)){
                displayError()
            }
            else{
                resultTextView.text = temperature.calculate().toString()
            }
        }// end Listener
    }// end onCreate

    private fun displayError(){
        Toast.makeText(applicationContext, R.string.error, Toast.LENGTH_LONG).show()
    }
}