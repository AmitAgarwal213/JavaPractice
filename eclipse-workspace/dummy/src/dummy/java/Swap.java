package dummy.java;

import java.util.Scanner;

public class Swap {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: "+a +"   " + b); 
		

}
}