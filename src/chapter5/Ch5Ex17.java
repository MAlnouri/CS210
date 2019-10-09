/* 
 * CS210 Ch5 Exercise 17
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;

public class Ch5Ex17 {
	
	public static boolean monthApart(int m1, int d1, int m2, int d2) {
		//takes the difference incase the 2nd month is before the first
		int monthDiff = Math.abs(m1 - m2);
		
		//if the difference in months is 2 or greater, returns true
		if(monthDiff >= 2) {
			return true;
		}
		
		//if the difference in months is 0, returns false
		if(monthDiff == 0) {
			return false;
		}	
		
		//if the month 1 is greater than month 2
		if(m1 > m2){
			//checks if the days are within a month, returns true if they are not, false if they are
			if(d1 >= d2) {
				return true;
			} else {
				return false;
			}

		} else {

			//if month 1 is less than month 2
			if(m2 < m1) {
				//checks if the days are within a month, returns true if they are not, false if they are
				if(d2 >= d1) {
					return true;
				} else {
					return false;
				}
				
			}

		}
		return true;
	}

	public static void main(String[] args) {
		if(monthApart(12,2,11,2) == true) {
			//prints the statement if the method returns true
			System.out.println("These dates are more than 1 month apart!");
		} else {
			//prints the statement if the method returns false
			System.out.println("These dates are less than 1 month apart!");
		}

	}

}
