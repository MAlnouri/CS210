/* 
 * CS210 Ch7 Project - ReadingData
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.22 - Fall
 * This program reads input from user or a file as text and
 * prints the text into a new file as an array of ASC II code
 */

package chapter7;
import java.util.*;
import java.io.*;

public class Coder {
	
	public static void readingdata(Scanner a)
			throws FileNotFoundException {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Encode or decode? ");
		a.next();
		String encode = "";
		
		//check user input for y/n
		System.out.println("Is it a file? ");
		char answer = a.next().toLowerCase().charAt(0);
		//if yes request file name and try to scan it
		if(answer == 'y') {
			System.out.println("Select a file: ");
			try {
				//scans the file for input
				read = new Scanner(new File(a.next()));
			}
			//catches filenotfound and restarts program
			catch (FileNotFoundException f) {
				//catches error and requests new input
				System.out.println("Error. Please try again.");
				readingdata(a);
			}
			//stores the line of text from the file
			encode = read.nextLine();
		
		//if no request a number of words from the user and store them in a string
		} else if(answer == 'n') {
			System.out.println("How many words? ");
			int words = a.nextInt();
			System.out.println("Enter the words to encode: ");
			for(int i = 0; i < words; i++) {
				encode = encode + a.next();
			}
		//if user input does not match y/n restart program
		} else {
			System.out.println("Not a valid response.");
			readingdata(a);
		}
		//creates new array with length of the string to encode
		int[] asc = new int[encode.length()];
		//loop that stores each char as an int
		for(int i = 0; i < encode.length(); i++) {
			asc[i] = (int)encode.charAt(i);
		}
		//prints the array to the console
		System.out.println(Arrays.toString(asc));
		//requests file name to save results
		System.out.println("New file name: ");
		String newFile = a.next();
		PrintStream save = new PrintStream(new File(newFile + ".txt"));
		//prints array to new file and tells user
		save.print(Arrays.toString(asc));
		System.out.println("Results have been saved in a text file: " + newFile + ".txt");
		save.close();
		a.close();
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		readingdata(input);

	}

}
