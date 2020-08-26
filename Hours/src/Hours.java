/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class Hours {

	public static final int minutes = 60;
		
	public static void main(String[] args) {
System.out.println("Enter a whole number. The machine will determine the number of hours and remaining minutes \r\n");
		
Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		
		int countHours = input / minutes; 
		int minutesRemain = input % minutes; 

System.out.println(input + " minutes is equal to: " + countHours + " Hours and " + minutesRemain + " Minutes");	
		

	}

}
