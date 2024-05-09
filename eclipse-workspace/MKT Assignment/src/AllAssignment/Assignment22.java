// Q2)If the number divisible by 3 print frog ,If the number divisible by 5 print cat , If the number divisible by both 3&5 then print frog & cat
package AllAssignment;

public class Assignment22 {

	public static void main(String[] args) {

		String StudentName[]= new String[5];
		StudentName[0]= "Amit";
		StudentName[1]= "Mohit";
		StudentName[2]= "Adhya";
		StudentName[3]= "salini";
		StudentName[4]= "Shyam";
		int RollNumber[]= new int [5] ;
		RollNumber[0]= 1;
		RollNumber[1] = 12;
		RollNumber[2]= 23;
		RollNumber[3] = 24;
		RollNumber[4]= 26;
		char Gender[]= new char[5];
		Gender[0]= 'M';
		Gender[1]= 'M';
		Gender[2]= 'F';
		Gender[3]= 'F';
		Gender[4]= 'M';
		long MobileNumber[]= new long[5];
		MobileNumber[0]= 3313;
		MobileNumber[1]= 5335;
		MobileNumber[2]= 2522;
		MobileNumber[3]= 5525;
		MobileNumber[4]= 5255;
		System.out.println("StudentName " + " "+ StudentName[0]+" "+StudentName[1]+ " "+StudentName[2]+" "+StudentName[3]+" "+ StudentName[4] );
		System.out.println("RollNumber" +   "    "+RollNumber[0]+"   "+ RollNumber[1]+"    "+RollNumber[2]+"     "+ RollNumber[3]+"      "+RollNumber[4]);
		System.out.println("Gender" + "        "+Gender[0]+"    "+Gender[1]+"    "+ Gender[2]+ "       "+Gender[3]+"      "+Gender[4]);
		System.out.println("MobileNumber" +"  "+MobileNumber[0]+"  "+MobileNumber[1]+ "  "+MobileNumber[2]+"  "+ MobileNumber[3]+"  "+MobileNumber[4]);
	}

}
