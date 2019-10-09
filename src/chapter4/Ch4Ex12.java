/* 
 * CS210 Ch4 Exercise 12
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;
import java.util.*;

public class Ch4Ex12 {
	
	public static void printTriangleType(Scanner console) {
		//requests and stores input for the base of the triangle
		System.out.println("Enter base triangle length");
		int sidebase = console.nextInt();
		//requests and stores input for the first side of the triangle
		System.out.println("Enter first triangle side length");
		int side1 = console.nextInt();
		//requests and stores input for the second side of the triangle
		System.out.println("Enter second triangle side length");
		int side2 = console.nextInt();
		//if 1 side is greater than the sum of the other 2, throws an exception
		if(side1 > (side2 + sidebase) || side2 > (side1 + sidebase) || sidebase > (side1 + side2)) {
			throw new IllegalArgumentException("a side is too long");
		}
		//compares the sides and prints the type of triangle given
		if(sidebase == side1 && side1 == side2) {
			System.out.println("This is an equilateral triangle.");
		} else if(side1 == side2 || side1 == sidebase || side2 == sidebase) {
			System.out.println("This is an isosceles triangle.");
		} else if(side1 != side2 && side1 != sidebase && side2 != sidebase) {
			System.out.println("This is an scalene triangle.");
		}
		
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printTriangleType(console);

	}

}
