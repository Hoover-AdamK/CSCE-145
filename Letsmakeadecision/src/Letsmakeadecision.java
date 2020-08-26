import java.util.Scanner;
public class Letsmakeadecision {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//Init
		String cont1Prize = "nothing";
		String cont2Prize = "nothing";
		
		String boxPrize = "A nice rock";
		String pocketPrize = "Free 100 on an assignment";
		String dollarPrize = "Crisp $1 bill";
		
		//Game Loop
		// \n ends the line and \" puts the actual " character
		
		System.out.println("Welcome to let's make a desicison \r\n"
				+ "Enter \"keep\" to keep the dollar\r\n"
				+ "Enter \"pocket\" to take what's in the pocket"
				+ "Enter \"box\" to take what's in the box");
		
		String answer = keyboard.nextLine();
		if(answer.contentEquals("box"))
		{
			cont1Prize = boxPrize;
			System.out.println("Contestant #2\nEnter \"keep\" or \"pocket\"");
			answer = keyboard.nextLine();
			if (answer.contentEquals("pocket"))
			{
				cont2Prize = pocketPrize;
			}
			else if (answer.contentEquals("keep"))
			{
				cont2Prize = dollarPrize;
			}
			else
			{
				System.out.println("NO YOU GET NOTHING! GOOD DAY SIR");
			}
		}
		
		else if(answer.contentEquals("pocket"))
		{
			cont1Prize = pocketPrize;
			System.out.println("Contestant #2\nEnter \"keep\" or \"box\"");
			answer = keyboard.nextLine();
			if (answer.contentEquals("box"))
			{
				cont2Prize = boxPrize;
			}
			else if (answer.contentEquals("keep"))
			{
				cont2Prize = dollarPrize;
			}
			else
			{
				System.out.println("NO YOU GET NOTHING! GOOD DAY SIR");
			}
		}
		else if(answer.contentEquals("keep"))
		{
			cont1Prize = dollarPrize;
			System.out.println("Contestant #2\nEnter \"box\" or \"pocket\"");
			answer = keyboard.nextLine();
			if (answer.contentEquals("pocket"))
			{
				cont2Prize = pocketPrize;
			}
			else if (answer.contentEquals("box"))
			{
				cont2Prize = boxPrize;
			}
			else
			{
				System.out.println("NO YOU GET NOTHING! GOOD DAY SIR");
			}
		}
		
		else
		{
			System.out.println("NO!");
			System.exit(0);
			
		System.out.println("Contestant 1 won " +cont1Prize+" Contestant 2 won " + cont2Prize);
		
		}
	
	}

}
