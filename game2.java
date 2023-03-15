import java.util.Scanner;
import java.util.Random;

public class game2 {
    public static void main(String[] args) {
        int player1TurnScore = 0;
        int player1TotalScore = 0;
        int player2TurnScore = 0;
        int player2TotalScore = 0;
        int dice;
        int dice2;
        String input = "r";
        char repeat;
    
        Scanner keyboard = new Scanner(System.in);
        Random diceRoll = new Random();
    
        System.out.println("Welcome to the game of Pig!\n");
    
        while(player1TotalScore < 100 || player2TotalScore < 100){
            // human's turn
            do{
                dice = diceRoll.nextInt(6) + 1;
                System.out.println("You rolled a " + dice);
    
                if(dice == 1){
                    player1TurnScore = 0;
                    System.out.println("You lose your turn!");
                    System.out.println("Your total score is " + player1TotalScore);
                    break;
                }else{
                    player1TurnScore += dice;
                    System.out.println("Your turn score is " + player1TurnScore);
                    System.out.println("And your total score is " + player1TotalScore);
                    System.out.println("If you hold, " + player1TurnScore + " points will be added to your total score.");
                    System.out.println("Enter 'r' to roll again, or 'h' to hold.");
                    input = keyboard.nextLine();
                    repeat = input.charAt(0);
    
                    if(repeat == 'h'){
                        break;
                    }
                }
            }while(input.equalsIgnoreCase("r") || dice != 1);
    
            player1TotalScore += player1TurnScore;
            System.out.println("Your score is " + player1TotalScore);
            player1TurnScore = 0;
    
            if(player1TotalScore >= 100){
                System.out.println("Your total score is " + player1TotalScore);
                System.out.println("PLAYER 1 WINS!");
                break;
            }
    
            // Player 2's turn
            System.out.println();
            System.out.println("It is Player 2's turn.");
            do{
                dice2 = diceRoll.nextInt(6) + 1;
                System.out.println("You rolled a " + dice2);
    
                if(dice2 == 1){
                    player2TurnScore = 0;
                    System.out.println("You lose your turn!");
                    System.out.println("Your total score is " + player2TotalScore);
                    break;
                }else{
                    player2TurnScore += dice2;
                    System.out.println("Your turn score is " + player2TurnScore);
                    System.out.println("And your total score is " + player2TotalScore);
                    System.out.println("If you hold, " + player2TurnScore + " points will be added to your total score.");
                    System.out.println("Enter 'r' to roll again, or 'h' to hold.");
                    input = keyboard.nextLine();
                    repeat = input.charAt(0);
    
                    if(repeat == 'h'){
                        break;
                    }
                }
            }while(input.equalsIgnoreCase("r") || dice2 != 1);
    
            player2TotalScore += player2TurnScore;
            System.out.println("Your score is " + player2TotalScore);
            player2TurnScore = 0;
    
            if(player2TotalScore >= 100){
                System.out.println("Your total score is " + player2TotalScore);
                System.out.println("PLAYER 2 WINS!");
                break;
            }
        }
}
}