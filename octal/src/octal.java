/*
 * Written by Adam Hoover
 */
import java.util.Scanner;

public class octal 
{
	//Powers of 8 stored as constants
	public static final int valFour = 512;
	public static final int valThree = 64;
	public static final int valTwo = 8;
	public static final int valOne = 1;

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a 4 digit octal number:");
		String octOne = keyboard.nextLine();
		
		System.out.println("Enter another 4 digit octal:");
		String octTwo = keyboard.nextLine();
		
		//Converting each digit to individual ints
		int octOne32 = Integer.parseInt(octOne.substring(0,1));
		int octOne16 = Integer.parseInt(octOne.substring(1,2));
		int octOne8 = Integer.parseInt(octOne.substring(2,3));
		int octOne1 = Integer.parseInt(octOne.substring(3));
		
		int octTwo32 = Integer.parseInt(octTwo.substring(0,1));
		int octTwo16 = Integer.parseInt(octTwo.substring(1,2));
		int octTwo8 = Integer.parseInt(octTwo.substring(2,3));
		int octTwo1 = Integer.parseInt(octTwo.substring(3));
		
		//Conversion and summation
		int decOne = octOne32 * valFour + octOne16 * valThree + octOne8 * valTwo + octOne1 * valOne;
		int decTwo = octTwo32 * valFour + octTwo16 * valThree + octTwo8 * valTwo + octTwo1 * valOne;
		int sum = decOne + decTwo;
		
		//Loop to convert from dec to oct
		int carry = sum/8;
		int bit = sum%8;
		String octSum = String.valueOf(bit);
		while (carry != 0)			
		{
			bit = carry%8;
			octSum = String.valueOf(bit) + octSum;
			carry = carry/8;
										
		}
		
		//Output
		System.out.println("The first number is: " + decOne);
		System.out.println("The second number is: " + decTwo);
		System.out.println("Added together is: " + sum);
		System.out.println("Which is " + octSum + " in octal");
		
		
		
	}

}
