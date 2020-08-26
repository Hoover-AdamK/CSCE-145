/*
 * Written by Adam Hoover
 */
import java.util.Scanner;

public class DateAndTimeTester 
{
	//Main I/O class
	public void run()
	{
		Scanner keyboard = new Scanner(System.in);
		String cont = " ";
		String input = " ";
		while(cont.equalsIgnoreCase("quit")==false)
		{
			System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid:");
			input = keyboard.nextLine();
			
			if (isValid(input))
			{
				System.out.println("That date and time is valid!");
			}
			else
			{
				System.out.println("That date and/or time is invalid!");
			}
			System.out.println("Do you want to continue? Type Quit to exit or Press enter to continue");
			cont = keyboard.nextLine();
			
		}
		System.out.println("Goodbye");
	}
	//Main validation class
	public boolean isValid(String dateTime)
	{
		int split = dateTime.indexOf(" ");
		if (split == -1)
		{
			return false;
		}
		String[] sep = {dateTime.substring(0,split),dateTime.substring(split+1)};
		return isValidDate(sep[0]) && isValidTime(sep[1]);
		
	}
	//Date validation
	public boolean isValidDate(String date)
	{
		int month = getMonth(date);
		int day = getDay(date);
		if (month < 1 || day < 1)
		{
			return false;
		}
		//Check for April,June,Sept,Nov date range
		else if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
		{
			return false;
		}
		//Check for Feb date range
		else if (month == 2 && day > 28)
		{
			return false;
		}
		
		else 
		{
			return true;
		}
	}
	//Time validation
	public boolean isValidTime(String time)
	{
		int hour = getHour(time);
		int minute = getMinute(time);
		if (hour < 1 || minute < 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	//Extract month value from string 
	public int getMonth(String month)
	{
		int split = month.indexOf("/"); //Find index of separator character 
		if (split == -1) // if separator character doesn't exist then format is invalid
		{
			return -1;
		}
		String monthStr = month.substring(0,split); //Create new string of just the month value
		int monthNum = Integer.parseInt(monthStr);//Convert to primitive int 
		if (monthNum < 1 || monthNum > 12)//Validation
		{
			return -1;
		}
		else 
		{
			return monthNum;
		}
	}
	
	public int getDay(String day)
	{
		int split = day.indexOf("/");
		if (split == -1)
		{
			return -1;
		}
		String dayStr = day.substring(split+1);
		int dayNum = Integer.parseInt(dayStr);
		if (dayNum < 1 || dayNum > 31)
		{
			return -1;
		}
		else 
		{
			return dayNum;
		}		
	}
	
	public int getHour(String hour)
	{
		int split = hour.indexOf(":");
		if (split == -1)
		{
			return -1;
		}
		String hourStr = hour.substring(0,split);
		int hourNum = Integer.parseInt(hourStr);
		if (hourNum < 1 || hourNum > 12)
		{
			return -1;
		}
		else
		{
			return hourNum;
		}
	}
	
	public int getMinute(String minute)
	{
		int split = minute.indexOf(":");
		if (split == -1)
		{
			return -1;
		}
		String minStr = minute.substring(0,split);
		int minNum = Integer.parseInt(minStr);
		if (minNum < 0 || minNum > 59)
		{
			return -1;
		}
		else
		{
			return minNum;
		}	
	}
	
}
