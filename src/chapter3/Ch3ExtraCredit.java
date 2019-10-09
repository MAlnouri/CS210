/* 
 * CS210 Ch3 Extra Credit
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.10 - Fall
 *
 */

package chapter3;

public class Ch3ExtraCredit {

	public static void main(String[] args) {
		
		int x = 42;
		int y = 17;
		int z = 25;
		
		if(y < x && y <= z) {
			System.out.println("The first statement is true.");
		} else {
			System.out.println("The first statement is false.");
		}
		
		if(x % 2 == y || x % 2 == z % 2) {
			System.out.println("The second statement is true.");
		} else {
			System.out.println("The second statement is false.");
		}
		
		if(x <= y + z && x >= y + z) {
			System.out.println("The third statement is true.");
		} else {
			System.out.println("The third statement is false.");
		}
		
		if(!(x < y && x < z)) {
			System.out.println("The fourth statement is true.");
		} else {
			System.out.println("The fourth statement is false.");
		}
		
		if((x + y) % 2 == 0 || !((z - y) % 2 == 0)) {
			System.out.println("The last statement is true.");
		} else {
			System.out.println("The last statement is false.");
		}

	}

}
