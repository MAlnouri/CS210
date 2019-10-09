/* 
 * CS210 Exercise 13
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class StarFigures {
	
	public static void starLine() {
		System.out.println("*****");
		
	}
	
	public static void starX() {
		System.out.println(" * *");
		
	}
	
	public static void starCenter() {
		System.out.println("  *");
		
	}

	public static void main(String[] args) {
		starLine();
		starLine();
		starX();
		starCenter();
		starX();
		
		System.out.println();
		starLine();
		starLine();
		starX();
		starCenter();
		starX();
		starLine();
		starLine();
		
		System.out.println();
		starCenter();
		starCenter();
		starCenter();
		starLine();
		starLine();
		starX();
		starCenter();
		starX();


	}

}
