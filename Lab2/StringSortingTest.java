/**
* @author Meenali M. Rane
* Lab2 - Exercise2
*Create a method that can accept an array of String objects and sort in alphabetical order. 
*The elements in the left half should be completely in uppercase and 
*the elements in the right half should be completely in lower case. 
*Return the resulting array.
*Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
* Test Code
*/
package com.og.Lab2.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringSortingTest {

	private StringSorting strSort = new StringSorting();
	
	static String inputArrayOdd[]= {"Rane","Naik","Sawant","Pawar","Gaonkar"};
	static String inputArrayEven[]= {"Rane","Naik","Sawant","Pawar","Gaonkar","Salunkhe"};
			
	@Test
	public void test_sortStringAlphabetically_GivenEmptyString_ShouldReturn0() {
		String [] string= {};
		int output = strSort.isEmpty(string.length);
		assertEquals(0, output);
	}
	
	@Test
	public void test_sortStringAlphabetically_GivenOneElement_ShouldReturn0(){
			String [] string= {"Rane"};
			String result=strSort.toUpperCase(string);
			assertEquals("RANE",result);
		}
	
	@Test
	public void test_sortStringAlphabetically_GivenOddElements(){
		String result=strSort.sortAndUpperLowerOdd(inputArrayOdd);
		assertEquals("GAONKAR NAIK PAWAR rane sawant",result);
	}
	
	@Test
	public void test_sortStringAlphabetically_GivenEvenElements(){
		String result=strSort.sortAndUpperLowerEven(inputArrayEven);
		assertEquals("GAONKAR NAIK PAWAR rane salunkhe sawant",result);
	}
}
