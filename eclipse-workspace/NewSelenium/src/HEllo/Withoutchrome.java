package HEllo;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.GeckoDriverInfo;
public class Withoutchrome {
public static void main (String[]args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("www.gmail.com");
	
	
}
}
