package com.polonsky.tempconvert

import android.media.Image
import android.widget.ImageView

class Temperature(val tempCelsius: Double){
    private val celsius: Double = tempCelsius
    private var fahren: Double = 0.0

    /*
    getter for celsius
     */
    public fun getCelsius():Double{
        return this.celsius
    }

    /*
    calculate and return temperature in fahrenheit
     */
    public fun calculate(): Double {
        this.fahren = (this.celsius) * 1.8 + 32
        return this.fahren
    }

    /*
    show image corresponding to the temperature
     */
    public fun showImage(image: ImageView){
        //for warm weather
        if(this.celsius in 19.0..24.0){
            image.setImageResource(R.drawable.niceweather)
        }
        //hot weather
        else if(this.celsius > 24){
            image.setImageResource(R.drawable.hotweather)
        }
        //cold weather
        else{
            image.setImageResource(R.drawable.coldweather)
        }
    }
}