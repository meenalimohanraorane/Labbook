/**
 * @author Meenali M. Rane
 * Lab 6 - Exercise 2
 * Create a method that accepts a character array and count the number of times each character is present in the array.
 */
import java.util.TreeMap;
import java.util.Map;

public class Exercise2 {
	public Map<Character,Integer> countChars(char[] arr)
	{
		Map<Character,Integer> m1=new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(m1.containsKey(arr[i]))
			{
				m1.put(arr[i],m1.get(arr[i])+1);
			}
			else
			{
				m1.put(arr[i],1);
			}
		}
		return m1;
	}
	
	public static void main(String args[])
	{
		Exercise2 exercise2=new Exercise2();
		char [] arr= {'m','e','e','n','a','l','i','i'};
		Map<Character,Integer> m2 =exercise2.countChars(arr);
		System.out.println(m2);
	}
}
