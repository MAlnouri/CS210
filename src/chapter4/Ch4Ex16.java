/* 
 * CS210 Ch4 Exercise 16
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;
import java.util.*;

public class Ch4Ex16 {
	
	public static void printPalindrome(Scanner console) {
		//requests and stores a word
		System.out.println("Type any word");
		String s = console.next();
		//sets the string to lowercase
		String word = s.toLowerCase();
		//stores the length of the string
		int length = s.length() - 1;
		//a variable storing if the word is a palindrome
		boolean palindrome = true;

		
		for(int i = 0; i <= length; i++) {
			//checks if the chars are the same, if they are not, updates palindrome to be false
			if(word.charAt(i) != word.charAt(length)) {
				palindrome = false;
			}
			//decreases length value for next loop
			length--;
		}
		//prints if the word is palindrome or not
		if(palindrome == true) {
			System.out.println("This word is a Palindrome.");
		} else {
			System.out.println("This word is not a Palindrome.");
		}
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printPalindrome(console);
	}

}
