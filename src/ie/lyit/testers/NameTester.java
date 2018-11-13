package ie.lyit.testers;
import ie.lyit.flight.*;
import java.util.*;

public class NameTester 
{

	public NameTester() 
	{
	}
	
	public static boolean nameSearch(Name name, ArrayList<Name> names)
	{
		for(Name n : names)
		{
			if(n.equals(name))
				return true;					
		}
		return false;
	}

	public static void main(String[] args) 
	{
       /*Name name = new Name();
		
		name.setTitle("Mr");
		name.setFirstName("Danny");
		name.setSurname("Boy");
		
	   Name name2 = new Name("Mr", "Danny", "Boy");
		
		System.out.println(name.equals(name2));
		System.out.println(name2.isFemale());
		System.out.println(name.toString());
		System.out.println(name2.getFirstName());*/
		
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("Mrs", "Henry", "Boyd"));
		names.add(new Name("Miss", "Kiki","LoveMe"));
		names.add(new Name("Mr", "Drake", "Sad"));
		names.trimToSize();
		
		for (Object obj : names)
		{
			System.out.println(obj.toString());
		}
		
		System.out.println(nameSearch(new Name("Mrs", "Henry", "Boyd"), names));
	}

}
