package logical;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[]args) {
		//int a,b,c,
		//int a = 60;
		//int b = 30;
		//int c = 50;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(b<=a&& c<=a) {
			System.out.println(a+" is the largest number ");
		}
		else if (b<=c && c>=a) {		
	System.out.println(c+"is the largest number ");
		}
		else {
			System.out.println(b+"is the largest number  ");
		}
	}
			
		}
	


