/* 
 * CS210 Ch6 Project 05
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Proj05 {
	
	public static void storyTime(Scanner a, PrintStream out)
			throws FileNotFoundException {
		//requests and reads input from a text file
		System.out.println("Enter a file name: ");
		Scanner input = new Scanner(new File(a.next()));
		//stores the new story in a string
		String newStory = "";
		
		//loops while there is another line of text
		while(input.hasNextLine()) {
			//stores the next line of the file in a string
			String line = input.nextLine();
			//scans the string
			Scanner next = new Scanner(line);
			
			//loops while there is another token
			while(next.hasNext()) {
				//consumes the next token
				String token = next.next();
				
				//requests user to insert a word for the placeholder if it starts with <
				if(token.charAt(0) == '<') {
					System.out.println("Please enter an " + token.substring(1, token.length() - 1) + ": ");
					//adds the user input to the string
					newStory += a.next() + " ";
					
				} else {
					//adds the token to the string
					newStory += token + " ";
					
				}

			}
			//begins a new line in the string
			newStory += "\n";
			
		}
		//writes the new story to the text file
		out.println(newStory);

	}

	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		//writes the story to a new file named newstory.txt
		PrintStream output = new PrintStream(new File("newstory.txt"));
		storyTime(console, output);

	}

}
