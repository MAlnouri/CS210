/* 
 * CS210 Ch5 Project 05
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;
import java.util.*;

public class Ch5Proj05 {
	
	public static void rpsGame(Scanner a) {
		Random r = new Random();
		//prompts the user to play and pick a weapon
		System.out.println("Lets play Rock Paper Scissors! Choose your weapon.");
		String pick = a.next();
		//sets a variable for the players pick
		int player = 0;
		//if the string begins with r, assumes you chose rock
		if(pick.charAt(0) == 'r' || pick.charAt(0) == 'R') {
			System.out.println("You chose Rock.");
			player = 0;
		}
		//if the string begins with p, assumes you chose paper
		if(pick.charAt(0) == 'p' || pick.charAt(0) == 'P') {
			System.out.println("You chose Paper.");
			player = 1;
		}
		//if the string begins with s, assumes you chose scissors
		if(pick.charAt(0) == 's' || pick.charAt(0) == 'S') {
			System.out.println("You chose Scissors.");
			player = 2;
		}
		//the computer will randomly pick a weapon based on the roll between 0-2
		int computer = r.nextInt(3);
		//prints the computers choice based on the number rolled
		if(computer == 0) {
			System.out.println("I choose Rock.");
		}
		if(computer == 1) {
			System.out.println("I choose Paper.");
		}
		if(computer == 2) {
			System.out.println("I choose Scissors.");
		}
		//if the weapons(numbers) are equal, the game ends in a draw
		if(player == computer) {
			System.out.println("The game is a draw!");
		}
		//player chose rock, win/lose depending on computer choice
		if(player == 0) {
			if(computer == 1) {
				System.out.println("I win!");
			}
			if(computer == 2) {
				System.out.println("Player wins!");
			}
		}
		//player chose paper, win/lose depending on computer choice
		if(player == 1) {
			if(computer == 0) {
				System.out.println("Player wins!");
			}
			if(computer == 2) {
				System.out.println("I win!");
			}
			
		}
		//player chose scissors, win/lose depending on computer choice
		if(player == 2) {
			if(computer == 0) {
				System.out.println("I win!");
			}
			if(computer == 1) {
				System.out.println("Player wins!");
			}
			
		}
		//prompts the user to play again, reruns method if yes
		System.out.println("Would you like to play again?");
		String play = a.next();
		if(play.charAt(0) == 'y' || play.charAt(0) == 'Y') {
			rpsGame(a);
		}
		//terminates the program
		System.out.println("Thank you for playing!");
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		rpsGame(console);

	}

}
