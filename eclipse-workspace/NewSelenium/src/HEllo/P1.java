package HEllo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P1 {

	private static final String ExpectedCondtion = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT AGARWAL\\Downloads\\chromedriver_win32\\chromedriver.exe");
new ChromeDriver();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://3.218.23.181:3000/adminpanel/login");
//driver.findElement(By.xpath("//input[@type='email'][1]")).sendKeys("amitaggarwal1213@gmail.com");
//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("11");
//Thread.sleep(5000);
driver.findElement(By.className("forget")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("amit@gmail.com");
driver.findElement(By.cssSelector("button[type='submit']")).click();
driver.findElement(By.xpath("//input[@id='otp_0_ne5wsw7vxaslkmjxque']")).sendKeys("1");
//System.out.println(driver.findElement(By.cssSelector("from p")).getText());
}}
	