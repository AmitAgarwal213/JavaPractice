package constrator;

public class ExceptionHandleing {
public static void main (String[]args) {
	try {
	int a= 1;
	System.out.println(a/0);
	
	}
catch(ArithmeticException a) {
		System.out.println("hello");
	}
	
}
}
