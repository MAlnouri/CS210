/* 
 * CS210 Ch4 Project 04
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;

import java.util.Scanner;

public class Ch4Proj04 {
	
	public static int date(Scanner console) {
		int days = 0;
		//asks user for day and month and stores the value
		System.out.println("Month?");
		int month = console.nextInt();
		System.out.println("Day?");
		int day = console.nextInt();
		days += day;
		//converts the month into a number of days
		if(month == 2) {
			days += 31;
		} else if (month == 3) {
			days += 59;
		} else if (month == 4) {
			days += 90;
		} else if (month == 5) {
			days += 120;
		} else if (month == 6) {
			days += 151;
		} else if (month == 7) {
			days += 181;
		} else if (month == 8) {
			days += 212;
		} else if (month == 9) {
			days += 243;
		} else if (month == 10) {
			days += 273;
		} else if (month == 11) {
			days += 304;
		} else if (month == 12) {
			days += 334;
		}
		//returns the date in a number of days within the year
		return days;
	}
	
	public static void birthday(Scanner console) {
		//sets variables for current date, first and second birthdays
		int dateCurrent = date(console);
		int birthday1 = date(console);
		int birthday2 = date(console);
		//days remaining for person 1's birthday
		int remain1 = Math.abs(birthday1 - dateCurrent);
		System.out.println("Days till first person's birthday: " + remain1);
		//days remaining for person 1's birthday
		int remain2 = Math.abs(birthday2 - dateCurrent);
		System.out.println("Days till second person's birthday: " + remain2);
		//compares days remaining and states whose birthday is closer
		if(remain1 < remain2) {
			System.out.println("First birthday is closer");
		} else {
			System.out.println("Second birthday is closer");
		}
		
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		birthday(console);
	}

}
