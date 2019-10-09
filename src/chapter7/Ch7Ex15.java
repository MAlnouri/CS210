/* 
 * CS210 Ch7 Exercise 15
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;
import java.util.Arrays;

public class Ch7Ex15 {
	
	public static int[] collapse(int a[]) {
		//creates a new array with half the length
		int sumPairs[] = new int[(a.length + 1) / 2];
		int index = 0;
		for(int i = 0; i < sumPairs.length ; i++) {
			//tests for an odd number of pairs
			if(index >= a.length - 1) {
				//the final element does not collapse
				sumPairs[i] = a[a.length - 1];
			} else {
				//adds the next pair of integers and stores their sum in the array
				sumPairs[i] = a[index] + (a[index + 1]);
				index += 2;
			}
			
		}
		//prints and returns the new array
		System.out.println(Arrays.toString(sumPairs));
		return sumPairs;
	}

	public static void main(String[] args) {
		int list[] = {1, 2, 3, 4, 5};
		collapse(list);

	}

}
