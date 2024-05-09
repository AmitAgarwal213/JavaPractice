package dummy.java;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n%2==0) {
			System.out.println("number is not prime" );	
			}
//			else if (n/2==0){
//				System.out.println("number is not prime" );
//			
//			}
			else {
				System.out.println("number is prime" );
			}
		}


	}


