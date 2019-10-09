/* 
 * CS210 Project 05
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class JackHouse {
	
	public static void house() {
		System.out.println("That lay in the house that Jack built.");
		System.out.println("");
	}

	public static void rat() {
		System.out.println("That ate the malt");
		house();
		
	}
	
	public static void cat() {
		System.out.println("That killed the rat,");
		rat();
		
	}
	
	public static void dog() {
		System.out.println("That worried the cat,");
		cat();
		
	}
	
	public static void cow() {
		System.out.println("That tossed the dog,");
		dog();
		
	}
	
	public static void maiden() {
		System.out.println("That milked the cow with the crumpled horn,");
		cow();
		
	}
	
	public static void verse1() {
		System.out.println("This is the house that Jack built.");
		System.out.println("This is the malt");
		house();
	}
	
	public static void verse2() {
		System.out.println("This is the rat,");
		rat();
	}
	
	public static void verse3() {
		System.out.println("This is the cat,");
		cat();
	}
	
	public static void verse4() {
		System.out.println("This is the dog,");
		dog();
	}
	
	public static void verse5() {
		System.out.println("This is the cow with the crumpled horn,");
		cow();
	}
	
	public static void verse6() {
		System.out.println("This is the maiden all forlorn");
		maiden();
	}
	
	public static void main(String[] args) {
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();

	}

}
