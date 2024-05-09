package constrator;
//class india {
//	 String colour, bread ;
//		int legs;
//		int eyes;
//	  void walk() {
//	
//	  System.out.println("my cat has"+legs+"legs and"+eyes+"eyes");
//	  
//	  }
//	  
	 // public class nonprameterized {
		  class india {
				 String colour, bread ;
					int legs;
					int eyes;
				  void walk() {
				legs = 4;
				eyes = 2;
				System.out.println("my cat has"+legs+"legs and"+eyes+"eyes");

				  }

}	  

public class nonprameterized {

				  
 

public static void main(String[]args) {
	 india cat = new india();
	 // System.out.println("my cat has"+cat.legs+"legs and"+cat.eyes+"eyes");

	// cat.colour = "white";
	 //cat.legs = 4;
	//cat.eyes = 2;
	  
	 cat.walk();
 }
}