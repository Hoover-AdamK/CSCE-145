/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
import java.util.Random;
public class xorkLand 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

// Declare Variables	
			String choiceOne = "";
			String choiceTwo = "";
			String choiceThree = "";
			int j = 1;
			boolean inn = false;
			boolean key = false;
			boolean rest = false;
			boolean sword = false;
			boolean shield = false;
			boolean flute = false;
			boolean playing = true;
			
			//Game Loop
			while (playing)	
			{
			
				if (choiceOne.contentEquals(""))
				{
				System.out.println("Welcome to the Land of Xork, you find yourself standing in the middle of a small town."
						+ "\r\nYou can choose to go into the INN, see if anyone in town will TALK to you or head off into the WOODS:"
						+ "\r\nWhat do you want to do?\r\n(Enter INN, TALK, or WOODS):");
				
				choiceOne = keyboard.nextLine();
				}
				
			//Main branch one
				if (choiceOne.equalsIgnoreCase("INN"))
				{
					while (!inn)
					{
						System.out.println("You walk into a warm but dark inn. There are only a few townsfolk inside and everyone "
								+ "seems to be keeping to themselves.\r\nThe innkeeper sees you and asks if you are looking for WORK or to just REST?"
								+ "\r\nWhat would you like to do?\r\n(Enter WORK or REST):");
						choiceTwo = keyboard.nextLine();
						
						if(choiceTwo.equalsIgnoreCase("REST"))
						{
							rest = true;
							System.out.println("Get up or stay in bed?\r\n(Enter UP or BED)");
							String lazy = keyboard.nextLine();
							if (lazy.equalsIgnoreCase("bed"))
							{
								System.out.println("Everyone thinks you're a lazy bum. You will never be a hero");
								System.exit(0);
							}
							System.out.println("You rest for a few hours and then come back into the main room of the inn, the innkeeper"
									+ "sees you and again asks if you would like some work\r\n(Enter Yes or No):");
							choiceThree = keyboard.nextLine();	
						}
						
						if(choiceTwo.equalsIgnoreCase("WORK") || choiceThree.equalsIgnoreCase("YES"))
						{
							System.out.println("Excellent, I have a small rat problem down in the cellar, if you will take care of it for me"
										+ " Ill give you a magic sword\r\nYou go down into the cellar and see that there is in fact several"
										+ " very large rats.");
							if (!rest)
							{
								System.out.println("You try to attack the rats but you are so tired from your travels that you fall down and"
										+ " are eaten by the rats\r\nYOU DIED");
								System.exit(0);		
							}
							else
							{
								System.out.println("You easily defeat the rats and bring their tails back up as proof. The innkeeper is very"
										+ "pleased and gives you the magical sword he promised\r\nSWORD ACQUIRED!!");
								sword = true;
								inn = true;
								
							}
								
						}
						
					}
					
					System.out.println("The innkeeper is busy and no one else in the inn will talk to you would you now like to TALK to the townsfolk "
							+ "or head into the WOODS?\r\n(ENTER TALK or WOODS):"); 
					choiceOne = keyboard.nextLine();
					

				}
			// Main Branch two	
				else if (choiceOne.equalsIgnoreCase("TALK"))
				{
					while (!(key && flute))
					{
						System.out.println("You walk into town and find there are only two people willing to talk to you, the blacksmith and the bard."
								+ "\r\nWho would you like to talk to first?\r\n(Enter BLACKSMITH or BARD)");
						choiceTwo = keyboard.nextLine();
						
						if(choiceTwo.equalsIgnoreCase("BLACKSMITH") && !key)
						{
							System.out.println("The blacksmith is a friendly old woman who says that if you can answer a riddle she will give you a prize!"
									+ "\r\nShe says \"What is too much for one, meant for two, and lost if three or more?\"\r\nWhat is your answer:");
							do
							{
								choiceThree = keyboard.nextLine();	
								if (choiceThree.equalsIgnoreCase("secret"))
								{
									System.out.println("She says \"That's right!! Here is your prize. I hope it helps you on the right path!\" As she hands you a golden key");
									key = true;
									if (j == 1)
									{	
										System.out.println("The blacksmith says \"You got it right on the first guess!! Will you marry me?\"\r\n(Enter YES or NO):");
										choiceThree = keyboard.nextLine();
										if (choiceThree.equalsIgnoreCase("yes"))
										{
											System.out.println("You marry the blacksmith and have a happy, meaningful life, but never become a hero");
											System.exit(0);
										}
									}
								}
								else
								{
									System.out.println("She says that you are wrong and should guess again");
									j++;
																	
								}
							}
							while (j <= 10 && !key);
							if (!key && j > 10)
							{
								System.out.println("She says you have no more guesses and thinks you are quite dumb. The townsfolk chase you out of town"
										+ "\r\nYou will never be a hero now.");
								System.exit(0);
							}
						}
						else if (choiceTwo.equalsIgnoreCase("BARD") && !flute)
						{
							System.out.println("The bard says that if you can guess the number he is thinking of you will win his flute and a secret!\r\nHe tells you to pick a number between one and 100");
							int guess = keyboard.nextInt();
							keyboard.nextLine();
							Random r = new Random();
							int roll = r.nextInt(100);
							for(int i=1;i<=15;i++)
							{
								if (guess > roll)
								{
									System.out.println("He say's you're too high!\r\nGuess Again:");
									guess = keyboard.nextInt();
									keyboard.nextLine();
									
								}
								else if (guess < roll)
								{
									System.out.println("He say's you're too low!\r\nGuess Again:");
									guess = keyboard.nextInt();
									keyboard.nextLine();
								}
								else 
								{
									System.out.println("He says \"Marvelous! that is correct! Here is the flute. But he says he can't actually tell you the secret, if he did"
											+ " you would be the third person to know and if three people know then the secret is lost!");
									flute = true;
									i = 20;
									if (i == 1)
									{	
										System.out.println("The bard says \"You got it right on the first guess!! Will you marry me?\"\r\n(Enter YES or NO):");
										choiceThree = keyboard.nextLine();
										if (choiceThree.equalsIgnoreCase("yes"))
										{
											System.out.println("You marry the bard and have a happy life, but never become a hero");
											System.exit(0);
										}
									
										
									}
								}
							}
							if (!flute)
							{
								System.out.println("He says you have no more guesses and thinks you are quite dumb. The townsfolk chase you out of town"
										+ "\r\nYou will never be a hero now.");
								System.exit(0);
							}
							
								
							choiceTwo = "TALK";
							
						}
						else if(choiceTwo.equalsIgnoreCase("BLACKSMITH") && key)
							System.out.println("The blacksmith is busy now and tells you to not bother her");
						else if(choiceTwo.equalsIgnoreCase("BARD") && flute)
							System.out.println("The bard is busy now and tells you to not bother him");
					}
								
					System.out.println("No one else will talk to you in the town. You can go to the INN or into the WOODS\r\n(ENTER INN or WOODS):");
					choiceOne = keyboard.nextLine();
				}						
			// Main Branch three and conclusion		
				else if (choiceOne.equalsIgnoreCase("WOODS"))
				{
					System.out.println("You walk into dark woods. Ahead there are two paths, one to the right and one to the left\r\nWhich way do you want to go?"
							+ "\r\n(Enter RIGHT or LEFT)");
					choiceTwo = keyboard.nextLine();
					if (choiceTwo.equalsIgnoreCase("right"))
					{
						System.out.println("Along the right path you find a magical box being guarded by a three headed dog");
						if (flute && key)
						{
							System.out.println("You play a small tune on your flute and the dog goes to sleep you then open the box with your key and find a magical shield"
									+ "\r\nSHIELD ACQUIRED");
							shield = true;
						}
						else if (flute && !key)
						{
							System.out.println("You play a small tune on your flute and the dog goes to sleep, however, you do not have the key to open the box! "
							+ "The dog wakes up and eats you!\r\nYOU DIED");
							
							System.exit(0);
							
						}
						else if (key && !flute)
						{
							System.out.println("You know you have the key to open the box, but you can't get passed the dog. The dog chases you through"
									+ "the woods till you fall off of a cliff. \r\nYOU DIED"); 
									System.exit(0);
						}
						else 
						{
							System.out.println("You are not able to get around the dog, you can go back to town or take the left path.\r\nWhat do you want to do\r\n(Enter Town or left):");
							choiceThree = keyboard.nextLine();
							if (choiceThree.equalsIgnoreCase("town") && sword)
							{
								choiceOne = "TALK";
							}
							else if (choiceThree.equalsIgnoreCase("town") && !sword)
							{
								choiceOne = "";							
							}
							else choiceTwo = "left";
						}
					}
					if (choiceTwo.equalsIgnoreCase("left") || shield)
					{
						System.out.println("You eventually come upon an evil dragon standing on the path, he says \"YOU DARE ENTER MY WOODS! YOU WILL DIE\" and he breaths fire at you!");
						if (sword && shield)
						{
							System.out.println("You block the dragon's breath with your magical shield and then slay him with your magical sword!\r\nYou have beaten the evil dragon and are now a HERO!"
									+ "\r\nYOU WIN!!!");
							System.exit(0);
						}
						else if (shield && !sword)
						{
							System.out.println("You block the dragon's breath with you magical shield but have no way of killing him. "
									+ "Eventually your shield melts and the dragon eats you!\r\nYOU DIED");
							System.exit(0);
						}
						else 
						{
							System.out.println("You are consumed by the dragon's fire.\r\nYOU DIED");
							System.exit(0);
						}
					}																	
				}
				else
				{
					System.out.println("I do not understand that command. Please try again\r\n(Enter INN, TALK, or WOODS):");
					choiceOne = keyboard.nextLine();
				}
		}
	}	
}

