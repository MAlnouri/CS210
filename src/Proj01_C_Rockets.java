/* 
 * CS210 Project 01 (Methods - Rockets)
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 * This program draws 2 rockets.
 */

public class Proj01_C_Rockets {
	
	//draws the engines and tips of 2 rockets
	public static void rocketTip() {
        System.out.println("   /\\     \\    /");
        System.out.println("  /  \\     \\  /");
        System.out.println(" /    \\     \\/");
	}
	
	//draws the top and bottom parts of 2 rockets
	public static void rocketBox() {
        System.out.println("+------+ +------+ ");
        System.out.println("|      | |      | ");
        System.out.println("|      | |      | ");
        System.out.println("+------+ +------+ ");
	}
	
	//draws the middle parts of 2 rockets
	public static void rocketMid() {
        System.out.println("|      | |      | ");
        System.out.println("| 9999 | | 6666 | ");
        System.out.println("|      | |      | ");
	}

    public static void main(String[] args) {
    	rocketTip();
    	rocketBox();
    	rocketMid();
    	rocketBox();
    	rocketTip();

      }
  
}