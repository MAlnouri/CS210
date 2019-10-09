/* 
 * CS210 Project 03
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class Lyrics {
	
	public static void verse1() {
		System.out.println("There was an old lady who swallowed a fly");
		System.out.println("I don’t know why she swallowed the fly");
		System.out.println("Perhaps she’ll die");
		System.out.println("But it’s only a fly");
		System.out.println("I think I’ll cry");
		System.out.println("She gulped it out of the sky");
		System.out.println("Oh, my!");
		System.out.println();
		
	}
	
	public static void fly() {
		System.out.println("She swallowed the spider to catch the fly");
		System.out.println("I don’t know why");
		System.out.println("She swallowed the fly");
		System.out.println("Perhaps she’ll die.");

		
	}
	
	public static void verse2() {
		System.out.println("There was an old lady who swallowed a spider");
		System.out.println("That wiggled and jiggled and tickled inside her.");
		fly();
		System.out.println("Gone to the by and by");
		System.out.println("Sigh");
		System.out.println();
		
	}
	
	public static void spider() {
		System.out.println("She swallowed the bird to catch the spider.");
	}
	
	public static void verse3() {
		System.out.println("There was an old lady who swallowed a bird.");
		System.out.println("How absurd! She swallowed a bird!");
		spider();
		fly();
		System.out.println("She’ll leave us high and dry.");
		System.out.println("");
		
	}
	
	public static void bird() {
		System.out.println("She swallowed the cat to catch the bird.");
		
	}
	
	public static void verse4() {
		System.out.println("There was an old lady who swallowed a cat.");
		System.out.println("Imagine that! She swallowed a cat.");
		bird();
		spider();
		fly();
		System.out.println("I hope it’s a lie.");
		System.out.println("");
		
	}
	
	public static void cat() {
		System.out.println("She swallowed the dog to catch the cat.");
	}
	
	public static void verse5() {
		System.out.println("There was an old lady who swallowed a dog.");
		System.out.println("She went whole hog to swallow the dog.");
		cat();
		bird();
		spider();
		fly();
		System.out.println("There’s a tear in my eye.");
		System.out.println("");
		
	}
	
	public static void dog() {
		System.out.println("She swallowed the cow to catch the dog.");
	}
	
	public static void verse6() {
		System.out.println("There was an old lady who swallowed a cow.");
		System.out.println("I don’t know how she swallowed the cow.");
		dog();
		cat();
		bird();
		spider();
		fly();
		System.out.println("I’d rather have ham on rye.");
		System.out.println("");
		
	}
	
	public static void verse7() {
		System.out.println("And she had a frog on the sly.");
		System.out.println("She did it in one try.");
		System.out.println("There was an old lady who swallowed a horse.");
		System.out.println("She died, of course.");
		System.out.println("It was the last course.");
		System.out.println("I’m filled with remorse.");
		System.out.println("What’s left to say...");
		System.out.println("Even the artist is crying.");
		System.out.println("We’ll miss her dearly.");
		System.out.println("It is such a loss.");
		System.out.println("She had no time to floss.");
		System.out.println("She missed out on the sauce.");
		System.out.println();
		System.out.println("Moral: Never swallow a horse.");
		
	}
	

	public static void main(String[] args) {
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();
		verse7();
		
	}

}
