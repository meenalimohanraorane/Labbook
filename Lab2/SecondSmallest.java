/**
* @author Meenali M. Rane
* Lab2 - Exercise1
* Create a method which accepts an array of integer elements 
* and return the second smallest element in the array
* Production Code
*/

package com.og.Lab2.util;

public class SecondSmallest {

	public int getSecondSmallest(int[] numbers) {
		if(isEmpty(numbers)) {
			return 0;
		}
		else if(numbers.length==2) {
			return(Math.max(numbers[0],numbers[1]));
		}
		return numbers[0];
	}
	
	private boolean isEmpty(int [] numbers) {
		return numbers.length==0;
	}


}
