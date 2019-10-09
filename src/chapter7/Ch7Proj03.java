/* 
 * CS210 Ch7 Project 03
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;
import java.util.*;

public class Ch7Proj03 {
	
	public static void masterMind(Scanner a) {
		Random r = new Random();
		//generates a random 4 digit number
		int codeNum = r.nextInt(8999) + 1000;
		//creates an array and stores the code numbers
		int code[] = new int[4];
		for(int i = 0; i < code.length; i++) {
			code[code.length - 1 - i] = (codeNum % 10);
			codeNum = codeNum / 10;
		}
		System.out.println(Arrays.toString(code));
		//requests input of a 4 digit number
		System.out.println("Take a guess: ");
		int guess = a.nextInt();
		int correctDigits = 0;
		for(int i = 0; i < code.length; i++) {
			//tests each digit vs each element
			int digit = guess % 10;
			for(int j = 0; j < code.length; j++) {
				if(digit == code[j]) {
					//increments correct digits for each element equal to a digit
					correctDigits++;
				}
				
			}
			guess = guess / 10;
		}
		//prints the number of correct digits and continues the game
		System.out.println(correctDigits + " digits were correct.");
		masterMind(a);
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		masterMind(console);
		
	}

}
