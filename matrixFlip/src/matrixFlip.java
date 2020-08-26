/*
 * Written by Adam Hoover
 */
import java.util.Random;
public class matrixFlip 
{
	public static final int SIZE = 10;
	public static void main(String[] args) 
	{
		//Initialize matrix
		int [][] matrix = new int [SIZE][SIZE];
		
		//Fill matrix with random integers
		for (int i=0;i<matrix.length;i++)
		{
			for (int j=0;j<matrix[i].length;j++)
			{
				Random r = new Random();
				matrix [i][j] = r.nextInt(9);
			}
		}
		
		System.out.println("Created Matrix:");
		
		//Print matrix
		for (int i=0;i<matrix.length;i++)
		{
			for (int j=0;j<matrix.length;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\r\nMatrix Flipped Horizontally\r\n");
		//Print flipped matrix
		for (int i=0;i<matrix.length;i++)
		{
			for (int j=matrix.length-1;j>=0;j--)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
