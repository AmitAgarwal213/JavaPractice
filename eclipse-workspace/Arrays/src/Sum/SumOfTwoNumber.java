package Sum;

//import java.util.Scanner;

public class SumOfTwoNumber {
public static void main(String[]args) {
////	Scanner sc = new Scanner(System.in);
////	//int a= sc.nextInt();
////	//int b = sc.nextInt();
////	//int c = a+b;
////	int n = sc.nextInt();
////	int factorial = 1;
////	for(int i=n;i>=1;i--) {
////		factorial = factorial*i;
//int bar = 1;
//{
int a[][] = {{1,2,3},{4,5,6}};
float sum = 0;
for(int i = 0;i<2;++i)
	for(int j=0;j<2;++j)
		sum = sum+a[i][j];
System.out.print(sum/5);
}}
