/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		System.out.println("----------------------------------");
		System.out.println("Welcome to the PBJ Sandwich Maker!");
		System.out.println("----------------------------------");
		
		Scanner keyboard = new Scanner(System.in);
		PBJSandwich[] sandwiches = new PBJSandwich[2];
		
		for (int i=0;i<sandwiches.length;i++)
		{
			System.out.println("-----Sandwich "+(i+1)+"-----");
			System.out.println("Top Slice of Bread Information\nEnter the Brand Name of the bread:");
			String name = keyboard.nextLine();
			int cal,e = 0;
			while(true)
			{
			
		        if (e>=1)
		        {
		        	System.out.println("Invalid Entry!");
		        }
				System.out.println("Enter the number of Calories: ");
			
				if(keyboard.hasNextInt())
				{
					cal = keyboard.nextInt();
					keyboard.nextLine();
					e = 0;
					break;
				}
				keyboard.nextLine();
				e++;
			}	
			System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\":");
			String type = keyboard.nextLine();
			
			Bread topSlice = new Bread(name,cal,type);
						
			System.out.println("Peanut Butter Information\nEnter the Brand Name of the Peanut Butter");
			name = keyboard.nextLine();
			while(true)
			{
			
		        if (e>=1)
		        {
		        	System.out.println("Invalid Entry!");
		        }
				System.out.println("Enter the number of Calories: ");
			
				if(keyboard.hasNextInt())
				{
					cal = keyboard.nextInt();
					keyboard.nextLine();
					e = 0;
					break;
				}
				keyboard.nextLine();
				e++;
			}
			boolean crunchy;
			while(true)
			{
				if(e>=1)
				{
					System.out.println("Invalid Entry!");
				}
				System.out.println("Is it crunchy? Enter \"true\", or \"false\"");
				if(keyboard.hasNextBoolean())
				{
					crunchy = keyboard.nextBoolean();
					keyboard.nextLine();
					e = 0;
					break;
				}
				keyboard.nextLine();
				e++;
			}
			
			PeanutButter pButter = new PeanutButter(name,cal,crunchy);
			
			System.out.println("Jelly Information\nEnter the Brand Name of the Jelly");
			name = keyboard.nextLine();
			while(true)
			{
			
		        if (e>=1)
		        {
		        	System.out.println("Invalid Entry!");
		        }
				System.out.println("Enter the number of Calories: ");
			
				if(keyboard.hasNextInt())
				{
					cal = keyboard.nextInt();
					keyboard.nextLine();
					e = 0;
					break;
				}
				keyboard.nextLine();
				e++;
			}
			System.out.println("Enter the type of Fruit. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
			type = keyboard.nextLine();
			
			Jelly jel = new Jelly(name,cal,type);
			
			System.out.println("Bottom Slice of Bread Information\nEnter the Brand Name of the bread:");
			name = keyboard.nextLine();
			while(true)
			{
			
		        if (e>=1)
		        {
		        	System.out.println("Invalid Entry!");
		        }
				System.out.println("Enter the number of Calories: ");
			
				if(keyboard.hasNextInt())
				{
					cal = keyboard.nextInt();
					keyboard.nextLine();
					e = 0;
					break;
				}
				keyboard.nextLine();
				e++;
			}
			System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\":");
			type = keyboard.nextLine();
			
			Bread bottomSlice = new Bread(name,cal,type);	
			
			PBJSandwich aPBJ = new PBJSandwich(topSlice,pButter,jel,bottomSlice);
			sandwiches[i] = aPBJ;
		}
		for (int i=0;i<sandwiches.length;i++)
		{
			System.out.println("\n*****Sandwich"+(i+1)+ "*****");
			System.out.println(sandwiches[i].toString());
		}
		
		if(sandwiches[0].Equals(sandwiches[1]))
		{
			System.out.println("They are the same sandwich!");
		}
		else
		{
			System.out.println("They are NOT the same sandwich!");
		}
		
		
	}

}
