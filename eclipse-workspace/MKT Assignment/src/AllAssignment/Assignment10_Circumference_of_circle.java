package AllAssignment;

import java.util.Scanner;

public class Assignment10_Circumference_of_circle {
	
	  final static double  pi= 3.14;
	
	public void Circumference_of_circle() {
Scanner s2= new Scanner(System.in);
int r= s2.nextInt();
		
		double Circumferenceofcircle = 2*pi*r;
	
		System.out.println("The area of circumference is ="+Circumferenceofcircle);
	
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter the value of r");
			Assignment10_Circumference_of_circle A1 = new Assignment10_Circumference_of_circle();
			
			A1.Circumference_of_circle();
			

	}

}
