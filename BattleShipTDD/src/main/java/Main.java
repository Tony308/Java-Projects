import org.openqa.selenium.interactions.SourceType;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player("Tony");
        Player player2 = new Player("John");

        game.start(player1, player2);


    }
}
