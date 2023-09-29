package com.myapps.settlersofcatan;

import android.view.View;
import android.widget.TextView;

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



    //create players
    Player bluePlayer = new Player('b');
    Player orangePlayer = new Player('o');
    Player purplePlayer = new Player('p');
    Player whitePlayer = new Player('w');


    Settlement settlement_0, settlement_1, settlement_2, settlement_3, settlement_4, settlement_5, settlement_6, settlement_7, settlement_8,
            settlement_9, settlement_10, settlement_11, settlement_12, settlement_13, settlement_14, settlement_15,
            settlement_17, settlement_19, settlement_20, settlement_21, settlement_22, settlement_23, settlement_39,
            settlement_40, settlement_41, settlement_42, settlement_45, settlement_46, settlement_47, settlement_48,
            settlement_51, settlement_53, settlement_54, settlement_55, settlement_57, settlement_59, settlement_60,
            settlement_61, settlement_62, settlement_63, settlement_65, settlement_66, settlement_67, settlement_68,
            settlement_69, settlement_72, settlement_73, settlement_74, settlement_75, settlement_76, settlement_77,
            settlement_80, settlement_82, settlement_84, settlement_85, settlement_88, settlement_89, settlement_95,
            settlement_99, settlement_100, settlement_101, settlement_104, settlement_105, settlement_106, settlement_107,
            settlement_108, settlement_109, settlement_110, settlement_111, settlement_112, settlement_113, settlement_114,
            settlement_115, settlement_116, settlement_117, settlement_118, settlement_119, settlement_120, settlement_121,
            settlement_122, settlement_123;

    Settlement[] settlementArray;






    private static final BoardModel instance = new BoardModel();

    private BoardModel() {


        //put the array into a linked list so we can easily remove indexes, allowing randomization
        tileTypesLinkedList = new LinkedList<>();
        Collections.addAll(tileTypesLinkedList, tileTypesArray);

        tileNumbersLinkedList = new LinkedList<>();
        Collections.addAll(tileNumbersLinkedList, tileNumbersArray);



        //create settlements
        settlement_123 = new Settlement(R.id.settlement_123);
        settlement_122 = new Settlement(R.id.settlement_122);
        settlement_121 = new Settlement(R.id.settlement_121);
        settlement_120 = new Settlement(R.id.settlement_120);
        settlement_119 = new Settlement(R.id.settlement_119);
        settlement_118 = new Settlement(R.id.settlement_118);
        settlement_117 = new Settlement(R.id.settlement_117);
        settlement_116 = new Settlement(R.id.settlement_116);
        settlement_115 = new Settlement(R.id.settlement_115);
        settlement_114 = new Settlement(R.id.settlement_114);
        settlement_113 = new Settlement(R.id.settlement_113);
        settlement_112 = new Settlement(R.id.settlement_112);
        settlement_111 = new Settlement(R.id.settlement_111);
        settlement_110 = new Settlement(R.id.settlement_110);
        settlement_109 = new Settlement(R.id.settlement_109);
        settlement_108 = new Settlement(R.id.settlement_108);
        settlement_107 = new Settlement(R.id.settlement_107);
        settlement_106 = new Settlement(R.id.settlement_106);
        settlement_105 = new Settlement(R.id.settlement_105);
        settlement_104 = new Settlement(R.id.settlement_104);
        settlement_101 = new Settlement(R.id.settlement_101);
        settlement_100 = new Settlement(R.id.settlement_100);
        settlement_99 = new Settlement(R.id.settlement_99);
        settlement_95 = new Settlement(R.id.settlement_95);
        settlement_89 = new Settlement(R.id.settlement_89);
        settlement_88 = new Settlement(R.id.settlement_88);
        settlement_85 =  new Settlement(R.id.settlement_85);
        settlement_84 = new Settlement(R.id.settlement_84);
        settlement_82 = new Settlement(R.id.settlement_82);
        settlement_80 = new Settlement(R.id.settlement_80);
        settlement_77 = new Settlement(R.id.settlement_77);
        settlement_76 = new Settlement(R.id.settlement_76);
        settlement_75 = new Settlement(R.id.settlement_75);
        settlement_74 = new Settlement(R.id.settlement_74);
        settlement_73 = new Settlement(R.id.settlement_73);
        settlement_72 = new Settlement(R.id.settlement_72);
        settlement_69 = new Settlement(R.id.settlement_69);
        settlement_68 = new Settlement(R.id.settlement_68);
        settlement_67 = new Settlement(R.id.settlement_67);
        settlement_66 = new Settlement(R.id.settlement_66);
        settlement_65 = new Settlement(R.id.settlement_65);
        settlement_63 = new Settlement(R.id.settlement_63);
        settlement_62 = new Settlement(R.id.settlement_62);
        settlement_61 = new Settlement(R.id.settlement_61);
        settlement_60 = new Settlement(R.id.settlement_60);
        settlement_59 = new Settlement(R.id.settlement_59);
        settlement_57 = new Settlement(R.id.settlement_57);
        settlement_55 = new Settlement(R.id.settlement_55);
        settlement_54 = new Settlement(R.id.settlement_54);
        settlement_53 = new Settlement(R.id.settlement_53);
        settlement_51 = new Settlement(R.id.settlement_51);
        settlement_48 = new Settlement(R.id.settlement_48);
        settlement_47 = new Settlement(R.id.settlement_47);
        settlement_46 = new Settlement(R.id.settlement_46);
        settlement_45 = new Settlement(R.id.settlement_45);
        settlement_42 = new Settlement(R.id.settlement_42);
        settlement_41 = new Settlement(R.id.settlement_41);
        settlement_40 = new Settlement(R.id.settlement_40);
        settlement_39 = new Settlement(R.id.settlement_39);
        settlement_23 = new Settlement(R.id.settlement_23);
        settlement_22 = new Settlement(R.id.settlement_22);
        settlement_21 = new Settlement(R.id.settlement_21);
        settlement_0 = new Settlement(R.id.settlement_0);
        settlement_1 = new Settlement(R.id.settlement_1);
        settlement_2 = new Settlement(R.id.settlement_2);
        settlement_3 = new Settlement(R.id.settlement_3);
        settlement_4 = new Settlement(R.id.settlement_4);
        settlement_5 = new Settlement(R.id.settlement_5);
        settlement_6 = new Settlement(R.id.settlement_6);
        settlement_7 = new Settlement(R.id.settlement_7);
        settlement_8 = new Settlement(R.id.settlement_8);
        settlement_9 = new Settlement(R.id.settlement_9);
        settlement_10 = new Settlement(R.id.settlement_10);
        settlement_11 = new Settlement(R.id.settlement_11);
        settlement_12 = new Settlement(R.id.settlement_12);
        settlement_13 = new Settlement(R.id.settlement_13);
        settlement_14 = new Settlement(R.id.settlement_14);
        settlement_15 = new Settlement(R.id.settlement_15);
        settlement_17 = new Settlement(R.id.settlement_17);
        settlement_19 = new Settlement(R.id.settlement_19);
        settlement_20 = new Settlement(R.id.settlement_20);


        settlementArray = new Settlement[]{settlement_0, settlement_1, settlement_2, settlement_3, settlement_4, settlement_5, settlement_6, settlement_7, settlement_8,
                settlement_9, settlement_10, settlement_11, settlement_12, settlement_13, settlement_14, settlement_15,
                settlement_17, settlement_19, settlement_20, settlement_21, settlement_22, settlement_23, settlement_39,
                settlement_40, settlement_41, settlement_42, settlement_45, settlement_46, settlement_47, settlement_48,
                settlement_51, settlement_53, settlement_54, settlement_55, settlement_57, settlement_59, settlement_60,
                settlement_61, settlement_62, settlement_63, settlement_65, settlement_66, settlement_67, settlement_68,
                settlement_69, settlement_72, settlement_73, settlement_74, settlement_75, settlement_76, settlement_77,
                settlement_80, settlement_82, settlement_84, settlement_85, settlement_88, settlement_89, settlement_95,
                settlement_99, settlement_100, settlement_101, settlement_104, settlement_105, settlement_106, settlement_107,
                settlement_108, settlement_109, settlement_110, settlement_111, settlement_112, settlement_113, settlement_114,
                settlement_115, settlement_116, settlement_117, settlement_118, settlement_119, settlement_120, settlement_121,
                settlement_122, settlement_123};




        //create tiles using view id, the type of tile, and the dice number of the tile
        Tile tile1 = new Tile(R.id.tile_1, R.id.tile_1_num, randomizeTileType());
        tile1.setTileNumber(randomizeTileNumber(tile1));
        tile1.setSettlements(new Settlement[]{settlement_112, settlement_1, settlement_109, settlement_111, settlement_110, settlement_105});

        Tile tile2 = new Tile(R.id.tile_2, R.id.tile_2_num, randomizeTileType());
        tile2.setTileNumber(randomizeTileNumber(tile2));
        tile2.setSettlements(new Settlement[]{settlement_104, settlement_105, settlement_110, settlement_9, settlement_8, settlement_6});

        Tile tile3 = new Tile(R.id.tile_3, R.id.tile_3_num, randomizeTileType());
        tile3.setTileNumber(randomizeTileNumber(tile3));
        tile3.setSettlements(new Settlement[]{settlement_109, settlement_85, settlement_76, settlement_74, settlement_84, settlement_111});

        Tile tile4 = new Tile(R.id.tile_4, R.id.tile_4_num, randomizeTileType());
        tile4.setTileNumber(randomizeTileNumber(tile4));
        tile4.setSettlements(new Settlement[]{settlement_17, settlement_6, settlement_8, settlement_15, settlement_14, settlement_12});

        Tile tile5 = new Tile(R.id.tile_5, R.id.tile_5_num, randomizeTileType());
        tile5.setTileNumber(randomizeTileNumber(tile5));
        tile5.setSettlements(new Settlement[]{settlement_110, settlement_111, settlement_84, settlement_89, settlement_88, settlement_9});

        Tile tile6 = new Tile(R.id.tile_6, R.id.tile_6_num, randomizeTileType());
        tile6.setTileNumber(randomizeTileNumber(tile6));
        tile6.setSettlements(new Settlement[]{settlement_76, settlement_75, settlement_77, settlement_66, settlement_67, settlement_74});

        Tile tile7 = new Tile(R.id.tile_7, R.id.tile_7_num, randomizeTileType());
        tile7.setTileNumber(randomizeTileNumber(tile7));
        tile7.setSettlements(new Settlement[]{settlement_8, settlement_9, settlement_88, settlement_95, settlement_7, settlement_15});

        Tile tile8 = new Tile(R.id.tile_8, R.id.tile_8_num, randomizeTileType());
        tile8.setTileNumber(randomizeTileNumber(tile8));
        tile8.setSettlements(new Settlement[]{settlement_84, settlement_74, settlement_67, settlement_62, settlement_99, settlement_89});

        Tile tile9 = new Tile(R.id.tile_9, R.id.tile_9_num, randomizeTileType());
        tile9.setTileNumber(randomizeTileNumber(tile9));
        tile9.setSettlements(new Settlement[]{settlement_14, settlement_15, settlement_7, settlement_13, settlement_10, settlement_19});

        Tile tile10 = new Tile(R.id.tile_10, R.id.tile_10_num, randomizeTileType());
        tile10.setTileNumber(randomizeTileNumber(tile10));
        tile10.setSettlements(new Settlement[]{settlement_88, settlement_89, settlement_99, settlement_101, settlement_100, settlement_95});

        Tile tile11 = new Tile(R.id.tile_11, R.id.tile_11_num, randomizeTileType());
        tile11.setTileNumber(randomizeTileNumber(tile11));
        tile11.setSettlements(new Settlement[]{settlement_67, settlement_66, settlement_63, settlement_60, settlement_61, settlement_62});

        Tile tile12 = new Tile(R.id.tile_12, R.id.tile_12_num, randomizeTileType());
        tile12.setTileNumber(randomizeTileNumber(tile12));
        tile12.setSettlements(new Settlement[]{settlement_7, settlement_95, settlement_100, settlement_42, settlement_21, settlement_13});

        Tile tile13 = new Tile(R.id.tile_13, R.id.tile_13_num, randomizeTileType());
        tile13.setTileNumber(randomizeTileNumber(tile13));
        tile13.setSettlements(new Settlement[]{settlement_99, settlement_62, settlement_61, settlement_54, settlement_55, settlement_101});

        Tile tile14 = new Tile(R.id.tile_14, R.id.tile_14_num, randomizeTileType());
        tile14.setTileNumber(randomizeTileNumber(tile14));
        tile14.setSettlements(new Settlement[]{settlement_10, settlement_13, settlement_21, settlement_23, settlement_22, settlement_20});

        Tile tile15 = new Tile(R.id.tile_15, R.id.tile_15_num, randomizeTileType());
        tile15.setTileNumber(randomizeTileNumber(tile15));
        tile15.setSettlements(new Settlement[]{settlement_100, settlement_101, settlement_55, settlement_48, settlement_39, settlement_42});

        Tile tile16 = new Tile(R.id.tile_16, R.id.tile_16_num, randomizeTileType());
        tile16.setTileNumber(randomizeTileNumber(tile16));
        tile16.setSettlements(new Settlement[]{settlement_61, settlement_60, settlement_57, settlement_59, settlement_51, settlement_54});

        Tile tile17 = new Tile(R.id.tile_17, R.id.tile_17_num, randomizeTileType());
        tile17.setTileNumber(randomizeTileNumber(tile17));
        tile17.setSettlements(new Settlement[]{settlement_21, settlement_42, settlement_39, settlement_41, settlement_40, settlement_23});

        Tile tile18 = new Tile(R.id.tile_18, R.id.tile_18_num, randomizeTileType());
        tile18.setTileNumber(randomizeTileNumber(tile18));
        tile18.setSettlements(new Settlement[]{settlement_55, settlement_54, settlement_51, settlement_53, settlement_45, settlement_48});

        Tile tile19 = new Tile(R.id.tile_19, R.id.tile_19_num, randomizeTileType());
        tile19.setTileNumber(randomizeTileNumber(tile19));
        tile19.setSettlements(new Settlement[]{settlement_39, settlement_48, settlement_45, settlement_47, settlement_46, settlement_41});

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


    public Player getBluePlayer() {
        return bluePlayer;
    }

    public Player getOrangePlayer() {
        return orangePlayer;
    }

    public Player getPurplePlayer() {
        return purplePlayer;
    }

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public Settlement getSettlementFromViewID(View v) {
        for (int i =0; i < settlementArray.length; i++) {
            if (settlementArray[i].getViewID() == v.getId()) {
                return settlementArray[i];
            }
        }
        return null;
    }
}


