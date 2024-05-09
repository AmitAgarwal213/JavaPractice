package logical;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if (n%2==0) {
		System.out.println("The number is not prime");
	}
	else if (n/2==0) {
		System.out.println("The is number  not prime");
		
	}
	else {
		System.out.println("The number is prime");
	}
}
}
