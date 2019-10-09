/* 
 * CS210 Ch5 Project 07
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;
import java.util.*;

public class Ch5Proj07 {
	
	public static void pigGame(Scanner a) {
		Random r = new Random();
		//the sums of each players rolls
		int sum1 = 0;
		int sum2 = 0;
		//boolean asking if the player wants to keep playing
		boolean play = true;
		//boolean checking if the player has rolled a 1
		boolean rolled1 = false;
		
		//game within the loop, ends end player says to stop or player rolls a 1
		while(play == true && rolled1 == false) {
			//rolls a 6 sided die for each player
			int roll1 = r.nextInt(6) + 1;
			int roll2 = r.nextInt(6) + 1;
			//adds their rolls to each sum
			sum1 += roll1;
			sum2 += roll2;
			//prints players rolls and their new totals
			System.out.println("Player 1 rolled " + roll1 + ". New total: " + sum1 + ".");
			System.out.println("Player 2 rolled " + roll2 + ". New total: " + sum2 + ".");
			//ends the game if either player rolled a 1
			if(roll1 == 1 || roll2 == 1) {
				rolled1 = true;
			}
			//asks each player if they would like to keep playing
			System.out.println("Player 1, would you like to keep playing?");
			String play1 = a.next();
			System.out.println("Player 2, would you like to keep playing?");
			String play2 = a.next();
			//if either player types n, the game will end
			if(play1.charAt(0) == 'n' || play1.charAt(0) == 'N' ||play2.charAt(0) == 'n' ||play2.charAt(0) == 'N') {
				play = false;
			}
			
		}
		//game over, prints each players points and states a winner or draw
		System.out.println("Game Over!");
		System.out.println("Player 1 has " + sum1 + " points!");
		System.out.println("Player 2 has " + sum2 + " points!");
		if(sum1 > sum2) {
			System.out.println("Player 1 wins!");
		} else if(sum1 < sum2) {
			System.out.println("Player 2 wins!");
		} else{
			System.out.println("It's a draw!");
		}
		
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		pigGame(console);
	}

}
