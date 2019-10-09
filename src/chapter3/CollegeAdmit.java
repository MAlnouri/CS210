/* 
 * CS210 Ch3 Exercise 22
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;
import java.util.*;

public class CollegeAdmit {

	public static void main(String[] args) {
		Scanner college = new Scanner(System.in);
		System.out.println("University admission program.");
		
		//asks user for gpa and stores the value
		System.out.println("What is your GPA?");
		double gpa = college.nextDouble();
		
		//asks user for sat score and stores the value
		System.out.println("What is your SAT score?");
		int sat = college.nextInt();
		
		//prints a rejection if gpa is below 1.8
		if (gpa < 1.8) {
			System.out.println("You were not accepted.");
            
        }
		//prints a rejection if sat score is below 900
		else if (sat < 900) {
        	System.out.println("You were not accepted.");

			}
		//prints an acceptance if gpa is 1.8+ and sat is 900+
        else {
        	System.out.println("You were accepted!");
        }
		
	}

}