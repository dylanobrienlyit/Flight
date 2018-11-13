/**
 * Class: Software Implementation - CSDF
 * Instructor: Maria Boyle
 * Description: Class Name - Developed for the Flight Booking System
 * Date: 06/11/2018
 * Written by: Dylan O'Brien
 */
package ie.lyit.flight;

import java.io.Serializable;

public class Name implements Serializable{
	
	private String title;
	private String firstName;
	private String surname;
	
	//Default constructor
	public Name()
	{
		title=firstName=surname=null;
	}
	
	//Constructor with parameters
	public Name(String t, String fN, String sN)
	{
		title = t;
		firstName = fN;
		surname = sN;
	}
	
	//Overridden toStrin method
	@Override
	public String toString()
	{
		return "Name: "+title+" "+firstName+" "+surname;
	}
	
	//Overridden equals method
	@Override
	public boolean equals(Object obj)
	{
		Name nObject;
		if(obj instanceof Name)
			nObject = (Name)obj;
		else
			return false;
		
		return (this.getTitle().equals(nObject.title) 
				&& this.getFirstName().equals(nObject.firstName) 
				&& this.getSurname().equals(nObject.surname)); 
	}
	
	//get and set title methods
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	//get and set first name methods
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String fN)
	{
		firstName = fN;
	}
	
	//get and set surname methods
	public String getSurname()
	{
		return surname;
	}
	
	public void setSurname(String sN)
	{
		surname = sN;
	}
	
	//method to check if person is female according to their title
	public boolean isFemale()
	{
		if(title.equalsIgnoreCase("Miss") ||
		   title.equalsIgnoreCase("Ms") ||
		   title.equalsIgnoreCase("Mrs"))
			return true;
		else
			return false;		
	}
}