package AllAssignment;

import java.util.Scanner;

//To find if the given number is Odd/Even number
public class Assignment30 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int n = s.nextInt();
	if (n%2==0) {
		System.out.println("Number is even");
		
	}
	else
		System.out.println("No is odd");
}
}
