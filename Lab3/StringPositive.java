/**
 * @author Meenali M. Rane
 * Lab3 - Exercise 8
 * Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right 
 * each character in the String comes after the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
 */
import java.util.Scanner;

public class StringPositive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		if(checkString(str)) {
			System.out.println(str+" is positive string");
		}
		else {
			System.out.println(str+" is not a positive string");
		}
		sc.close();
		
	}
	private static boolean checkString(String str) {
		char [] array = str.toCharArray();
		char beforeChar=array[0];
		for(int i=0;i<str.length();i++) {
			if(array[i]<beforeChar) {
				return false;
			}
			beforeChar = array[i];
		}
		return true;
	}
}
