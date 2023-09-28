package com.myapps.settlersofcatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    BoardModel boardModel;

    ImageView tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10,
            tile11, tile12, tile13, tile14, tile15, tile16, tile17, tile18, tile19;


    View buildSelection;

    TextView roadBuild, settlementBuild;

    TextView brick_card_blue, grain_card_blue, wool_card_blue, lumber_card_blue, ore_card_blue;

    TextView brick_card_orange, grain_card_orange, wool_card_orange, lumber_card_orange, ore_card_orange;

    TextView brick_card_purple, grain_card_purple, wool_card_purple, lumber_card_purple, ore_card_purple;

    TextView brick_card_white, grain_card_white, wool_card_white, lumber_card_white, ore_card_white;





    TextView road_0, road_1, road_2, road_3, road_4, road_5, road_6, road_7, road_8, road_9, road_10, road_11, road_12, road_13, road_14, road_15, road_16, road_17, road_18, road_19, road_20, road_21, road_22, road_23, road_24, road_25, road_26, road_27, road_28, road_29, road_30, road_31, road_32, road_33, road_34, road_35, road_36, road_37, road_38, road_39, road_40, road_41, road_42, road_43, road_44, road_45, road_46, road_47, road_48, road_49, road_50, road_51, road_52, road_53, road_54, road_55, road_56, road_57, road_58, road_59, road_60, road_61, road_62, road_63, road_64, road_65, road_66, road_67, road_68, road_69, road_70, road_71, road_72, road_73, road_74, road_75, road_76, road_77, road_78, road_79, road_80, road_81, road_82, road_83, road_84, road_85, road_86, road_87, road_88, road_89, road_90, road_91, road_92, road_93, road_94, road_95, road_96, road_97, road_98, road_99, road_100, road_101, road_102, road_103, road_104, road_105, road_106, road_107, road_108, road_109, road_110, road_111, road_112;

    TextView settlement_0, settlement_1, settlement_2, settlement_3, settlement_4, settlement_5, settlement_6, settlement_7, settlement_8, settlement_9, settlement_10, settlement_11, settlement_12, settlement_13, settlement_14, settlement_15, settlement_17, settlement_19, settlement_20, settlement_21, settlement_22, settlement_23, settlement_39, settlement_40, settlement_41, settlement_42, settlement_45, settlement_46, settlement_47, settlement_48, settlement_51, settlement_53, settlement_54, settlement_55, settlement_57, settlement_59, settlement_60, settlement_61, settlement_62, settlement_63, settlement_65, settlement_66, settlement_67, settlement_68, settlement_69, settlement_72, settlement_73, settlement_74, settlement_75, settlement_76, settlement_77, settlement_80, settlement_82, settlement_84, settlement_85, settlement_88, settlement_89, settlement_95, settlement_99, settlement_100, settlement_101, settlement_104, settlement_105, settlement_106, settlement_107, settlement_108, settlement_109, settlement_110, settlement_111, settlement_112, settlement_113, settlement_114, settlement_115, settlement_116, settlement_117, settlement_118, settlement_119, settlement_120, settlement_121, settlement_122, settlement_123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boardModel = BoardModel.getInstance();




        //build road button
        roadBuild = findViewById(R.id.road_build);
        roadBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildSelection = v;
                v.setBackgroundColor(getResources().getColor(R.color.white, getTheme()));
            }
        });


        //build settlement button
        settlementBuild = findViewById(R.id.settlement_build);
        settlementBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildSelection = v;
                v.setBackgroundColor(getResources().getColor(R.color.white, getTheme()));
            }
        });




        brick_card_blue = findViewById(R.id.brick_card_blue);
        grain_card_blue = findViewById(R.id.grain_card_blue);
        wool_card_blue = findViewById(R.id.wool_card_blue);
        lumber_card_blue = findViewById(R.id.lumber_card_blue);
        ore_card_blue = findViewById(R.id.ore_card_blue);

        brick_card_orange = findViewById(R.id.brick_card_orange);
        grain_card_orange = findViewById(R.id.grain_card_orange);
        wool_card_orange = findViewById(R.id.wool_card_orange);
        lumber_card_orange = findViewById(R.id.lumber_card_orange);
        ore_card_orange = findViewById(R.id.ore_card_orange);

        brick_card_purple = findViewById(R.id.brick_card_purple);
        grain_card_purple = findViewById(R.id.grain_card_purple);
        wool_card_purple = findViewById(R.id.wool_card_purple);
        lumber_card_purple = findViewById(R.id.lumber_card_purple);
        ore_card_purple = findViewById(R.id.ore_card_purple);

        brick_card_white = findViewById(R.id.brick_card_white);
        grain_card_white = findViewById(R.id.grain_card_white);
        wool_card_white = findViewById(R.id.wool_card_white);
        lumber_card_white = findViewById(R.id.lumber_card_white);
        ore_card_white = findViewById(R.id.ore_card_white);






        tile1 = findViewById(R.id.tile_1);
        tile2 = findViewById(R.id.tile_2);
        tile3 = findViewById(R.id.tile_3);
        tile4 = findViewById(R.id.tile_4);
        tile5 = findViewById(R.id.tile_5);
        tile6 = findViewById(R.id.tile_6);
        tile7 = findViewById(R.id.tile_7);
        tile8 = findViewById(R.id.tile_8);
        tile9 = findViewById(R.id.tile_9);
        tile10 = findViewById(R.id.tile_10);
        tile11 = findViewById(R.id.tile_11);
        tile12 = findViewById(R.id.tile_12);
        tile13 = findViewById(R.id.tile_13);
        tile14 = findViewById(R.id.tile_14);
        tile15 = findViewById(R.id.tile_15);
        tile16 = findViewById(R.id.tile_16);
        tile17 = findViewById(R.id.tile_17);
        tile18 = findViewById(R.id.tile_18);
        tile19 = findViewById(R.id.tile_19);



        road_0 = findViewById(R.id.road_0);
        road_0.setOnClickListener(this);

        road_1 = findViewById(R.id.road_1);
        road_1.setOnClickListener(this);

        road_2 = findViewById(R.id.road_2);
        road_2.setOnClickListener(this);

        road_3 = findViewById(R.id.road_3);
        road_3.setOnClickListener(this);

        road_4 = findViewById(R.id.road_4);
        road_4.setOnClickListener(this);

        road_5 = findViewById(R.id.road_5);
        road_5.setOnClickListener(this);

        road_6 = findViewById(R.id.road_6);
        road_6.setOnClickListener(this);

        road_7 = findViewById(R.id.road_7);
        road_7.setOnClickListener(this);


        road_8 = findViewById(R.id.road_8);
        road_8.setOnClickListener(this);

        road_9 = findViewById(R.id.road_9);
        road_9.setOnClickListener(this);

        road_10 = findViewById(R.id.road_10);
        road_10.setOnClickListener(this);

        road_11 = findViewById(R.id.road_11);
        road_11.setOnClickListener(this);

        road_12 = findViewById(R.id.road_12);
        road_12.setOnClickListener(this);

        road_13 = findViewById(R.id.road_13);
        road_13.setOnClickListener(this);

        road_14 = findViewById(R.id.road_14);
        road_14.setOnClickListener(this);

        road_15 = findViewById(R.id.road_15);
        road_15.setOnClickListener(this);

        road_16 = findViewById(R.id.road_16);
        road_16.setOnClickListener(this);

        road_17 = findViewById(R.id.road_17);
        road_17.setOnClickListener(this);

        road_18 = findViewById(R.id.road_18);
        road_18.setOnClickListener(this);

        road_19 = findViewById(R.id.road_19);
        road_19.setOnClickListener(this);


        road_21 = findViewById(R.id.road_21);
        road_21.setOnClickListener(this);

        road_22 = findViewById(R.id.road_22);
        road_22.setOnClickListener(this);

        road_23 = findViewById(R.id.road_23);
        road_23.setOnClickListener(this);

        road_24 = findViewById(R.id.road_24);
        road_24.setOnClickListener(this);

        road_25 = findViewById(R.id.road_25);
        road_25.setOnClickListener(this);

        road_26 = findViewById(R.id.road_26);
        road_26.setOnClickListener(this);

        road_27 = findViewById(R.id.road_27);
        road_27.setOnClickListener(this);

        road_41 = findViewById(R.id.road_41);
        road_41.setOnClickListener(this);

        road_42 = findViewById(R.id.road_42);
        road_42.setOnClickListener(this);

        road_43 = findViewById(R.id.road_43);
        road_43.setOnClickListener(this);

        road_44 = findViewById(R.id.road_44);
        road_44.setOnClickListener(this);

        road_45 = findViewById(R.id.road_45);
        road_45.setOnClickListener(this);

        road_47 = findViewById(R.id.road_47);
        road_47.setOnClickListener(this);

        road_48 = findViewById(R.id.road_48);
        road_48.setOnClickListener(this);

        road_49 = findViewById(R.id.road_49);
        road_49.setOnClickListener(this);

        road_50 = findViewById(R.id.road_50);
        road_50.setOnClickListener(this);

        road_51 = findViewById(R.id.road_51);
        road_51.setOnClickListener(this);

        road_52 = findViewById(R.id.road_52);
        road_52.setOnClickListener(this);

        road_54 = findViewById(R.id.road_54);
        road_54.setOnClickListener(this);

        road_55 = findViewById(R.id.road_55);
        road_55.setOnClickListener(this);

        road_56 = findViewById(R.id.road_56);
        road_56.setOnClickListener(this);

        road_57 = findViewById(R.id.road_57);
        road_57.setOnClickListener(this);

        road_58 = findViewById(R.id.road_58);
        road_58.setOnClickListener(this);

        road_60 = findViewById(R.id.road_60);
        road_60.setOnClickListener(this);

        road_61 = findViewById(R.id.road_61);
        road_61.setOnClickListener(this);

        road_62 = findViewById(R.id.road_62);
        road_62.setOnClickListener(this);

        road_63 = findViewById(R.id.road_63);
        road_63.setOnClickListener(this);

        road_64 = findViewById(R.id.road_64);
        road_64.setOnClickListener(this);

        road_65 = findViewById(R.id.road_65);
        road_65.setOnClickListener(this);

        road_67= findViewById(R.id.road_67);
        road_67.setOnClickListener(this);

        road_68 = findViewById(R.id.road_68);
        road_68.setOnClickListener(this);

        road_69 = findViewById(R.id.road_69);
        road_69.setOnClickListener(this);

        road_70 = findViewById(R.id.road_70);
        road_70.setOnClickListener(this);

        road_71 = findViewById(R.id.road_71);
        road_71.setOnClickListener(this);

        road_73 = findViewById(R.id.road_73);
        road_73.setOnClickListener(this);

        road_74 = findViewById(R.id.road_74);
        road_74.setOnClickListener(this);

        road_75 = findViewById(R.id.road_75);
        road_75.setOnClickListener(this);

        road_76 = findViewById(R.id.road_76);
        road_76.setOnClickListener(this);

        road_77 = findViewById(R.id.road_77);
        road_77.setOnClickListener(this);

        road_78 = findViewById(R.id.road_78);
        road_78.setOnClickListener(this);

        road_79 = findViewById(R.id.road_79);
        road_79.setOnClickListener(this);

        road_80 = findViewById(R.id.road_80);
        road_80.setOnClickListener(this);

        road_82 = findViewById(R.id.road_82);
        road_82.setOnClickListener(this);

        road_83 = findViewById(R.id.road_83);
        road_83.setOnClickListener(this);

        road_85 = findViewById(R.id.road_85);
        road_85.setOnClickListener(this);

        road_86 = findViewById(R.id.road_86);
        road_86.setOnClickListener(this);

        road_87 = findViewById(R.id.road_87);
        road_87.setOnClickListener(this);

        road_88 = findViewById(R.id.road_88);
        road_88.setOnClickListener(this);

        road_89 = findViewById(R.id.road_89);
        road_89.setOnClickListener(this);

        road_90 = findViewById(R.id.road_90);
        road_90.setOnClickListener(this);

        road_92 = findViewById(R.id.road_92);
        road_92.setOnClickListener(this);

        road_93 = findViewById(R.id.road_93);
        road_93.setOnClickListener(this);

        road_94 = findViewById(R.id.road_94);
        road_94.setOnClickListener(this);

        road_99 = findViewById(R.id.road_99);
        road_99.setOnClickListener(this);

        road_100 = findViewById(R.id.road_100);
        road_100.setOnClickListener(this);

        road_104 = findViewById(R.id.road_104);
        road_104.setOnClickListener(this);

        road_105 = findViewById(R.id.road_105);
        road_105.setOnClickListener(this);

        road_106 = findViewById(R.id.road_106);
        road_106.setOnClickListener(this);

        road_107 = findViewById(R.id.road_107);
        road_107.setOnClickListener(this);

        road_109 = findViewById(R.id.road_109);
        road_109.setOnClickListener(this);

        road_110 = findViewById(R.id.road_110);
        road_110.setOnClickListener(this);

        road_112 = findViewById(R.id.road_112);
        road_112.setOnClickListener(this);



        settlement_0 = findViewById(R.id.settlement_0);
        settlement_0.setOnClickListener(this);

        settlement_1 = findViewById(R.id.settlement_1);
        settlement_1.setOnClickListener(this);

        settlement_2 = findViewById(R.id.settlement_2);
        settlement_2.setOnClickListener(this);

        settlement_3 = findViewById(R.id.settlement_3);
        settlement_3.setOnClickListener(this);

        settlement_4 = findViewById(R.id.settlement_4);
        settlement_4.setOnClickListener(this);

        settlement_5 = findViewById(R.id.settlement_5);
        settlement_5.setOnClickListener(this);

        settlement_6 = findViewById(R.id.settlement_6);
        settlement_6.setOnClickListener(this);

        settlement_7 = findViewById(R.id.settlement_7);
        settlement_7.setOnClickListener(this);

        settlement_8 = findViewById(R.id.settlement_8);
        settlement_8.setOnClickListener(this);

        settlement_9 = findViewById(R.id.settlement_9);
        settlement_9.setOnClickListener(this);

        settlement_10 = findViewById(R.id.settlement_10);
        settlement_10.setOnClickListener(this);

        settlement_11 = findViewById(R.id.settlement_11);
        settlement_11.setOnClickListener(this);

        settlement_12 = findViewById(R.id.settlement_12);
        settlement_12.setOnClickListener(this);

        settlement_13 = findViewById(R.id.settlement_13);
        settlement_13.setOnClickListener(this);

        settlement_14 = findViewById(R.id.settlement_14);
        settlement_14.setOnClickListener(this);

        settlement_15 = findViewById(R.id.settlement_15);
        settlement_15.setOnClickListener(this);

        settlement_17 = findViewById(R.id.settlement_17);
        settlement_17.setOnClickListener(this);

        settlement_19 = findViewById(R.id.settlement_19);
        settlement_19.setOnClickListener(this);

        settlement_20 = findViewById(R.id.settlement_20);
        settlement_20.setOnClickListener(this);

        settlement_21 = findViewById(R.id.settlement_21);
        settlement_21.setOnClickListener(this);

        settlement_22 = findViewById(R.id.settlement_22);
        settlement_22.setOnClickListener(this);

        settlement_23 = findViewById(R.id.settlement_23);
        settlement_23.setOnClickListener(this);

        settlement_39 = findViewById(R.id.settlement_39);
        settlement_39.setOnClickListener(this);

        settlement_40 = findViewById(R.id.settlement_40);
        settlement_40.setOnClickListener(this);

        settlement_41 = findViewById(R.id.settlement_41);
        settlement_41.setOnClickListener(this);

        settlement_42 = findViewById(R.id.settlement_42);
        settlement_42.setOnClickListener(this);

        settlement_45 = findViewById(R.id.settlement_45);
        settlement_45.setOnClickListener(this);

        settlement_46 = findViewById(R.id.settlement_46);
        settlement_46.setOnClickListener(this);

        settlement_47 = findViewById(R.id.settlement_47);
        settlement_47.setOnClickListener(this);

        settlement_48 = findViewById(R.id.settlement_48);
        settlement_48.setOnClickListener(this);

        settlement_51 = findViewById(R.id.settlement_51);
        settlement_51.setOnClickListener(this);

        settlement_53 = findViewById(R.id.settlement_53);
        settlement_53.setOnClickListener(this);

        settlement_54 = findViewById(R.id.settlement_54);
        settlement_54.setOnClickListener(this);

        settlement_55 = findViewById(R.id.settlement_55);
        settlement_55.setOnClickListener(this);

        settlement_57 = findViewById(R.id.settlement_57);
        settlement_57.setOnClickListener(this);

        settlement_59 = findViewById(R.id.settlement_59);
        settlement_59.setOnClickListener(this);

        settlement_60 = findViewById(R.id.settlement_60);
        settlement_60.setOnClickListener(this);

        settlement_61 = findViewById(R.id.settlement_61);
        settlement_61.setOnClickListener(this);

        settlement_62 = findViewById(R.id.settlement_62);
        settlement_62.setOnClickListener(this);

        settlement_63 = findViewById(R.id.settlement_63);
        settlement_63.setOnClickListener(this);

        settlement_65 = findViewById(R.id.settlement_65);
        settlement_65.setOnClickListener(this);

        settlement_66 = findViewById(R.id.settlement_66);
        settlement_66.setOnClickListener(this);

        settlement_67 = findViewById(R.id.settlement_67);
        settlement_67.setOnClickListener(this);

        settlement_68 = findViewById(R.id.settlement_68);
        settlement_68.setOnClickListener(this);

        settlement_69 = findViewById(R.id.settlement_69);
        settlement_69.setOnClickListener(this);

        settlement_72 = findViewById(R.id.settlement_72);
        settlement_72.setOnClickListener(this);

        settlement_73 = findViewById(R.id.settlement_73);
        settlement_73.setOnClickListener(this);

        settlement_74 = findViewById(R.id.settlement_74);
        settlement_74.setOnClickListener(this);

        settlement_75 = findViewById(R.id.settlement_75);
        settlement_75.setOnClickListener(this);

        settlement_76 = findViewById(R.id.settlement_76);
        settlement_76.setOnClickListener(this);

        settlement_77 = findViewById(R.id.settlement_77);
        settlement_77.setOnClickListener(this);

        settlement_80 = findViewById(R.id.settlement_80);
        settlement_80.setOnClickListener(this);

        settlement_82 = findViewById(R.id.settlement_82);
        settlement_82.setOnClickListener(this);

        settlement_84 = findViewById(R.id.settlement_84);
        settlement_84.setOnClickListener(this);

        settlement_85 = findViewById(R.id.settlement_85);
        settlement_85.setOnClickListener(this);

        settlement_88 = findViewById(R.id.settlement_88);
        settlement_88.setOnClickListener(this);

        settlement_89 = findViewById(R.id.settlement_89);
        settlement_89.setOnClickListener(this);

        settlement_95 = findViewById(R.id.settlement_95);
        settlement_95.setOnClickListener(this);

        settlement_99 = findViewById(R.id.settlement_99);
        settlement_99.setOnClickListener(this);

        settlement_100 = findViewById(R.id.settlement_100);
        settlement_100.setOnClickListener(this);

        settlement_101 = findViewById(R.id.settlement_101);
        settlement_101.setOnClickListener(this);

        settlement_104 = findViewById(R.id.settlement_104);
        settlement_104.setOnClickListener(this);

        settlement_105 = findViewById(R.id.settlement_105);
        settlement_105.setOnClickListener(this);

        settlement_106 = findViewById(R.id.settlement_106);
        settlement_106.setOnClickListener(this);

        settlement_107 = findViewById(R.id.settlement_107);
        settlement_107.setOnClickListener(this);

        settlement_108 = findViewById(R.id.settlement_108);
        settlement_108.setOnClickListener(this);

        settlement_109 = findViewById(R.id.settlement_109);
        settlement_109.setOnClickListener(this);

        settlement_110 = findViewById(R.id.settlement_110);
        settlement_110.setOnClickListener(this);

        settlement_111 = findViewById(R.id.settlement_111);
        settlement_111.setOnClickListener(this);

        settlement_112 = findViewById(R.id.settlement_112);
        settlement_112.setOnClickListener(this);

        settlement_113 = findViewById(R.id.settlement_113);
        settlement_113.setOnClickListener(this);

        settlement_114 = findViewById(R.id.settlement_114);
        settlement_114.setOnClickListener(this);

        settlement_115 = findViewById(R.id.settlement_115);
        settlement_115.setOnClickListener(this);

        settlement_116 = findViewById(R.id.settlement_116);
        settlement_116.setOnClickListener(this);

        settlement_117 = findViewById(R.id.settlement_117);
        settlement_117.setOnClickListener(this);

        settlement_118 = findViewById(R.id.settlement_118);
        settlement_118.setOnClickListener(this);

        settlement_119 = findViewById(R.id.settlement_119);
        settlement_119.setOnClickListener(this);

        settlement_120 = findViewById(R.id.settlement_120);
        settlement_120.setOnClickListener(this);

        settlement_121 = findViewById(R.id.settlement_121);
        settlement_121.setOnClickListener(this);

        settlement_122 = findViewById(R.id.settlement_122);
        settlement_122.setOnClickListener(this);

        settlement_123 = findViewById(R.id.settlement_123);
        settlement_123.setOnClickListener(this);





































        drawBoardTiles();

    }


    private void drawBoardTiles() {
        ImageView temp;
        TextView tempTextView;

        for (int i = 0; i < boardModel.getTileArray().length; i++) {
            //create temp view for checking values
            temp = findViewById(boardModel.getTileArray()[i].getViewID());
            tempTextView = findViewById(boardModel.getTileArray()[i].getTextViewID());


            //set tile type
            if (boardModel.getTileArray()[i].getTileType() == 'b') {
                temp.setImageResource(R.drawable.brick_tile);
            }
            if (boardModel.getTileArray()[i].getTileType() == 'g') {
                temp.setImageResource(R.drawable.grain_tile);
            }
            if (boardModel.getTileArray()[i].getTileType() == 'd') {
                temp.setImageResource(R.drawable.desert_tile);
            }
            if (boardModel.getTileArray()[i].getTileType() == 'o') {
                temp.setImageResource(R.drawable.ore_tile);
            }
            if (boardModel.getTileArray()[i].getTileType() == 'w') {
                temp.setImageResource(R.drawable.wool_tile);
            }
            if (boardModel.getTileArray()[i].getTileType() == 'l') {
                temp.setImageResource(R.drawable.lumber_tile);
            }

            //set tile number
            if (boardModel.getTileArray()[i].getTileNumber() == 0) {
                tempTextView.setText("");

                ;
                tempTextView.setBackground(ResourcesCompat.getDrawable(getResources(),R.drawable.robber_baron, getTheme()));
            }
            if (boardModel.getTileArray()[i].getTileNumber() == 2) {
                tempTextView.setText(R.string.Two);
                tempTextView.setTextColor(getResources().getColor(R.color.black));
            }
            if (boardModel.getTileArray()[i].getTileNumber() == 3) {
                tempTextView.setText(R.string.Three);
                tempTextView.setTextColor(getResources().getColor(R.color.black));

            }
            if (boardModel.getTileArray()[i].getTileNumber() == 4) {
                tempTextView.setText(R.string.Four);
                tempTextView.setTextColor(getResources().getColor(R.color.black));

            }
            if (boardModel.getTileArray()[i].getTileNumber() == 5) {
                tempTextView.setText(R.string.Five);
                tempTextView.setTextColor(getResources().getColor(R.color.black));

            }
            if (boardModel.getTileArray()[i].getTileNumber() == 6) {
                tempTextView.setText(R.string.Six);
                tempTextView.setTextColor(getResources().getColor(R.color.brick_red));

            }
            if (boardModel.getTileArray()[i].getTileNumber() == 8) {
                tempTextView.setText(R.string.Eight);
                tempTextView.setTextColor(getResources().getColor(R.color.brick_red));

            }
            if (boardModel.getTileArray()[i].getTileNumber() == 9) {
                tempTextView.setText(R.string.Nine);
                tempTextView.setTextColor(getResources().getColor(R.color.black));

            }
            if (boardModel.getTileArray()[i].getTileNumber() == 10) {
                tempTextView.setText(R.string.Ten);
                tempTextView.setTextColor(getResources().getColor(R.color.black));

            }
            if (boardModel.getTileArray()[i].getTileNumber() == 11) {
                tempTextView.setText(R.string.Eleven);
                tempTextView.setTextColor(getResources().getColor(R.color.black));

            }
            if (boardModel.getTileArray()[i].getTileNumber() == 12) {
                tempTextView.setText(R.string.Twelve);
                tempTextView.setTextColor(getResources().getColor(R.color.black));

            }



        }

    }


    //TODO onclick

    @Override
    public void onClick(View v) {

        String viewType = v.getResources().getResourceName(v.getId()).substring(30);

        Toast.makeText(this, viewType, Toast.LENGTH_SHORT).show();

        /*


        //check if a build has been selected
        if (buildSelection != null) {

            //gets the type of view whether road or settlement
            char viewType = v.getResources().getResourceName(v.getId()).charAt(30);

            //if road build is selected
            if (buildSelection.getId() == R.id.road_build) {
                //if clicked a road spot
                if (viewType == 'r') {
                    buildRoad(v);
                }
            }
            //if build settlement is selected
            else if (buildSelection.getId() == R.id.settlement_build) {
                //if clicked a settlement spot
                if (viewType == 's') {
                    buildSettlement(v);
                }
            }
            //upgrade to city is selected
            else {

            }
        }

         */
    }

    private void buildRoad(View v) {
        v.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.blue, getTheme()));
        v.setAlpha(1);
        buildSelection = null;
        roadBuild.setBackgroundColor(getResources().getColor(R.color.blue, getTheme()));
    }

    private void buildSettlement(View v) {
        v.setBackgroundResource(R.drawable.blue_settlement);
        v.setAlpha(1);
        buildSelection = null;
        settlementBuild.setBackgroundResource(R.drawable.blue_settlement);

    }


}