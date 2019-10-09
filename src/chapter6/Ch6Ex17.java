/* 
 * CS210 Ch6 Exercise 17
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Ex17 {
	
	public static void inputStats(Scanner a) {
		//stores the longest line as a string
		String longestLine = "";
		int lineNumber = 0;
		
		//loops while there is another line of text
		while(a.hasNextLine()) {
			//stores the line in a string
			String nextLine = a.nextLine();
			//scans the string for inputs
			Scanner line = new Scanner(nextLine);
			//stores and resets the number of tokens on each loop
			int tokens = 0;
			//increments line numbers
			lineNumber++;
			//stores the longest and resets on each loop
			String longestToken = "";
			
			//if the line is the longest, updates the string
			if(nextLine.length() > longestLine.length()) {
				longestLine = nextLine;
			}
			//loops while the line has another token to consume
			while(line.hasNext()) {
				//increments # of tokens on the line
				String token = line.next();
				tokens++;
				//if the token is longer than the current longest, updates the length
				if(token.length() > longestToken.length()) {
					longestToken = token;
					
				}
				
			}
			//prints the line #, # of tokens, and longest token length on each line
			System.out.println("Line " + lineNumber + " has " + tokens + " tokens (longest = " + longestToken.length() + ")");
			
		}
		//prints the longest line
		System.out.println("Longest line : " + longestLine);
		
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		//reads from a text file named input.txt
		Scanner input = new Scanner(new File("input.txt"));
		inputStats(input);
		

	}

}
