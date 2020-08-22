package com.huang;

import com.huang.domain.Player;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Player player1 = new Player("Tony");
        Player player2 = new Player("John");

        game.start(player1, player2);

        Scanner sc = new Scanner(System.in);

        game.placeShipsPhase(player1,player2, sc, game);

        String[][] stuff = new String[3][3];

        for (int x = 0; x < 3;x++) {
            for (int z = 0; z < 3;z++){
                stuff[x][z] = " ~ ";
            }
        }
        
        game.printPlayerBoard(player1);
        game.printPlayerBoard(player2);

    }

}
