package com.myapps.settlersofcatan;

public class Settlement {


    int viewID;
    char color = 0;

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
}
