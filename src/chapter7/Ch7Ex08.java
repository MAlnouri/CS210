/* 
 * CS210 Ch7 Exercise 08
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;
import java.util.Arrays;

public class Ch7Ex08 {
	
	public static int median(int a[]) {
		//sorts the array
		Arrays.sort(a);
		//stores, prints and returns the value in the median of the array
		int arrayMedian = a[a.length / 2];
		System.out.println(arrayMedian);
		return arrayMedian;
	}

	public static void main(String[] args) {
		int a[] = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
		median(a);

	}

}
