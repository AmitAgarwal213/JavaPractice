package forloop;
import java.util.Scanner;
public class fiboncchi {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int a = 0;
	int b = 1;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for (int i=0;i<n;i++) {
		int c = a+b;
		a=b;
		b=c;
		System.out.println(c);
//	a=b;
//		b=c;
	}
}
}
