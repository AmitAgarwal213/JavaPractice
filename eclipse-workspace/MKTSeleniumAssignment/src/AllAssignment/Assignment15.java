package AllAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assignment15 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement hover = driver.findElement(By.className("nav-a  "));
Actions a = new Actions(driver);	
a.moveToElement(hover);
hover.click();

}
}
