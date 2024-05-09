package AllAssignment;
//Iterate Arraylist elements using iterator and list Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment28 {
public static void main(String[]args) {
	ArrayList a= new ArrayList();
	a.add(22);
	a.add(24);
	a.add(null);
	a.add(null);
	a.isEmpty();
	Iterator b= a.iterator();
	while (b.hasNext()==true) {
		
	System.out.println(b.next());
	
	ListIterator i = a.listIterator();
	while (i.hasNext()==true) {
		System.out.println(i.next());
		
		
		
	}
	
}
}
}