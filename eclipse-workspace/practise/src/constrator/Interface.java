package constrator;

import java.util.Scanner;


interface student1 { 
	
	void reverse();

	int rev1= 0;
	Scanner S1= new Scanner (System.in);
	int n = S1.nextInt();

		
		
	}

	

	

abstract class  student implements student1{
abstract void add();
int a= 23;
int b =40;
	

}
public class Interface extends student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface I1= new Interface();
		I1.reverse();
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		while (n>0) {
			int rem = n%10;
			rev1 = rem * 10 +rev1 ;
			
		}
		
			System.out.println(rev1);
		}
	

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

}
