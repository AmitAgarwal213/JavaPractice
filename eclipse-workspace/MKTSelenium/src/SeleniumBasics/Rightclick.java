package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	Actions a= new Actions(driver);
	a.contextClick().perform();
	
	
	
}
}
