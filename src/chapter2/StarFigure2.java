/* 
 * CS210 Ch2 Exercise 21
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class StarFigure2 {
	
	//dictates the number of lines to print for the loop
	public static int height = 6;


	public static void main(String[] args) {
		
			
			//draws a figure with increasing number of stars in the center, and decreasing number of slashes on each side
			for (int a=0; a+1 <= height; a++) {
			
				//prints forward slashes to align to the left side of the figure
				for (int b=20; b > a*4 ; b--) {
					System.out.print("/");
								
				}
				
				//prints stars between the slashes
				for (int c=1; c <= a*8; c++) {
					System.out.print("*");
					
				}
				
				//prints back slashes to align to the right side of the figure
				for (int d=20; d > a*4; d--) {
					System.out.print("\\");
					
				}			
				//begins a new line between each loop
				System.out.println();
				
			}
			
		}

	}
