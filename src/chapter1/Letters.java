/* 
 * CS210 Project 02
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class Letters {
	
	public static void conclude() {
		System.out.println("I'll be home to visit this Summer!");
		System.out.println("");
	}
	
	public static void parents() {
		System.out.println("Hey dad,");
		System.out.println("School is going well but I\'m going to need more money to pay for my classes");
		conclude();
	}
	
	public static void friend() {
		System.out.println("Hey Jack,");
		System.out.println("I hope you\'re doing well! I've made a lot of new friends here!");
		conclude();
	}
	
	public static void brother() {
		System.out.println("Hey Samir,");
		System.out.println("It\'s good to hear from you! I can\'t wait to show you everything I\'ve learned!");
		conclude();
	}

	public static void main(String[] args) {
		parents();
		friend();
		brother();
		
	}

}
