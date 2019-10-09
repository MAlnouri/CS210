/* 
 * CS210 Project 06
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class BoughtCat {

	public static void cat() {
		System.out.println("Cat goes fiddle-i-fee.");
		System.out.println();
		
	}
	
	public static void hen() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
		cat();
		
	}
	
	public static void duck() {
		System.out.println("Duck goes quack, quack,");
		hen();
		
	}
	
	public static void goose() {
		System.out.println("Goose goes hissy, hissy,");
		duck();
		
	}
	
	public static void sheep() {
		System.out.println("Sheep goes baa, baa,");
		goose();
		
	}
	
	public static void verse1() {
		System.out.println("Bought me a cat and the cat pleased me,");
		System.out.println("I fed my cat under yonder tree.");
		cat();
	}
	
	public static void verse2() {
		System.out.println("Bought me a hen and the hen pleased me,");
		System.out.println("I fed my hen under yonder tree.");
		hen();
	}
	
	public static void verse3() {
		System.out.println("Bought me a duck and the duck pleased me,");
		System.out.println("I fed my duck under yonder tree.");
		duck();
	}
	
	public static void verse4() {
		System.out.println("Bought me a goose and the goose pleased me,");
		System.out.println("I fed my goose under yonder tree.");
		goose();
	}
	
	public static void verse5() {
		System.out.println("Bought me a sheep and the sheep pleased me,");
		System.out.println("I fed my sheep under yonder tree.");
		sheep();
	}

	public static void main(String[] args) {
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();

	}

}
