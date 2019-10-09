/* 
 * CS210 Ch6 Exercise 15
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */


package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Ex15 {
	
	public static void coinFlip(Scanner a) {
		//loops until the file has no more lines of text
		while(a.hasNextLine()) {
			//counters for each flip and total flips, resets on each new line
			int headsCount = 0;
			int tailsCount = 0;
			double totalFlips = 0;
			//stores the line of flips into a string
			String flips = a.nextLine();
			//loops through each char in the string testing whether they are heads or tails
			for(int i = 0; i < flips.length(); i++) {
				//if char is H, increments heads counter
				if(Character.toLowerCase(flips.charAt(i)) == 'h') {
					headsCount++;
					//if char is T, increments tails counter
				} else if(Character.toLowerCase(flips.charAt(i)) == 't') {
					tailsCount++;
				}
				
			}
			//adds the flips together
			totalFlips = headsCount + tailsCount;
			//prints the # and % of head flips
			System.out.println(headsCount + " heads (" + (headsCount / totalFlips * 100) + "%)");
			//prints winner statement if head count is above 50%
			if((headsCount / totalFlips) > 0.5){
				System.out.println("You win!");
			}
		}
		
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		//reads from a text file named coinflips.txt
		Scanner input = new Scanner(new File("coinflips.txt"));
		coinFlip(input);

	}

}
