/* 
 * CS210 Ch3 Exercise 05
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;

public class Ch3Ex05 {
	
	//prints a grid 
	public static void printGrid(int rows, int columns) {
		for(int a = 1; a <= rows; a++) {
			System.out.print(a + " ");
			
			for(int b = 1; b < columns; b++) {
				//the value printed increments based on the column number, and the total rows
				System.out.print((rows*b+a) + " ");
				
			}
			//begins a new line
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		printGrid(4,6);

	}

}
