package arthmatic;
import java.util.Scanner;
public class ModuloOperatosUserInput {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	//int c = sc.nextInt();
	  int c = a%b;
	 System.out.println("the reminder is"  +c);
}
}