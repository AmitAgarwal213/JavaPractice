package AllAssignment;

import java.util.Scanner;

public class Assignment_8_method_scanner {
	public void addl() {
		 Scanner s1= new Scanner(System.in);
		
		 int a = s1.nextInt();
		 int b = s1.nextInt();
int addl = a+b;
System.out.println(addl);
}
	
	 void subl() {
		 Scanner S2 = new Scanner(System.in);
		 int i1= S2.nextInt();
		 int i2 = S2.nextInt();
		 int sub = i1-i2;
		 System.out.println(sub);
		 
	 }
	 void multiple() {
		 Scanner S3 = new Scanner(System.in);
		 int i1= S3.nextInt();
		 int i2= S3.nextInt();
		 int multi = i1*i2; 
		 System.out.println(multi);

	 }
	 void div() {
		 Scanner S3 = new Scanner(System.in);
		 int i1= S3.nextInt();
		 int i2= S3.nextInt();
		 int div = i1/i2; 
		 System.out.println(div);

	 }
	 void moduloes() {
		 
	 
	 Scanner S3 = new Scanner(System.in);
	 int i1= S3.nextInt();
	 int i2= S3.nextInt();
	 int mod = i1%i2; 
	 System.out.println(mod);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_8_method_scanner A8 = new Assignment_8_method_scanner();
		System.out.println();
		A8.addl();
		A8.subl();
		A8.multiple();
		A8.div();
		A8.moduloes();

	}

}
