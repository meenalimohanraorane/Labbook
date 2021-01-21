/**
 * @author Meenali M. Rane
 * Lab 6 - Exercise 3
 * Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap 
 * 
 */
import java.util.Map;
import java.util.HashMap;

public class Exercise3 {
	public Map<Integer,Integer> getSquares(int [] numbers)
	{
		Map<Integer,Integer> m1=new HashMap<>();
		int square=0;
		for(int i=0;i<numbers.length;i++)
		{
			square=numbers[i]*numbers[i];
			m1.put(numbers[i],square);
		}
		return m1;
	}

	public static void main(String[] args) {
		Exercise3 exercise3=new Exercise3();
		int [] numbers = {1,2,3,4,5,6,7};
		Map<Integer,Integer> m2=exercise3.getSquares(numbers);
		System.out.println(m2);	
	}
}
