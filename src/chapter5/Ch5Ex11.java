/* 
 * CS210 Ch5 Exercise 11
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;
import java.util.*;

public class Ch5Ex11 {
	
	public static void threeHeads() {
		Random r = new Random();
		//luck will represent the number of heads flipped in a row
		int luck = 0;
		do {
			//the flip will be represented as an integer value, heads is 0, tails is 1
			int flip = r.nextInt(2);
			if(flip == 0) {
				//prints a heads flip and increments luck to track how many heads in a row
				System.out.print("H  ");
				luck++;
			} else {
				//prints tails flip and resets luck counter for heads
				System.out.print("T  ");
				luck = 0;
			}
			
		} while(luck != 3);
		//terminates the loop and prints the message when 3 heads are flipped in a row
		System.out.print("\nThree heads in a row!");
		
	}

	public static void main(String[] args) {
		threeHeads();

	}

}
