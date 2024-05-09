package AllAssignment;

public class Assignment21 {
public static void main(String[] args) { 
	//Check if given String only consist of alpha

	String s = "Amit";
	char[] ch=s.toCharArray();
	for (int i = 0; i < s.length(); i++) {
		if (!Character.isLetter(ch[i])) {
			System.out.println("Given string Contains alphabets,numbers,special characters ");
			return;
		}
	}
	System.out.println("Given string Contains Alphabets only");
	System.out.println();
	checkNumbers();

}
//Check if given String only consist of numbers
static void checkNumbers() {
	String s = "12345drg";
	char[] ch=s.toCharArray();
	for (int i = 0; i < s.length(); i++) {
		if (!Character.isDigit(ch[i])) {
			System.out.println("Given string Contains alphabets,numbers,special characters ");
			return;
		}
	}
	System.err.println("Given string Contains Numerics only");
}



}

