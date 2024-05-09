package sum;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			int lastdigit=n%10;
			//n/=10;

			sum+=lastdigit;
			System.out.println(sum);
		}
		
}

}
