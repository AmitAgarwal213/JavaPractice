package AllAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment20_1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n ;
//		Scanner A1= new Scanner(System.in);
//		System.out.println("enter the value");
//		
//		n=A1.nextInt();
//		for(int i =0;i<n;i++) {
			
		//"Q1)check in the given string how many Special characters are present
		
				int count = 0;
				String s = "Manish123 $# kumar";
				char[] ch = s.toCharArray();
				for (int i = 0; i < s.length(); i++) {
					if (!Character.isDigit(s.charAt(i))&&!Character.isAlphabetic(s.charAt(i)) 
							&&!Character.isSpaceChar(s.charAt(i))){
						count++;
					}
				}
				if (count == 0) {
					System.out.println("No special characters are found ");
				}else {
					System.out.println("Special characters are found "+count);
				}
				
				arrayLength();	
	}
	//Q2)Create a Array of length 5 & int datatype & Store value in it using scanner class"
			
	static void arrayLength() {
					Scanner sc = new Scanner(System.in);
					int[]a=new int[5];
					a[0]=sc.nextInt();
					a[1]=sc.nextInt();
					a[2]=sc.nextInt();
					a[3]=sc.nextInt();
					a[4]=sc.nextInt();
					Arrays.sort(a);
					System.out.println(Arrays.toString(a));
					

			
	}}

	

	
