import org.openqa.selenium.interactions.SourceType;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import static org.junit.Assert.assertNotEquals;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Player player1 = new Player("Tony");
        Player player2 = new Player("John");

       /* PatrolBoat pb1 = new PatrolBoat(player1.getName().toLowerCase() + "pb1");
        PatrolBoat pb2 = new PatrolBoat(player1.getName().toLowerCase() + "pb2");
//        Battleship b1 = new Battleship(player1.getName().toLowerCase() + "b1");
//        Battleship b2 = new Battleship(player1.getName().toLowerCase() + "b2");
//        Submarine s1 = new Submarine(player1.getName().toLowerCase() + "s1");
//        Destroyer d1 = new Destroyer(player1.getName().toLowerCase() + "d1");
//        Carrier c1 = new Carrier(player1.getName().toLowerCase() +  "c1");

        player1.addShip(pb1);
        player1.addShip(pb2);
//        player1.addShip(b1);
//        player1.addShip(b2);
//        player1.addShip(s1);
//        player1.addShip(d1);
//        player1.addShip(c1);

        PatrolBoat pb3 = new PatrolBoat("pb3");
        PatrolBoat pb4 = new PatrolBoat("pb4");

        player2.addShip(pb3);
        player2.addShip(pb4);*/

        game.start(player1, player2);

        Scanner sc = new Scanner(System.in);
        int shipsLeft = player1.ships.size();
        do {

// Iterates through the data dictionary
//            Iterator it = player1.ships.entrySet().iterator();
//
//            while (it.hasNext()) {
//                Map.Entry pair = (Map.Entry)it.next();
//                System.out.println(pair.getKey() + " = " + pair.getValue());
//
//                it.remove(); // avoids a ConcurrentModificationException
//            }
            System.out.println("Player 1. Pick which boat you'd like to play.");
            String ship = sc.next();
            System.out.println("Row: ?");
            int row = sc.nextInt();
            System.out.println("Column: ?");
            int col = sc.nextInt();
            System.out.println("Player 1. Enter direction you want");
            String direction = sc.next();
            player1.placeShip( ship, 1 ,1, game.getDirection(direction));

            System.out.println("Enter the ship you want.");
            ship = sc.next();
            System.out.println("Row: ?");
            row = sc.nextInt();
            System.out.println("Column: ?");
            col = sc.nextInt();
            System.out.println("Player 2. Enter direction you want");
            direction = sc.next();
            player2.placeShip( ship, 2 ,2, game.getDirection(direction));
        } while (shipsLeft > 0 );


//        String[][] stuff = new String[3][3];
//
//        for (int x = 0; x < 3;x++) {
//            for (int z = 0; z < 3;z++){
//                stuff[x][z] = "  -  ";
//            }
//        }

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
    }
}
