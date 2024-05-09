package AllAssignment;

import java.util.Scanner;

public class Assignment13_AreaofCircle_ByusingForLoop {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner aoc= new Scanner(System.in);
		
		for (int i=1;i<=10;i++) {
			
			double r= aoc.nextDouble();
			
			
			double pi=3.14;
		double  AOC= pi*r*r;
		System.out.println("area of circle is-------> "+AOC);
		}
		
	}}