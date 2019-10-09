/* 
 * CS210 Ch5 Exercise 19
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;

public class Ch5Ex19 {
	
	public static void firstDigit(int x) {
		//sets the number to absolute value
		int number = Math.abs(x);
		
		//changes the int value into a string
		String num = Integer.toString(number);
		
		//variable for the char of the first digit in the number
		char firstDig = num.charAt(0);
		
		//prints the first digit
		System.out.println("The first digit is " + firstDig + ".");
		
	}

	public static void main(String[] args) {
		firstDigit(-965);

	}

}
