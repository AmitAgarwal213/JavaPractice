package dummy.java;
import java.util.Scanner; 
public class IfElse {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(b<=a&& c<=a){
		System.out.println("the largest number is " +a);
	}
	else if (a<=c && b<=c) {
	
	System.out.println("the largest number is " +c);	
	}
	else {
		System.out.println("the largest number is " +b);
	}
	}
}
