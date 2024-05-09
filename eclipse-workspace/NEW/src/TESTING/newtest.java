package TESTING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import //org.openqa.selenium.chrome.ChromeOptions;
import //org.openqa.selenium.chromium.ChromiumDriver;

public class newtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("Webdriver.Chrome.driver","C:\\Users\\AMIT AGARWAL\\Desktop\\Chrome drive\\chromedriver_win32.exe");
WebDriver driver = new ChromeDriver();
//Thread.sleep(2500
driver.get("https://www.facebook.com/");
//driver.get("")

}

}
