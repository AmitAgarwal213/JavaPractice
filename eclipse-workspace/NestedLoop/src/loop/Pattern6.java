package loop;
import java.util.Scanner;
public class Pattern6 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int rows = 2*n-1;
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.println("");
		}
if (i<=n) {
	
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}}
			else {
				for(int k=1;k<=n-i+1;k++) {
					System.out.print("* ");
				}
			
			System.out.println();
	}
}
	}}
