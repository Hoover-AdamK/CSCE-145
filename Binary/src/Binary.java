/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class Binary {

	public static final int valEight = 128;
	public static final int valSeven = 64;
	public static final int valSix = 32;
	public static final int valFive = 16;
	public static final int valFour = 8;
	public static final int valThree = 4;
	public static final int valTwo = 2;
	public static final int valOne = 1;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an 8 bit binary number and I will convert it to decimal\r\n");
		String input = keyboard.nextLine();
		
		// Convert each binary digit to an integer value
		int bitEight = Integer.parseInt(input.substring(0,1));
		int bitSeven = Integer.parseInt(input.substring(1,2));
		int bitSix = Integer.parseInt(input.substring(2,3));
		int bitFive = Integer.parseInt(input.substring(3,4));
		int bitFour = Integer.parseInt(input.substring(4,5));
		int bitThree = Integer.parseInt(input.substring(5,6));
		int bitTwo = Integer.parseInt(input.substring(6,7));
		int bitOne = Integer.parseInt(input.substring(7));
		
		//Multiplying each binary digit by the decimal values stored in the assigned constant and summing
		int decSum = bitEight * valEight + bitSeven * valSeven + bitSix * valSix + bitFive * valFive + bitFour * valFour + bitThree * valThree + bitTwo * valTwo + bitOne * valOne;
		
		System.out.println(input + " in decimal form is:" + decSum);		

	}

}
