package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayreverse {
public static void main (String[]args){
	Scanner sc= new Scanner (System.in);
	
	String a[]= new String[5];
	
	String rev = "";
	String output = "";
	for (int i= a.length-1;i>= 0; i--) {
		char rem[]= new char[i];
		rev = a[i]%10+rev;
		System.out.println(Arrays.toString(a));
		
	}}
}
