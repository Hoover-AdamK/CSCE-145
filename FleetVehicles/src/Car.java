/*
 * Written by Adam Hoover
 */
public class Car extends Vehicle {
	private double gasM;
	private int numP;

	public Car()
	{
		super();
		this.gasM = 0.0;
		this.numP = 0;
	}
	
	public Car(String aM, int aC, String aO, double aG, int aP)
	{
		super(aM,aC,aO);
		this.setGasMileage(aG);
		this.setNumberOfPassengers(aP);
	}
	
	public double getGasMileage()
	{
		return this.gasM;
	}
	public int getNumberOfPassengers()
	{
		return this.numP;
	}
	
	public void setGasMileage(double aG)
	{
		if(aG < 0.0)
		{
			this.gasM = 0.0;
		}
		else 
		{
			this.gasM = aG;
		}
	}
	public void setNumberOfPassengers(int aP)
	{
		if(aP<0)
		{
			this.numP = 0;
		}
		else
		{
			this.numP = aP;
		}
	}
	
	public String toString()
	{
		return super.toString()+"\nGas Mileage: "+this.gasM+"\nNumber of Passengers: "+this.numP;
	}
	public boolean equals(Car aC)
	{
		return aC != null &&
				super.equals(aC) &&
				this.gasM == aC.getGasMileage() &&
				this.numP == aC.getNumberOfPassengers();
		
	}
}
