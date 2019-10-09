/* 
 * CS210 Ch6 Project - ReadingData
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.07 - Fall
 * This program reads a file of data on students and lists the
 * data and a summary based on the gender input given
 */


package chapter6;
import java.util.*;
import java.io.*;

public class ReadingData {
	
	public static void accessFile(Scanner a) {
		Scanner input = new Scanner(System.in);
		//requests file name
		System.out.println("Enter the file name: ");
		try {
			//scans the file for input
			input = new Scanner(new File(a.next()));
		}
		catch (FileNotFoundException f) {
			//catches error and requests new input
			System.out.println("Error. Please try again.");
			accessFile(a);
		}
		//variables stored for summary of data
		int gender = genderData(a);
		double students = 0;
		double genderStudents = 0;
		double sumAge = 0;
		String g = "";
		
		//lists data of male students
		if(gender == 1) {
			g = "male";
			while(input.hasNextLine()) {
				String line = input.nextLine();
				Scanner next = new Scanner(line);
				
				//consumes and stores next line of data
				while(next.hasNext()) {
					int id = next.nextInt();
					String name = next.next();
					String sex = next.next();
					double age = next.nextDouble();
					
					//if male prints data
					if(sex.equals("m")) {
						genderStudents++;
						sumAge += age;
						System.out.printf("\n%-8d" + "%-12s" + "%.1f", id, name, age);
						
					}
					//increments students regardless of gender
					students++;
				}
				
			}
			
			//lists data of female students
		} else if(gender == 2) {
			g = "female";
			while(input.hasNextLine()) {
				String line = input.nextLine();
				Scanner next = new Scanner(line);
				
				//consumes and stores next line of data
				while(next.hasNext()) {
					int id = next.nextInt();
					String name = next.next();
					String sex = next.next();
					double age = next.nextDouble();
					
					//if female prints data
					if(sex.equals("f")) {
						genderStudents++;
						sumAge += age;
						System.out.printf("\n%-8d" + "%-12s" + "%.1f", id, name, age);
						
					}
					//increments students regardless of gender
					students++;
				}
				
			}
			
		} else {
			System.out.println("Error. Please try again.");
			accessFile(a);
		}
		//prints summary of data
		System.out.printf("\nThere are %d %s students. (%.2f%% of class)", (int)genderStudents, g, genderStudents / students * 100);
		System.out.printf("\nTheir average age is: %.1f years.", sumAge / genderStudents);
		
	}
	
	public static int genderData(Scanner a) {
		System.out.println("Parse by gender (M/F): ");
		String parseGender = a.next();
		int gender = 0;
		
		//if M, will return 1 for male
		if(parseGender.toLowerCase().charAt(0) == 'm') {
			System.out.println("List of male students: ");
			gender = 1;
			
			//if F, will return 2 for female
		} else if(parseGender.toLowerCase().charAt(0) == 'f') {
			System.out.println("List of female students: ");
			gender = 2;
			//resets the prompt method if invalid input is given
		} else {
			System.out.println("You did not enter a valid input.");
			genderData(a);
		}
		//prints formatting for data and returns the input value
		System.out.printf("%-8s" + "%-12s" + "%s", "ID #", "NAME", "AGE");
		System.out.printf("\n%-8s" + "%-12s" + "%s", "----", "---------", "----");
		return gender;
	}

	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		accessFile(console);

	}

}
