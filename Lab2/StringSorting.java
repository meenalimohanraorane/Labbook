/**
* @author Meenali M. Rane
* Lab2 - Exercise2
*Create a method which accepts an integer array, 
*reverse the numbers in the array and 
*returns the resulting array in sorted order* 
*Production Code
*/

package com.og.Lab2.util;

import java.util.Arrays;

public class StringSorting {

	public int isEmpty(int length) {
		return length;
	}

	public String toUpperCase(String[] string) {
		String output = string[0].toUpperCase();
		return output;
	}

	public String sortAndUpperLowerOdd(String[] inputArrayOdd) {
		Arrays.sort(inputArrayOdd);
		String output = "";
		for(int i=0;i<(inputArrayOdd.length/2)+1;i++) {
			  output+=inputArrayOdd[i].toUpperCase()+" ";
		}
	    for(int j=(inputArrayOdd.length/2)+1;j<inputArrayOdd.length;j++) {
	    	  if(j==inputArrayOdd.length-1) {
	    		  output+=inputArrayOdd[j].toLowerCase();		  
	    	  }
		      else {
			      output+=inputArrayOdd[j].toLowerCase()+" ";
		      }
	    }
	    return output;
	}

	public String sortAndUpperLowerEven(String[] inputArrayEven) {
		Arrays.sort(inputArrayEven);
		String output = "";
		for(int i=0;i<(inputArrayEven.length/2);i++) {
			  output+=inputArrayEven[i].toUpperCase()+" ";
		}
	    for(int j=(inputArrayEven.length/2);j<inputArrayEven.length;j++) {
	    	  if(j==inputArrayEven.length-1) {
	    		  output+=inputArrayEven[j].toLowerCase();		  
	    	  }
		      else {
			      output+=inputArrayEven[j].toLowerCase()+" ";
		      }
	    }
	    return output;
	}
}

//String output="";
//if(input.length==1) {
//	output+=ifSingleElementIsThere(input);
//}
//if(input.length%2==0) {
//	output+=split_even(input);
//}
//	if(input.length%2==1 && input.length>1) {
//		output+=split_odd(input);
//}
// return output;