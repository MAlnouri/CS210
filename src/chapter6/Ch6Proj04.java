/* 
 * CS210 Ch6 Project 04
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Proj04 {
	
	public static void babyNames(Scanner a) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program lists data on the popularity of names based on the decade.");
		//asks for a name and stores it
		System.out.println("Enter a name: ");
		String name = console.next();
		
		//loops while there is another token
		while(a.hasNext()) {
			String token = "";
			//stores the token if its not an int
			if(!a.hasNextInt()) {
				token = a.next();
			//consumes the token if it is an int
			} else {
				int waste = a.nextInt();
			}
			//if the name is equal to the token prints out the data stored
			if(token.equalsIgnoreCase(name)) {
				System.out.println("Name found. Stats on name \"" + name + "\"");
				for(int i = 0; i < 11; i++) {
					int year = 1900 + (10 * i);
					System.out.println(year + ": " + a.nextInt());
					
				}
				
			}
			
		}
		
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		//reads from a text file named babynames.txt
		Scanner input = new Scanner(new File("babynames.txt"));
		babyNames(input);
		

	}

}
