/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class validDate {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Take input from user 
		System.out.println("Enter a date in the format month/day/year");
		String input = keyboard.nextLine();
		
		//Extract parts of the string to individual strings
		String monthString = input.substring(0,input.indexOf("/"));
		String dayString = input.substring(input.indexOf("/")+1,input.lastIndexOf("/"));
		String yearString = input.substring(input.lastIndexOf("/")+1);
		
		//Convert each part to int type
		int day = Integer.parseInt(dayString);
		int month = Integer.parseInt(monthString);
		int year = Integer.parseInt(yearString);
		
		//Month validation
		if (month > 12)
		{
			System.out.println("Invalid Month entered. Must enter a number between 1-12");System.exit(0);
		}
		//30 day month validations
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{				
			if (day > 30)
			{
				System.out.println("Invalid date entered for the given month. Must be between 1-30");
				System.exit(0);
			}
		}	
		
		else if (day > 31) 
		{
			System.out.println("Invalid date entered. Must be between 1-31");
			System.exit(0);
		}
		
		//Leap year check
		if (month == 2 && year % 4 == 0)
			{
				if (year % 100 == 0 && year % 400 != 0)
				{
					System.out.println("Invalid date entered. " + year + " is not a leap year. Day must be between 1-28");
					System.exit(0);
				}
			
			}	
		
		System.out.println(input +" is a valid date!");
		
		
	}

}
