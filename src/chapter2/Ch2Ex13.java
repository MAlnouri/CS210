/* 
 * CS210 Ch2 Exercise 13
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Ex13 {

	public static void main(String[] args) {
		
		//repeats the loops to print it 5 times on separate lines
		for (int c=1; c <= 5; c++) {
			
				//repeats to print numbers 0-9 5 times each on the same line
				for (int a=9; a >= 0; a--) {
			
					//prints the value of 'a' 5 times
					for (int b=1; b <= 5; b++) {
						System.out.print(a);
				
					}
			
				}
		
				//begins a new line between each loop
				System.out.println();
		}

	}

}
