/**
 * @author Meenali M. Rane
 * Lab 6 - Exercise 6
 * Create a method which accepts an array of integer elements and return the second smallest element in the array
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise6 {

	public void modify(Integer arr[]) {

		List<Integer> al1 = (Arrays.asList(arr));
		List<String> al2 = new ArrayList<String>();
		for (Integer i : al1) {
			String str = i.toString();
			// System.out.println(str);
			StringBuilder builder = new StringBuilder(str);
			String res = builder.reverse().toString();
			// System.out.println(builder);
			al2.add(res);
		}
		
		// System.out.println(al2);
		Integer arr2[] = new Integer[al2.size()];
		for (Integer j = 0; j < al2.size(); j++) {
			arr2[j] = Integer.parseInt(al2.get(j));
			//System.out.println(arr2[j]);
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.asList(arr2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[] { 101, 102, 10367, 789 };
		Exercise6 exercise6 = new Exercise6();
		exercise6.modify(arr);
	}
}