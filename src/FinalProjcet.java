/* 
 * CS210 Final Project Toolbox
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.12.06 - Fall
 * This program calls methods from a toolbox
 * class file containing useful methods
 */

import java.util.*;
import java.io.*;

public class FinalProjcet {

	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream("test.txt");
		int[] test = {1, 2, 3, 4, 5};
		int[] test2 = {22, 44, 55, 13, 13, 56, 99};
		
		//instantiate the class
		myToolBox tools = new myToolBox();
		//calling the methods
		
		tools.avgArray(test);
		
		tools.calculator(input);
		
		tools.logBook(input, output);
		
		tools.mergeArray(test, test2);
		
		tools.priceCalc(input);
		
		tools.readData(input);
		
		tools.splitArray(test);
		
		tools.sumArray(test);
		
		tools.swapArray(test, test2);
		
		tools.tallyArray(input);
	}

}
