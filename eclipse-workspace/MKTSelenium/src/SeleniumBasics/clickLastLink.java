package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class clickLastLink {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
WebElement Search = driver.findElement(By.name("q"));
Search.sendKeys("india");
Thread.sleep(1000);
List<WebElement> a1 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
int count = a1.size();
System.out.println(count);
 a1.get(count-1).click();
 
TakesScreenshot t1 = driver;
File source = t1.getScreenshotAs(OutputType.FILE);
//File destination = new File("C:\\Users\\AMIT AGARWAL\\Desktop\\Animal\\amit.jpg");
File destination = new File("C:\\Users\\AMIT AGARWAL\\Desktop\\Animal\\amit"+Math.random()+".jpg");
FileHandler.copy(source,destination);

	
}
}
