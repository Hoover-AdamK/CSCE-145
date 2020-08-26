import java.util.Scanner;
import java.util.Random;

public class BlackJackGame {

	public static final int CARD_AMT = 52;
	public static final int HAND_AMT = 5;
	public static final int CARD_SUIT_AMT = 13;
	public static final String[] SUITS = {"Hearts","Clubs","Diamons","Spades"};
	public static final int SHUFFLE_AMT = 100;
	public static final int EMPTY = -1;
	
	
	//<scope> <return value> <method id> (<parameters>)
	//scope - public or private gives access to the method outside of the class
	//return - void returns nothing and any other type must return said value
	//method id - how we call it 
	//parameters - extra information passed to the method
	
	public void run()
	{
		System.out.println("Welcome to Black Jack Game");
		boolean gameOver = false; 
		while(!gameOver)
		{
			Scanner keyboard = new Scanner(System.in);
			int[] deck = createDeck();
			int[] pHand = createHand();
			int[] cHand = createHand();
			
			shuffleDeck(deck);
			
		}
	}
	public int [] createDeck()
	{
		int[] ret = new int[CARD_AMT];
		for (int i=0;i<ret.length;i++)
		{
			ret[i] = i;
		}
		return ret;
		
	}
	public int[] createHand()
	{
		int[] ret = new int[HAND_AMT];
		for (int i=0;i<ret.length;i++)
		{
			ret[i] = EMPTY;
		}
		return ret;
	}
	public void shuffleDeck(int[] aDeck)
	{
		Random r = new Random();
		for (int i=0;i<SHUFFLE_AMT;i++)
		{
			int j = r.nextInt(CARD_AMT);
			int k = r.nextInt(CARD_AMT);
			int temp = aDeck[i];
			aDeck[j] = aDeck[k];
			aDeck[k] = temp;
		}
	}
}
