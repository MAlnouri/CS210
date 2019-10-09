/* 
 * CS210 Ch5 Project 02
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;
import java.util.*;

public class Ch5Proj02 {
	
	public static void hangMan(Scanner a) {
		Random r = new Random();
		String s = "0";
		//stores chars guessed
		String guessed = "";
		//stores the number of incorrect guesses
		int wrong = 0;
		//stores the correct letters
		String correctGuesses = "";
		
		//plays the game until it guesses incorrectly 6 times
		while(wrong != 6) {
			//stores a random char between A-Z
			char c = (char)(r.nextInt(26) + 65);
			
			if(guessed.contains(s) == false) {

				System.out.println("Computer guesses " + c + ". Was it right?" );
				//adds the new letter to guessed letters string
				guessed = guessed + c;
				String correct = a.next();
				if(correct.charAt(0) == 'y' || correct.charAt(0) == 'Y') {
					//if the letter was correct, adds it to the correctly guessed letters
					correctGuesses = correctGuesses + c;
					//asks to continue playing if the word hasn't been completed
					System.out.println("Has the word been completed?");
					String play = a.next();
					if(play.charAt(0) == 'y' || play.charAt(0) == 'Y') {
						//terminates the program if user says yes
						System.out.println("Thank you for playing!");
						return;
					}
				} else {
					wrong++;
				}
			
			}
			
		}
		System.out.println("Game over. Computer failed to guess your word.");
		
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//prompts the user to play and stores the number of letters in their word
		System.out.println("Lets play Hangman. Pick a word and tell me how many letters are in it.");
		int numLetters = console.nextInt();
		hangMan(console);
		
	}

}
