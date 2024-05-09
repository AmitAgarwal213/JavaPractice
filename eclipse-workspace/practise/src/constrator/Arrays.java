package constrator;

public class Arrays {
public static void main(String[]args) {
	String a ="amit24";
	
	char[] b= a.toCharArray();
	for (int i = 0;i<a.length();i++) {
		
	
	boolean a2= Character.isDigit(b[i]);
	if (a2==true) {
		System.out.println("numeric is present at  " +i);
	}
	}
}
}
