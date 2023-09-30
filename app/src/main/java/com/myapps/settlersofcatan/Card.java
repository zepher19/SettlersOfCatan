package com.myapps.settlersofcatan;

public class Card {

    int viewID;
    char cardType;

    int cardNumber = 0;

    char playerOwner;


    public Card(int viewID, char cardType, char playerOwner) {
        this.viewID = viewID;
        this.cardType = cardType;
        this.playerOwner = playerOwner;
    }


    public char getCardType() {
        return cardType;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }


    public char getPlayerOwner() {
        return playerOwner;
    }


    public int getViewID() {
        return viewID;
    }
}
