package arthmatic;
import java.util.Scanner;

public class UserInputIncrementDecriment {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int b= sc.nextInt();

	int c = ++a;
	int d = ++b;
	System.out.println(" after incriment:"+c+d);
}
	


}
