/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class tempTester {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double[] temps = new double[10];
		System.out.println("Welcome to the above average temperature tester program.");
				
		double sum = 0;
		
		//Loop to take input for each day and store in the array
		for (int i=0;i<10;i++)
		{
			System.out.println("Please enter the temperature for Day " + (i+1) + ":");
			temps[i] = keyboard.nextDouble();
			keyboard.nextLine();
			//cumulative summation of temps
			sum = sum + temps[i];		
		}
		
		//Calculate the average
		double avg = sum/10;
		//Output the average
		System.out.println("\r\nThe average temperature was " + avg);
		System.out.println("The days that had above average temps were:");
		//Loop to display the days with above average temps
		for (int i=0;i<10;i++)
		{
			if (temps[i]>avg)
			{
				System.out.println("Day " + (i+1) + " with " + temps[i]);				
			}
		}
		
		System.out.println("Done");
		System.exit(0);

	}

}
