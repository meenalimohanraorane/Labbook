/**
* @author Meenali M. Rane
* Lab2 - Exercise4
* Create a method which accepts an integer array and 
* removes all the duplicates in the array. 
* Return the resulting array in descending order
* Production Code
*/
package com.og.Lab2.util;

import java.util.Arrays;

public class RemoveDuplicateAndDescending {

	public int modifyArray(int[] input) {

		if(input.length==1) {
			return input[0];
		}
		
		if(input.length==2) {
			if(input[0]==input[1]) {
				int result[] = new int[1];
				result[0]=input[0];
				return result[0];
			}
			else {
				int result[]=new int[2];
				Arrays.sort(input);
				result[0]= input[1];
				result[1]= input[0];
				return result[0]; 	
			}		
		}
		
		if(input.length>2) {
			Arrays.sort(input);
			String dupresult="";
			int count = 0;
			int k=0;
			int j;
			for(int i=0;i<input.length;i++) {
				for(j=i+1;j<input.length;j++) {
					if(input[i]==input[j]) {
						count++;
					}
				}
				if(count==0) {
					dupresult+=input[i];
					k++;
				}
				count=0;
			}

			int n = Integer.parseInt(dupresult);
			int result[] = new int[k];
			for(int i=0;i<k;i++) {
					result[i]=n%10;
					n/=10;
			}
			return result[1];
		}
		return 0;
	}
}
