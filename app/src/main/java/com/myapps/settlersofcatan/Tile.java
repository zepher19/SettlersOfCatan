package com.myapps.settlersofcatan;

public class Tile {

    int viewID;

    int textViewID;

    char tileType;

    int tileNumber;

    public Tile(int viewID, int textViewID, char tileType) {
        this.viewID = viewID;
        this.textViewID = textViewID;
        this.tileType = tileType;
        this.tileNumber = tileNumber;
    }


    public char getTileType() {
        return tileType;
    }


    public int getViewID() {
        return viewID;
    }


    public int getTileNumber() {
        return tileNumber;
    }


    public int getTextViewID() {
        return textViewID;
    }


    public void setTileNumber(int tileNumber) {
        this.tileNumber = tileNumber;
    }

}

