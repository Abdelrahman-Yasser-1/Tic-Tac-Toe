package com.example.tictactoe;

public class Game {
    private int[][] box = new int[3][3];

    public Game() {
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                box[i][j] = -1;
            }
        }
    }

    public void refresh(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                box[i][j] = -1;
            }
        }
    }

    public boolean check_block(int row, int column){
        return box[row][column] != -1 ? false : true;
    }

    public void set_block(int row, int column, int player){
//        if(check_block(row, column) == 1)
        box[row][column] = player;
    }

    public int check_winner(int player){
        if (box[0][0] == player && box[0][1] == player && box[0][2] == player)
            return 1;
        else if (box[1][0] == player && box[1][1] == player && box[1][2] == player)
            return 2;
        else if (box[2][0] == player && box[2][1] == player && box[2][2] == player)
            return 3;
        else if (box[0][0] == player && box[1][0] == player && box[2][0] == player)
            return 4;
        else if (box[0][1] == player && box[1][1] == player && box[2][1] == player)
            return 5;
        else if (box[0][2] == player && box[1][2] == player && box[2][2] == player)
            return 6;
        else if (box[0][0] == player && box[1][1] == player && box[2][2] == player)
            return 7;
        else if (box[0][2] == player && box[1][1] == player && box[2][0] == player)
            return 8;
        else
            return 0;
    }
}
