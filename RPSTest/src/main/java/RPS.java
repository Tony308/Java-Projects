import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        RPS main = new RPS();
        System.out.println("Welcome to rock paper scissors");
        main.Game(0,0, 0, 0,0, 0);
    }

    private void Game(int playerScore, int aiScore, int totalGames, int aiWins, int playerWins, int draws){
        boolean finished = false;

        if(playerScore == 5){
            finished = true;
            System.out.println("You win");
            System.out.println("Total games played:" + totalGames);
            System.out.println("You won " + playerWins + " games. You've won " + ((double)playerWins/(double)totalGames) * 100+ "% of your games.");
            return;
        } else if (aiScore == 5){
            finished = true;
            System.out.println("Computer won, try again");
            System.out.println("Total games played:" + totalGames);
            System.out.println("The computer won " + aiWins + " games. The computer won " + ((double)aiWins/(double)totalGames) * 100+ "% of its games.");
            return;
        }

        System.out.println("Enter 'r' for Rock, 'p' for Paper or 's' for Scissor to start:");

        Scanner input = new Scanner(System.in);

        String playerInput = input.nextLine();
        playerInput.toLowerCase();

        String aiChoice = "";
        int random = (int) (Math.random() * 10);

        if (random <= 3) {
            aiChoice = "r";
        }
        if (random >= 4 && random <=6) {
            aiChoice = "p";
        }
        if (random >= 7 && random <=10) {
            aiChoice = "s";
        }
        
        //rock
        if (playerInput.equals("r") && aiChoice.equals("r")) {
            System.out.println("You drew, try again");
            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++; 
            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);

        } else if (playerInput.equals("r") && aiChoice.equals("p")){
            System.out.println("You lose, try again");
            aiScore++;
            aiWins++;
            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++;

            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);

        } else if (playerInput.equals("r") && aiChoice.equals("s")){
            System.out.println("You win, continue");
            playerScore++;
            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++; 
            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);
        }

        //paper
        if (playerInput.equals("p") && aiChoice.equals("r")) {
            System.out.println("You win, try again");
            playerScore = playerScore + 1;
            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++;
            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);
        } else if (playerInput.equals("p") && aiChoice.equals("p")){
            System.out.println("You drew, try again");
            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++;
            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);
        } else if (playerInput.equals("p") && aiChoice.equals("s")){
            System.out.println("You lose, continue");
            aiScore++;
            aiWins++;
            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++;
            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);
        }

        //scissors
        if (playerInput.equals("s") && aiChoice.equals("r")) {
            System.out.println("You lose, try again");
            aiScore++;
            aiWins++;

            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++;
            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);
        } else if (playerInput.equals("s") && aiChoice.equals("p")){
            System.out.println("You win, try again");
            playerScore++;
            playerWins++;
            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++;
            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);
        } else if (playerInput.equals("s") && aiChoice.equals("s")){
            System.out.println("You drew, continue");
            System.out.println("Player Score:" + playerScore + " " + "Computer Score:" + aiScore);
            totalGames++;
            Game(playerScore,aiScore,totalGames, aiWins, playerWins, draws);
        }

    }

}
