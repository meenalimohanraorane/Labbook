/**
* @author Meenali M. Rane
* La3 - Exercise1
* Write a Java program that reads a line of integers 
* and then displays each integer and the sum of all integers. 
* (Use String Tokenizer class)
* Test Code
*/
package com.og.Lab3.util;

import org.junit.Test;

import junit.framework.TestCase;

public class IntegersAndSumTest extends TestCase {
	private IntegersAndSum intSum = new IntegersAndSum();
	
	@Test
	public void test_displayIntegersAndSum_GivenEmptyArray_Return0() {
		int input[]= {};
		String result=intSum.displayIntegersAndSum(input);
		assertEquals("0",result); 
	}
	
	@Test
	public void test_displayIntegersAndSum_GivenOneElement_ReturnsElement() {
		int input[]= {7};
		String result=intSum.displayIntegersAndSum(input);
		assertEquals("Integer = 7 | Sum = 7",result); 
	}
	
	@Test
	public void test_displayIntegersAndSum_GivenArrrayOfElements_ReturnsElementsAndSum() {
		int input[]= {1,2,3,4,5};
		String result=intSum.displayIntegersAndSum(input);
		assertEquals("Integer = 12345 | Sum = 15",result); 
	}
}
