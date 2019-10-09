/* 
 * CS210 Ch7 Exercise 20
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.20 - Fall
 *
 */

package chapter7;

public class Ch7Ex20 {
	
	public static boolean isMagicSquare(int [][] a) {
		//the number to test if the matrix is a magic square
		int magicNumber = 0;
		//an integer to compare to the magic number
		int magicTest = 0;
		//finds the magic number by adding the first row together
		for(int i = 0; i < a[0].length; i++) {
			magicNumber += a[0][i];
		}
		//tests each row in the 2d array
		for(int row = 1; row < a.length; row++) {
			for(int index = 0; index < a[row].length; index++) {
				//adds the row together
				magicTest += a[row][index];
			}
			//if the test is not equal, returns false
			if(magicTest != magicNumber) {
				System.out.println("This is not a magic square.");
				return false;
			}
			//resets the test number for the next row
			magicTest = 0;
		}
		//tests each column in the 2d array
		for(int index = 0; index < a.length; index++) {
			for(int column = 0; column < a[index].length; column++) {
				//adds the column together
				magicTest += a[column][index];
			}
			//if the test is not equal, returns false
			if(magicTest != magicNumber) {
				System.out.println("This is not a magic square.");
				return false;
			}
			//resets the test number for the next column
			magicTest = 0;
		}
		
		int diag1 = 0;
		int diag2 = 0;
		//tests the diagonals in the 2d array
		for(int diag = 0; diag < a.length; diag++) {
			//adds the diagonals together
			diag1 += a[diag][diag];
			diag2 += a[a.length - 1 - diag][diag];
			}
		//if either test is not equal, returns false
		if(diag1 != magicNumber || diag2 != magicNumber) {
			return false;
		}
		

		//prints the statement and returns true
		System.out.println("This array is a magic square.");
		return true;
	}

	public static void main(String[] args) {
		int [][] a = new int [][] { {2, 7, 6},
									{9, 5, 1},
									{4, 3, 8},
									};
		isMagicSquare(a);

	}

}
