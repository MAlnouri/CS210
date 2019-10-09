/* 
 * CS210 Exercise 14
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class Lanterns {
	
	public static void longLant() {
		System.out.println("*************");
		
	}
	
	public static void shortLant() {
		System.out.println("    *****");
		
	}
	
	
	public static void wholeLant() {
		shortLant();
		System.out.println("  *********");
		longLant();
		
	}
	
	public static void midLant() {
		System.out.println("* | | | | | *");
		
	}
	


	public static void main(String[] args) {
		wholeLant();
		System.out.println();
		
		wholeLant();
		midLant();
		longLant();
		wholeLant();
		System.out.println();
		
		wholeLant();
		shortLant();
		midLant();
		midLant();
		shortLant();
		shortLant();

	}

}
