/* 
 * CS210 Ch2 Project 01
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Proj1 {
	
	//dictates the number of forward slashes that will be printed (divided by 2)
	public static int fslash = 6;
	//dictates the number of back slashes that will be printed (divided by 2)
	public static int bslash = 0;
	

	public static void main(String[] args) {

		//draws the entire figure using loops
		for (int a=1; a <= 7; a++) {
			
			//draws a decreasing number of stars based on the line number
			for (int s=6; s >= a; s--) {
				System.out.print("*");
				
			}
			
			//draws an increasing number of spaces based on the line number
			for (int d=1; d <= a; d++) {
				System.out.print(" ");
				
			}

			//draws a decreasing number of forward slashes based on the line number
			for (int b=1; b <= fslash*2; b++) {
				System.out.print("/");
				
			}
			//decreases the number of forward slashes to print on the next line
			fslash--;

			//draws an increasing number of back slashes based on the line number
			for (int c=1; c <= bslash*2; c++) {
				System.out.print("\\");
				
			}
			//increases the number of back slashes to print on the next line
			bslash++;
			
			//draws an increasing number of spaces based on the line number
			for (int d=1; d <= a; d++) {
				System.out.print(" ");
				
			}
			
			//draws a decreasing number of stars based on the line number
			for (int s=6; s >= a; s--) {
				System.out.print("*");
				
			}
			//begins a new line for the loop
			System.out.println();
			
		}
		
	}

}
