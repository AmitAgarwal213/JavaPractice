package AllAssignment;
// Find out future time in 10days
import java.util.Date;

public class Assignment18 {

	public static void main(String[] args) {
		//Find out future time in 10days
		
		Date d1= new Date();
		Date d2= new Date(d1.getTime()+(1000*60*60*24*10) );
		System.out.println(d2);
		//System.out.println(d1.getTime());
	}

}
