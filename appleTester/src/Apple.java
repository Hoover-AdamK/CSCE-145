/*
 * Written by Adam Hoover
 */
//Step 1. Define Class
public class Apple {
	//Step 2. Instance Variables
	private String type;
	private double weight; 
	private double price;
	private String defType = "Gala";
	private double defWeight = 0.5;
	private double defPrice = 0.89;
	
	//Step 3. Create Constructors
	public Apple() 
	{
		this.type = defType;
		this.weight = defWeight;
		this.price = defPrice;
	}
	public Apple(String aT, double aW, double aP)
	{
		this.setType(aT);
		this.setPrice(aP);
		this.setWeight(aW);
	}
	//Step 4. Create Accessors
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	//Step 5. Create Mutators
	public void setType(String aT)
	{
		if(aT != null && 
				(aT.equalsIgnoreCase("gala") ||
						aT.equalsIgnoreCase("red delicious") ||
						aT.equalsIgnoreCase("golden delicious") ||
						aT.equalsIgnoreCase("granny smith")))
		{
			this.type = aT;
		}
		else
		{
			System.out.println("Invalid Type");
			this.type = defType;
		}
	}
	public void setWeight(double aW)
	{
		if(aW >= 0.0 && aW <= 2.0)
		{
			this.weight = aW;
		}
		else
		{
			System.out.println("Invalid Weight");
			this.weight = defWeight;
		}
	}
	public void setPrice(double aP)
	{
		if(aP >=0.0)
		{
			this.price = aP;
		}
		else
		{
			System.out.println("Invalid Price");
			this.price = defPrice;
		}
	}
	//Step 6. Other useful methods
	public String toString()
	{
		return "Type: " + this.type+"\nWeight: "+this.weight+"\nPrice: "+this.price;
	}
	public boolean equals(Apple aA)
	{
		return aA != null &&
				this.type.equals(aA.getType()) &&
				this.weight == aA.getWeight() &&
				this.price == aA.getPrice();
		
	}
}










