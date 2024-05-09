package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/?");
WebElement s1= driver.findElement(By.id("twotabsearchtextbox"));
s1.sendKeys("india");
s1.sendKeys(Keys.ENTER);



	}

}
