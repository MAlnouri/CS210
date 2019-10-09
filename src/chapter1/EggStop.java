/* 
 * CS210 Exercise 15
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class EggStop {
	
	public static void topEgg() {
		System.out.println("  ________");
		System.out.println(" /        \\");
		System.out.println("/          \\");
	}
	
	public static void shortDash() {
		System.out.println(" +--------+");
		
	}
	
	public static void longDash() {
		System.out.println("+----------+");
		
	}
	
	public static void stopSign() {
		System.out.println("|   STOP   |");
		
	}
	
	public static void botEgg() {
		System.out.println("\\          /");
		System.out.println(" \\________/");
		
	}

	public static void main(String[] args) {
		topEgg();
		botEgg();
		botEgg();
		shortDash();
		System.out.println();
		
		topEgg();
		stopSign();
		botEgg();
		topEgg();
		longDash();
	}

}
