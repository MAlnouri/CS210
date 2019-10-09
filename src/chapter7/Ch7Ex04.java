/* 
 * CS210 Ch7 Exercise 04
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;

public class Ch7Ex04 {
	
	public static boolean isSorted(double a[]) {
		//returns true for one element arrays
		if(a.length == 1) {
			return true;
		}
		//if any element is less than the last, returns false
		for(int i = 1; i < a.length - 1; i++) {
			if(a[i] < a[i-1]) {
				return false;
			}
		}
		//returns true is array is sorted
		return true;
	}

	public static void main(String[] args) {
		double a[] = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		//prints if the array is sorted or not
		System.out.println("Is the array sorted? " + isSorted(a));
		
	}

}
