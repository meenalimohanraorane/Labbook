/**
 * @author Meenali M. Rane
 * Lab 6 - Exercise 1
 * Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {

	public List<String> getValues(Map<Integer,String> m1)
	{
		List<String> l1=new ArrayList<String>();
		for(Map.Entry<Integer,String> entry:m1.entrySet())
		{
		 l1.add(entry.getValue());
		}
		Collections.sort(l1);
		
		return l1;	
	}
	
	public static void main(String[] args) {
		
		Map<Integer,String> m1=new HashMap<>();
		Exercise1 exercise1=new Exercise1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=scanner.nextInt();
		for(int i=0;i<size;i++)
		{
			
			System.out.println("Enter the id");
			int id=scanner.nextInt();
			System.out.println("Enter the name");
			String name=scanner.next();
			m1.put(id,name);
		}
		List<String> l2=exercise1.getValues(m1);
		System.out.println(l2);
		scanner.close();
				
	}
}
