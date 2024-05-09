package Sum;

public class calculator {

  public int calculate(int a, int b) {
	        return a + b;
	    }

	    public double calculate(int a, double b) {
//	    	a= 20;
//	    	b =30;
	       
	        System.out.println(a*b);
	        return a;

	    }

	    public int calculate(int a, int b, int c) {
	        return a + b + c;
	    }
	    public static void main(String[]args) {
	    	calculator s1= new calculator();
	    	s1.calculate(2,3);
	    }
	    }
	

