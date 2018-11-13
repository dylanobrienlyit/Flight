/**
 * Class: Software Implementation - CSDF
 * Instructor: Maria Boyle
 * Description: Class Employee - Developed for the Flight Booking System
 * Date: 06/11/2018
 * Written by: Dylan O'Brien
 */

package ie.lyit.flight;

import java.io.*;
import javax.swing.*;

public class Employee extends Person implements Payable, Serializable
{
	//instance variables
	private double salary;
	private Date startDate;
	private int number;
	private static int nextNumber=1000;
	private final double MAX_SALARY = 150000;
	private int empNo;
	
	//default constructor
	public Employee()
	{
		super();
		salary = 0;
		startDate = new Date();
		number = nextNumber++;
		this.empNo = nextNumber;
	}
	
	//constructor with parameters
	public Employee(String t, String fN, String sN, int d, int m, int y, double salaryIn, Date sD)
	{
		//person class constructor
		super(t, fN, sN, d, m, y);
		this.salary = salaryIn;
		this.startDate = sD;
		this.number = nextNumber++;
		this.empNo = nextNumber;
	}
	
	//overridden to string method
	@Override
	public String toString()
	{
		return("Number: "+number+ "\n"+ super.toString() + "\nSalary: €"+salary
				+"\nStart Date: "+startDate);
	}
	
	//overridden equals method
	@Override
	public boolean equals(Object obj)
	{
		Employee eObject;
		if(obj instanceof Employee)
			eObject = (Employee)obj;
		else
			return false;
		
		return (this.number == eObject.number);
	}

	//method to return employees salary
	public double getSalary() 
	{
		return salary;
	}

	//method to set employees salary
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	//method to get employees start date
	public Date getStartDate() 
	{
		return startDate;
	}

	//method to set employees start date
	public void setStartDate(Date startDate) 
	{
		this.startDate = startDate;
	}

	//method to get employees number
	public int getNumber() 
	{
		return number;
	}
	
	//method to calculate employees monthly wage
	public double calculateWage(double taxPercentage)
	{
		return this.salary/12 - taxPercentage;
	}
	
	//method to increment employees salary
	public double incrementSalary(double incrementAmount)
	{
		salary = this.salary + incrementAmount;
		
		//making sure the new salary doesn't exceed the max salary
		//if it does then make it equal the max salary
		if(this.salary < MAX_SALARY)
		{
			return this.salary;
		}
		else
		{
			this.salary = MAX_SALARY;
			return this.salary;
		}
	}
	
	//saving current employee number
	public void saveEmpNum()
	{
		empNo = nextNumber;	
	}
	
	//setting newest employee number to highest employee number
	public void setEmpNum()
	{
		nextNumber = empNo; 
	}
	
	//method to read a new employee in from the user
	public void read(){
		  //creating JTextFields for the JPane
	      JTextField txtEmployeeNo = new JTextField();
	      txtEmployeeNo.setText("" + this.getNumber());
	      JTextField txtTitle = new JTextField();
	      txtTitle.requestFocus();
	      JTextField txtFName = new JTextField();
	      JTextField txtLName = new JTextField();
	      JTextField txtDay = new JTextField();
	      JTextField txtMonth = new JTextField();
	      JTextField txtYear = new JTextField();
	      JTextField txtDayS = new JTextField();
	      JTextField txtMonthS = new JTextField();
	      JTextField txtYearS = new JTextField();
	      JTextField txtSalary = new JTextField();

	      //object to put into the JPane
	      Object[] message = {
	          "Number:", txtEmployeeNo,
	          "Title:", txtTitle,
	          "First Name:", txtFName,
	          "Last Name:", txtLName,
	          "Day of birth:", txtDay,
	          "Month of birth:", txtMonth,
	          "Year of birth:", txtYear,
	          "Day of start:", txtDayS,
	          "Month of start:", txtMonthS,
	          "Year of start:", txtYearS,
	          "Salary:", txtSalary,
	          
	      };

	      //creating the JOptionPane
	      int option = JOptionPane.showConfirmDialog(null, message, "Enter employee details", JOptionPane.OK_CANCEL_OPTION);

	      //if the user clicks OK, get the text from the textfields and convert them
	      if (option == JOptionPane.OK_OPTION){
	    	  int day = Integer.parseInt(txtDay.getText());
	    	  int month = Integer.parseInt(txtMonth.getText());
	    	  int year = Integer.parseInt(txtYear.getText());
	    	  Date date = new Date(day, month, year);
	    	  int dayS = Integer.parseInt(txtDayS.getText());
	    	  int monthS = Integer.parseInt(txtMonthS.getText());
	    	  int yearS = Integer.parseInt(txtYearS.getText());
	    	  Date dateS = new Date(dayS, monthS, yearS);
	    	  double salary = Double.parseDouble(txtSalary.getText());
	    	  
	    	  //add the new details to an employee
	    	  super.name = new Name(txtTitle.getText(), txtFName.getText(), txtLName.getText());
	    	  super.dateOfBirth = date;
	    	  this.startDate = dateS;
	    	  this.salary = salary;
	      }   
		}
}
