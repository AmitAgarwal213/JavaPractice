package WebDriver;

//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;

public class FacebookTestCase {
public static void main(String[]args) {
//	System.setProperty("webdriver.Chrome.driver","C:\\\\Users\\\\AMIT AGARWAL\\\\Downloads\\\\chromedriver_win32.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://mail.google.com/mail/u/0/#inbox");
//}
//}
//	
//	
	Scanner sc = new Scanner(System.in);
//	int tableof = sc.nextInt() ;
//	int n = sc.nextInt();
//	for(int i= 1;i<=10;i++) {
//		System.out.println(i);
//		for(int j =1;j<=20;i++)
//			//table = j*i;
//		tableof*=i;
//		System.out.println(tableof);
	int table = 0;
	int n = sc.nextInt();
for(int i=1;i<=10;i++) {
	table*=i;
	System.out.println("tableof "+table);
}
	
	}
	
}