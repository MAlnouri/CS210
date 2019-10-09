/* 
 * CS210 Ch6 Exercise 19
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Ex19 {
	
	public static void leetSpeak(Scanner in, PrintStream out) {
		
		//loops while there is another line of text
		while(in.hasNextLine()) {
			//stores the line in a string
			String line = in.nextLine();
			//scans the string
			Scanner next = new Scanner(line);
			
			//loops while there is another token to consume
			while(next.hasNext()) {
				//stores the new line of text to be written
				String newLine = "";
				//stores the next token
				String token = next.next();
				//contains the token
				out.print("(");
				//checks and outputs each char, replacing certain chars with numbers
				for(int i = 0; i < token.length(); i++) {
					if(Character.toLowerCase(token.charAt(i)) == 'o'){
						newLine += "0";
					} else
					if(line.charAt(i) == 'l'){
						newLine += "1";
					} else
					if(Character.toLowerCase(token.charAt(i)) == 'e'){
						newLine += "3";
					} else
					if(Character.toLowerCase(token.charAt(i)) == 'a'){
						newLine += "4";
					} else
					if(Character.toLowerCase(token.charAt(i)) == 't'){
						newLine += "7";
					} else {
						newLine += token.charAt(i);
					}
					
				}
				//outputs the new token
				out.print(newLine);
				if(Character.toLowerCase(token.charAt(token.length() - 1)) == 's') {
					out.print("z");
				}
				//contains the token
				out.print(") ");
				
			}
			//begins a new line
			out.println();
			
		}
		
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		//reads from a text file named translate.txt
		Scanner input = new Scanner(new File("translate.txt"));
		//creates and writes into a text file named leetspeak.txt
		PrintStream output = new PrintStream(new File("leetspeak.txt"));
		leetSpeak(input, output);

	}

}
