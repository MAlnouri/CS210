/* 
 * CS210 Ch3 Project 02
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.08 - Fall
 *
 */

package chapter3;

public class Ch3Proj02 {
	//sets interest rate to 6.5%
	public static final double interest = 1.065;
	//sets initial investment to $1000
	public static double investment = 1000;

	public static void main(String[] args) {
		
		//prints year and balance as separate columns
		System.out.println("Year\tBalance");
		
		//prints the year and corresponding balance for the next 25 years
		for(int year = 2000; year <= 2025; year++) {
			
			//increases the investment based on the interest rate
			investment = (investment*interest);
			
			//round the investment to 2 decimals places
			investment = Math.round((investment*100)/100);
			
			//prints the year and current balance
			System.out.println(year + "\t" + (investment));
			
			//increases the investment by $100 after each year
			investment+=100;
		}
		
	}

}
