package comparatorex;
import java.util.Iterator;
import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {
		TreeSet<Customer> ts=new TreeSet(new CheckComparator());
		//ts.add(new Customer(1001,25,"Sathish","Bheemavarapu"));
		ts.add(new Customer(1002,22,"Bhanu","Shaik"));
		ts.add(new Customer(1258,26,"naveen","bheemavarapu"));
		ts.add(new Customer(1586,45,"neelu","Patan"));
		ts.add(new Customer(7858,85,"raju","vangaveti"));
		ts.add(new Customer(1002,13,"uma","chintalapudi"));
		ts.add(new Customer(1258,74,"narayana","narala"));
			
			Iterator itr=ts.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			
			}
			
		

	}

}
