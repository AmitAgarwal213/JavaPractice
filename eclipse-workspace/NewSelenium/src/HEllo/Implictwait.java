package HEllo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author AMIT AGARWAL
 *
 */
public class Implictwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.Chrome.driver","C:\\Users\\AMIT AGARWAL\\Downloads\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("amit@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("124567");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		//String title = driver.getTitle();
       System.out.println("Page title is : " + driver.getTitle());
//driver.quit();
//		Thread.sleep(6);
//		driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
//		//driver.findElement(By.xpath("//span[@class=\"ctp-label\"]")).click();
//		//Thread.sleep(3);
		//driver.findElement(By.id("cf-stage")).click();
  
       
	}

}
