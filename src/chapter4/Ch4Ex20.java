/* 
 * CS210 Ch4 Exercise 20
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;

public class Ch4Ex20 {
	
	public static int numUnique(int x, int y, int z) {
		int unique = 0;
		//returns 1 unique integer if all 3 values are equal
		if(x == y && y == z) {
			unique = 1;
		//returns 2 unique integers if 2 of any are equal
		} else if((x == y && x != z) || (x == z && x != y) || (y == z && y != x)) {
			unique = 2;
		//returns 3 unique integers
		} else {
			unique = 3;
		}
		//returns the value to the method
		return unique;
	}

	public static void main(String[] args) {
		System.out.println(numUnique(1, 2, 3));

	}

}
