package OOPS;

import java.util.Scanner;

public class startpattern {
public static void main(String[]arge) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	
for (int i=1;i<=n;i++) {
	for(int j = 1; j<=n-i;j++) {
		System.out.print(" ");
		
	}
	for(int j=1;i<=i;j++) {
	System.out.print("*  ");
	}
	System.out.println();
	

}
}}