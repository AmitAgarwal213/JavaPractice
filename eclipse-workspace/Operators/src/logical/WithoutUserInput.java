package logical;
import java.util.Scanner;
public class WithoutUserInput {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
//	int a = 3;
//int b = 2;
//			
////	System.out.println("enter first number");
////	//int b = sc.nextInt();
////	System.out.println("enter second number");
////	//sc.nextLine();
////	System.out.println("enter operation");
//	char operation=0 ;
//	int result = 0 ;
//	switch (operation) {
//	case'+':
//		result = a+b;
//		break;
//	case'-':
//		result = a-b;
//		break;
//	case'*':
//		result = a*b;
//		break;
//	case'/':
//		 result = a/b;
//		break;
//		default :
//			System.out.println("invalid operation");
//	}
//	System.out.println("the result is" + result);
//	}
//
//	}
			int a = sc.nextInt();
			System.out.println("enter first number");
			int b = sc.nextInt();
			System.out.println("enter second number");
			sc.nextLine();
			System.out.println("enter operation");
			char operation = sc.nextLine().charAt(0);
			int result = 0 ;
			switch (operation) {
			case'+':
				result = a+b;
				break;
			case'-':
				result = a-b;
				break;
			case'*':
				result = a*b;
				break;
			case'/':
				 result = a/b;
				break;
				default :
					System.out.println("invalid operation");
			}
			System.out.println("the result is" + result);


}}