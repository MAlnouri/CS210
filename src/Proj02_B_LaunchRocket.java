/* 
 * CS210 Assignment 02 (For Loops - Rockets)
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 * This program draws multiple rockets and launches them separately.
 */

import java.util.concurrent.TimeUnit;

public class Proj02_B_LaunchRocket{
	
	//variable based on the rocket being drawn
	public static int rockets = 0;
	
	//prints spaces between each new rocket
	public static void spacing() {
		for (int b=1; b <= 12*rockets; b++) {
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		for (int t=10; t >= 1; t--) {
			//this prints the current time of the countdown
			System.out.println(t);
			TimeUnit.MILLISECONDS.sleep(700);//this delays the println
		}
		
		System.out.println(" BLAST OFF!!");
		TimeUnit.MILLISECONDS.sleep(1000);//this delays the println
		
		//draws a number of rockets and launches them
		for (int a=0; a <=3; a++) {
			
			spacing();
	       	System.out.println("    /\\  ");
	       	spacing();
	       	System.out.println("   /  \\ ");
	       	spacing();
	       	System.out.println("  +----+");
	       	spacing();
	       	System.out.println("  | CS |");
	       	spacing();
	       	System.out.println(" /|    |\\");
	       	spacing();
	       	System.out.println("/_+----+_\\");
	       	spacing();
	       	System.out.println("    /\\  ");
	       	spacing();
	       	System.out.println("   /__\\ ");
	       	spacing();
	       	TimeUnit.MILLISECONDS.sleep(500);//this delays the println
	       	System.out.println("  (    )");
	       	spacing();
	       	System.out.println("   **** ");
	       	spacing();
	       	System.out.println("    **");
	       	spacing();
	       	System.out.println("    **");
	       	spacing();
	       	System.out.println("    **");
	       	
	       	//increments the value to increase space for next rocket
	       	rockets++;
	
	       	//this prints lines that launch the rocket
	       	for (int l=1; l <= 100; l++) {
	       		System.out.println();
	       		TimeUnit.MILLISECONDS.sleep(50);//this delays the println
	       		
	       	}
       	
       	}

	}

}
