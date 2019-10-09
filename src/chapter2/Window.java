/* 
 * CS210 Ch2 Exercise 19
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Window {
	
	//dictates the size of window drawn in the figure
	public static int size = 3;

	public static void main(String[] args) {
		
		//draws a window with different dimensions based on the value of the height
		for (int a=1; a <= 2 ; a++) {

			//draws the top of the window frame
			for (int b=1; b <= size-1 ; b++) {
				System.out.print("+===");
							
			}
			
			//prints the end of the figure of the line
			System.out.print("+");
			//begins a new line for the figure
			System.out.println();

			//draws the window
			for (int c=1; c <= size; c++) {
				
				for (int d=1; d <= size-1; d++) {
					
					System.out.print("|   ");
				}
				
				//prints the end of the figure
				System.out.print("|");
				//begins a new line between each loop
				System.out.println();
				
			}
			
			//draws the bottom of the window only when the max size is reached
			for (int e = 2; e <= a ; e++) {

				//draws the bottom of the window
				for (int b=1; b <= size-1 ; b++) {
					System.out.print("+===");
								
				}
				
				//prints the end of the figure of the line
				System.out.print("+");
				//begins a new line for the figure
				System.out.println();
			}
			
		}
		
	}

}
