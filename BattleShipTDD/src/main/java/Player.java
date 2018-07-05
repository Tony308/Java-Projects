import java.util.ArrayList;
import java.util.HashMap;

public class Player extends Board {

    HashMap<String, Ships> ships = new HashMap<String, Ships>();
    private String name;

    Player(String name) {
        this.name = name;

    }

    public void placeShip(String type, int x, int y) {


        if (board[x][y].equals(" - ")){
            this.board[x][y] = type.substring(type.length()-3,type.length());
        } else if (!board[x][y].equals(" - ")) {
            System.out.println("This space is occupied.");
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
