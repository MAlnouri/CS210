/* 
 * CS210 Ch4 Exercise 10
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;
import java.util.*;

public class Ch4Ex10 {
	
	public static void printGPA(Scanner console) {
		//requests and stores input for students name
		System.out.println("Enter student's name");
		String name = console.nextLine();
		//requests and stores input for number of classes
		System.out.println("Enter number of classes");
		int classes = console.nextInt();
		double total = 0.0;
		
		for(int i = 1; i <= classes; i++) {
			//requests input for a grade and adds the totals from all loops
			System.out.println("Enter next grade");
			total =+ console.nextDouble();
		}
		//calculates the average grade and prints the result
		double grade = (total / classes);
		System.out.println(name + "'s grade is " + grade + ".");		
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printGPA(console);
	}

}
