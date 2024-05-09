package dummy.java;
import java.util.Scanner;
public class SimpleInteresst {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
//		a+= b;
//		System.out.println("After use add " + a);
		int p = sc.nextInt();
		float r = sc.nextInt();
	float t = sc.nextInt();
	double si= (p*r*t)/100;
	System.out.println(si);
	}

}
