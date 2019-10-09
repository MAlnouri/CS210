/* 
 * CS210 Ch2 Project 05
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Proj5 {
	
	//an increasing value for the spacing between each new set of stairs
	public static int space = 1;
	//an increasing value for the spacing between each new set of stairs
	public static int space2 = 0;
	
	//draws the open spaces between the stairs
	public static void spacing() {
		System.out.print("*");
		for (int s=1; s <= space*5; s++) {
			System.out.print(" ");
			
		}
		System.out.print("*");
		System.out.println();
	}
	
	//draws the open spaces at the foot of the stairs
	public static void spacing2() {
		for (int s=1; s <= space2*5; s++) {
			System.out.print(" ");
			
		}
		System.out.print("*");
		space2++;
	}
	
	//draws the face of the stick figure
	public static void face() {
		System.out.print(" o  ");

	}
	
	//draws the body of the stick figure and the stairs
	public static void body() {
		System.out.print("/|\\ ");
		spacing();
	}
	
	//draws the legs of the stick figure and the stairs
	public static void legs() {
		System.out.print("/ \\ ");
		spacing();
		space++;

	}

	
	//this value determines the number of people and stairs the program will draw
	public static int stairs = 5;

	public static void main(String[] args) {

		//draws the people and stairs
		for (int a=1; a <= stairs; a++) {
			
			//draws the spaces to the left of each person
			for (int b=1; b <= (stairs*5)-(a*5); b++) {
				System.out.print(" ");
				
			}
			face();
			
			//draws the top of the stairs
			for (int c=1; c <= 6; c++) {
					
				System.out.print("*");

			}
			spacing2();
			//begins new line for the figure
			System.out.println();
			
			//draws the spaces to the left of each person
			for (int b=1; b <= (stairs*5)-(a*5); b++) {
				System.out.print(" ");
				
			}
			body();

			//draws the spaces to the left of each person
			for (int b=1; b <= (stairs*5)-(a*5); b++) {
				System.out.print(" ");
				
			}
			legs();

			
		}
		
		//draws the bottom of the stairs
		for (int s=1; s <= (stairs+1)*5+1; s++) {
			System.out.print("*");
			
		}

	}

}
