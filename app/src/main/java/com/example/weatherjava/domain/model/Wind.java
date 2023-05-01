package com.example.weatherjava.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {
    @SerializedName("speed")
    @Expose
    private double speed;
    @SerializedName("deg")
    @Expose
    private long deg;

    public double getSpeed() { return speed; }
    public void setSpeed(double value) { this.speed = value; }

    public long getDeg() { return deg; }
    public void setDeg(long value) { this.deg = value; }
}
