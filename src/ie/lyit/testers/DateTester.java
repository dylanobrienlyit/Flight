package ie.lyit.testers;
import ie.lyit.flight.*;
import java.util.Scanner;

public class DateTester 
{
	public static void main(String[] args) {
		/*Date d1 = new Date();
      System.out.println(d1);      

	   d1.setDay(4);
		d1.setMonth(6);
		d1.setYear(1941);
		
		System.out.println(d1);
      
		Date d2 = new Date(28, 12, 1982);
      System.out.println(d2);
      
		if(d1.equals(d2))
			System.out.println("Date's are equal.");
		else
			System.out.println("Date's are not equal.");*/
		int myDay = 32, myMonth = 13, myYear = -2009;
		boolean goodInput = false;
		Scanner keyboardIn = new Scanner(System.in);
	do {
		try {
		Date myDate1 = new Date();
		myDate1.setDay(myDay);
		myDate1.setMonth(myMonth);
		myDate1.setYear(myYear);
		System.out.println(myDate1);
		goodInput = true;
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid Date.");
			
			System.out.println("Enter Day [1-31]: ");
			myDay = keyboardIn.nextInt();
			System.out.println("Enter Month [1-12]: ");
			myMonth= keyboardIn.nextInt();
			System.out.println("Enter Year [Above 1900]: ");
			myYear = keyboardIn.nextInt();
		}
	}while(!goodInput);
	
	Date dob = new Date(33, 13, 100);
	System.out.println(dob);
	
	keyboardIn.close();

   }

}
