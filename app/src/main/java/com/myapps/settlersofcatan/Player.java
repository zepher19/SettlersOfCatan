package com.myapps.settlersofcatan;

public class Player {

    char color;



    Card brickCard;
    Card grainCard;
    Card woolCard;
    Card lumberCard;
    Card oreCard;

    Card[] cardArray;






    public Player(char color, Card brickCard, Card grainCard, Card woolCard, Card lumberCard, Card oreCard ) {
        this.color = color;
        this.brickCard = brickCard;
        this.grainCard = grainCard;
        this.woolCard = woolCard;
        this.lumberCard = lumberCard;
        this.oreCard = oreCard;

        cardArray = new Card[] {brickCard, grainCard, woolCard, lumberCard, oreCard};
    }


    public Card getBrickCard() {
        return brickCard;
    }

    public Card getGrainCard() {
        return grainCard;
    }

    public Card getLumberCard() {
        return lumberCard;
    }

    public Card getWoolCard() {
        return woolCard;
    }

    public Card getOreCard() {
        return oreCard;
    }

    public Card[] getCardArray() {
        return cardArray;
    }

    public char getColor() {
        return color;
    }
}
