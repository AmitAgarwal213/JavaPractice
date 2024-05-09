package logical;
import java.util.Scanner;
public class UserInput {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		if (a>0) {
			System.out.println("the number is possitive");
		}
		else if (a<0) {
			System.out.println("the numbe is negative");
		
		}
		else {
			System.out.println("the number is zero");
		}
	}

}
