import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;


import java.io.InputStream;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Testing {

    @Test
    @Ignore
    public void placeShipTest() {
        Game game = new Game();

        Player player1 = new Player("Tony");
        Player player2 = new Player("John");

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

        game.start(player1, player2);

        Scanner sc = new Scanner(System.in);

//        String input = sc.nextLine();

        do {
            System.out.println("Pick which boat you'd like to play.");

            Iterator it = player1.ships.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());

                it.remove(); // avoids a ConcurrentModificationException
            }

            String direction = sc.next();
            String input = "pb";
            player1.placeShip( input, 1 ,1, game.getDirection(direction));
            direction = sc.next();
            player2.placeShip( input, 2 ,2, game.getDirection(direction));
        } while (false);


        String[][] stuff = new String[3][3];

        for (int x = 0; x < 3;x++) {
            for (int z = 0; z < 3;z++){
                stuff[x][z] = "  -  ";
            }
        }

        System.out.println("Player1 board: ");
        for (int x = 0; x < 3;x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(player1.board[x][y]);
            }
            System.out.println();
        }
        System.out.println("Player 2 board: ");
        for (int x = 0; x < 3;x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(player2.board[x][y]);
            }
            System.out.println();
        }

        assertNotEquals(stuff, player1.board);
        assertNotEquals(stuff, player2.board);

    }

    @Test
    public void createBoardTest(){
        Player player1 = new Player("Tony");
        Player player2 = new Player("John");
        String[][] stuff = new String[3][3];

        for (int x = 0; x < 3;x++) {
            for (int z = 0; z < 3;z++){
                stuff[x][z] = " - ";
            }
        }
        assertArrayEquals(stuff, player1.board);
        assertArrayEquals(stuff, player2.board);

    }

    @Test
    @Ignore
    public void hitOrMissTest() {

    }

    @Test
    public void addShipTest() {
        Player player1 = new Player("Tony");
        Player player2 = new Player("John");

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

        assertEquals(7,player1.ships.size());
        assertEquals(7,player2.ships.size());
    }

    @Test
    public void getDirectionDownTest() {
        Direction result = null;
        String input = "DoWn".toLowerCase();

        String temp = input;

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
        assertEquals(Direction.DOWN, result);

    }

    @Test
    public void getDirectionUpTest() {
        Direction result = null;
        String input = "up";

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
        assertEquals(Direction.UP, result);

    }
    @Test
    public void getDirectionRightTest() {
        Direction result = null;
        String input = "RighT";

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
        assertEquals(Direction.RIGHT, result);
    }

    @Test
    public void getDirectionLeftTest() {
        Direction result = null;
        String input = "LEFT";

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
        assertEquals(Direction.LEFT, result);

    }
}