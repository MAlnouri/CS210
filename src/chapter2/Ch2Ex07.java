/* 
 * CS210 Ch2 Exercise 07
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Ex07 {

	public static void main(String[] args) {
		
		//prints numbers 1-5 with decreasing spacing on each new line
		for (int a=1; a <= 5; a++) {
			
			//prints a space for the difference between 'a' and 'b'
			for (int b=5; b >= a+1; b--) {
				System.out.print(" ");
				
			}
			//prints the value of 'a' at the end of each line
			System.out.print(a);
			//begins a new line between each loop
			System.out.println();
		}

	}

}
