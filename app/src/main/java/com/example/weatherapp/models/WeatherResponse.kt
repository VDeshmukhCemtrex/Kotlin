package com.example.weatherapp.models

import android.media.MicrophoneInfo.Coordinate3F
import com.example.weatherapp.MainActivity
import java.io.Serializable
import java.util.SimpleTimeZone

data class WeatherResponse(
    val coord:Coord,
    val weather:List<Weather>,
    val base:String,
    val main:Main,
    val visibility:Int,
    val wind:Wind,
    val clouds:Clouds,
    val dt:Int,
    val sys:Sys,
    val timezone:Int,
    val id:Int,
    val name:String,
    val cod:Int
):Serializable