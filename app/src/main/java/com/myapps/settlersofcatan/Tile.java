package com.myapps.settlersofcatan;

public class Tile {

    int viewID;

    int textViewID;

    char tileType;

    int tileNumber;


    Settlement[] settlements;

    public Tile(int viewID, int textViewID, char tileType) {
        this.viewID = viewID;
        this.textViewID = textViewID;
        this.tileType = tileType;
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


    public void setSettlements(Settlement[] settlements) {
        this.settlements = settlements;
    }

    public Settlement[] getSettlements() {
        return settlements;
    }
}

