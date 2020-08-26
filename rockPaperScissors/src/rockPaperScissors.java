/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Random;

public class rockPaperScissors {
	public static final int ROUNDS = 3;

	public static void main(String[] args) {
		String input;
		String cont;
		boolean game = true;
		Scanner keyboard = new Scanner(System.in);
	//Game Loop
		while (game)
		{
			//Initialize variables
			int round=1;
			int compVal;
			int playerScore = 0;
			int compScore = 0;	
			
			System.out.println("Welcome to Rock Paper Scissors! Best of " + ROUNDS);
			//Round Loop
			while (round <= ROUNDS)
			{
				Random r = new Random();
				//Generate computers choice
				compVal = r.nextInt(3)+1;
				
				System.out.println("Choose \"Rock\" \"Paper\" or \"Scissors\":");
				input = keyboard.nextLine();
				
				//Results if player chooses rock
				if (input.equalsIgnoreCase("rock"))
				{
					if (compVal == 1)
					{
						System.out.println("Rock V Rock! TIE!");
					}
					else if (compVal == 2)
					{
						System.out.println("Rock V Paper! Computer wins round " + round);
						compScore++;
					}
					else if (compVal == 3)
					{
						System.out.println("Rock V Scissors! Player wins round "+ round);
						playerScore++;
					}					
				}
				//Results if player chooses paper
				else if (input.equalsIgnoreCase("paper"))
				{
					if (compVal == 1)
					{
						System.out.println("Paper V Rock! Player wins round " + round);
						playerScore++;
					}
					else if (compVal == 2)
					{
						System.out.println("Paper V Paper! TIE!");
					}
					else if (compVal == 3)
					{
						System.out.println("Paper V Scissors! Computer wins round " + round);
						compScore++;
					}
				}
				//Results if player chooses scissors
				else if (input.equalsIgnoreCase("scissors"))
				{
					if (compVal == 1)
					{
						System.out.println("Scissors V Rock! Computer wins round " + round);
						compScore++;
					}
					else if (compVal == 2)
					{
						System.out.println("Scissors V Paper! Player wins round " + round);
						playerScore++;
					}
					else if (compVal == 3)
					{
						System.out.println("Scissors V Scissors! TIE!");
					}
				}
				else
				{
					System.out.println("Invalid Choice! The computer wins this rounds.");
					compScore++;
				}
				round++;
			}
			//output results
			System.out.println("After " + (round - 1) + " rounds, Player has " + playerScore + " wins and the Computer has "
					+ compScore + " wins.");
			if (playerScore>compScore)
			{
				System.out.println("Player WINS! CONGRATS");
			}
			else if (playerScore<compScore)
			{
				System.out.println("Computer WINS! Better luck next time!");
			}
			else
			{
				System.out.println("It was a TIE!");
			}		
			
			//Play again loop
			System.out.println("Do you want to play again? Enter Y/N:");
			cont = keyboard.nextLine();
			if (cont.equalsIgnoreCase("N"))
			{
				System.out.println("Ok, goodbye");
				game = false;
			}
			else
			{
				System.out.println("Yay, let's play again!");
			}
						
		}
	}

}
