/* 
 * CS210 Ch3 Exercise 18
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;

public class Ch3Ex18 {
	
	//prints each char of a string on a separate line
	public static void vertical(String s) {
		//sets the length of the string as a variable
		int x = s.length();
		//loops for each char until it reaches the strings max length
		for(int i = 0; i < x; i++) {
			//prints the next char in the string on a new line
			System.out.println(s.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		vertical("hey now");

	}

}
