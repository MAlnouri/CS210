/* 
 * CS210 Exercise 16
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class Shining {
	
	public static void sendHelp() {
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		
	}
	
	public static void noLoop() {
		sendHelp();
		sendHelp();
		sendHelp();
		sendHelp();
		sendHelp();
		sendHelp();
		sendHelp();
		sendHelp();
		sendHelp();
		sendHelp();
		
	}

	public static void main(String[] args) {
		noLoop();

	}

}
