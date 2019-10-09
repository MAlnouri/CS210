/* 
 * CS210 Attendance Array
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.13 - Fall
 *
 */

package chapter6;
import java.io.*;
import java.util.*;

public class AttendanceEC {

	public static void main(String[] args)
			throws FileNotFoundException {
		//accesses the file for input
		Scanner input = new Scanner(new File("attendance.txt"));
		int section = 0;
		
		//loops for each section/line of text
		while(input.hasNextLine()) {
			//creates array index for each student's points
			int[] students = new int[5];
			//increments and prints the section
			section++;
			System.out.println("Section " + section);
			//stores the line of text in a string
			String line = input.nextLine();
			//reads each char on the line
			for(int i = 0; i < line.length(); i++) {
				//if char is y, adds 3 points to student score
				if(line.charAt(i) == 'y') {
					students[i % 5] += 3;
				}
				//if char is n, adds 2 points to student score
				if(line.charAt(i) == 'n') {
					students[i % 5] += 2;
				}
				//prevents score from exceeding 20
				students[i % 5] = Math.min(20, students[i % 5]);
			}
			//creates array for student grades
			double grades[] = new double[5];
			//calculates each student grade
			for(int a = 0; a < grades.length; a++) {
				grades[a] = 100 * students[a] / 20;
			}
			//prints the students scores and grades each section
			System.out.println("Student points: " + Arrays.toString(students));
			System.out.println("Student grades: " + Arrays.toString(grades));
				
		}

	}

}