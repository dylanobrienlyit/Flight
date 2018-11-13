/**
 * Class: Software Implementation - CSDF
 * Instructor: Maria Boyle
 * Description: Class EmployeeSerializer - Developed for the Flight Booking System
 * Date: 06/11/2018
 * Written by: Dylan O'Brien
 */
package ie.lyit.serialize;

import java.util.ArrayList;
import java.nio.file.*;
import java.util.Scanner;
import ie.lyit.flight.*;
import java.io.*;
import java.io.File;

public class EmployeeSerializer {
	//initiating employee arraylist
	private ArrayList<Employee> employees;
	private final String FILENAME = "employees.ser";
	//creating a path for the filename
	Path p=Paths.get(FILENAME);

	
	//default constructor
	public EmployeeSerializer() {
		employees = new ArrayList<Employee>();
	}
	
	//method to add an employee to the arraylist
	public void add() {
		Employee employee = new Employee();
		
		//read an employee in through the JOptionPane
		employee.read();
		
		//Adding the new employee to the arraylist
		employees.add(employee);
	}
	
	//method to show all employees in arraylist
	public void list() {
		for(Employee tmpEmployee : employees)
			System.out.println(tmpEmployee);
	}
	
	//method to view a certain employee by number
	public Employee view() {
		//creating scanner
		Scanner kIn = new Scanner(System.in);
		System.out.println("Enter the employee number: ");
		int employeeToView = kIn.nextInt();
		
		//search for the employee by the number entered
		for(Employee tmpEmployee : employees) {
			if(tmpEmployee.getNumber() == employeeToView) {
				System.out.println(tmpEmployee);
				//return the employee if there's a match
			    return tmpEmployee;
			}
		}
		//return null if no match
		return null;
	}
	
	//method to delete an employee by number
	public void delete() {
		//call the view method to search for employee by number
		Employee tmpEmployee = view();
		
		//check if the employee exists and remove it if it does
		if(tmpEmployee !=null) {
			employees.remove(tmpEmployee);
		}
	}
	
	//method to edit a full employee by number
	public void edit() {
		//call the view method to search for employee by number
		Employee tmpEmployee = view();
		
		//check if employee exists
		if(tmpEmployee !=null) {
			int index = employees.indexOf(tmpEmployee);
			//read in the employee
			tmpEmployee.read();
			//add it to the arraylist at the index it was at
			employees.set(index, tmpEmployee);
		}
	}
	
	//saving highest employee number
	public void saveEmpNo()
	{
		if(employees.size() > 0)
		employees.get(employees.size() -1).saveEmpNum();
	}
	
	//restoring highest employee number if arraylist isn
	public void restoreEmpNo()
	{
		if(employees.size() > 0)
        employees.get(employees.size() -1).setEmpNum();	
	}
	
	//serializing the employee arraylist
	public void serializeEmployees() {
		try {
			//create the file output stream
			FileOutputStream fileStream = new FileOutputStream(new File(FILENAME));
		    
			//create the object output stream
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
		    
			//write the employee arraylist to the output stream
			os.writeObject(employees);
			
			//saving last employee number
			saveEmpNo();
		    
			//close the output stream
			os.close();
		}
		//catch block if file cannot be found
		catch(FileNotFoundException fNFE) {
			System.out.println("Cannot create file to store employees.");
		}
		//catch block if input is wrong
		catch(IOException ioE) {
			System.out.println(ioE.getMessage());
		}
	}
	
	//deserializing the employee arraylist
	public void deserializeEmployees() {
		try {
			//check if the file to deserialize actually exists
			if(Files.exists(p)){
			//create the file input stream
			FileInputStream fileStream = new FileInputStream(FILENAME);
			
			//create the object input stream
			ObjectInputStream is = new ObjectInputStream(fileStream);
			
			//read the file to the arraylist
			employees = (ArrayList<Employee>)is.readObject();
			
			//restoring last employee number
			restoreEmpNo();
			
			//close the input stream
			is.close();
			
			}
			else // file doesn't exist
				 System.out.println("File "+p.getFileName()+" doesn’t exist");
		}
		//catch block if file cannot be found
		catch(FileNotFoundException fNFE) {
			System.out.println("Cannot create file to store employees.");
		}
		//catch block if input is wrong
		catch(IOException ioE) {
			System.out.println(ioE.getMessage());
		}
		//catch block if class can't be found
		catch(ClassNotFoundException cNFE) {
			System.out.println(cNFE.getMessage());
		}
	}

}
