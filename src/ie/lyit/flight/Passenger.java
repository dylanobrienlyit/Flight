package ie.lyit.flight;

public class Passenger extends Person
{
	public int noBags;
	public boolean priorityBoarding;
	
	public Passenger()
	{
		super(); // Not needed but can be put in
		noBags = 0;
		priorityBoarding = false;
	}
	
	public Passenger(String t, String fN, String sN, int d, int m, int y, int nB, boolean pB)
	{
		super(t, fN, sN, d, m, y);
		noBags = nB;
		priorityBoarding = pB;
	}
	
	@Override
	public String toString()
	{
		return(super.toString()+"\nNumber of Bags: "+noBags
				+"\nPriority Boarding is: "+priorityBoarding);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Passenger pObject;
		if(obj instanceof Passenger)
			pObject = (Passenger)obj;
		else
			return false;
		
		return this.name.equals(pObject.name)
				&& this.dateOfBirth.equals(pObject.dateOfBirth)
				&& this.noBags == pObject.noBags
				&& this.priorityBoarding == pObject.priorityBoarding;
	}

	public int getNoBags() 
	{
		return noBags;
	}

	public void setNoBags(int nB) 
	{
		noBags = nB;
	}

	public boolean isPriorityBoarding() 
	{
		return priorityBoarding;
	}

	public void setPriorityBoarding(boolean pB) 
	{
		priorityBoarding = pB;
	}

}
