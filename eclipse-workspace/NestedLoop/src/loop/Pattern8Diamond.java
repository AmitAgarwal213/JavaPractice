package loop;

import java.util.Scanner;

public class Pattern8Diamond {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int rows = 2*n-1;
for(int i=1;i<=rows;i++) {
	for(int k=1;k<=n-i;k++) {
		System.out.print(" ");
	}
	if (i<=n) {
	for (int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	}else {
	for(int l=1;l<=i-1;i++) {
		
	System.out.print(" ");			}
		for(int j=1;j<=rows-i+1;j++) {
			System.out.print("* ");
		}
		
	}
	System.out.println();
}
	}
	}

