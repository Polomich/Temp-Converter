package com.polonsky.tempconvert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create GUI objects
        var tempEditText = findViewById<EditText>(R.id.temp)
        var resultTextView = findViewById<TextView>(R.id.result)
        var weatherImageView = findViewById<ImageView>(R.id.weatherImage)

        //create and set button
        val calculateBtn = findViewById<Button>(R.id.calculate)
        calculateBtn.setOnClickListener{
            var temperature = Temperature(tempEditText.text.toString().toDouble())
            //if temperature is out of range
            if((temperature.getCelsius() < -50)||(temperature.getCelsius() > 50)){
                displayError()
            }
            else{
                //show temperature and image
                resultTextView.text = temperature.calculate().toString()
                temperature.showImage(weatherImageView)
            }
        }// end Listener
    }// end onCreate

    private fun displayError(){
        Toast.makeText(applicationContext, R.string.error, Toast.LENGTH_LONG).show()
    }
}