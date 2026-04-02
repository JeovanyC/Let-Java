import java.util.Random;
import java.util.Scanner;

public class GuessNumber{

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
       
        // true -> game can continue
        // false -> game has finish
        boolean game_status = true;

        while (game_status) {
	  System.out.println("I'm thinking of a number between 1 and 100");
	  System.out.println("(including both). Can you guess what it is?");
        
	  int unknown_number = rand.nextInt(100) + 1;
	  int chances = 0;
	  boolean guessed = false;
	 	  
	  while (chances < 100) {
	      int player_guess = takeGuess(in);
	      chances++;
	      
	      if (checkGuess(unknown_number, player_guess)) {
		guessed = true;
		break;
		}
	  }
	  if (!guessed ) {
	      System.out.println("You ran out of guesses!");
	      System.out.printf("The number I was thinking of is: %d%n", to_guess);
	  }
	  System.out.print("Want to play again? (Y or N)");
	  char answer = in.nextLine().toUpperCase();
		
	  if (answer.equals("Y")) {
	      System.out.println("Resetting the game...");   
	  } else {
	      game_status = false;
	  }
        }
        in.close();
    }

    public static int takeGuess(Scanner in) {

        int player_guess;
        System.out.print("Type a number (1-100) or Q to quit: ");
        while(true) {

	  if (in.hasNextInt()) {
	      player_guess = in.nextInt();
	      in.nextLine();
	      
	      if (player_guess >= 1 && player_guess <= 100) {
		
		System.out.printf("Your guess is: %d%n", player_guess);
		return player_guess;
	      } else {
		char temp = in.nextLine().toUpperCase();

		if (input.equals("Q")) {
		    System.exit(0);
		} else {
		    System.out.println("Invalid input");
		}
	      }
	  }
        }
    
    public static boolean checkGuess(int unknown_number, int guess) {

        if (unknown_number == guess) {
	  System.out.printf("You guessed right! It was %d%n", guess);
	  return true;
        } else if (unknown_number > guess) {
	  System.out.println("To high");
        } else if (unknown_number < guess) {
	  System.out.println("To low");
        }
        return false;
    }
}
