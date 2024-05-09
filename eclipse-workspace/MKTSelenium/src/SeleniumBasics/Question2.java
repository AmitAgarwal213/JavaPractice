package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question2 {
	//2. Write A Code To Select SQL 15 Using Select By Value.
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/dropdown/");
	WebElement dd =driver.findElement(By.id("Choice9"));
	
	Select s1= new Select(dd);
	s1.selectByValue("SQL15");
	//Write Codes Separately To Select QTP 10 And Energy 15 Using Select By Visible Text.
	WebElement d2 = driver.findElement(By.id("Choice8"));
	
	Select s2= new Select(d2);
	s2.selectByVisibleText("QTP10");
	d2= driver.findElement(By.id("Choice4"));
	s2.selectByVisibleText("Energy15");
}

}
