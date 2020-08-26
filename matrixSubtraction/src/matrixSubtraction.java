/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class matrixSubtraction 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the matix subtracting program");
		
		boolean valid = false;
		int aX = 0;
		int aY = 0;
		int bX = 0;
		int bY = 0;
				
		//User input of matrix sizes			
		while (!valid)
		{
			System.out.println("Please enter the length of the first matrix:");
			aX = keyboard.nextInt();
			System.out.println("Please enter the height of the first matrix:");
			aY = keyboard.nextInt();
			System.out.println("Please enter the length of the second matrix:");
			bX = keyboard.nextInt();
			System.out.println("Please enter the height of the second matrix:");
			bY = keyboard.nextInt();
			
			//Input Validation
			if (aX != bX || aY != bY)
			{
				System.out.println("Cannot subtract these! Dimension mismatch");
				valid = false;
			}
			else valid = true;
		}
		
		int sX = aX;
		int sY = bY;
		
		//Create arrays
		int [][] aMatrix = new int [aX][aY];
		int [][] bMatrix = new int [bX][bY];
		int [][] sMatrix = new int [sX][sY];
		
		//Build first matrix
		for (int i=0;i<aX;i++) //Loop through columns
		{
			for (int j=0;j<aY;j++) //Loop through rows
			{
				System.out.println("Please enter the value for matrix A, space " + (i+1) +", "+ (j+1) + ":");
				aMatrix[i][j] = keyboard.nextInt();
			}
		}
		
		//Build second matrix
		for (int i=0;i<bX;i++)
		{
			for (int j=0;j<bY;j++)
			{
				System.out.println("Please enter the value for matrix B, space " + (i+1) +", "+ (j+1) + ":");
				bMatrix[i][j] = keyboard.nextInt();
			}
		}
		
		//Subtract Matrices and store in new array
		for (int i=0;i<bX;i++)
		{
			for (int j=0;j<bY;j++)
			{
				sMatrix[i][j] = aMatrix[i][j] - bMatrix[i][j];
			}
		}
		
		System.out.println();
		
		//Display Matrices and results
		for (int i=0;i<aX;i++)
		{
			for (int j=0;j<aY;j++)
			{
				System.out.print(aMatrix[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("-");
		
		for (int i=0;i<bX;i++)
		{
			for (int j=0;j<bY;j++)
			{
				System.out.print(bMatrix[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("=");
		
		for (int i=0;i<sX;i++)
		{
			for (int j=0;j<sY;j++)
			{
				System.out.print(sMatrix[i][j]+ " ");
			}
			System.out.println();
		}	
		
		System.out.println("DONE!");
		System.exit(0);
		
	
	}

}
