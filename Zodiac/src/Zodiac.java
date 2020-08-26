/*
 * Written by Adam Hoover
 */

import java.util.Scanner;
public class Zodiac {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Take users birthmonth and date as input strings
		System.out.println("Enter your Birth Month (1-12) followed by the Day (1-31): \r\n");
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		
		// Initialize string to store sign  
		String zodiacSign = "";
		
		// Check for date validation
		if (month < 1 || month > 12 || day < 1 || day > 31)
			System.out.println ("Invalid Month/Day combo");
		
		// Branching if statements to determine Sign
		if (month == 1)
			{
	
				if (day <= 19)
					zodiacSign = "Capricorn";
				
				else
					zodiacSign = "Aquarius";
				
			}
		
		else if (month == 2)
			{
				// Check for month specific date validation
				if (day > 28)
					System.out.println("Invalid day");
				else if (day <= 18)
					zodiacSign = "Aquarius";
				
				else
					zodiacSign = "Pisces";
			}
		
		else if (month == 3)
			{
				if (day <= 20)
					zodiacSign = "Pisces";
				
				else
					zodiacSign = "Aries";
			}
		
		else if (month == 4)
			{
				if (day > 30)
					System.out.println("Invalid day");
				
				else if (day <= 19)
					zodiacSign = "Aries";
				
				else
					zodiacSign = "Taurus";
			}
		
		else if (month == 5)
			{
				if (day <= 20)
					zodiacSign = "Taurus";
				
				else
					zodiacSign = "Gemini";
			}

		else if (month == 6)
			{
			if (day > 30)
				System.out.println("Invalid day");
			
			else if (day <= 20)
					zodiacSign = "Gemini";
				
				else
					zodiacSign = "Cancer";
			}

		else if (month == 7)
			{
				if (day <= 22)
					zodiacSign = "Cancer";
				
				else
					zodiacSign = "Leo";
			}
		
		else if (month == 8)
			{
				if (day <= 22)
					zodiacSign = "Leo";
				
				else
					zodiacSign = "Virgo";
			}
		
		else if (month == 9)
			{
			if (day > 30)
				System.out.println("Invalid day");
			
			else if (day <= 22)
					zodiacSign = "Virgo";
				
				else
					zodiacSign = "Libra";
			}
		
		else if (month == 10)
			{
				if (day <= 22)
					zodiacSign = "Libra";
				
				else
					zodiacSign = "Scorpio";
			}
		
		else if (month == 11)
			{
				if (day > 30)
					System.out.println("Invalid day");
				
				else if (day <= 21)
					zodiacSign = "Scorpio";
				
				else
					zodiacSign = "Sagittarius";
			}
		
		else if (month == 12)
			{
			if (day <= 21)
				zodiacSign = "Sagittarius";
			
			else
				zodiacSign = "Capricorn";
			}
		
		// Print determined sign
		System.out.println ("Your sign is " + zodiacSign);
		
		
		
	}

}
