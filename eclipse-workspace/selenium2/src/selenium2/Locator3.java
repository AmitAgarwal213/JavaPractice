package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator3 {
public static void main(String[]args) throws InterruptedException {
	//WebDriver driver;
	//ChromeDriver driver = new ChromeDriver();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();

	String name= "rahul";
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("name");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	//System.out.println(driver.getTitle());
	//System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
	String text = "Hello rahul,";
	//String test = (driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText());

	
//	if (text==test) {
//	System.out.println("pass");
//}
//	else //h3[@class='LC20lb MBeuO DKV0Md'][1]
//		
//		System.out.println("Fail");
	
	
		
	
	System.out.println(driver.findElement(By.cssSelector("h2")).getText());
//	Thread.sleep(2000);
//driver.quit();

}

private static void Driver() {
	// TODO Auto-generated method stub
	
}
}
