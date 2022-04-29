package com.example.myapplication;

public class WeatherRVModel {
    private String time;
    private String temparature;
    private String icon;
    private String windSPeed;


    public WeatherRVModel(String time, String temparature, String icon, String windSPeed) {
        this.time = time;
        this.temparature = temparature;
        this.icon = icon;
        this.windSPeed = windSPeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemparature() {
        return temparature;
    }

    public void setTemparature(String temparature) {
        this.temparature = temparature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSPeed() {
        return windSPeed;
    }

    public void setWindSPeed(String windSPeed) {
        this.windSPeed = windSPeed;
    }
}
