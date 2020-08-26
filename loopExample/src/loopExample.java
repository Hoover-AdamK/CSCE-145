import java.util.Scanner;
import java.util.Random;
public class loopExample {

	public static final int MAX_VAL = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int secretNumber;
		Random r = new Random();		
		secretNumber = r.nextInt(MAX_VAL);
		boolean correctGuess = false;
		
		System.out.println("Enter a value");
		
		while(!correctGuess)
		{
			int guessNumber = keyboard.nextInt();
			keyboard.nextLine();
			if(guessNumber > secretNumber)
			{
				System.out.println("That's too high");
			}
			else if (guessNumber < secretNumber)
			{
				System.out.println("That's too low");				
			}
			else
			{
				correctGuess = true;
			}
		}
		System.out.println("Game over, you win!");
		
	}

}
