/* 
 * CS210 Ch4 Project 07
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;

public class Ch4Proj07 {
	
	public static void main(String[] args) {
		//variable for how many lines on the triangle
		int levels = 11;
		//prints new lines of the triangle
		for(int a = 0; a < levels; a++) {
			//the value to print on the triangle
			int value = 1;
			//prints the spaces based on the line, right aligned
			System.out.printf("%" + (levels-a) * 2 + "s"," ");
			//prints the values on the line of the triangle
			for(int b = 0; b <= a; b++) {
				//prints the value right aligned
				System.out.printf("%4d", value);
				//calculates the new value for the next line
				value = value * (a - b) / (b + 1);
				
			}
			//begins a new line
			System.out.println();
		}
		
	}
	
}
