/* 
 * CS210 Ch3 Exercise 02
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;

public class Ch3Ex02 {
	
	//prints all values for power of 2 from 0 to the given integer
	public static void printPowersOf2(int power) {
		
		int a = 1;
		//prints 2^0
		System.out.print("1 ");
		
		for(int i = 1; i <= power; i++) {
			//will multiply by 2, and set the new value as (a*2) for the next loop
			a *= 2;
			//prints the new value
			System.out.print(a + " ");
		}
		//begins new line after the loop ends
		System.out.println();
	}

	public static void main(String[] args) {
		printPowersOf2(3);
		printPowersOf2(10);

	}

}
