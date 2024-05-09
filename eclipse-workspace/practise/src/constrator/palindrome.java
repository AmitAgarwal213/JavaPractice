package constrator;

public class palindrome {
public static void main(String[]args) {
	String Output ="";
	String a= "Austrelia";
	
	for(int i=0;i<a.length()-1;i++) {
		
		char rev = a.charAt(i);
		Output = rev+Output;
	}
	if(a.equals(Output)) {
		System.out.println("String is Palindrom");
	}
		else {
			System.out.println("String is not palindrom");
		}
	
	}}

