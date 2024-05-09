package AllAssignment;

import java.util.Scanner;

public class Assignment15_ToTakeUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S1= new Scanner(System.in);
		int n = S1.nextInt();
		switch (n) {
		case 1: 
			System.out.println("I will attend the class");
			break;
		case 2: 
			System.out.println("I will't attend the class");
			break;
			
		case 3: 
			System.out.println("I am not sure i will join class or not ");
			break;
			
		case 4: 
			System.out.println("I am sure i will not join the class");
			break;
			
			default:
				System.err.println("oops I am unable to recorgnized");
			
		}
	}

}
