package AllAssignment;

public class Assignment3_AdditionByUsingMethodCalling {

	public static void add() {
		int a= 20;
		int b = 10;
		System.out.println(a+b);
	}
	
	 void sub() {
		int a=20;
		int b = 10;
		System.out.println(a-b);
	}
	public static void multi() {
		int a= 20;
		int b = 10;
		System.out.println(a*b);
	}
	public static void div() {
		int a = 20;
		int b = 10;
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Assignment3_AdditionByUsingMethodCalling sub= new Assignment3_AdditionByUsingMethodCalling();
		sub.sub();
add();
multi();
div();




	}

}
