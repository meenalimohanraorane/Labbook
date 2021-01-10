/**
 * @author Meenali M. Rane
 * Lab3 -Exercise3
 * Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 */

import java.util.Scanner;
public class ReplaceConsonants {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String string = st.nextLine();
		System.out.println(alterString(string.toCharArray()));
		st.close();
	}

	private static String alterString(char [] string) {
		char[] result = new char[string.length];
		for(int i=0;i<string.length;i++) {
			if(string[i]=='a') {
				result[i]= 'b';
			}
			else if(string[i]=='A') {
				result[i]= 'B';
			}
			else if(string[i]=='e') {
				result[i]= 'f';
			}
			else if(string[i]=='E') {
				result[i]= 'F';
			}
			else if(string[i]=='i') {
				result[i]= 'j';
			}
			else if(string[i]=='I') {
				result[i]= 'J';
			}
			else if(string[i]=='o') {
				result[i]= 'P';
			}
			else if(string[i]=='O') {
				result[i]= 'P';
			}
			else if(string[i]=='u') {
				result[i]= 'v';
			}
			else if(string[i]=='U') {
				result[i]= 'V';
			}
			else {
				result[i]=string[i];
			}
		}
		return new String(result);
	}

}


//
//public class Exercise3 {
//
//	static boolean isVowel(char ch){ 
//        if (ch != 'a' && ch != 'e' && ch != 'i'
//                && ch != 'o' && ch != 'u'&& ch != 'A' && ch != 'E' && ch != 'I'
//                && ch != 'O' && ch != 'U'){ 
//            return false; 
//        } 
//        return true; 
//    }
//    static String replaceConsonants(char[] s){ 
//        for (int i = 0; i < s.length; i++){ 
//            if (!isVowel(s[i])){
//                if (s[i] == 'z'){ 
//                    s[i] = 'b'; 
//                } 
//                else{
//                    s[i] = (char) (s[i] + 1); 
//                    if (isVowel(s[i])){ 
//                        s[i] = (char) (s[i] + 1); 
//                    } 
//                } 
//            } 
//        } 
//        return String.valueOf(s); 
//    } 
//  	    public static void main(String[] args){ 
//        String s = "JAVA"; 
//        System.out.println(replaceConsonants(s.toCharArray())); 
//    } 
//}