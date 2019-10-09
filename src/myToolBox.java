/* 
 * CS210 Final Project Toolbox
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.12.06 - Fall
 * This program contains a number of useful methods within the class
 * that can be called in other classes
 * 
 * In this class I learned a lot about the ins and outs of java and how certain things work within them such as classes and methods
 * One of my challenges was understanding how calling a class worked, as I couldn't test it in class,
 * but I managed to get some help understanding it and eventually figured what to do
 * I feel I can still work to improve by finding better ways to simplify my code. 
 * I write plenty of comments but looking back at previous programs I see I could be writing
 * them in a better and simpler way
 */

import java.util.*;
import java.io.*;

public class myToolBox {
	
	Scanner input = new Scanner(System.in);
	PrintStream output;
	int[] a;
	int[] b;
	
	//merges 2 arrays into a new 1
	//2 arrays with similar data can be combined to reduce redundancy
	public int[] mergeArray(int[] a, int[] b) {
		int[] newMerge = new int[a.length + b.length];
		//copies elements of the first array in
		for(int i = 0; i < a.length; i++) {
			newMerge[i] = a[i];
		}
		//copies elements of the second array in
		for(int j = 0; j < b.length; j++) {
			newMerge[j + a.length] = b[j];
		}
		//returns the new array
		return newMerge;
	}
	//splits an array and returns a 2d array of its elements
	//can be useful to separate an array into chunks if its too large
	public int[][] splitArray(int[] a) {
		int[][] newSplit = new int[2][a.length / 2];
		//loops for each half of the array
		for(int i = 1; i < 3; i++) {
			//copies elements of the array in
			for(int j = 0; j < a.length / 2; j++) {
				newSplit[i - 1][j] = a[i * j];
			}
		}
		//returns the new 2d array
		return newSplit;
	}
	//swaps the values of 2 arrays
	//to swap data sets while keeping excess elements the same
	public void swapArray(int[] a, int[] b) {
		//loops through the smallest length of both arrays
		for(int i = 0; i < (Math.min(a.length, b.length)); i++) {
			//stores the value and then swaps them
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
	}
	//returns the sum of an array of integers
	//useful for finding the total of stored information (ex: hours worked)
	public int sumArray(int[] a) {
		int sum = 0;
		//loops and adds each element on the 
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	//loads a calculator program with user input
	//a basic calculator that can be improved on to do more complex tasks
	public int calculator(Scanner input) {
		//seperate each integer or operand with return
		//assumes valid integer from user
		System.out.println("Calculator loaded:");
		//boolean to end the loop
		boolean terminate = false;
		//fencepost for the loop
		int calc = 0;
		while(!terminate) {
			//stores user input values to calculate
			int a = input.nextInt();
			String operator = input.next();
			int b = input.nextInt();
			//tests for each operator to calculate
			if(operator.contains("*")) {
				calc = a * b;
			} else if(operator.contains("/")) {
				if(b == 0) {
					//lets not divide by 0, restarts
					System.out.println("That's not a good idea.");
					calculator(input);
				} else {
					calc = a / b;
				}
			} else if(operator.contains("+")) {
				calc = a + b;
			} else if(operator.contains("-")) {
				calc = a - b;
			//restarts if invalid operator
			} else {
				System.out.println("Invalid operator.");
				calculator(input);
			}
			System.out.println(calc);
			//ends program, returns final calculation
			System.out.println("Continue? Type end to terminate.");
			if(input.next().equalsIgnoreCase("end")) {
				terminate = true;
			}
			
		}
		return calc;
	}
	//loads a price calculator for items with tax and tip of user input
	//useful to calculate prices with percentages involved
	public double priceCalc(Scanner input) {
		System.out.println("Price calculator loaded:");
		//stores subtotal
		double subtotal = 0.0;
		System.out.println("Enter tax percentage:");
		//user sets the tax rate
		double tax = input.nextDouble() / 100.00 + 1;
		System.out.println("Enter tip percentage (0 if not applicable):");
		//user sets the tip rate if applicable
		double tip = input.nextDouble() / 100.00 + 1;
		
		//asks and stores how many items to buy
		System.out.println("How many items:");
		int items = input.nextInt();
		for(int i = 1; i <= items; i++) {
			//asks and stores the cost for each item, adding it to the total
			System.out.println("Enter next item price:");
			subtotal += input.nextDouble();
		}
		
		//prints out the full receipt
		double total = subtotal * tax * tip;
		System.out.printf("Subtotal: " + "%7.2f\n", subtotal);
		System.out.printf("Tax: " + "%10.2f\n", tax);
		System.out.printf("Tip: " + "%10.2f\n", tip);
		System.out.printf("Total: " + "%10.2f\n", total);
		return total;
	}
	//prints a new file of log and saves the file based on date
	//can be useful to log data or information, and store it to a file
	public String logBook(Scanner input, PrintStream output)
			throws FileNotFoundException {
		System.out.println("Enter today's date(mm.dd.yy):");
		String date = input.next();
		//output file name created on the date
		output = new PrintStream(new File("Log " + date + ".txt"));
		System.out.println("Begin typing (type 'close' to end log):");
		boolean close = false;
		//stores the text to print
		String log = "";
		String logTemp= "";
		//loops until user requests to close
		while(!close) {
			String logLine = input.nextLine();
			//tests if input requests to close the log
			if(logLine.equalsIgnoreCase("close")) {
				close = true;
				logLine = "";
			//else adds the line of text to the log
			} else {
				log = log + "\n" + logLine;
				logTemp = logLine;
			}
			//prints the line to the file
			output.println(logTemp);
		}
		//returns the file as a string
		return log;
	}
	//returns the average of an array
	//can be useful to calculate the average of a data set
	public double avgArray(int[] a) {
		//calls sum method to get sumtotal of the array
		double total = sumArray(a);
		//calculates and returns the average of the array
		return (total / (double)a.length);
	}
	//creates an array that tallies indexes
	//can be useful to keep track of (ex: points for teams, grades, etc)
	public int[] tallyArray(Scanner input) {
		System.out.println("How many tallies to track?");
		//creates a new array with user input length
		int[] tally = new int[input.nextInt()];
		boolean end = false;
		//loops until user inputs close
		while(!end) {
			//tally index cannot exceed array length
			System.out.println("Enter next tally:");
			int inc = input.nextInt();
			if(inc >= tally.length) {
				System.out.println("Not a valid index.");
			} else {
				//increments the input index
				tally[inc]++;
			}
			//terminates if user inputs close
			System.out.println("Continue? Type 'close' to end.");
			if(input.next().equalsIgnoreCase("close")) {
				end = true;
			}
		}
		return tally;
	}
	//reads and prints a text file to the console
	//can be useful to read files and expand and use its contents as data
	public String readData(Scanner input)
			throws FileNotFoundException {
		System.out.println("Enter file name:");
		Scanner read = new Scanner(new File(input.next()));
		String reading = "";
		//consumes the line in the file and adds it to the string until there are no more lines to read
		while(read.hasNextLine()) {
			String temp = read.nextLine();
			reading = reading + temp;
		}
		read.close();
		//returns the file as a string
		return reading;
	}
	
	
	
	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream("test.txt");
		//these arrays are samples to test the array methods
		int[] test= {1, 2, 3, 4, 5};
		int[] test2 = {11, 12, 13, 14, 15};
		int[] test3 = {100, 200, 300, 400, 500, 600, 700, 800};
		myToolBox tools = new myToolBox();
		
		//testing the methods
		
		System.out.println("newMerge = " + Arrays.toString(tools.mergeArray(test, test2)));
		System.out.println("newMerge = " + Arrays.toString(tools.mergeArray(test2, test3)));
		System.out.println();
		
		System.out.println(Arrays.deepToString(tools.splitArray(test)));
		System.out.println(Arrays.deepToString(tools.splitArray(test3)));
		System.out.println();
		
		//print before swap
		System.out.println("test = " + Arrays.toString(test));
		System.out.println("test2 = " + Arrays.toString(test2));
		//call swap method
		tools.swapArray(test, test2);
		//print after swap
		System.out.println("Swap test = " + Arrays.toString(test));
		System.out.println("Swap test2 = " + Arrays.toString(test2));
		System.out.println();
		//print before swap
		System.out.println("test2 = " + Arrays.toString(test2));
		System.out.println("test3 = " + Arrays.toString(test3));
		//call swap method
		tools.swapArray(test2, test3);
		//print after swap
		System.out.println("Swap test2 = " + Arrays.toString(test2));
		System.out.println("Swap test3 = " + Arrays.toString(test3));
		System.out.println();
		
		System.out.println("Sum test = " + tools.sumArray(test));
		System.out.println("Sum test2 = " + tools.sumArray(test2));
		System.out.println();
		
		//requires input to test, so testing 2 instances
		tools.calculator(input);
		tools.calculator(input);
		System.out.println();
		
		//requires input to test, so testing 2 instances
		tools.priceCalc(input);
		tools.priceCalc(input);
		System.out.println();
		
		//test file name placeholder, file save will be based on input
		System.out.println(tools.logBook(input, output));
		System.out.println(tools.logBook(input, output));
		System.out.println();
		
		System.out.println(tools.avgArray(test));
		System.out.println(tools.avgArray(test2));
		System.out.println();
		
		System.out.println(Arrays.toString(tools.tallyArray(input)));
		System.out.println(Arrays.toString(tools.tallyArray(input)));
		System.out.println();
		
		//requires input to test, so testing 2 instances
		System.out.println(tools.readData(input));
		System.out.println(tools.readData(input));
		System.out.println();	
		
	}

}
