package ie.lyit.testers;
import java.util.ArrayList;

import ie.lyit.flight.*;

public class EmployeeTester 
{
	public static boolean employeeSearch(Employee employee, ArrayList<Employee> employees)
	{
		for(Employee e : employees)
		{
			if(e.equals(employee))
				return true;					
		}
		return false;
	}

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Mr", "John", "Jacob", 25, 04, 1997, 125000.00, new Date(25, 04, 2017));
		Employee e2 = new Employee("Mrs", "Johnny", "Jacobson", 26, 04, 1997, 126000.00, new Date(26, 04, 2017));
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		System.out.println(e1.equals(e2));
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Mrs", "Jonathon", "Jingle", 27, 04, 1997, 127000.00, new Date(27,04,2017)));
		employees.add(new Employee("Mr", "JJ", "Ja", 28, 04, 1997, 128000.00, new Date(28, 04, 2017)));
		employees.add(new Employee("Miss", "Jodie", "Jo", 29, 04, 1997, 129000.00, new Date(29, 04, 2017)));
		employees.add(new Employee("Miss", "JP", "Jake", 30, 04, 1997, 130000.00, new Date(30, 04, 2017)));
		employees.trimToSize();
		
		for (Employee e : employees)
		{
			System.out.println(e.toString());
		}
		
		System.out.println(employeeSearch(e1, employees));
		
	}

}
