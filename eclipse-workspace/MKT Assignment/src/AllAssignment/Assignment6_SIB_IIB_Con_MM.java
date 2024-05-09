package AllAssignment;

public class Assignment6_SIB_IIB_Con_MM {
	Assignment6_SIB_IIB_Con_MM(){
		System.out.println("This is constractor");
	}
	
	static {
		System.out.println("This is SIB");
		
			
	}
	{
		System.out.println("this is IIB");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6_SIB_IIB_Con_MM c1 = new Assignment6_SIB_IIB_Con_MM();
		System.out.println("This is main method ");

	}

}
