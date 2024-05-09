package WebDriver;

import java.security.cert.PKIXRevocationChecker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class chromeDriver {
public static void main(String[]args){


System.setProperty("Webdriver.Chrome.driver","C:\\Users\\AMIT AGARWAL\\Downloads\\chromedriver_win32.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://stackoverflow.com/");



}
}
