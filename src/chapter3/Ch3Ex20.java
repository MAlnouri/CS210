/* 
 * CS210 Ch3 Exercise 20
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;
import java.util.*;

public class Ch3Ex20 {
	
	/* requests the user to input their month, day and year of birth
	   then prints out a statement saying their birthday using the input */
	public static void inputBirthday(Scanner a) {
		
		//asks the day and stores the value
		System.out.println("What day of the month were you born?");
		int day = a.nextInt();
		//asks the month and stores the value
		System.out.println("What month were you born?");
		String month = a.next();
		//asks the year and stores the value
		System.out.println("What year were you born?");
		int year = a.nextInt();
		//prints the birthday
		System.out.print("You birthdate is " + month + " " + day + "," + year);
		
	}

	public static void main(String[] args) {
		Scanner date = new Scanner(System.in);
		inputBirthday(date);

	}

}
