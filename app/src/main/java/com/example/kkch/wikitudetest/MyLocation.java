package com.example.kkch.wikitudetest;

import java.io.Serializable;


public class MyLocation implements Serializable{
    double latitude;
    double longitude;

    public MyLocation(){

    }
    public MyLocation(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


}
