/**
* @author Meenali M. Rane
* Lab2 - Exercise1
* Create a method which accepts an array of integer elements 
* and return the second smallest element in the array
* Test Code
*/

package com.og.Lab2.util;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class SecondSmallestTest extends TestCase {
	//private SecondSmallest secSmall;
	SecondSmallest secSmall= new SecondSmallest();
	private static int SINGLE_NUMBER = 10;
	private static int EXPECTED_ANSWER = 20;
	
//	@Before
//	void setup() {
//		secSmall= new SecondSmallest();
//	}
	
	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0() {
		int[] numbers = {};
		int result = secSmall.getSecondSmallest(numbers);
		assertEquals(0,result);
	}
	
	@Test
	public void test_getSecondSmallest_GivenSingleNumberInIntegerArray_ShouldReturnNumber() {
		int[] numbers = {SINGLE_NUMBER};
		int result = secSmall.getSecondSmallest(numbers);
		assertEquals(SINGLE_NUMBER,result);
	}	
	
	@Test
	public void test_getSecondSmallest_Given10and20InIntegerArray_ShouldReturn20() {
		int[] numbers = {10, EXPECTED_ANSWER};
		int result = secSmall.getSecondSmallest(numbers);
		assertEquals(EXPECTED_ANSWER,result);
	}	
}
