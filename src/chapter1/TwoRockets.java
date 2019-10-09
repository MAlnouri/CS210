/* 
 * CS210 Exercise 11
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class TwoRockets {
	
	public static void rocketTip() {
		System.out.println("   /\\       /\\ ");
		System.out.println("  /  \\     /  \\ ");
		System.out.println(" /    \\   /    \\ ");
		
	}
	
	public static void rocketBox() {
		System.out.println("+------+ +------+");
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
		System.out.println("+------+ +------+");
		
	}
	
	public static void rocketUSA() {
		System.out.println("|United| |United|");
		System.out.println("|States| |States|");
		
	}
		

	public static void main(String[] args) {
		rocketTip();
		rocketBox();
		rocketUSA();
		rocketBox();
		rocketTip();



	}

}
