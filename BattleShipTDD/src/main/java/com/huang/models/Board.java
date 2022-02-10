package com.huang.models;
public class Board {
    public String[][] board;

    public Board (int size) {
        board = new String[size][size];
        populateDefaultBoard();
    }

    public Board () {
        board = new String[3][3];
        populateDefaultBoard();
    }

    public void populateDefaultBoard() {
        for (int x = 0; x < 3;x++) {
            for (int z = 0; z < 3;z++){
                board[x][z] = " ~ ";
            }
        }
    }
}