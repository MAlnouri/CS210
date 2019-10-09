/* 
 * CS210 Ch2 Exercise 15
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Ex15 {
	
	public static int c = 5;
	
	public static void lines() {
		
		//prints multiple dashes
		for (int b=1; b <= c; b++) {
			System.out.print("-");
		}
		
	}
	
	public static void printDesign() {
		
		//prints odd numbers 1-9, 1-9 times each on a new line with dashes on each side to center it
		for (int a=1; a <= 9; a+=2) {
			
			//prints the dashes at the start of the new line
			lines();

			
			//prints odd numbers between 1-9, 1-9 times
			for (int b=1; b <= a; b++) {
				System.out.print(a);
			}
			
			//prints the dashes on the end of the line
			lines();
			
			//decreases the number of lines printed on each side for next loop
			c--;
			
			//begins a new line between each loop
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		printDesign();

	}

}
