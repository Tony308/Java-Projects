import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

public class Testing {

    @Test
    public void placeShipTest() {
        Player player1 = new Player("Tony");
        Player player2 = new Player("John");
        Game game = new Game();
        game.start(player1, player2);




        player1.placeShip(player1.getName().toLowerCase() + "pb1", 1 ,1, game.getDirection());
        player2.placeShip(player2.getName().toLowerCase() + "pb2", 2 ,2, game.getDirection());

        String[][] stuff = new String[3][3];

        for (int x = 0; x < 3;x++) {
            for (int z = 0; z < 3;z++){
                stuff[x][z] = " - ";
            }
        }

        for (int x = 0; x < 3;x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(player1.board[x][y]);
            }
            System.out.println();
        }

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
}