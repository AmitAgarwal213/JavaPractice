package sum;

import java.util.Scanner;

public class SumOfNumber {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp = n;
int sum = 0 ;
while (temp>0) {
	int lastdigit= temp%10;
	temp/= 10;
	
	sum+= lastdigit;
}
System.out.println("sum of the number " +sum);
}
}
