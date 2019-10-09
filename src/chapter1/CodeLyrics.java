/* 
 * CS210 Project 07
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.09.25 - Fall
 *
 */

package chapter1;

public class CodeLyrics {
	
	public static void compile() {
		System.out.println("I don't know why it wouldn't compile,");
		System.out.println("My TA just smiled.");
		System.out.println();
		
	}
	
	public static void print() {
		System.out.println("I added System.out.println(\"I <3 coding\"),");
		compile();
		
	}
	
	public static void escape() {
		System.out.println("I added a backslash to escape the quotes,");
		print();
		
	}
	
	public static void method() {
		System.out.println("I added a main method with its String[] args,");
		escape();
		
	}
	
	public static void scum() {
		System.out.println("I added a public class and called it Scum,");
		method();
		
	}
	
	
	public static void verse1() {
		System.out.println("I once wrote a program that wouldn't compile");
		compile();
	}
	
	public static void verse2() {
		System.out.println("My program did nothing");
		System.out.println("So I started typing.");
		print();
	}
	
	public static void verse3() {
		System.out.println("\"Parse error,\" cried the compiler");
		System.out.println("Luckily I'm such a code baller.");
		escape();
	}
	
	public static void verse4() {
		System.out.println("Now the compiler wanted an identifier");
		System.out.println("And I thought the situation was getting dire.");
		method();
	}
	
	public static void verse5() {
		System.out.println("Java complained it expected an enum");
		System.out.println("Boy, these computers really are dumb!");
		scum();
	}

	public static void main(String[] args) {
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		

	}

}
