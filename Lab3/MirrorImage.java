/**
 * @author Meenali M. Rane
 * Lab3 -Exercise2
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol 
 */
import java.util.Scanner;

public class MirrorImage {
	public static void main(String[] args) {
		Scanner st  = new Scanner(System.in);
		String string = st.nextLine();
		System.out.println(getImage(string));
		st.close();
	}
	
	public static String getImage(String string) {
		byte[] strArr = string.getBytes();
		byte[] result = new byte[strArr.length];
		for(int i=0; i<result.length; i++) {
			result[i] = strArr[strArr.length - i - 1];
		}
		return string+" | "+new String(result);
	}
	
}