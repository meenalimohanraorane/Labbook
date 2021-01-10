/**
 * @author Meenali M. Rane
 * Lab3 - Exercise 5
 * Write a Java program that displays the number of characters, lines and words in a text 
 */
public class CharLinesWords {
	public static void main(String[] args) {
		String text = "Hello Everyone. \nI am Meenali Rane from Goa. \nI am 22 years old. ";
		int characterscount = text.length();
		String [] words = text.split(" "); 
		String [] lines = text.split("\n"); 
		
		System.out.println(text);
		System.out.println("\nCharacters = "+characterscount);
		System.out.println("Words = "+words.length);
		System.out.println("Lines = "+lines.length);
	}
}
