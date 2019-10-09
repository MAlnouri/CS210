/* 
 * CS210 Ch2 Project 08
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.01 - Fall
 *
 */

package chapter2;

public class Ch2Proj8 {
	
	//value determines the size of the book
	public static int size = 10;
	
	//draws the dashes as the edges of the book
	public static void dashes() {
		System.out.print("+");
		
		for(int c=1; c <= 30; c++) {
			System.out.print("-");
		}
		System.out.print("+");
	}
	
	//dynamic value to draws the pages on the bottom
	public static int slashes = size;
	
	//draws the text on the book
	public static void text() {
		
		for(int a=1; a <= size/2; a++) {
		
			System.out.print("|");
			spacing();
			System.out.print("Building Java Programs");
			spacing();
			System.out.print("|");
			
			for(int c=1; c <= slashes; c++) {
				System.out.print("/");
				
			}
			slashes-=2;
			System.out.println();
			
		}

	}
	
	//draws the spacing to center the text
	public static void spacing() {
		
		for(int a=1; a <= 4; a++) {
			System.out.print(" ");
		}
	}
	

	public static void main(String[] args) {

		//draws the entire book
		for(int a=1; a <=1; a++) {
			
			//draws the empty space around the book
			for(int c=1; c <= size; c++) {
				System.out.print(" ");
			}
			dashes();
			System.out.println();
			
			//draws the front page of the book
			for(int b=1; b <= size; b++) {
				
				for(int c=1; c <= size-b; c++) {
					System.out.print(" ");
					
				}
				System.out.print("/");
				
				for(int c=1; c <= 32-(b*3); c++) {
					System.out.print(" ");
					
				}
				
				for(int c=1; c <= b; c++) {
					System.out.print("__/");
					
				}
				
				for(int c=1; c <=b-1; c++) {
					System.out.print("/");
					
				}
				System.out.println();
				
			}
			dashes();
			
			//draws the bottom of the book
			for(int c=size; c >= 1; c--) {
				System.out.print("/");
				
			}
			System.out.println();
			text();
			dashes();
			
			
		}

	}

}
