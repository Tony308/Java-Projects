import static org.junit.Assert.*;

import com.sun.deploy.security.DeployKeyStore;
import org.junit.Test;
import sun.security.krb5.internal.crypto.Des;


public class Testing {

    @Test
    public void placeShipTest() {
        Board sea = new Board();

        Player player1 = new Player();
        Player player2 = new Player();

        Game game = new Game();
        new PatrolBoat();
        new PatrolBoat();

        new Battleship();
        new Battleship();

        new Submarine();

        new Destroyer();

        new Carrier();

        game.start();

    }

    @Test
    public void createBoardTest(){

    }
}
