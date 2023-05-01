package com.example.weatherjava.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sys {
    @SerializedName("type")
    @Expose
    private long type;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("sunrise")
    @Expose
    private long sunrise;
    @SerializedName("sunset")
    @Expose
    private long sunset;

    public long getType() { return type; }
    public void setType(long value) { this.type = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getCountry() { return country; }
    public void setCountry(String value) { this.country = value; }

    public long getSunrise() { return sunrise; }
    public void setSunrise(long value) { this.sunrise = value; }

    public long getSunset() { return sunset; }
    public void setSunset(long value) { this.sunset = value; }
}
