package arthmatic;
import java.util.Scanner;

public class UserInput {
	public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
//int c = a*a+b*b+2*a*b;
int d = (a+b)*(a+b);

//System.out.println("square of two number" + c);
System.out.println("square of two number" + d);

}
}