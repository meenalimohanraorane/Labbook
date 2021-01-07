/**
 * 
 * @author Meenali M. Rane
 * Desc:Create a class with a method to find 
 * the difference between the sum of the squares 
 * and the square of the sum of the first n natural numbers.
 *
 */
import java.util.Scanner;
public class Exercise6 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(calculateDifference(n));
		sc.close();	
	}
	
	public static int calculateDifference(int n) {
		int sum1=0, sum2=0, difference=0;
		for(int i=1;i<=n;i++) {
			sum1+=i*i;
		}
		for(int i=1;i<=n;i++) {
			sum2+=i;
		}
		sum2*=sum2;
		difference = sum1 - sum2;	
		return difference;
	}
}
