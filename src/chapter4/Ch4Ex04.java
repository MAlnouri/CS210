/* 
 * CS210 Ch4 Exercise 04
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.15 - Fall
 *
 */

package chapter4;

public class Ch4Ex04 {
	
	public static int daysInMonth(int x) {

		if(x == 2) {
			//if the month is february, will return 28 days
			return 28;
			//if month is april, jun, sept, dec, will return 30 days
		} else if(x == 4 || x == 6 || x == 9 || x == 11) {
			return 30;
		} else {
			//returns 31 days for all other months
			return 31;
		}
	}

	public static void main(String[] args) {
		//prints out the number of days in the month
		System.out.println(daysInMonth(1));
		
	}
	
}