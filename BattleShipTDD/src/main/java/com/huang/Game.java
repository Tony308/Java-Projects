package com.huang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.huang.domain.Battleship;
import com.huang.domain.Carrier;
import com.huang.domain.Destroyer;
import com.huang.domain.Direction;
import com.huang.domain.PatrolBoat;
import com.huang.domain.Player;
import com.huang.domain.Submarine;

public class Game {

    public void start(Player player1, Player player2) {

        PatrolBoat pb1 = new PatrolBoat(player1.getName().toLowerCase() + "pb1");
        PatrolBoat pb2 = new PatrolBoat(player1.getName().toLowerCase() + "pb2");

        Battleship b1 = new Battleship(player1.getName().toLowerCase() + "b1");
        Battleship b2 = new Battleship(player1.getName().toLowerCase() + "b2");

        Submarine s1 = new Submarine(player1.getName().toLowerCase() + "s1");

        Destroyer d1 = new Destroyer(player1.getName().toLowerCase() + "d1");

        Carrier c1 = new Carrier(player1.getName().toLowerCase() +  "c1");

        player1.addShip(pb1);
        player1.addShip(pb2);
        player1.addShip(b1);
        player1.addShip(b2);
        player1.addShip(s1);
        player1.addShip(d1);
        player1.addShip(c1);

        PatrolBoat pb3 = new PatrolBoat(player2.getName().toLowerCase()+ "pb1");
        PatrolBoat pb4 = new PatrolBoat(player2.getName().toLowerCase()+ "pb2");

        Battleship b3 = new Battleship(player2.getName().toLowerCase()+ "b1");
        Battleship b4 = new Battleship(player2.getName().toLowerCase()+ "b2");

        Submarine s2 = new Submarine(player2.getName().toLowerCase()+ "s1");
        Destroyer d2 = new Destroyer(player2.getName().toLowerCase()+ "d1");

        Carrier c2 = new Carrier(player2.getName().toLowerCase()+ "c1");

        player2.addShip(pb3);
        player2.addShip(pb4);
        player2.addShip(b3);
        player2.addShip(b4);
        player2.addShip(s2);
        player2.addShip(d2);
        player2.addShip(c2);

        System.out.println("Welcome to Battleships.");
        System.out.println("Assumes you know how to play.");
        System.out.println();

        System.out.print("  1 ");
        System.out.print(" 2 ");
        System.out.print(" 3 ");
        System.out.println();

        for (int x = 0; x < 3;x++) {
            System.out.print(x);

            for (int y = 0; y < 3; y++){
                System.out.print(player1.board[x][y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The dashes represent empty space. " +
                "You have to populate the board with your ships.");

    }

    public Direction getDirection(String input) {
        Direction result = null;

        String temp = input.toLowerCase();

        if (temp.equals("up")) {
            result = Direction.UP;
        } else if (temp.equals("right")) {
            result =  Direction.RIGHT;
        } else if (temp.equals("down")) {
            result =  Direction.DOWN;
        } else if (temp.equals("left")) {
            result =   Direction.LEFT;
        } else {
            System.out.println("You haven't entered a direction correctly.");
            System.out.println("Try again.");
        }
        return result;

    }
    
    public void printPlayerBoard(Player player) {
        System.out.println(player.getName() + " board: ");
        for (int x = 0; x < 3;x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(player.board[x][y]);
            }
            System.out.println();
        }
    }

    public void placeShipsPhase(Player player1, Player player2, Scanner sc, Game game) {
        do {
            int shipsLeft = player1.ships.size();

            // Iterates through the data dictionary
            Iterator it = player1.ships.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getValue());

                it.remove(); // avoids a ConcurrentModificationException
            }
            System.out.println("Player 1. Pick which boat you'd like to play.");
            String ship = sc.next();

            System.out.println("Row: ?");
            int row = sc.nextInt();
            System.out.println("Column: ?");
            int col = sc.nextInt();

            System.out.println("Enter direction you want");
            String direction = sc.next();

            player1.placeShip( ship, row ,col, game.getDirection(direction));

            System.out.println("Player 2");
            System.out.println("Enter the ship you want.");
            ship = sc.next();
            System.out.println("Row: ?");
            row = sc.nextInt();
            System.out.println("Column: ?");
            col = sc.nextInt();

            System.out.println("Enter direction you want");
            direction = sc.next();
            player2.placeShip( ship, row ,col, game.getDirection(direction));
            shipsLeft--;
        } while (false );
    }
}
