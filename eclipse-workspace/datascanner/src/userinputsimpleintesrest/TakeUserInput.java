package userinputsimpleintesrest;
import java.util.Scanner;

public class TakeUserInput {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int Principal = sc.nextInt();
	float rate = sc.nextFloat();
	int time = sc.nextInt();
float simpleInterest = Principal*rate*time/100;
System.out.println("the simple interest is  simpleInterest");

}
}