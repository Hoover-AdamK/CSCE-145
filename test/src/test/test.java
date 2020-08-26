package test;

import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int [4][4];
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What number are you looking for?:");
		int search = keyboard.nextInt();
		
		for (int i=0;i<=array.length;i++)
		{
			for (int j=0;j<=array.length;j++)
			{
				if (array[i][j]%search == 0 && array[i][j]/search == 1)
				{
					System.out.println("The location of that number is: " + i + "," + j);
				}
			}
		}
		
	}

}
