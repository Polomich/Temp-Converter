package com.polonsky.tempconvert

class Temperature(val tempCelsius: Double){
    private val celsius: Double = tempCelsius
    private var fahren: Double = 0.0

    public fun getCelsius():Double{
        return this.celsius
    }

    public fun calculate(): Double {
        this.fahren = (this.celsius) * 1.8 + 32
        return this.fahren
    }

    public fun showImage(){
        if(this.celsius in 19.0..24.0){

        }
    }
    /*
    6.	When the temperature given is between 19 – 24 inclusive, the App should display an image that
    represents a nice weather. If the temperature is greater than 24, an image representing hot weather
     should be displayed. If the temperature is <19, an image indicating cold weather should be displayed.
     */
}