/**
 * 
 * @author Meenali M. Rane
 * Desc: Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green with radio buttons. 
 * On entering the choice, 
 * an appropriate message with “stop” or “ready” or “go” should appear in the console .
 * Initially there is no message shown.
 */
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String signal = sc.nextLine();
		
		switch(signal) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		case "green":
			System.out.println("go");
			break;
		}
		sc.close();
	}
}

