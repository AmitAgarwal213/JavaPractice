package AllAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement l1 = driver.findElement(By.className("nav-line-1-container"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(l1).perform();
		l1.click();

		WebElement login = driver.findElement(By.xpath("//input[@type='email']"));
		login.click();
		login.sendKeys("amitaggarwal1213@gmail.com");
		driver.findElement(By.id("continue")).click();
		WebElement l2 = driver.findElement(By.xpath("//input[@type='password']"));
		l2.click();
		l2.sendKeys("Amit@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
}
