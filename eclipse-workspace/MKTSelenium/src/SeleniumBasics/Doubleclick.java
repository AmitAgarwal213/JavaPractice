package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
public static void main (String[]args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("bag");
	Actions a = new Actions(driver);
	
	a.doubleClick(search).perform();
	
}
}
