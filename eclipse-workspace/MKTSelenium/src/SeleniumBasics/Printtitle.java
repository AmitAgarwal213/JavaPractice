package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Printtitle {
	public static void main(String[] args) {
		
	
ChromeDriver driver = new ChromeDriver();
//driver.get("https://grotechminds.com/dropdow");
driver.get("https://www.flipkart.com/");
//System.out.println(driver.getTitle());
System.out.println(driver.getTitle());
driver.close();
}
}