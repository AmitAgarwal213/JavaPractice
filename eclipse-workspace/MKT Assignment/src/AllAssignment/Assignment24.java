package AllAssignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Assignment24 {
public static void main (String[]args) {
	ArrayList a1 = new ArrayList();
	a1.add("Hi");
	a1.add("My");
	a1.add("Amit");// we can stroe string value 
	a1.add(null);//In arraylist we can store multiple null value 
	a1.add(null);
	a1.add( 2);// we can store intiger value 
	
	
	System.out.println(a1);
	ArrayList a2= new ArrayList();
	a2.add(22);
	a2.addAll(a1);
	System.out.println(a2);
	
	Vector  V4  =new Vector();
	System.err.println("Print the vector "+"======================");
	V4.add(441441);
	V4.add(23);
	V4.add(1441);
	V4.add(null);//Vectro can store multiple null value 
	V4.add(442);//vectro can store int value 
	V4.addElement(V4);
	V4.add(null);//
	
	
	
	System.out.println(V4);
	
	PriorityQueue <Integer> v= new PriorityQueue();
	System.err.println("Print the priority queue"+"=========================");
	//v.add("hi");//Prority queue can story string value 
	//v.add(null);//prority queue can not store null value 
	v.add(123);
	v.add(34);
	v.add(3311);
	
	System.out.println(v);

	
	LinkedList l1= new LinkedList();
	System.err.println("print the linkedlist"+ "=========================");
	l1.add("Hi");
	l1.add(1);
	l1.add("amit");
	l1.add(2);
	l1.add(null);
	l1.add(null);
	System.out.println(l1);

	TreeSet <Integer>a= new TreeSet();
	System.err.println("print the tree set"+ "=======================");
	a.add(122);
	//a.add(null);
	//a.add(null);
	a.add(1332);
	//a.add("hi");
	System.out.println(a);
}
}



