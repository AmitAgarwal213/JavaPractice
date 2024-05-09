package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Locator2 {
public static void main(String[]args) throws Exception {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("amitaggarwal@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	//driver.findElement(By.xpath(""))
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	System.out.println(driver.findElement(By.tagName("h3")).getText());// tagname=CSs selector and //tagname = Xpath
	//Thread.sleep(2000);
	
	

			String text = "Epic sadface: Username and password do not match any user in this service";

			String test=(driver.findElement(By.tagName("h3")).getText());
			//System.out.println(test);
		
			if (text==test)
			{ System.out.println("Match"); 
			}
			else 
				
			
		System.out.println("not match");
			 //driver.close();

}



}

