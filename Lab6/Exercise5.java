/**
 * @author Meenali M. Rane
 * Lab 6 - Exercise 5
 * Create a method which accepts an array of integer elements and return the second smallest element in the array
 * 
 */
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Exercise5 {
	public int getSecondSmallest(Integer[] arr)
	{ 
		List<Integer> al = (Arrays.asList(arr)); 
		Collections.sort(al);
		int secondSmallest = al.get(1);
		return secondSmallest;
	}

	public static void main(String[] args) {	
		Exercise5 exercise5=new Exercise5();
		Integer[] arr = new Integer[] {31,52,17,29,81};
		int secondSmallest = exercise5.getSecondSmallest(arr);
		System.out.println(secondSmallest);
	}
}
