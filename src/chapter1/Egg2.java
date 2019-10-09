/* 
 * CS210 Exercise 10
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class Egg2 {
	
	public static void topEgg() {
		System.out.println("  _______");
		System.out.println(" /       \\");
		System.out.println("/         \\");
	}
	
	public static void midEgg() {
		System.out.println("-\"-'-\"-'-\"-");
		
	}
	
	public static void botEgg() {
		System.out.println("\\         /");
		System.out.println(" \\_______/");
		
	}

	public static void main(String[] args) {
		topEgg();
		botEgg();
		System.out.println();
		midEgg();
		topEgg();
		botEgg();
		System.out.println();
		midEgg();
		botEgg();
		topEgg();
		midEgg();
		botEgg();

	}

}
