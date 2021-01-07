/**
 * 
 * @author Meenali M. Rane
 * Desc: Create a class with a method which can calculate the sum 
 * of first n natural numbers which are divisible by 3 or 5.
 *
 */
import java.util.Scanner;
public class Exercise5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(calculateSum(n));
		sc.close();
	}
	
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
}
