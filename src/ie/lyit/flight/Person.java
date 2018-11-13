/**
 * Class: Software Implementation - CSDF
 * Instructor: Maria Boyle
 * Description: Class Person - Developed for the Flight Booking System
 * Date: 06/11/2018
 * Written by: Dylan O'Brien
 */

package ie.lyit.flight;

import java.io.Serializable;

public abstract class Person implements Serializable
{
	protected Name name;
	protected Date dateOfBirth;
	
	//Default constructor
	public Person()
	{
		name = new Name();
		dateOfBirth = new Date();
	}
	
	//Constructor with parameters
	public Person(String t, String fN, String sN, int day, int month, int year)
	{
		name = new Name(t, fN, sN);
		dateOfBirth = new Date(day, month, year);
	}
	
	//Overridden toString method
	@Override
	public String toString()
	{
		return "Name: "+name.toString()+"\nDate Of Birth: "+dateOfBirth.toString();
	}
	
	//Overridden equals method
	@Override
	public boolean equals(Object obj)
	{
		Person pObject;
		if(obj instanceof Person)
			pObject = (Person)obj;
		else
			return false;
		
		return(name.equals(pObject.name) 
				&& dateOfBirth.equals(pObject.dateOfBirth));	
	}
	
	//set methods
	public void setName(Name nameIn)
	{
		name = nameIn;
	}
	
	public void setDateOfBirth(Date dobIn)
	{
		dateOfBirth = dobIn;
	}
	
	//get methods
	public Name getName()
	{
		return name;
	}
	
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

}
