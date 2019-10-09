/* 
 * CS210 Ch2 Exercise 12
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Ex12 {

	public static void main(String[] args) {
		
		//repeats the loops to print it 3 times on separate lines
		for (int c=1; c <= 3; c++) {
			
				//repeats to print numbers 0-9 3 times each on the same line
				for (int a=0; a <= 9; a++) {
			
					//prints the value of 'a' 3 times
					for (int b=1; b <= 3; b++) {
						System.out.print(a);
				
					}
			
				}
		
				//begins a new line between each loop
				System.out.println();
		}

	}

}
