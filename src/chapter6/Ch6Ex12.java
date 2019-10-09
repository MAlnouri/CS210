/* 
 * CS210 Ch6 Exercise 12
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Ex12 {
	
	public static void stripHtmlTags(Scanner a) {
		//loops as long as there is another line of text
		while(a.hasNextLine()) {
			//stores the next line into a string
			String text = a.nextLine();
			int length = text.length();
			//stores whether the token in the string is an html tag
			//declared true on each loop
			boolean notTag = true;
			
			for(int i = 0; i < length; i++) {
				if(text.charAt(i) == '<') {
					//tests if the first char is <
					notTag = false;
					
				} else if(text.charAt(i) == '>') {
					//declares tag true when it reaches the end of the tag
					notTag = true;
					
				} else if(notTag) {
					//prints the char if the token is not an html tag
					System.out.print(text.charAt(i));
				}
				
			}
			//prints a new line
			System.out.println();

		}
		
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		//reads from an html web page file named page.html
		Scanner input = new Scanner(new File("page.html"));
		stripHtmlTags(input);

	}

}
