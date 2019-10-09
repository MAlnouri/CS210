/* 
 * CS210 Ch5 Exercise 22
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;

public class Ch5Ex22 {
	
	public static boolean allDigitsOdd(int x) {
		//makes a new variable for int x to be changed within the method
		int a = x;
		
		//if a is equal to 0, returns false
		if(a == 0) {
			return false;
		}
		
		//will divide by 10 and test the digit until the int reaches 0
		while(a != 0) {
			//'a' modular 10 gives the final digit as an int value and stores it
			int digit = a % 10;
			//if the final digit modular 2 is equal to 0, the number is even
			//continues the loop otherwise
			if(digit % 2 == 0) {
				//returns and prints false and terminates the program
				System.out.println("This number does not have all odd digits");
				return false;
			}
			//divides a by 10 and sets it as the new int a
			//effectively removes the last digit from the int
			a /= 10;
			
		}
		//while loop ends when it reaches the last digit and will return true and prints the statement
		System.out.println("The number has all odd digits");
		return true;
	}

	public static void main(String[] args) {
		allDigitsOdd(135790);

	}

}
