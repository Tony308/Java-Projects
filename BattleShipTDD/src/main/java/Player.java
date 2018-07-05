import jdk.nashorn.internal.ir.annotations.Ignore;
import sun.security.x509.CertAttrSet;

import java.util.ArrayList;
import java.util.HashMap;

public class Player extends Board {

    HashMap<String, Ships> ships = new HashMap<String, Ships>();
    private String name;

    Player(String name) {
        this.name = name;

    }

    public void placeShip(String type, int x, int y, Direction input)  {

        if (board[x][y].equals(" - ")) {
            this.board[x][y] = type.substring(type.length() - 3);
        } else if (!board[x][y].equals(" - ")) {
            System.out.println("This space is occupied.");
        }

        try {
            switch (input) {
                case UP:
                    this.board[x - 1][y] = type.substring(type.length() - 3);
                    break;
                case RIGHT:
                    this.board[x][y + 1] = type.substring(type.length() - 3);
                    break;
                case DOWN:
                    this.board[x + 1][y] = type.substring(type.length() - 3);
                    break;
                case LEFT:
                    this.board[x][y--] = type.substring(type.length() - 3);
                    break;
                default:
                    System.out.println("You haven't entered a direction for your ship to face.");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You choose that direction.");
        }

    }

    public void addShip(Ships boat){
        this.ships.put(boat.getType(), boat);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

}
