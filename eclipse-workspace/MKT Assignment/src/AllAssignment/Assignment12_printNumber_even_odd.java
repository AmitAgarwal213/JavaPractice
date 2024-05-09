package AllAssignment;

public class Assignment12_printNumber_even_odd {

	public static void main(String[] args) {
		evenOrOdd();
	}

	public static void evenOrOdd() {
		for (int i = 1; i <=100; i++) {
			if (i%2==0) {
				System.out.println(i+" This is even ");
			}else {
				System.err.println(i+" This is odd ");
			}
		}
	}

}