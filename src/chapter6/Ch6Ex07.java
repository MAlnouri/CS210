/* 
 * CS210 Ch6 Exercise 07
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Ex07 {
	
	public static void flipLines(Scanner a) {
		//loop ends after final line of tokens has been consumed
		while(a.hasNextLine()) {
			//stores a line of text into a string
			String Line1 = a.nextLine();
			String Line2 = "";
			//checks there is another line to store
			if(a.hasNextLine()) {
			Line2 = a.nextLine();
			}
			//checks if there is anything stored before printing
			//prints the lines in reverse order unless there is an odd number of lines
			if(!Line2.equals("")) {
				System.out.println(Line2);
			}
			System.out.println(Line1);
			
		}
		
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		//reads from a text file named lines.txt
		Scanner input = new Scanner(new File("lines.txt"));
		flipLines(input);

	}

}
