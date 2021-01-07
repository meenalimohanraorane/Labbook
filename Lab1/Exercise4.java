/**
 * 
 * @author Meenali M. Rane
 * Desc: Write a Java program that prompts the user for an integer 
 * and then prints out all the prime numbers up to that Integer?
 * 
 */

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int integer = sc.nextInt();
	
		primes(integer);
		sc.close();
	}
	
	public static void primes(int integer) {
		int i,j,flag;
		if(integer == 0 || integer==1) {
			System.out.println("No Prime Numbers");
			return;
		}
		System.out.print("Prime Numbers : ");
		for(i=2; i<=integer; i++) {
			flag=0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.print(" "+i);
			}
		}
	}
}

