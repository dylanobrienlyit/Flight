/**
 * Class: Software Implementation - CSDF
 * Instructor: Maria Boyle
 * Description: Class Menu - Developed for the Flight Booking System
 * Date: 06/11/2018
 * Written by: Dylan O'Brien
 */
package ie.lyit.flight;
import java.util.Scanner;

public class Menu {
	
	private int option;
	
	public Menu() {
		option=0;
	}
	
	public void display() {
		System.out.println("\tEmployee Menu");
		System.out.println("\t1. Add");
		System.out.println("\t2. List");
		System.out.println("\t3. View");
		System.out.println("\t4. Edit");
		System.out.println("\t5. Delete");
		System.out.println("\t6. Quit");
		
	}
	
	public void readOption() {
		Scanner kIn = new Scanner(System.in);
		System.out.println("Enter option - [1|2|3|4|5|6]: ");
		option = kIn.nextInt();
	}
	
	public int getOption() {
		return option;
	}

}
