package chapter8;
import java.util.*;
import java.io.*;

public class myStudent {
	
	public class student {
		int ID;
		String name;
		String gender;
		double age;
		Scanner input = new Scanner(System.in);
		Scanner read;
		
		public void readData(String fileName)
				throws FileNotFoundException {
			System.out.println("Enter file name to read: ");
			fileName = input.next();
			read = new Scanner(new File(fileName + ".txt"));
		}
		
		public void studentList(String gender) {
			if(gender.toLowerCase().charAt(0) == 'm') {
				gender = "m";
				System.out.print("List of male students: ");
			} else if(gender.toLowerCase().charAt(0) == 'f') {
				gender = "f";
				System.out.print("List of female students: ");
			} else {
				System.out.println("Invalid input.");
				studentList(gender);
			}
			while(read.hasNextLine()) {
				ID = read.nextInt();
				name = read.next();
				String studentGender = read.next();
				age = read.nextDouble();
				if(gender == studentGender) {
					System.out.print(name);
					if(read.hasNext()) {
						System.out.print(", ");
					}
					
				}
				
			}
			
		}
		
		public void avgAge(String gender) {
			double totalAge = 0;
			int genderStudents = 0;
			while(read.hasNextLine()) {
				ID = read.nextInt();
				name = read.next();
				String studentGender = read.next();
				age = read.nextDouble();
				if(gender == studentGender) {
					totalAge += age;
					genderStudents++;
				}
				
			}
			System.out.println("Average age of students: " + (totalAge / (double)genderStudents) + " years.");
		}
		
		public void howMany(String gender) {
			
		}
		
		public void age(int value) {
			
		}

		
	}

	public static void main(String[] args) {
		

	}

}
