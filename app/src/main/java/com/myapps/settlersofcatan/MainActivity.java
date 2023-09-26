package com.myapps.settlersofcatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    BoardModel boardModel;

    ImageView tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10,
            tile11, tile12, tile13, tile14, tile15, tile16, tile17, tile18, tile19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boardModel = BoardModel.getInstance();


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



}