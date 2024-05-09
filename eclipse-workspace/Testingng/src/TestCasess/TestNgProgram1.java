package TestCasess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgProgram1 {
	
	WebDriver driver;
		
		@Test
		@Parameters("browser")
		public void launch_browser()
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			WebElement e1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			Actions a1=new Actions(driver);
			
			a1.moveToElement(e1).perform();
		}
			
}
