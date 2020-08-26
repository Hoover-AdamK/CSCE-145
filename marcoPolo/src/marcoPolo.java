/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
import java.util.Random;

public class marcoPolo 
{
	public static final int BOARD_SIZE = 10;
	public static final int COLD_DIST = (BOARD_SIZE/2)*(BOARD_SIZE/2);
	public static final int WARM_DIST = (BOARD_SIZE/4)*(BOARD_SIZE/4);
	public static final char PLAYER = 'X';
	public static final char EMPTY = '_';
	public static final char WALKED_PATH = '#';
	public static final char GOAL = '_';
	public static void main(String[] args) 
	{
		char [][] board = new char [BOARD_SIZE][BOARD_SIZE];
		int pX = 0;
		int pY =0;
		Random r = new Random();
		int gX = r.nextInt(BOARD_SIZE);
		int gY = r.nextInt(BOARD_SIZE);
		
		Scanner keyboard = new Scanner(System.in);
		for (int i=0;i<board.length;i++)
		{
			for (int j=0;j<board[i].length;j++)
			{
				board[i][j] = EMPTY;
			}
		}
		board[pY][pX] = PLAYER;
		board[gY][gX] = GOAL;
		
		System.out.println("Hey");
		boolean gameOver = false;
		while(!gameOver)
		{
			for (int i=0;i<board.length;i++)
			{
				for (int j=0;j<board.length;j++)
				{
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			int dist = (pX-gX)*(pX-gX)+(pY-gY)*(pY*gY);
			if (dist > COLD_DIST)
			{
				System.out.println("You are cold!");
			}
			else if (dist > WARM_DIST)
			{
				System.out.println("You are Warm...");
			}
			else 
			{
				System.out.println("You are Hot!");
			}
			System.out.println("Enter -1 0 or 1 to move in the x");
			int dX = keyboard.nextInt();
			if (dX > 1 || dX <-1)
			{
				dX = 0;
			}
			int dY = keyboard.nextInt();
			if (dY > 1|| dY < -1)
			{
				dY = 0;
			}
			pX += dX;
			pY += dY;
			if (pX < 0)
			{
				pX = 0;
			}
			if (pX >= BOARD_SIZE)
			{
				pX = BOARD_SIZE;
			}
			if (pY < 0)
			{
				pY = 0;
			}
			if (pY >= BOARD_SIZE)
			{
				pY = BOARD_SIZE;
			}
			
			
		}//End While Loop for game
	}

}

























