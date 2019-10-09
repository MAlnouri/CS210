/* 
 * CS210 Ch3 Project 06
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;

public class Ch3Proj06 {
	
	// Returns a string of the number n, left-padded
	// with spaces until it is at least the given width.
	public static String padded(int n, int width) {
	String s = "" + n;
	for (int i = s.length(); i < width; i++) {
	s = " " + s;
	}
	return s;
	}
	
	//draws the top and bottom of the calendar
	public static void page() {
		System.out.println("+-----+-----+-----+-----+-----+-----+-----+");
	}
	
	//draws the calendar
	public static void calender(int days, int sunday) {
		//draws the day at the top of the calender
		System.out.println("  Sun   Mon   Tue   Wed   Thu   Fri   Sat");
		//draws the top of the calender
		page();
		//variable to count which day in the week it is
		int date = 0;
		//variable to print the day on the calender
		int day = 1;
		for(int a = 0; a <= 7-sunday; a++) {
			System.out.print("|     ");
			date++;			
		}

		//draws four rows for days in the calender
		for(int i = 1; i <= 5; i++) {
			//prints the day on each section of the calender
			for(int a = 0; a <= date; a++) {
				System.out.print("|" + padded(day, 5));
				//resets the loop when reaching the last day of the week
				date = (date == 6) ? 0 : date+1;
				//increments the day to be printed in the next loop
				day++;
			}

			//draws the end of the row
			System.out.print("|");
			//begins a new line
			System.out.println();
		}
		//draws the bottom of the calender
		page();
	}

	public static void main(String[] args) {
		calender(31, 6);


	}

}
