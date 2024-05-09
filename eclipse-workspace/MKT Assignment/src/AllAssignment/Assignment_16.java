package AllAssignment;

abstract class addition{
	abstract void add();
	
	abstract void subtraction();
	
	}
	abstract class div extends addition{
		abstract void abstr();
		
	int a =40;
	int b = 3;
	
	abstract void modulo();
	
void mul() {
	System.out.println(a*b);
	
}
	}

public class Assignment_16 extends div {
void concreat() {
	System.out.println("Concrete method 1");
}
	void concrete2() {
		System.out.println("concrete method 2");
		
	}
	

public static void main(String[]args) {
	
	Assignment_16 A1= new Assignment_16();
A1.abstr();
A1.add();
A1.subtraction();
A1.modulo();
A1.concreat();
A1.concrete2();
	
}
@Override
void abstr() {
	System.out.println(a/b);
}
@Override
void modulo() {
	System.out.println(a%b);
	
}
@Override
void add() {
	
	System.out.println(a+b);
}
@Override
void subtraction() {
	System.out.println(a-b);
}
}
