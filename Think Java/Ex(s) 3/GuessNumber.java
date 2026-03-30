import java.util.Random;
import java.util.Scanner;

public class GuessNumber{

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        
        int unknown_number = rand.nextInt(100) + 1;

        int player_guess = 0;
        while(true) {
	  System.out.print("Type a number: ");

	  if (!in.hasNextInt()) {
	      System.out.println("Invalid input: try integer in range of 1 - 100");
	      in.next();
	      continue;
	  }
	  
	  player_guess = in.nextInt();
	  
	  if (player_guess > 100 || player_guess < 1) {
	      System.out.println("Invalid input: try integer in range of 1 - 100");
	      continue;
	  }
	  break;
	  }
        System.out.printf("Your guess is: %d%n", player_guess);
        
        CheckGuess(unknown_number, player_guess);
        in.close();
    }
    
    public static void checkGuess(int to_guess, int guess) {
        
        System.out.printf("The number I was thinking of is: %d%n", to_guess);
        if (to_guess == guess) {
	  System.out.printf("You guessed right! It was %d%n", guess);
        } else {
	  int out = Math.abs(to_guess - guess);
	  System.out.printf("You were off by: %d%n", out);
        }
    }
}
