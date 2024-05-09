package OOPS;

//public class methodcall {
	  

	class Cat{
		boolean hasfur;
		String color,breed;
		int legs,eyes;
		public void walk() {
			System.out.println("cat is walking");
		}
		public void eat() {
			System.out.println("cat is eating");
		
		}
		
		public void discreption() {
			System.out.println("my cat has " +legs+" legs and "+eyes+"eyes");
		}
			
	}

	class Dog{
		String color,bread;
		int legs;
		public void weeping() {
			System.out.println("dog is weeping");
		}
	}
	
	
		public class FirstClass {

			
	public static void main(String[] args) {
	Cat cat1 = new Cat();	
	Cat cat2= new Cat();
	
	cat1.legs=2;
	cat1.eyes = 3;
	cat1.eat();
	cat1.walk();
	Dog dog = new Dog();
	dog.weeping();	
		cat1.discreption();
		//cat2.discreption();

		
	
}}