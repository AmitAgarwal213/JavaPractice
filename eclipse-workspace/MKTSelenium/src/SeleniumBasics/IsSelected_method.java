package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_method{
	public static void main(String[] args) {
		
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/AMIT%20AGARWAL/Downloads/learningHTML1.html");
	WebElement un= driver.findElement(By.xpath("/html/body/input[1]"));
	un.sendKeys("amit@gmail.com");
	WebElement pass= driver.findElement(By.xpath("/html/body/input[3]"));
	pass.sendKeys("Amithahha");
	System.out.println(un.isSelected());
	//driver.get("https://admin.goochil.com/adminpanel/layout/refund-mgmt");
	driver.getTitle();
	
	
	
	
	
	}

}
