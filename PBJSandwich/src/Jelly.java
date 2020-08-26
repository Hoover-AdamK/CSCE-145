/*
 * Written by Adam Hoover
 */	
	//Step 1. Define the Class
public class Jelly {
	//Step 2. Create Instance Variables
	private String name;
	private int calories;
	private String fruit;
	private String defName = "none";
	private int defCal = 50;
	private String defFruit = "Apple";

	//Step 3. Create Constructors
		public Jelly()
		{
			this.name = defName;
			this.calories = defCal;
			this.fruit = defFruit;
		}
		public Jelly(String aName, int aCal, String aFruit)
		{
			this.setName(aName);
			this.setCalories(aCal);
			this.setFruit(aFruit);
		}
	//Step 4. Create Accessors
		public String getName()
		{
			return this.name;
		}
		public int getCal()
		{
			return this.calories;
		}
		public String getFruit()
		{
			return this.fruit;
		}
	//Step 5. Mutators
		public void setName(String aName)
		{
			if(aName == null)
			{
				System.out.println("Invalid Name!");
				this.name = defName;
			}
			else
			{
				this.name = aName;
			}
		}
		public void setCalories(int aCal)
		{
			if(aCal<50 || aCal>200)
			{
				System.out.println("Invalid Calories!");
				this.calories = defCal;
			}
			else
			{
				this.calories = aCal;
			}
		}
		public void setFruit(String aFruit)
		{
			if(aFruit !=null && (aFruit.equalsIgnoreCase("apple") ||
					aFruit.equalsIgnoreCase("blueberry") || 
					aFruit.equalsIgnoreCase("grape") || 
					aFruit.equalsIgnoreCase("strawberry") ||
					aFruit.equalsIgnoreCase("tomato")))
			{
				this.fruit = aFruit;
			}
			else
			{
				System.out.println("Invalid Fruit Choice!");
				this.fruit = defFruit;
			}
		}
		
	//Step 6. Other Methods
		public boolean Equals(Jelly j2)
		{
			if(this.name.equalsIgnoreCase(j2.name) &&
					this.calories == (j2.calories) &&
					this.fruit.equalsIgnoreCase(j2.fruit))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public String toString()
		{
			return "Name: "+this.name+"\nCalories: "+this.calories+"\nFruit: "+this.fruit;
		}

}
