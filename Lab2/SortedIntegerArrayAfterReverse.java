/**
* @author Meenali M. Rane
* Lab2 - Exercise3
* Create a method which accepts an integer array, 
* reverse the numbers in the array and returns the resulting array in sorted order
* Production Code
*/
package com.og.Lab2.util;

import java.util.Arrays;

public class SortedIntegerArrayAfterReverse {

	public int isEmpty(int[] input) {
		return 0;
	}

	public int ifSingleElement(int[] input) {
		return input[0];
	}

	public int ifSameElement(int[] input) {
		int count=0;
		int output=0;
		for(int i=1;i<input.length;i++) {
	    	if(input[0]==input[i]) {
	    			count++;
			}
		}
		if(count==input.length-1) {
			output=input[0];
		}
		return output;
	}

	public int ifDifferentElement(int[] input) {
		int input_op[]=new int[input.length];
		String input_string="";
		int j=0;
		for(int i=input.length-1;i>=0;i--){
			input_op[j]+=input[i];
			j++;
		}
		Arrays.sort(input_op);
		for(int i=0;i<input_op.length;i++) {
			input_string+=input_op[i];
		}
	    int sorted_result=Integer.parseInt(input_string);
	     return sorted_result;
	}
	
//	public static int getSorted(int input_array[]) {
//		int result=0;
//		if(input_array.length==0) {
//			result=isEmpty(input_array.length);
//	}
//		else 
//			if(input_array.length==1) {
//				result=isSingleElementThere(input_array[0]);
//	}
//		else
//			if(input_array.length>1 && input_array[0]==input_array[1] && input_array[1]==input_array[input_array.length-1]) {
//				result=ifSameElementAllAcrossArray(input_array);
//				
//	}
//		else {
//			result=ifDifferentElement(input_array);
//	}
//		return result;
//	}
	
}
