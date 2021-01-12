/**
 * @author Meenali M. Rane
 * Lab5 - Exercise 1, 2, 3
 */
package com.cg.eis.exception;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/**
		 * Exercise 2
		 */
		System.out.print("Enter Name Of Employee (Format : First Last) : ");
	    try{
	    	String name = s.nextLine();
	    	if(name=="") {
	    		throw new InvalidNameException("Name Cannot Be Blank. Enter a Valid Name");
	    	}
	    	if (name.indexOf(" ")==-1){
	    		throw new InvalidNameException("Name Should Have Both First and Last Name. Enter a Valid Name");
	    	}
	    } 
	    catch(InvalidNameException e) {
	    	System.out.println(e.getMessage());
	    }
	    
	    /**
	     * Exercise 1
	     */
		System.out.print("Enter Age Of Employee : ");
	    try{
	    	int age = s.nextInt();
	    	if( age<=15 || age>100) {
	    		throw new InvalidAgeException("Age Should Be Above 15 years. Enter a Valid Age.");
	    	}
	    } 
	    catch(InvalidAgeException e) {
	    	System.out.println(e.getMessage());
	    }
		
		/**
		 * Exercise 3
		 */
		System.out.print("Enter Salary Of Employee : ");
		try{
			double salary = s.nextDouble();
			if( salary<3000) {
	    		throw new EmployeeException("Salary cannot be less than INR 3000. Enter a Valid Salary.");
	    	}
	    } 
	    catch(EmployeeException e) {
	    	System.out.println(e.getMessage());
		}
	}
}
