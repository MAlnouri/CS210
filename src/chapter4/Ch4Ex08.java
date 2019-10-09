/* 
 * CS210 Ch4 Exercise 08
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;
import java.util.*;

public class Ch4Ex08 {
	
	public static void smallestLargest(Scanner console) {
		//requests input for how many numbers to enter
		System.out.println("How many numbers do you want to enter?");
		int numbers = console.nextInt();
		//sets the variables for the smallest and largest numbers
		int smallest = 0;
		int largest = 0;
		
		//loops to enter a new number based on the first input
		for(int i = 1; i <= numbers; i++) {
			//sets the new input as x
			int x = console.nextInt();
			//prints out the number
			System.out.println("Number " + i + ": " + x);
			//if x is the smallest number, it replaces the variable
			if(x <= smallest) {
				smallest = x;
			//if x is the largest number, it replaces the variable
			} else if (x >= largest) {
				largest = x;
			}
			
		}
		//prints out the smallest and largest variables
		System.out.println("Smallest; " + smallest);
		System.out.println("Largest: " + largest);
		
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		smallestLargest(console);

	}

}
