package ie.lyit.testers;
import ie.lyit.flight.*;

public class PassengerTester 
{

	public static void main(String[] args) 
	{
		Passenger p1 = new Passenger("Mr", "John", "Jacob", 25, 04, 1997, 2, true);
		Passenger p2 = new Passenger("Mrs", "Johnny", "Jacobson", 26, 04, 1997, 2, true);
		
		System.out.println(p1);
		
		System.out.println(p1.equals(p2));
	}

}
