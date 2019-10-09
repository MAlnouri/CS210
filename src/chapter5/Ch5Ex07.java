/* 
 * CS210 Ch5 Exercise 07
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;
import java.util.*;

public class Ch5Ex07 {
	
	public static void diceSum(Scanner a) {
		//prompts user for their desired dice roll
		System.out.println("What is your desired roll?");
		int desire = a.nextInt();
		Random r = new Random();
		int roll;
		//rolls 2 dice and prints their rolls and sum until the desired roll is obtained
		do {
			//rolls 2 numbers between 1-6
			int roll1 = r.nextInt(6) + 1;
			int roll2 = r.nextInt(6) + 1;
			//adds the rolls to get the sum
			roll = roll1 + roll2;
			//prints the roll and their sums
			System.out.println(roll1 + " and " + roll2 + " = " + roll + ".");
			
		} while(roll != desire);
		//terminates the loop when the desired roll is reached
		System.out.println("You got your desired roll!");
		
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		diceSum(console);

	}

}
