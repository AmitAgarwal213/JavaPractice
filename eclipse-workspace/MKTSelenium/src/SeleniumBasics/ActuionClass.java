package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActuionClass {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement e1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a1=new Actions(driver);
	
	a1.moveToElement(e1).perform();
	
}
}
