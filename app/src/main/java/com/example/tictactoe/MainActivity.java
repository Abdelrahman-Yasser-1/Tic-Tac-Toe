package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton[] blocks = new ImageButton[9];
    ImageButton refresh;

    TextView tv_xScoure, tv_oScoure;

    int player = 0, player1Scoure = 0, player2Scoure = 0, result = -1;
    Game game;

    View[] win_lines = new View[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        blocks[0] = findViewById(R.id.btn_0);
        blocks[1] = findViewById(R.id.btn_1);
        blocks[2] = findViewById(R.id.btn_2);
        blocks[3] = findViewById(R.id.btn_3);
        blocks[4] = findViewById(R.id.btn_4);
        blocks[5] = findViewById(R.id.btn_5);
        blocks[6] = findViewById(R.id.btn_6);
        blocks[7] = findViewById(R.id.btn_7);
        blocks[8] = findViewById(R.id.btn_8);

//        win_lines[0] = findViewById(R.id.win_line1)
//        win_lines[1] = findViewById(R.id.win_line2)
//        win_lines[2] = findViewById(R.id.win_line3)
//        win_lines[3] = findViewById(R.id.win_line4)
//        win_lines[4] = findViewById(R.id.win_line5)
//        win_lines[5] = findViewById(R.id.win_line6)
//        win_lines[6] = findViewById(R.id.win_line7)
//        win_lines[7] = findViewById(R.id.win_line8)


        refresh = findViewById(R.id.btn_refresh);

        tv_xScoure = findViewById(R.id.tv_xScore);
        tv_oScoure = findViewById(R.id.tv_oScore);

        game = new Game();

        for (ImageButton block : blocks) {
            block.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id = block.getId();

                    if (id == R.id.btn_0) {
                        if (game.check_block(0, 0)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(0, 0, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                        Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.btn_1) {
                        if (game.check_block(0, 1)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(0, 1, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                    } else if (id == R.id.btn_2) {
                        if (game.check_block(0, 2)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(0, 2, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                    } else if (id == R.id.btn_3) {
                        if (game.check_block(1, 0)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(1, 0, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                    } else if (id == R.id.btn_4) {
                        if (game.check_block(1, 1)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(1, 1, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                    } else if (id == R.id.btn_5) {
                        if (game.check_block(1, 2)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(1, 2, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                    } else if (id == R.id.btn_6) {
                        if (game.check_block(2, 0)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(2, 0, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                    } else if (id == R.id.btn_7) {
                        if (game.check_block(2, 1)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(2, 1, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                    } else if (id == R.id.btn_8) {
                        if (game.check_block(2, 2)) {
                            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
                            game.set_block(2, 2, player);
                            result = game.check_winner(player);
                            if (result != 0)
                                Toast.makeText(getApplicationContext(), "player " + player + "win", Toast.LENGTH_SHORT).show();
                            else
                                player = player == 1 ? 0 : 1;
                        }
                    }
                }
            });
        }


        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                for(View win_line:win_lines) {
//                    win_line.setVisibility(1);
//                }
                game.refresh();
                Toast.makeText(getApplicationContext(), "refresh", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void block_click(ImageButton block, int row, int column, int player) {
        if (game.check_block(row, column)) {
            block.setImageResource(player == 0 ? R.drawable.circle : R.drawable.cross);
            game.set_block(row, column, player);
            result = game.check_winner(player);
            if (result != 0) {
//                win_lines[result - 1].setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(), "Player " + player + "win, with line " + result, Toast.LENGTH_SHORT).show();
            } else
                player = player == 1 ? 0 : 1;
        }
    }
}