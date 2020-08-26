/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class NumberSquare {

	public static void main(String[] args) {
		// Original Square
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a four digit number:");
		String input = keyboard.nextLine();
		System.out.println("The number squared is: \r\n" + input); 
		System.out.println(input.charAt(1) + "  " + input.charAt(2)); 
		System.out.println(input.charAt(2) + "  " + input.charAt(1));
		System.out.println("" + input.charAt(3) + input.charAt(2) + input.charAt(0) + input.charAt(1)); 
		
		// First Rotation
		System.out.println("The number square rotated clockwise is:");
		System.out.println("" + input.charAt(1) + input.substring(0,3));
		System.out.println(input.charAt(2) + "  " + input.charAt(3)); 
		System.out.println(input.charAt(3) + "  " + input.charAt(2));
		System.out.println("" + input.charAt(2) + input.charAt(1) + input.charAt(0) + input.charAt(1));
		
		//Second Rotation
		System.out.println("The number square rotated again is:");
		System.out.println("" + input.charAt(2) + input.charAt(1) + input.charAt(0) + input.charAt(1));
		System.out.println(input.charAt(3) + "  " + input.charAt(2)); 
		System.out.println(input.charAt(2) + "  " + input.charAt(3));
		System.out.println("" + input.charAt(1) + input.charAt(0) + input.charAt(1) + input.charAt(2));
	}

}
