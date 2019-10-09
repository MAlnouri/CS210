/* 
 * CS210 Ch6 Exercise 16
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Ex16 {
	
	public static int mostCommonNames(Scanner a) {
		//unique names that will be returned
		int names = 0;
		
		//loops while the file has another line of text
		while(a.hasNextLine()) {
			//scanner for the line of names
			Scanner line = new Scanner(a.nextLine());
			//increments the names
			names++;
			//sets most common names and counter for similar names
			int mostCommon = 1;
			int sameName = 1;
			//stores the next token from the string
			String next = line.next();
			//sets the previous name for each loop
			String prev = next;
			
			//loops while there is a token in the string
			while(line.hasNext()) {
				String currentName = line.next();
				//increments sameName if the previous name is the same as the next
				if(currentName.equals(prev)) {
					sameName++;
				//sets the most common name if its more common than the others
				} else {
					if(sameName > mostCommon) {
						mostCommon = sameName;
						next = prev;
					}
					//if they are not similar, resets counter and increments unique names
					names++;
	                sameName = 1;
	                prev = currentName;
                }
				
			}
			//sets most common name and prints it
			if(sameName > mostCommon)
				next = prev;
			//prints the most common name
			System.out.println("Most common name: " + next);
		}
		//returns the unique names
		return names;
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		//reads from a text file named commonnames.txt
		Scanner input = new Scanner(new File("commonnames.txt"));
		mostCommonNames(input);

	}

}
