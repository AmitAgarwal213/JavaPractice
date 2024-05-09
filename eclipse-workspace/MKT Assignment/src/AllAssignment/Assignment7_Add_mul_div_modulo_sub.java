package AllAssignment;

import java.util.Scanner;

public class Assignment7_Add_mul_div_modulo_sub {
	
Scanner Assigmnet7 = new Scanner(System.in);
int a = Assigmnet7.nextInt();
	int b = Assigmnet7.nextInt();
	void add() {
		int sum = a+b;
		
		System.out.println("Addtion of two number is=" +sum);	
	}

	void multi() {

		int mul = a*b;
		System.out.println("Multiplication of two number is = "+mul);
	}
	void modulo() {
		double modulo = a%b;
		System.out.println("Reminder of the number is ="+ modulo);
	}
	void divi() {
		float division = a/b;
		System.out.println("Division of two number is = " +division);
	}

	void sub() {
		int sub = a-b;
		System.out.println("The subtratcion of two number is = "+ sub);
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment7_Add_mul_div_modulo_sub A7 = new Assignment7_Add_mul_div_modulo_sub();
		
		A7.add();
		A7.sub();
		A7.multi();
		A7.divi();
		A7.modulo();


	}

}
