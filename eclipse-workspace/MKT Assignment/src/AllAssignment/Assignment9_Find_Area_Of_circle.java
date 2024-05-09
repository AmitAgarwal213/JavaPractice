package AllAssignment;

import java.util.Scanner;

public class Assignment9_Find_Area_Of_circle {
	Scanner sc=new Scanner(System.in);
  final static double  pi= 3.14;
int r= sc.nextInt();
public void area_circle() {

	double areofcircle = pi*r*r;
	System.out.println(areofcircle);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment9_Find_Area_Of_circle A1= new Assignment9_Find_Area_Of_circle();
		A1.area_circle();
	}

}
