/*
 * Written by Adam Hoover 
 */
import java.util.Scanner;
public class triangleMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//User input
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle you want to make: ");
		int triSize = keyboard.nextInt();
		keyboard.nextLine();
		
		//Create Stars String
		String stars = "*";
		
		//Build Triangle
		for (int i = 1; i <= triSize; i++)
		{
			System.out.println(stars);
			stars = stars.concat("*");
		}
		
		stars = stars.substring(0,stars.length() - 1);
		
		//Reduce
		for (int j = 1; j <= triSize; j++)
		{
			stars = stars.substring(0,stars.length() - 1);
			System.out.println(stars);
		}
		
	}

}
