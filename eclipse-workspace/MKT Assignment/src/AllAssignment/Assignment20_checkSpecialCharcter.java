//Q1)check in the given string how many Special characters are present
package AllAssignment;

import java.util.Arrays;

public class Assignment20_checkSpecialCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count_alphabet = 0;
		boolean answer;
		String name= "amit@123";
		char a1[]= name.toCharArray();
		for(int i=0;i<name.length();i++) {
			
			answer = Character.isSpaceChar(a1[i]);
		System.out.println(answer);
		if (answer == true) {
			count_alphabet++;
		}
		}
	 System.out.println(count_alphabet);
		
		}
		
}
	


