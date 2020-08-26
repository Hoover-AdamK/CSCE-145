/*
 * Written by Adam Hoover
 */
	//Step 1. Define the Class
public class PBJSandwich {
	//Step 2. Create Instance Variables
	Bread topSlice;
	PeanutButter pButter;
	Jelly jelly;
	Bread bottomSlice;
	
	//Step 3. Create Constructors
	PBJSandwich()
	{
		topSlice = new Bread();
		pButter = new PeanutButter();
		jelly = new Jelly();
		bottomSlice = new Bread();
	}
	PBJSandwich(Bread tS, PeanutButter pB,Jelly je, Bread bS)
	{
		this.setTop(tS);
		this.setPb(pB);
		this.setJel(je);
		this.setBot(bS);
	}
	
	//Step 4. Create Accessors
	public Bread getTop()
	{
		return this.topSlice;
	}
	public PeanutButter getPb()
	{
		return this.pButter;
	}
	public Jelly getJel()
	{
		return this.jelly;
	}
	public Bread getBot()
	{
		return this.bottomSlice;
	}
	//Step 5. Mutators
	public void setTop(Bread tS)
	{
		topSlice = tS;
	}
	public void setPb(PeanutButter pB)
	{
		pButter = pB;
	}
	public void setJel(Jelly je)
	{
		jelly = je;
	}
	public void setBot(Bread bS)
	{
		bottomSlice = bS;
	}
	//Step 6. Other Methods
	public boolean Equals(PBJSandwich sandwich2)
	{
		if(this.topSlice.Equals(sandwich2.topSlice) && 
				this.pButter.Equals(sandwich2.pButter) &&
				this.jelly.Equals(sandwich2.jelly) &&
				this.bottomSlice.Equals(sandwich2.bottomSlice))
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
		return "Top Slice: "+this.topSlice.toString()+"\nPeanut Butter: "+this.pButter.toString()+"\nJelly: "+
				this.jelly.toString()+"\nBottom Slice: "+this.bottomSlice.toString();
	}
}









