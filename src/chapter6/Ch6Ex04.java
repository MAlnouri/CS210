/* 
 * CS210 Ch6 Exercise 04
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Ex04 {
	
	public static void countCoins(Scanner a) {
		double sum = 0;
		//ends loop when the file has no more tokens to be read
		while(a.hasNext()) {
			double count = 0;
			String text = "";
			if(a.hasNextInt()) {
				count = a.nextInt();
				//stores the next token as string
				text = a.next();
			}
			//compares the stored string and adds the value of money based on the type of coin
			if(text.equalsIgnoreCase("pennies")) {
				sum += count * 1 / 100;
			} else if(text.equalsIgnoreCase("nickels")) {
				sum += count * 5 / 100;
			} else if(text.equalsIgnoreCase("dimes")) {
				sum += count * 10 / 100;
			} else if(text.equalsIgnoreCase("quarters")) {
				sum += count * 25 / 100;
			}
			
		}
		//prints the total value of the coins
		System.out.println("Total money: $" + sum);
		
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		//reads a text file named coins.txt
		Scanner input = new Scanner(new File("coins.txt"));
		countCoins(input);

	}

}
