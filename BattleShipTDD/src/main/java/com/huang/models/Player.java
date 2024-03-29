package com.huang.models;


import java.util.HashMap;

public class Player extends Board {

    private HashMap<String, Ships> ships = new HashMap<>();
    private String name;

    public HashMap<String, Ships> getShips() {
        return ships;
    }

    public void setShips(HashMap<String, Ships> ships) {
        this.ships = ships;
    }

    public Player(String name) {
        super();
        this.name = name;
    }

    public void placeShip(String type, int x, int y, Direction input)  {

        if (this.board[x][y].equals(" ~ ")) {
            this.board[x][y] = " " + type;
        } else {
            System.out.println("This space is occupied.");
        }

        try {
            switch (input) {
                case UP:
                    this.board[x - 1][y] = " " + type;
                    break;
                case RIGHT:
                    this.board[x][y + 1] = " " + type;
                    break;
                case DOWN:
                    this.board[x + 1][y] = " " + type;
                    break;
                case LEFT:
                    this.board[x][y--] = " " + type;
                    break;
                default:
                    System.out.println("You haven't entered a direction for your ship to face.");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You can't choose that direction.");
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
