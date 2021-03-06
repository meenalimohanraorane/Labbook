/**
 * @author Meenali M. Rane
 * Lab3 - Exercise 9
 * Create a method to accept date and print the duration in 
 * days, months and years with regards to current system date.
 */

import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
public class DayMonthYear {  
   public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format: ");
		String inputDate  = scanner.nextLine();
	    findDuration(inputDate);
	    scanner.close();
		
  }
	private static void findDuration(String inputDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate enteredDate = LocalDate.parse(inputDate,formatter);
		LocalDate end = LocalDate.now();
	    Period period = enteredDate.until(end);
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());		
	}
}