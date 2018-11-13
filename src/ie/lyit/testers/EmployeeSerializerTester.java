/**
 * Class: Software Implementation - CSDF
 * Instructor: Maria Boyle
 * Description: Class EmployeeSerializerTester - Developed for the Flight Booking System
 * Date: 06/11/2018
 * Written by: Dylan O'Brien
 */
package ie.lyit.testers;

import ie.lyit.serialize.EmployeeSerializer;
import ie.lyit.flight.Menu;

public class EmployeeSerializerTester {

	public static void main(String[] args) {
		//initialise a new employee serializer
		EmployeeSerializer employeeSerializer = new EmployeeSerializer();
		
		//deserialize the employees file
	    employeeSerializer.deserializeEmployees();
		
	    //create a new menu to display
		Menu employeeMenu = new Menu();
		
		//display the menu repeatedly until option 6 is pressed
		do {
			employeeMenu.display();
			employeeMenu.readOption();
			
			//switch to let user pick which option and appropriate method
			switch(employeeMenu.getOption()) {
			
			case 1 : employeeSerializer.add(); break;
			case 2 : employeeSerializer.list(); break;
			case 3 : employeeSerializer.view(); break;
			case 4 : employeeSerializer.edit(); break;
			case 5 : employeeSerializer.delete(); break;
			case 6 : break;
			default : System.out.println("Invalid option, try again");
			}
		}while(employeeMenu.getOption() != 6);
		
		//serialize the employees for any changes that have been made
		employeeSerializer.serializeEmployees();
	
	}

}

