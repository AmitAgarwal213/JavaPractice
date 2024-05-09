package sum;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp = n;
int reversenumber = 0;
while (temp>0) {
	int lastdigit= temp%10;
	reversenumber= reversenumber*10+lastdigit;
	temp/= 10;}
	if (reversenumber==n) {
		System.out.println("the number is  palindrome"+n);
	}
	else {
		
	System.out.println("the number is not palindrome"+n);
}		}

}