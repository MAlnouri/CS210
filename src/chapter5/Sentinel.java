/* 
 * CS210 Ch5 Project - Sentinel
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.25 - Fall
 * This program will ask for the password and display a menu
 * of programs the user can choose to run
 */

package chapter5;
import java.util.*;

//password is sentinel
public class Sentinel {
	
	public static int choice;
	
	public static void enterPass(Scanner a) {
		//sets the pass to sentinel
		String passcode = "sentinel";
		System.out.println("Enter password: ");
		String pass = a.next();
		//tests the user input and compares it to the password(case insensitive)
		if(pass.toLowerCase().equals(passcode) == false) {
			System.out.println("Incorrect password.");
			enterPass(a);
		} else {
			System.out.println("Login successful.");
		}
		
	}
	
	public static void menu(Scanner a) {
		//prints the menu
		System.out.printf("%50s", "Choose a program to run:\n");
		System.out.printf("%50s", "1. Rock, Paper, Scissors\n");
		System.out.printf("%43s", "2. Tip Calculator\n");
		System.out.printf("%42s", "3. Number Adding\n");
		System.out.printf("%42s", "4. Guessing Game\n");
		System.out.printf("%42s", "5. Choose for me\n");
		System.out.printf("%33s", "6. Exit\n");
		//requests a choice and stores it
		String pick = a.next();
		choice = Character.getNumericValue(pick.charAt(0));
		if(choice > 6 || choice < 1) {
			//if the choice is invalid, prompts again
			System.out.println("That is not a valid choice.\n");
			menu(a);
		}
		
	}
	
	public static void runProgram(Scanner a) {
		Random r = new Random();
		//performs the corresponding task based on the number input
		if(choice == 1) {
			System.out.println("Launching Rock, Paper, Scissors...");
			rpsGame(a);
		}
		
		if(choice == 2) {
			System.out.println("Launching Tip Calculator...");
			tip(a);
		}
		
		if(choice == 3) {
			System.out.println("Launching Number Adding...");
			adding(a);
		}
		
		if(choice == 4) {
			System.out.println("Launching Guessing Game...");
			setup(a);
		}
		
		if(choice == 5) {
			//randomly selects a number between 1-4 and selects that program
			System.out.println("You asked for a random program. Now launching...");
			choice = r.nextInt(4) + 1;
			runProgram(a);
		}
		
		if(choice == 6) {
			//terminates when exit is chosen
			System.out.println("Terminating program...");

		}
		
	}
	
	public static void adding(Scanner a) {
		Random r = new Random();
		int wrong = 0;
		int points = 0;
		while(wrong != 3) {
			//randomly chooses the number of numbers to add
			int numbers = r.nextInt(4) + 2;
			//sets the sum to 0
			int sum = 0;
			//fence post for the loop
			int firstNumber = r.nextInt(10) + 1;
			sum += firstNumber;
			System.out.print(firstNumber);
			//prints and adds the numbers together
			for(int i = 2; i <= numbers; i++);{
				int nextNumber = r.nextInt(10) + 1;
				System.out.print(" + " + nextNumber);
				sum += nextNumber;
				
			}
			System.out.print(" = ");
			//stores user answer
			int guess = a.nextInt();
			if(guess != sum) {
				//if sum was incorrect, increments wrong answers
				System.out.println("That answer was incorrect.");
				wrong++;
			} else {
				//if answer was right, increments their points
				points++;
			}	
			
		}
		//ends the program and prints their points
		System.out.println("You earned " + points + " points!");
		
	}
	
	public static void tip(Scanner a) {
		
		double subtotal = 0.0;
		//sets the tax rate
		double tax = 1.09;
		//sets the tip rate
		double tip = 1.15;
		
		//asks and stores how many people to calculate for
		System.out.println("How many people are eating?");
		int people = a.nextInt();
		for(int i = 1; i <= people; i++) {
			//asks and stores the cost for each person, adding it to the total
			System.out.println("Person " + i + " . How much did your meal cost?");
			subtotal += a.nextDouble();
		}
		
		//prints out the full receipt
		double total = subtotal * tax * tip;
		System.out.printf("Subtotal: " + "%7.2f\n", subtotal);
		System.out.printf("Tax: " + "%10.2f\n", tax);
		System.out.printf("Tip: " + "%10.2f\n", tip);
		System.out.printf("Total: " + "%10.2f\n", total);

		
	}
	
	
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
		/* Heuristics
		 * data is for each method is kept within itself unless required within another method
		 * main method summarizes what the overall program is doing
		 * giving each method its own set of responsibilities and tasks
		 * calling them within the main method, returning to main after each one completes
		 * each method can run without too much dependance on the other methods
		 */
		enterPass(console);
		menu(console);
		runProgram(console);

	}

}
