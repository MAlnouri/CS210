import java.util.*;

public class NumAdding {
	
	public static void adding(Scanner a) {
		Random r = new Random();
		int wrong = 0;
		int points = 0;
		while(wrong != 3) {
			//randomly chooses the number of numbers to add
			int numbers = r.nextInt(4) + 2;
			//sets the sum to 0
			int sum = 0;
			//fence post for the loop
			int firstNumber = r.nextInt(10) + 1;
			sum += firstNumber;
			System.out.print(firstNumber);
			//prints and adds the numbers together
			for(int i = 2; i <= numbers; i++);{
				int nextNumber = r.nextInt(10) + 1;
				System.out.print(" + " + nextNumber);
				sum += nextNumber;
				
			}
			System.out.print(" = ");
			//stores user answer
			int guess = a.nextInt();
			if(guess != sum) {
				//if sum was incorrect, increments wrong answers
				System.out.println("That answer was incorrect.");
				wrong++;
			} else {
				//if answer was right, increments their points
				points++;
			}	
			
		}
		//ends the program and prints their points
		System.out.println("You earned " + points + " points!");
		
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		adding(console);
		
	}

}
