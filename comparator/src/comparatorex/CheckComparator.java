package comparatorex;

import java.util.Comparator;

public class CheckComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Customer c1=(Customer)o1;
		Customer c2=(Customer)o2;
		
		int age=c1.getAge().compareTo(c2.getAge());
		int firstName=c1.getFirstName().compareTo(c2.getFirstName());
		int lastName=c2.getLastName().compareTo(c2.getLastName());
		int id=c1.getId().compareTo(c2.getId());
		if(c1.getAge().equals(c2.getAge()))
		{
		if(c1.getFirstName().equals(c2.getFirstName()))
			
		{
		
		return lastName;
	     }
		else 
			
			return firstName;
		}
		else 
			return id;

	     }

}