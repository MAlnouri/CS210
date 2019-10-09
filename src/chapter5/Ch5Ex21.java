/* 
 * CS210 Ch5 Exercise 21
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;

public class Ch5Ex21 {
	
	//this method reverses a strings characters, int x determines whether to skip the first char
	public static String reverse(String s, int x) {
		//sets the new string
		String New = "";
		if(x == 1) {
			//if x is 1, representing odd number of digits, begins the string at 1
			for(int i = 1; i < s.length(); i++) {
				//adds the next char in the loop to the string
				New = s.charAt(i) + New;
			}
			//adds the first digit to the start of the string
			New = s.charAt(0) + New;
		} else {
			for(int i = 0; i < s.length(); i++) {
			//adds the next char in the loop to the string
			New = s.charAt(i) + New;
			
			}
		}
		//prints the new string
		System.out.println(New);
		//returns the New string once the loop has finished creating the new string
		return New;
	}
	
	public static void swapDigitPairs(int n) {
		//sets the number to absolute value
		int number = Math.abs(n);
		
		//changes the int value into a string
		String num = Integer.toString(number);
		
		//gets the length of the string
		int Length = num.length() -1;
		
		//boolean value to determine if the number has an odd number of digits
		boolean odd;
		
		//if length has no remainder divided by 2, it has an even number of digits
		if(Length % 2 == 0) {
			//sets boolean to false since it is an even number of digits
			odd = false;
		} else {
			//sets boolean to true since it is an odd number of digits
			odd = true;
		}
		
		if(odd == true) {
			//calls the method to reverse the string
			reverse(num, 0);
			
		} else {
			//calls the method to reverse the string
			reverse(num, 1);
			
		}
		
	}

	public static void main(String[] args) {
		swapDigitPairs(1234567);

	}

}
