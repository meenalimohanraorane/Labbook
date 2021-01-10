/**
* @author Meenali M. Rane
* Lab2 - Exercise4
* Create a method which accepts an integer array and 
* removes all the duplicates in the array. 
* Return the resulting array in descending order
* Test Code
*/
package com.og.Lab2.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDuplicateAndDescendingTest {

	private RemoveDuplicateAndDescending remDupDes = new RemoveDuplicateAndDescending();
	
	@Test
	public void test_modifyArray_GivenEmptyArray_Return0() {
		int [] input = {};
		int result = remDupDes.modifyArray(input);
		assertEquals(0,result);
	}
	
	@Test
	public void test_modifyArray_GivenSingleElement_ReturnElement(){
	    int input[]= {1};
	    int result=remDupDes.modifyArray(input);
	    assertEquals(input[0], result);
	}
	
	@Test
	public void test_modifyArray_Given2NonDuplicateElements_ReturnDecendingArray() {
		int input[]= {1,2};
		int expected=input[1];
		int result=remDupDes.modifyArray(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void test_modifyArray_Given2DuplicateElements_ReturnNonDuplicateArray() {
		int input[]= {2,2};
		int result=remDupDes.modifyArray(input);
		assertEquals(2, result);
	}
	
	@Test
	public void test_modifyArray_GivenMoreThan2Elements_ReturnNonDuplicateArray() {
		int input[]= {1,3,5,6,3,5,7,9,4,6,8,9,2,2};
		// expected[]={9,8,7,6,5,4,3,2,1};
		int result=remDupDes.modifyArray(input);
		assertEquals(8, result);
	}
	
}
