/**
 * 
 * @author Meenali M. Rane
 * Lab3 - Exercise 4
 * Create a method that accepts a number and modifies it such that 
 * the each of the digit in the newly formed number is equal to 
 * the difference between two consecutive digits in the original number. 
 * The digit in the units place can be left as it is. 
 */
import java.util.Scanner;
public class DifferenceBetweenNumbers {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		int number1 = st.nextInt();
		System.out.println(modifyNumber(number1));
		st.close();
	}

	private static int modifyNumber(int number1) {
		String str1 = Integer.toString(number1);
		StringBuffer str2 = new StringBuffer(); 
		int number2=0;
		for(int i=0; i<str1.length()-1;i++) {
			str2.append(Math.abs(Character.getNumericValue(str1.charAt(i+1))-Character.getNumericValue(str1.charAt(i))));
		}
		str2.append(str1.charAt(str1.length()-1));
		number2 = Integer.parseInt(str2.toString());
		return number2;
	}

}


