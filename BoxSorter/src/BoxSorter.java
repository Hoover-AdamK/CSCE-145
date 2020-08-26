/*
 * Written by Adam Hoover
 */
import java.util.Scanner;
public class BoxSorter {

	public static void main(String[] args) {
		System.out.println("Welcome to the box sorter!\nEnter the information about the boxes and I'll sort them!");
		Scanner keyboard = new Scanner(System.in);
		Box[] boxes = new Box[5];
		
		for (int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter the label, length, width, and height (all in feet) of box "+(i+1)+":");
			String label = keyboard.nextLine();
			double L = keyboard.nextDouble();
			double W = keyboard.nextDouble();
			double H = keyboard.nextDouble();
			keyboard.nextLine();
			Box aBox = new Box(label,L,W,H);
			boxes[i] = aBox;
		}
		boolean test = true;
		while (test == true)
		{
			test = false;
			for (int i=0;i<boxes.length-1;i++)
			{
				if (boxes[i].getVolume() > boxes[i+1].getVolume())
				{
					Box temp = boxes[i];
					boxes [i] = boxes[i+1];
					boxes [i+1] = temp;
					test = true;
				}
			}
		}
		System.out.println("Sorted Boxes:");
		for (Box b : boxes)
		{
			System.out.println(b);
		}
		
		
	}

}
