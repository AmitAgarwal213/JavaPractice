package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowser {
	WebDriver driver;
@Test
@Parameters("browser")

public void Launch_Browser(String nameofbrowser) {
	if (nameofbrowser.equals("Chrome")) {
		 driver = new ChromeDriver();
	}
	if (nameofbrowser.equals("Edge")) {
		 driver = new EdgeDriver();
	}
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement e1= driver.findElement(By.xpath("//input[@type=\"text\"]"));
			 e1.sendKeys("india");
	
	e1.sendKeys(Keys.ENTER);
	}
}
