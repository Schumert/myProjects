import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int wins = 0;
		int losses = 0;

		System.out.println("Welcome to Rock-Paper-Scissors! Please enter \"rock\", \"paper\", \"scissors\", or \"quit\" to exit.");

		while (true) {
		    System.out.println("-------------------------");
		    System.out.print("Enter your move: ");
		    String playerMove = input.nextLine();

		    if (playerMove.equals("quit")) {
		        System.out.println("You won " + wins + " times and lost " + losses + " times.");
		        System.out.println("Thanks for playing! See you again.");
		        break;
		    }
		    if (Arrays.stream(Move()).noneMatch(x -> x.equals(playerMove))) {
		        System.out.println("Your move isn't valid!");
		        continue;
		    }
		    

		    String computerMove = getComputerMove();

		    if (playerMove.equals(computerMove)) {
		        System.out.println("It's a tie!");
		    } else if (isPlayerWin(playerMove, computerMove)) {
		        System.out.println("You won!");
		        wins++;
		    } else {
		        System.out.println("You lost!");
		        losses++;
		    }
		}

	}
	private static String[] Move() {
		String[] moves = {"rock", "scissors", "paper"};
		return moves;
	}
	private static String getComputerMove() {
	    Random random = new Random();
	    int randomNumber = random.nextInt(3);
	    String computerMove = Move()[randomNumber];
	    System.out.println("Computer move: " + computerMove);
	    return computerMove;
	}
	private static boolean isPlayerWin(String playerMove, String computerMove) {
	    return playerMove.equals(Move()[0]) && computerMove.equals(Move()[1])
	            || (playerMove.equals(Move()[1]) && computerMove.equals(Move()[2]))
	            || (playerMove.equals(Move()[2]) && computerMove.equals(Move()[0]));
	}
}
