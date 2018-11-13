package ie.lyit.flight;

public interface Payable 
{
	public abstract double calculateWage(double taxPercentage); //don't need 
	                                                            //public
	double incrementSalary(double incrementAmount);             //or abstract
	
}
