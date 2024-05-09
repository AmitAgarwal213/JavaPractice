package OOPS;

import java.util.Scanner;

public class secondClass {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = 100;
	int b = 600;
	//int firstnumber= sc.nextInt();/////this code also known as DRY(Dont't repeat your self)
	//int secondnumber= sc.nextInt();
	int result = maxof(a,b);
	maxof (200,500);
	//maxof(400,3500);
	System.out.println(result);
	sayHi();
}
static int maxof(int a, int b) {
	if(a>b) {
		return a;
	}
	else {
		return b;
	}
	
}

static void sayHi() {
	System.out.println("Hi");
System.out.println("Goodmoring ");		
	}
}