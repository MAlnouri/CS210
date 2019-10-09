/* 
 * CS210 Ch7 Exercise 07
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;
import java.util.Arrays;

public class Ch7Ex07 {
	
	public static int kthLargest(int k, int a[]) {
		//sorts the array
		Arrays.sort(a);
		//takes the largest - k element, prints and returns it
		int kLarge = a[a.length - 1 - k];
		System.out.println(kLarge);
		return kLarge;
	}

	public static void main(String[] args) {
		int a[] = {74, 85, 102, 99, 101, 56, 84};
		kthLargest(2, a);

	}

}
