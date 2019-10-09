/* 
 * CS210 Ch4 Project 03
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;

import java.util.Scanner;

public class Ch4Proj03 {
	
	public static double gpa(Scanner console) {
		//asks user for GPA and stores the value
		System.out.println("What is your GPA?");
		double a = console.nextDouble();
		return a;
	}
	
	public static int sat(Scanner console) {
		//asks user for SAT score and stores the value
		System.out.println("What is your SAT score?");
		int b = console.nextInt();
		return b;
	}
	
	public static int act(Scanner console) {
		//asks user for ACT score and stores the value
		System.out.println("What is your ACT score?");
		int c = console.nextInt();
		return c;
	}
	
	public static void compare(Scanner console) {
		//requests and stores scores for student 1
		double gpa1 = gpa(console);
		int sat1 = sat(console);
		int act1 = act(console);
		//requests and stores scores for student 2
		double gpa2 = gpa(console);
		int sat2 = sat(console);
		int act2 = act(console);
		//compares the scores and accepts the student with 2 or more greater scores
		if((gpa1 > gpa2 && sat1 > sat2) || (sat1 > sat2 && act1 > act2) || (gpa1 > gpa2 && act1 > act2)) {
			System.out.println("Student 1 is accepted!");
		} else {
			System.out.println("Student 2 is accepted!");
		}
		
}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		compare(console);
	}

}
