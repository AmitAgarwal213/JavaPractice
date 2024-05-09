package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickOnGmail {
public static void main(String[]args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement rightclick= driver.findElement(By.linkText("Gmail"));
	Actions a= new Actions(driver);
	a.contextClick(rightclick).perform();
	Thread.sleep(10000);
	driver.close();
}
}
