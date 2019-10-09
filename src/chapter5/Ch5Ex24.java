/* 
 * CS210 Ch5 Exercise 24
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.10.23 - Fall
 *
 */

package chapter5;

public class Ch5Ex24 {
	
	public static boolean isAllVowels(String a) {
		//sets the string to lowercase letters
		String s = a.toLowerCase();
		//sets a boolean testing for vowel letters
		boolean allVowels = true;
		//variable to increment the loop to match length
		int L = 0;
		
		//loop that continues until L reaches the string length or allVowels is set to false
		while(allVowels == true && L != s.length()) {
			//checks if the char in the loop is a vowel
			for(int i = 0; i < s.length(); i++) {
				//sets the char to test
				char vowel = s.charAt(i);
				//if the char is a vowel, continues the loop
				if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
					//increments L
					L++;
				} else {
					//if the char is not a vowel, prints the statement and terminates the program
					System.out.println("This word is not all vowels.");
					allVowels = false;
					return false;
				}
				
			}
			
		}
		//if the loop ends, then all chars were tested to be vowels
		//prints the statement and terminates the program
		System.out.println("This word is all vowels.");
		return true;
	}

	public static void main(String[] args) {
		isAllVowels("aeiou");

	}

}
