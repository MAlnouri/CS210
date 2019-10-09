/* 
 * CS210 Ch2 Exercise 08
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Ex08 {

	public static void main(String[] args) {

		//prints numbers 1-5, 1-5 times on new lines aligned to the right
		for (int a=1; a <= 5; a++) {
			
			//prints spaces to align the value of 'a' to the right
			for (int b=5; b >= a+1; b--) {
				System.out.print(" ");
								
			}
			
			//prints the value of a after the spaces, 'a' number of times
			for (int c=1; c <= a; c++) {
				System.out.print(a);
				
			}
			
			//begins a new line between each loop
			System.out.println();	
		}

	}

}
