package OOPS;

import java.util.Scanner;

public class MethodOverloading {
public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	//int a = sc.nextInt();
	
	//int b = sc.nextInt();
	int a = 500;
	int b = 600;
	int result = maxof(a,b);
	maxof(200,900);
	//maxof(400,3500);///class parent
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
