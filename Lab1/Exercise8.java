/**
 * 
 * @author Meenali M. Rane
 * Desc:Create a method to check if a number is a power of two or not
 *
 */
import java.util.Scanner;
public class Exercise8 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(checkNumber(n)) {
			System.out.println(n+" is a power of 2");
		}
		else {
			System.out.println(n+" is a not power of 2");
		}
		sc.close();
	}
	
	public static boolean checkNumber(int n) {
		int two = 2, mul = 2;
		boolean flag=false;
		if(n%2==0) {
			for(int i=0; i<n; i++) {
				mul *= two;
				if(mul==n) {
					flag = true;
					break;
				}
			}
			
		}
		return flag;
	}
}


//Logic 				Check if the input is a power of two. 
//						Ex: 8 is a power of 2 
