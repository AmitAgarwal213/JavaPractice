package AllAssignment;

class additon{
	static void add() {
		int a = 30;
		int b = 40;
		System.out.println("the addtion of the number is "+ a+b);
	}
}
class multiplication extends additon{
	static void multi() {
		int i1 = 50;
		int i2 = 40;
		System.out.println("the multi of the number is "+ i1*i2);
	}
}
class divition extends multiplication{
	static void div() {
	int i3 = 30;
	int i4= 2;
	System.out.println("Multiplication of two number is " + i3/i4);
	
}

}

class modulo extends divition{
	static void mod () {
		int i5= 45;
		int i6 = 2;
		System.out.println("The modulo of two number is " + i5%i6);
	}
}

public class MultiLevel_inheritance extends modulo {

	public static void main(String[] args) {
		
		System.out.println("hello");
		add();
		multi();
		div();
		mod();
		// TODO Auto-generated method stub

	}

}
