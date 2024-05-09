package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestion {
public static void main (String[]args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.findElement(By.className("gLFyf")).sendKeys("banglore");
	Thread.sleep(2000);
	//driver.findElement(By.name("q"));
	List<WebElement> a1  = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	
	int count = a1.size();
	System.out.println(count);
	
	a1.get(5).click();
}
}
