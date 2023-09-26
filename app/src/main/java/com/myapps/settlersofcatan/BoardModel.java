package com.myapps.settlersofcatan;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class BoardModel {



    //contains types of tiles, used to populate board



    //b = brick
    //w = wool
    //o = ore
    //g = grain
    //l = lumber
    //d = desert

    Character[] tileTypesArray = {'b', 'b', 'b', 'w', 'w', 'w', 'w', 'o', 'o', 'o', 'g', 'g', 'g', 'g', 'l', 'l', 'l', 'l', 'd'};

    Integer[] tileNumbersArray = {12, 11, 11, 10, 10, 9, 9, 8, 8, 6, 6, 5, 5, 4, 4, 3, 3, 2};
    LinkedList<Integer> tileNumbersLinkedList;

    Tile[] tileArray;
    LinkedList<Character> tileTypesLinkedList;



    private static final BoardModel instance = new BoardModel();

    private BoardModel() {


        //put the array into a linked list so we can easily remove indexes, allowing randomization
        tileTypesLinkedList = new LinkedList<>();
        Collections.addAll(tileTypesLinkedList, tileTypesArray);

        tileNumbersLinkedList = new LinkedList<>();
        Collections.addAll(tileNumbersLinkedList, tileNumbersArray);


        //create tiles using view id, the type of tile, and the dice number of the tile
        Tile tile1 = new Tile(R.id.tile_1, R.id.tile_1_num, randomizeTileType());
        tile1.setTileNumber(randomizeTileNumber(tile1));

        Tile tile2 = new Tile(R.id.tile_2, R.id.tile_2_num, randomizeTileType());
        tile2.setTileNumber(randomizeTileNumber(tile2));

        Tile tile3 = new Tile(R.id.tile_3, R.id.tile_3_num, randomizeTileType());
        tile3.setTileNumber(randomizeTileNumber(tile3));

        Tile tile4 = new Tile(R.id.tile_4, R.id.tile_4_num, randomizeTileType());
        tile4.setTileNumber(randomizeTileNumber(tile4));

        Tile tile5 = new Tile(R.id.tile_5, R.id.tile_5_num, randomizeTileType());
        tile5.setTileNumber(randomizeTileNumber(tile5));

        Tile tile6 = new Tile(R.id.tile_6, R.id.tile_6_num, randomizeTileType());
        tile6.setTileNumber(randomizeTileNumber(tile6));


        Tile tile7 = new Tile(R.id.tile_7, R.id.tile_7_num, randomizeTileType());
        tile7.setTileNumber(randomizeTileNumber(tile7));

        Tile tile8 = new Tile(R.id.tile_8, R.id.tile_8_num, randomizeTileType());
        tile8.setTileNumber(randomizeTileNumber(tile8));

        Tile tile9 = new Tile(R.id.tile_9, R.id.tile_9_num, randomizeTileType());
        tile9.setTileNumber(randomizeTileNumber(tile9));

        Tile tile10 = new Tile(R.id.tile_10, R.id.tile_10_num, randomizeTileType());
        tile10.setTileNumber(randomizeTileNumber(tile10));

        Tile tile11 = new Tile(R.id.tile_11, R.id.tile_11_num, randomizeTileType());
        tile11.setTileNumber(randomizeTileNumber(tile11));

        Tile tile12 = new Tile(R.id.tile_12, R.id.tile_12_num, randomizeTileType());
        tile12.setTileNumber(randomizeTileNumber(tile12));

        Tile tile13 = new Tile(R.id.tile_13, R.id.tile_13_num, randomizeTileType());
        tile13.setTileNumber(randomizeTileNumber(tile13));

        Tile tile14 = new Tile(R.id.tile_14, R.id.tile_14_num, randomizeTileType());
        tile14.setTileNumber(randomizeTileNumber(tile14));

        Tile tile15 = new Tile(R.id.tile_15, R.id.tile_15_num, randomizeTileType());
        tile15.setTileNumber(randomizeTileNumber(tile15));

        Tile tile16 = new Tile(R.id.tile_16, R.id.tile_16_num, randomizeTileType());
        tile16.setTileNumber(randomizeTileNumber(tile16));

        Tile tile17 = new Tile(R.id.tile_17, R.id.tile_17_num, randomizeTileType());
        tile17.setTileNumber(randomizeTileNumber(tile17));

        Tile tile18 = new Tile(R.id.tile_18, R.id.tile_18_num, randomizeTileType());
        tile18.setTileNumber(randomizeTileNumber(tile18));

        Tile tile19 = new Tile(R.id.tile_19, R.id.tile_19_num, randomizeTileType());
        tile19.setTileNumber(randomizeTileNumber(tile19));

        //put tiles in tile array
        tileArray = new Tile[]{tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile16, tile17, tile18, tile19};
    }
    public static BoardModel getInstance() {
        return instance;
    }

    private char randomizeTileType() {
        Random random = new Random();
        char tileTypeChar;
        int randomIndex;

        randomIndex = random.nextInt(tileTypesLinkedList.size());

        //get random tile type from the list
        tileTypeChar = tileTypesLinkedList.get(randomIndex);
        //remove that tile type from the list
        tileTypesLinkedList.remove(randomIndex);

        return tileTypeChar;
    }


    private int randomizeTileNumber(Tile tile) {

        //set the desert tile to 0 on setup always
        if (tile.getTileType() == 'd') {
            return 0;
        }


        Random random = new Random();
        int tileNumber;
        int randomIndex;

        randomIndex = random.nextInt(tileNumbersLinkedList.size());

        //get random tile type from the list
        tileNumber = tileNumbersLinkedList.get(randomIndex);
        //remove that tile type from the list
        tileNumbersLinkedList.remove(randomIndex);

        return tileNumber;
    }


    public Tile[] getTileArray() {
        return tileArray;
    }
}
