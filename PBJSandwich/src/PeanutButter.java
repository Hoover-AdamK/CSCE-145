/*
 * Written by Adam Hoover
 */
	//Step 1. Define the Class
public class PeanutButter {
	//Step 2. Create Instance Variables
	private String name;
	private int calories;
	private  boolean isCrunchy;
	private String defName = "none";
	private int defCal = 100;
	private boolean defCrunch = true;
	
	//Step 3. Create Constructors
	public PeanutButter()
	{
		this.name = defName;
		this.calories = defCal;
		this.isCrunchy = defCrunch;
	}
	public PeanutButter(String aName, int aCal, boolean aCrunch)
	{
		this.setName(aName);
		this.setCal(aCal);
		this.setCrunch(aCrunch);
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
		public boolean getCrunch()
		{
			return this.isCrunchy;
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
		public void setCal(int aCal)
		{
			if(aCal<100 || aCal>300)
			{
				System.out.println("Invalid Calories");
				this.calories = defCal;
			}
			else 
			{
				this.calories = aCal;
			}
		}
		public void setCrunch(boolean aCrunch)
		{
			this.isCrunchy = aCrunch;			
		}
	//Step 6. Other Methods
		public boolean Equals(PeanutButter pb2)
		{
			if(this.name.equalsIgnoreCase(pb2.name) && 
					this.calories == (pb2.calories) &&
					this.isCrunchy == (pb2.isCrunchy))
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
			return "Name: "+this.name+"\nCalories: "+this.calories+"\nCrunchy: "+this.isCrunchy;
		}

}
