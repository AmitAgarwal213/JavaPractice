package switchh;
import java.util.Scanner;
public class CheckReview {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int rating = sc.nextInt();
		//char result = 0;
		switch(rating) {
		case 1 :
			case 2:
				System.out.println("bad review");
				break;
		
		case 3: case 4:
			System.out.println("good review");
			break;
		case 5:
			System.out.println("excilent");
			break;
		
			default:
		
				System.out.println("I dont know what is the review");
			
	
	

}}
}