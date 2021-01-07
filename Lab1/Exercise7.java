/**
 * 
 * @author Meenali M. Rane
 * Desc:Create a method to check if a number is an increasing number
 *
 */
import java.util.Scanner;
public class Exercise7 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(checkNumber(number)) {
			System.out.println(number + " is an increasing number");
		}
		else { 
			System.out.println(number + " is not an increasing number");
		}
		sc.close();	
	}
	
	public static boolean checkNumber(int number) {
		int left, right;
		int flag = 1;
		right = number%10;
		number/=10;
		for(;number!=0;number/=10) {
			left=number%10;
			if(left<=right) {
				right = left;
				flag = 0;
				continue;
			}
			flag = 1;
		}
		if(flag==0) {
			return true;
		}
		else {
			return false;
		}
	}
}