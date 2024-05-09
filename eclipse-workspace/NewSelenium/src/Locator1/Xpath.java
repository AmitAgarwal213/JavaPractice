package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {
	public static void main(String[]args) {
		//new ChromeDriver();
	WebDriver driver = new EdgeDriver();	
	driver.get("http://3.218.23.181:3000/adminpanel/login");
driver.findElement(By.xpath("//input[@type='email'][1]")).sendKeys("amit@gmail.com");
driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("12345678");
	System.out.println("the title of the page is: "   +driver.getTitle());
	}

}
