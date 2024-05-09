package WebDriver;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[]args) throws Exception {


		System.setProperty("webdriver.Chrome.driver","C:\\Users\\AMIT AGARWAL\\Downloads\\chromedriver_win32.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		driver.get("https://www.ecatering.irctc.co.in/login	");
//driver.findElements(By.xpath("https://www.ecatering.irctc.co.in/login"));
//driver.findElement(By.cssSelector("button[type='button']")).click();

driver.findElement(By.name("mobileNum")).sendKeys("9650472430");

driver.findElement(By.cssSelector("input[type='email']")).sendKeys("amitaggarwal1213@gmail.com");
driver.findElement(By.cssSelector("button[type='submit']")).click();
//driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Amit Agarwal");
//driver.findElement(By.name("mobileNum")).sendKeys("9650472430");
//driver.findElement(By.name("email")).sendKeys("amitaggarwal1213@gmail.com");
//driver.findElement(By.cssSelector("button[type='submit']")).click();


System.out.println(driver.findElement(By.xpath("//div[@class='text-sm mt-10 text-alert-primary']")).getText());
//Thread.sleep(1000);
//System.out.println(driver.findElement(By.cssSelector("div.text-sm.mt-10.text-alert-primary")).getText());


		}
		}	

