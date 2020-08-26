/*
 * Written by Adam Hoover
 */
//Step 1. Define the Class
public class Box {
	
//Step 2. Create Instance Variables
	private String label;
	private double length;
	private double width;
	private double height; 
	
//Step 3. Create Constructors
	public Box()
	{
		this.label = "none";
		this.length = 0.0;
		this.width = 0.0;
		this.height = 0.0;	
	}
	public Box(String aLabel, double aLen, double aWid, double aHei)
	{
		this.setLabel(aLabel);
		this.setLength(aLen);
		this.setWidth(aWid);
		this.setHeight(aHei);
		
	}
//Step 4. Create Accessors
	public String getLabel()
	{
		return this.label;
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	
//Step 5. Mutators
	public void setLabel(String aLabel)
	{
		if(aLabel == null)
		{
			this.label = "none";
		}
		else
		{
			this.label = aLabel;
		}
		
	}
	public void setLength(double aLen)
	{
		if (aLen <= 0.0)
		{
			this.length = 1.0;
		}
		else
		{
			this.length = aLen;
		}
	}
	public void setWidth(double aWid)
	{
		if(aWid <= 0.0)
		{
			this.width = 1.0;
		}
		else
		{
			this.width = aWid;
		}
	}
	public void setHeight(double aHei)
	{
		if(aHei <= 0.0)
		{
			this.height = 1.0;
		}
		else 
		{
			this.height = aHei;
		}
	}
//Step 6. Other Methods
	public double getVolume()
	{
		return this.length*this.width*this.height;
	}
	public String toString()
	{
		return "Label: "+this.label+" Volume: "+this.getVolume();
	}

}
























