/*
 * Written by Adam Hoover 
 */
import java.util.Scanner;
import java.util.Random;
public class diceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		// Ask for Input
		System.out.println("How many times should the dice be rolled?");
		int maxRolls = keyboard.nextInt();
		keyboard.nextLine();
		// Validate input
		if (maxRolls < 0)
		{
			System.out.println("Invalid Input, Please choose a positive integer");
		}
		// Declare variables and set counts to 0
		int roll;
		int rollCount = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixs = 0; 
		int sevens = 0; 
		int eights = 0; 
		
		//Loop to generate the dice rolls 
		while (rollCount < maxRolls)
		{
			Random r = new Random();
			roll = r.nextInt(8) + 1;
			System.out.println(roll + " was rolled");
			
			// Nested if statements to record the results
			if (roll == 1)
			{
				ones ++;
			}
			else if (roll == 2)
			{
				twos ++;
			}
			else if (roll == 3)
			{
				threes ++;
			}
			else if (roll == 4)
			{
				fours ++;
			}
			else if (roll == 5)
			{
				fives ++;
			}
			else if (roll == 6)
			{
				sixs ++;
			}
			else if (roll == 7)
			{
				sevens ++;
			}
			else if (roll == 8)
			{
				eights ++;
			}
			// Bug catcher
			else
				System.out.println("Something went wrong!!!");
			
			// Advance the roll count 
			rollCount ++;
		}
		// Output of the results
		System.out.println("One was rolled " + ones + " times");
		System.out.println("Two was rolled " + twos + " times");
		System.out.println("Three was rolled " + threes + " times");
		System.out.println("Four was rolled " + fours + " times");
		System.out.println("Five was rolled " + fives + " times");
		System.out.println("Six was rolled " + sixs + " times");
		System.out.println("Seven was rolled " + sevens + " times");
		System.out.println("Eight was rolled " + eights + " times");
		
	}

}
