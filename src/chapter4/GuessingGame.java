/* 
 * CS210 Ch4 Project 3 Guessing Game
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.18 - Fall
 * This program will ask the user for a number range
 * and repeat attempts until it guesses their number correctly
 */

package chapter4;
import java.util.*;

public class GuessingGame {
	
	//sets the variables to be used in the methods
	//holds the max number to guess
	public static int max = 0;
	//holds the min number to guess
	public static int min = 0;
	//holds the range between the max and min
	public static int range = 0;
	//holds the number of turns the computer takes
	public static int turns = 0;
	//holds the players' response
	public static String answer = "placeholder";
	
	//this method sets up the variables for the guessing game before it begins
	public static void setup(Scanner console) {
		//user inputs the max range
		System.out.println("Enter the max range:");
		max = console.nextInt();
		//user inputs the min range
		System.out.println("Enter the min range:");
		min = console.nextInt();
		//states the range of the players' number
		System.out.println("Player is thinking of a number between " + min + " and " + max + ".");
		//sets the current turn to 1
		turns = 1;
		
		//variations of low, high and correct will work, including capital letters, or just an L, H or C.
		//the code only checks if the words contains an upper or lower case l, h or c within the user input
		System.out.println("The computer will now try to guess your number. Respond with 'low', 'high', or 'correct'.");
		//begins the computer guessing
		guess(console);
	}
	
	public static void guess(Scanner console) {
		//sets the new range for the computer to guess between
		range = max - min;
		//stores the computers guess
		double guess = (Math.random()*range) + min;
		//sets computers guess to an integer and prints it
		System.out.println("Computer guesses: " + (int)guess);
		//asks the user for input on the guess (must use 'high', 'low' or 'correct')
		System.out.println("Was the number too high, too low or correct?");
		//stores the user response
		answer = console.next();
		
		//if the user responds with 'high'
		if(answer.contains("h") || answer.contains("H") ) {
			System.out.println("Player says this number is too high.");
			//makes the new max range equal to the previous guess
			max = ((int)guess);
			//updates the turn counter
			turns++;
			//reruns the guess method
			guess(console);

		//if the user responds with 'low'
		} else if(answer.contains("l") || answer.contains("L")) {
			System.out.println("Player says this number is too low.");
			//makes the new min range equal to the previous guess
			min = ((int)guess);
			//updates the turn counter
			turns++;
			//reruns the guess method
			guess(console);

		//if the user responds with 'correct'
		} else if(answer.contains("c") || answer.contains("C")) {
			System.out.println("Player says this number is correct.");
			System.out.println("Game finished. It took the computer " + turns + " turn(s).");
			//states the game is complete and asks the user if they want to play another round
			System.out.println("Would you like to play another round?");
			//stores the users input
			String round = console.next();
			
			//if the users input beings with 'y' or 'Y', it will interpret it as 'yes' and will rerun the method
			if(round.charAt(0) == 'Y'|| round.charAt(0) == 'y') {
				System.out.println("Lets play again!");
				setup(console);
				
			//if the users input beings with 'n' or 'N', it will interpret it as 'no' and the program will terminate
			} else if(round.charAt(0) == 'N'|| round.charAt(0) == 'n') {
				System.out.println("Thank you for playing!");
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		//runs the game
		setup(console);
		
	}

}
