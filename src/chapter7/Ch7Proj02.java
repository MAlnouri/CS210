/* 
 * CS210 Ch7 Project 02
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;
import java.util.Arrays;
import java.util.Scanner;

public class Ch7Proj02 {
	
	public static void hangMan(Scanner a) {
		//creates an array for guessed letters
		char letters[] = new char[26];
		int guesses = 0;
		//ends loops when guessed all letters
		while(guesses != 26) {
			//asks and stores input of a char
			System.out.println("Guess a letter: ");
			char guess = a.next().charAt(0);
			//a test value for guessed letters
			boolean guessed = false;
			//tests each stored element to the guessed letter
			for(char element: letters) {
				if(guess == element) {
					guessed = true;
				}
				
			}
			//increments guesses if its a unique guess and stores the guess
			if(!guessed) {
				letters[guesses] = guess;
				guesses++;
			}
			//prints the guessed letters
			System.out.println(Arrays.toString(letters));
		}

	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Lets play Hangman.");
		hangMan(console);
		

	}

}
