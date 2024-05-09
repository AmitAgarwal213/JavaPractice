package AllAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement dd= driver.findElement(By.
	
	//dd.click();
	Select s1= new Select(dd);
	//s1.selectByValue("search-alias=stripbooks");
	s1.selectByIndex(12);
	
}
}
