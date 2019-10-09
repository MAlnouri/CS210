/* 
 * CS210 Ch3 Exercise 09
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;

public class Ch3Ex09 {
	
	//returns the last digit of the integer
	public static int lastDigit(int x) {
		
		/* takes the absolute value and then takes remainder of 
		the integer which will give the last digit	*/
		x = (Math.abs(x) % 10);
		//returns the value
		return x;
		
	}

	public static void main(String[] args) {
		//prints the last digit of the integer
		System.out.println(lastDigit(-956897));

	}

}
