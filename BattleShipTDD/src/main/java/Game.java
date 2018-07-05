import net.bytebuddy.dynamic.loading.ClassInjector;

import java.util.Scanner;

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

    public Direction getDirection() {
        String input = "UP";

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
//            getDirection();
        }
        return result;

    }
}
