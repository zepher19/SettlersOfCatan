package com.myapps.settlersofcatan;

public class Player {

    char color;

    int brickCards;
    int grainCards;
    int woolCards;
    int lumberCards;
    int oreCards;


    public Player(char color) {

    }

    public void setBrickCards(int brickCards) {
        this.brickCards = brickCards;
    }

    public void setGrainCards(int grainCards) {
        this.grainCards = grainCards;
    }

    public void setWoolCards(int woolCards) {
        this.woolCards = woolCards;
    }

    public void setLumberCards(int lumberCards) {
        this.lumberCards = lumberCards;
    }

    public void setOreCards(int oreCards) {
        this.oreCards = oreCards;
    }

    public int getBrickCards() {
        return brickCards;
    }

    public int getGrainCards() {
        return grainCards;
    }

    public int getWoolCards() {
        return woolCards;
    }

    public int getLumberCards() {
        return lumberCards;
    }

    public int getOreCards() {
        return oreCards;
    }
}
