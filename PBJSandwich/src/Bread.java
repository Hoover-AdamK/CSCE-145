/*
 * Written by Adam Hoover
 */
	//Step 1. Define the Class
public class Bread {
	//Step 2. Create Instance Variables
	private String name;
	private int calories;
	private String type;
	private String defName = "none";
	private int defCal = 50;
	private String defType = "white";
	
	
	//Step 3. Create Constructors
		public Bread()
		{
			this.name = defName;
			this.calories = defCal;
			this.type = defType;				
		}
		public Bread(String aName, int aCal, String aType)
		{
			this.setName(aName);
			this.setCalories(aCal);
			this.setType(aType);
		}
	//Step 4. Create Accessors
		public String getName()
		{
			return this.name;
		}
		public int getCalories()
		{
			return this.calories;
		}
		public String getType()
		{
			return this.type;
		}
		
	//Step 5. Mutators
		public void setName(String aName)
		{
			if(aName == null)
			{
				System.out.println("Empty Name!");
				this.name = defName;
			}
			else
			{
				this.name = aName;
			}
		}
		public void setCalories(int aCal)
		{
			if(aCal<50 || aCal>250)
			{
				System.out.println("Invalid Calories!");
				this.calories = defCal;
			}
			else
			{
				this.calories = aCal;
			}
		}
		public void setType(String aType)
		{
			if(aType != null && 
					( aType.equalsIgnoreCase("honey Wheat") ||
							aType.equalsIgnoreCase("white") ||
							aType.equalsIgnoreCase("whole grain") ||
							aType.equalsIgnoreCase("whole wheat")))
			{
				this.type = aType;
			}
			else 
			{
				System.out.println("Invalid Type!");
				this.type = defType;
			}
		}
	//Step 6. Other Methods
		public boolean Equals(Bread b2)
		{
			if(this.name.equalsIgnoreCase(b2.name) && 
					this.calories == (b2.calories) &&
					this.type.equalsIgnoreCase(b2.type))
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
			return "Name: "+this.name+"\nCalories: "+this.calories+"\nType: "+this.type;
		}
}























