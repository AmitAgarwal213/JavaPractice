package AllAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment25 {
public static void main(String[]args) {
	List <Integer> a= new ArrayList();
	a.add(2);
	a.add(23);
	a.add(25);
	a.remove(1);
	//a.add("hi");
	Collections.sort(a);
		System.out.println(a);	
}
}
