package com.myapps.settlersofcatan;

public class Settlement {


    int viewID;
    char color = 0;

    boolean city = false;

    public Settlement(int viewID) {
        this.viewID = viewID;
    }


    public int getViewID() {
        return viewID;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }


    public boolean isCity() {
        return city;
    }

    public void setCity(boolean city) {
        this.city = city;
    }
}
