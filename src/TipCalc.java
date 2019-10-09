import java.util.*;

public class TipCalc {
	
	public static void tip(Scanner a) {
		
		double subtotal = 0.0;
		//sets the tax rate
		double tax = 1.09;
		//sets the tip rate
		double tip = 1.15;
		
		//asks and stores how many people to calculate for
		System.out.println("How many people are eating?");
		int people = a.nextInt();
		for(int i = 1; i <= people; i++) {
			//asks and stores the cost for each person, adding it to the total
			System.out.println("Person " + i + " . How much did your meal cost?");
			subtotal += a.nextDouble();
		}
		
		//prints out the full receipt
		double total = subtotal * tax * tip;
		System.out.printf("Subtotal: " + "%7.2f\n", subtotal);
		System.out.printf("Tax: " + "%10.2f\n", tax);
		System.out.printf("Tip: " + "%10.2f\n", tip);
		System.out.printf("Total: " + "%10.2f\n", total);

		
	}
	

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		tip(console);
	}

}
