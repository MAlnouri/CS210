/* 
 * CS210 Ch3 Project 07
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;

public class Ch3Ex07 {
	
	//returns the highest value of 3 integers after taking their absolute values
	public static int largerAbsVal(int x, int y, int z) {
		//sets the integers as their absolute values
		x = Math.abs(x);
		y = Math.abs(y);
		z = Math.abs(z);
		//sets the value as the highest of the first 2 integers
		int max = Math.max(x, y);
		//sets the value as the highest of all 3 integers
		max = Math.max(max, z);
		return max;
		
	}

	public static void main(String[] args) {
		//prints the highest value
		System.out.println(largerAbsVal(-4,5,2));

	}

}
