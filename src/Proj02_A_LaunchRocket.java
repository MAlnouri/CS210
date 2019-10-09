/* 
 * CS210 Assignment 02 (For Loops - Rocket)
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 * This program draws a rocket and launches it.
 */

import java.util.concurrent.TimeUnit;

public class Proj02_A_LaunchRocket{
	
	public static void main(String[] args) throws Exception {
		
		//this prints a countdown
		for (int t=10; t >= 1; t--) {
			 System.out.println(t);//this prints the current time of the countdown
			 TimeUnit.MILLISECONDS.sleep(700);//this delays the println
		}
		
	   /*
		System.out.println("10");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("9");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("8");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("7");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("6");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("5");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("4");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("3");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("2");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    System.out.println("1");
	    TimeUnit.MILLISECONDS.sleep(700);//this delays the println
	    */
	    
		System.out.println(" BLAST OFF!!");
		TimeUnit.MILLISECONDS.sleep(1000);//this delays the println

		//these lines draw the rocket
       	System.out.println("    /\\  ");
       	System.out.println("   /  \\ ");
       	System.out.println("  +----+");
       	System.out.println("  | CS |");
       	System.out.println(" /|    |\\");
       	System.out.println("/_+----+_\\");
       	System.out.println("    /\\  ");
       	System.out.println("   /__\\ ");
       	TimeUnit.MILLISECONDS.sleep(500);//this delays the println
       	System.out.println("  (    )");
       	System.out.println("   **** ");
       	System.out.println("    **");
       	System.out.println("    **");
       	System.out.println("    **");

       	//this prints lines that launch the rocket
       	for (int l=1; l <= 100; l++) {
       		System.out.println();
       		TimeUnit.MILLISECONDS.sleep(50);//this delays the println
       	}
       	
	}

}
