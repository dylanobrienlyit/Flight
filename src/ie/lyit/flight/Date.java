/**
 * Class: Software Implementation - CSDF
 * Instructor: Maria Boyle
 * Description: Class Date - Developed for the Flight Booking System
 * Date: 06/11/2018
 * Written by: Dylan O'Brien
 */
package ie.lyit.flight;

import java.io.Serializable;

public class Date implements Serializable
{
	private int day;
	private int month;
	private int year;

	// Default Constructor 
	public Date(){
	   day=month=year=0;
	}

	// Initialisation Constructor
  	public Date(int day, int month, int year)throws IllegalArgumentException{
       this.day = day;
       this.month = month;
	    this.year = year;
   }

	//Overridden toString() method
	@Override
   public String toString(){
		return (day + "/" + month + "/" + year);
	}
	
	//Overridden equals() method
	@Override
   public boolean equals(Object o){
		// First check if o is a null reference to prevent run-time exceptions
		if(o == null) 
         return false;
	
		// Next check if o references the current object, if it does it must be equal
		if (this == o)
			return true;
         
		// Next check if o is in fact a Date object
		if(!(o instanceof Date))
			return false;
		else
		{
			// If none of the above are true, cast o to a Date object so that
            // we can compare the object's instance variables and methods
			Date other = (Date)o;
			
			return (this.day == other.day) &&
				   (this.month == other.month) &&
				   (this.year == other.year);
		}
	}
	
	// get methods
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}

	// set methods
	public void setDay(int setDayTo) throws IllegalArgumentException{
		//try {
		 if(setDayTo > 31 || setDayTo < 1)
	      throw new IllegalArgumentException("Day has to be between 1 and 31");
		 
         day=setDayTo;
		/*}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}*/
	}
	
 	public void setMonth(int setMonthTo) throws IllegalArgumentException{
 		//try {
 		if(setMonthTo > 12 || setMonthTo < 1)
 		 throw new IllegalArgumentException("Month has to be between 1 and 12");
 		
 		month = setMonthTo;
 			/*}
 		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}*/
 	}
 		
 	public void setYear(int setYearTo) throws IllegalArgumentException{
 		//try {
 		if(setYearTo < 1900)
 			throw new IllegalArgumentException("Year has to be above 1900");
 		
 		year = setYearTo;
 		/*}
 		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
 		}*/
 	}
}
	
