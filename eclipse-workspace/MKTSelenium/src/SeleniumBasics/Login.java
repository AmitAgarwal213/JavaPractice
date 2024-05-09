package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
//driver.findElement(By.className("nav-line-2 "));
driver.findElement(By.className("nav-line-1-container")).click();

	}

}
