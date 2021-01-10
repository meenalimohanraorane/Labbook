/**
* @author Meenali M. Rane
* La3 - Exercise1
* Write a Java program that reads a line of integers 
* and then displays each integer and the sum of all integers. 
* (Use String Tokenizer class)
* Production Code
*/
package com.og.Lab3.util;

public class IntegersAndSum {

	public String displayIntegersAndSum(int[] input) {
		if(input.length==1) {
			return "Integer = "+input[0]+" | Sum = "+input[0];
		}
		if(input.length>1) {
			String output="";
			int sum=0;
			for(int i=0;i<input.length;i++) {
				output+=input[i];
				sum+=input[i];
			}
			return "Integer = "+output+" | Sum = "+sum;
		}
		return "0";
	}

}
