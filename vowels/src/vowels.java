/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		// Initialize Arrays
		int [] count = new int [5];
		char [] vowel = new char[] {'a','e','i','o','u'};
		
		// User input
		System.out.println("Welcome to the vowel counter and sorter!");
		System.out.println("Enter a phrase:");
		String phrase = keyboard.nextLine();
		
		// Remove case
		phrase = phrase.toLowerCase();
		
		//Loop to check each character and count vowels
		for (int i=0;i<phrase.length();i++)
		{
			if (phrase.charAt(i) == 'a')
			{
				count[0]++;
			}
			else if (phrase.charAt(i) == 'e')
			{
				count[1]++;
			}
			else if (phrase.charAt(i) == 'i')
			{
				count[2]++;
			}
			else if (phrase.charAt(i) == 'o')
			{
				count[3]++;
			}
			else if (phrase.charAt(i) == 'u')
			{
				count[4]++;
			}
		}
		
		System.out.println("The vowels and their count");
		//Initialize variable used to sort
		int maxCount = count[0];
		char maxVowel = vowel[0];
		boolean sorted = false;
		int loopCount = 0;
		//Loop until all values are in order
		while (!sorted)
		{
			for (int j=1; j < count.length;j++)
			{
				//Sorting algorithm
				if (count[j] > count[j-1])
				{
					maxCount = count[j];
					maxVowel = vowel[j];
					count[j] = count[j-1];
					vowel[j] = vowel[j-1];
					count[j-1] = maxCount;
					vowel[j-1] = maxVowel;
				}
				//Else catch for when an index is in the proper place
				else
				{
					loopCount++;
				}
			
			}
			//If all indexes are in the correct order, set sorted to true
			if (loopCount >= 5)
			{
				sorted = true;
			}
		}
		//Output of results
		for (int v = count.length-1;v>=0;v--)
		{
			System.out.println(vowel[v] + " : " + count[v]);
			
		}
		
	}

}
