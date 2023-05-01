package com.example.weatherjava.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    @Expose
    private double temp;
    @SerializedName("feelsLike")
    @Expose
    private double feelsLike;
    @SerializedName("tempMin")
    @Expose
    private double tempMin;
    @SerializedName("tempMax")
    @Expose
    private double tempMax;
    @SerializedName("pressure")
    @Expose
    private long pressure;
    @SerializedName("humidity")
    @Expose
    private long humidity;

    public double getTemp() { return temp; }
    public void setTemp(double value) { this.temp = value; }

    public double getFeelsLike() { return feelsLike; }
    public void setFeelsLike(double value) { this.feelsLike = value; }

    public double getTempMin() { return tempMin; }
    public void setTempMin(double value) { this.tempMin = value; }

    public double getTempMax() { return tempMax; }
    public void setTempMax(double value) { this.tempMax = value; }

    public long getPressure() { return pressure; }
    public void setPressure(long value) { this.pressure = value; }

    public long getHumidity() { return humidity; }
    public void setHumidity(long value) { this.humidity = value; }
}
