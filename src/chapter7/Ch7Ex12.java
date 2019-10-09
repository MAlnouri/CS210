/* 
 * CS210 Ch7 Exercise 12
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;

public class Ch7Ex12 {
	
	public static int priceIsRight(int a[], int price) {
		int bestGuess = -1;
		/*tests each element in the array
		  if the guess is less than the price and higher than the bestGuess
		  makes that element the bestGuess */
		for(int element: a) {

			if(element <= price) {
				if(element > bestGuess) {
					bestGuess = element;
				}
				
			}
			
		}
		//returns -1 if all guesses were above the price
		if(bestGuess == -1) {
			System.out.println("All guesses were too large.");
			return bestGuess;
		}
		//prints and returns the best guess
		System.out.println("Closest guess was " + bestGuess + ".");
		return bestGuess;
	}

	public static void main(String[] args) {
		int guesses[] = {200, 300, 250, 1, 950, 40};
		priceIsRight(guesses, 280);

	}

}
