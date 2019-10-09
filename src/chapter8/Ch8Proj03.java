/* 
 * CS210 Ch8 Project 03
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.27 - Fall
 *
 */

package chapter8;

public class Ch8Proj03 {
	
	public class GroceryList {
		//array for list of items
		GroceryItemOrder[] List;
		//tracks the number of items
		int ListIndex;
		//constructs new list
		public GroceryList() {
			List = new GroceryItemOrder[10];
			ListIndex = 0;
		}
		//adds item order to the list if less than 10 items
		public void add(GroceryItemOrder item) {
			this.List[ListIndex] = item;
			ListIndex++;
		}
		//returns the total cost of all items in the list
		public double getTotalCost() {
			double cost = 0;
			for(int i = 0; i < this.ListIndex; i++) {
				cost += this.List[i].getCost();
			}
			return cost;
		}
		
	}
	
	public class GroceryItemOrder {
		String name;
		int quantity;
		double pricePerUnit;
		
		//constructs item order with item name, quantity and cost per unit
		public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
			this.name = name;
			this.quantity = quantity;
			this.pricePerUnit = pricePerUnit;
		}
		//returns total cost of item order
		public double getCost() {
			return quantity * pricePerUnit;
		}
		//returns quantity of item
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
	}


	public static void main(String[] args) {

	}

}
