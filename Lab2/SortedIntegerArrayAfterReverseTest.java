/**
* @author Meenali M. Rane
* Lab2 - Exercise3
*Create a method which accepts an integer array, 
*reverse the numbers in the array and returns the resulting array in sorted order
* Test Code
*/
package com.og.Lab2.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedIntegerArrayAfterReverseTest {

	private SortedIntegerArrayAfterReverse sortArray = new SortedIntegerArrayAfterReverse();
	
	@Test
	public void test_isEmpty_GivenEmptyArray_Return0() {
		int input[]= {};
		int result= sortArray.isEmpty(input);
		assertEquals(0,result);
	}
	
	@Test
	public void test_ifSingleElement_GivenOneElement_ShouldReturnElement() {
		int input[]= {5};
		int result= sortArray.ifSingleElement(input);
		assertEquals(input[0],result);
	}
	
	@Test
	public void test_ifSameElement_GivenSameElements_ShouldReturnSameArray() {
		int input[]= {9,9,9,9,9,9,9,9,9};
		int result= sortArray.ifSameElement(input);
		assertEquals(input[7],result);
	}

	@Test
	public void test_ifDifferentElement_GivenDifferentElements_ShouldReturn123456789() {
		int input[]= {9,7,6,5,4,3,2,1};
		int result= sortArray.ifDifferentElement(input);
		assertEquals(12345679,result);
	}
}
