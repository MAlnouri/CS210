/* 
 * CS210 Ch3 Exercise 04
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;

public class Ch3Ex04 {
	
	//method that draws a square of numbers between the integers given
	public static void printSquare(int x, int y) {
		
		for(int a = x; a <= y; a++) {
			
			for(int b = x; b <= y; b++) {
				//prints the increasing value of a each loop
				System.out.print(a);
				
				/*
				restricts the printed number to be within the integers given
				if a is not equal to y, it will assign it a new value of x
				if a is equal to y, it will assign it a new value of a+1
				*/
				a = (a == y) ? x : a + 1;
			}
			//begins a new line in the loop
			System.out.println();
		}

	}

	public static void main(String[] args) {
		printSquare(3,7);

	}

}
