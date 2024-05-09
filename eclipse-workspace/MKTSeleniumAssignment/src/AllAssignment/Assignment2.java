package AllAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Actions a2= new Actions(driver) ;

	WebElement d1= driver.findElement(By.xpath("//span[.='Fashion']"));
	
	a2.moveToElement(d1).perform();

	 driver.findElement(By.className("_3490ry")).click();
//	Select s1= new Select(s2);
//	s1.selectByVisibleText("Men's T-Shirts");
//  	
	
	
}
}
