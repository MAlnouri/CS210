/* 
 * CS210 Ch2 Exercise 06
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Ex06 {

	public static void main(String[] args) {
		
		
		for (int a=1; a <= 7; a++) {
			
			//prints the value of 'a' until 'b' reaches that value
			for (int b=1; b <= a; b++) {
				System.out.print(a);
			}
			
			//begins a new line between each loop
			System.out.println();
		}

	}

}
