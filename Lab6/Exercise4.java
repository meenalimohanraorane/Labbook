/**
 * @author Meenali M. Rane
 * Lab 6 - Exercise 4
 * Student Medals Using Hash Map 
 * 
 */
import java.util.HashMap;
import java.util.Map;

public class Exercise4 {

	public Map<Integer,String> getDetails(Map<Integer,Integer> m1)
	{
		Map<Integer,String> m2=new HashMap<Integer, String>();
		for(Map.Entry<Integer,Integer> entry:m1.entrySet())
		{
			if(entry.getValue()>=90)
			{
				m2.put(entry.getKey(),"gold");
			}
			else if(entry.getValue()>=80)
			{
				m2.put(entry.getKey(),"silver");
			}
			else if(entry.getValue()>=70)
			{
				m2.put(entry.getKey(),"bronze");
			}
		}
		return m2;		
	}
	
	
	public static void main(String[] args) {
	
		Map<Integer,Integer> m1=new HashMap<>();
		m1.put(101, 90);
		m1.put(102, 80);
		m1.put(103, 49);
		m1.put(104, 50);
		m1.put(105, 79);
	    Exercise4 exercise4=new Exercise4();
	    Map<Integer,String> m3=exercise4.getDetails(m1);
	    System.out.println(m3);

	}
}