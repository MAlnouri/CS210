/* 
 * CS210 Ch6 Project 02
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.05 - Fall
 *
 */

package chapter6;
import java.util.*;
import java.io.*;

public class Ch6Proj02 {
	
	public static void compareFiles(Scanner a, PrintStream out)
			throws FileNotFoundException {
		//requests 2 file names to be read
		System.out.println("Enter the first file name: ");
		Scanner file1 = new Scanner(new File(a.next()));
		System.out.println("Enter the second file name: ");
		Scanner file2 = new Scanner(new File(a.next()));
		out.println("Differences found: ");
		int lineNumber = 0;
		
		//loops while each file has another line of text
		while(file1.hasNextLine() && file2.hasNextLine()) {
			//increments the line number
			lineNumber++;
			//stores the lines in each string
			String line1 = file1.nextLine();
			String line2 = file2.nextLine();
			//outputs the differences if the strings are not equal
			if(!line1.equals(line2)) {
				out.println("Line " + lineNumber + ":");
				out.println("< " + line1);
				out.println("> " + line2);
			}

		}
		
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		//creates and writes into a text file named differences.txt
		PrintStream output = new PrintStream(new File("differences.txt"));
		compareFiles(console, output);

	}

}
