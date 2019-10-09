/* 
 * CS210 Ch7 Exercise 01
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;

public class Ch7Ex01 {
	
	public static int lastIndexOf(int[] a, int b) {
		//the value to be returned
		int index = -1;
		//loops for each element
		for(int i = 0; i < a.length; i++) {
			//if element matches int b, stores the last index
			if(b == a[i]) {
				index = i;
			}

		}
		//if no index was found, returns -1
		if(index == -1) {
			System.out.println("The value was not found.");
			return index;
		}
		//prints the last index and returns the value
		System.out.println("Last index of " + b + " is " + index + ".");
		return index;
	}

	public static void main(String[] args) {
		int test[] = {74, 85, 102, 99, 101, 85, 56};
		lastIndexOf(test, 85);
		
	}

}
