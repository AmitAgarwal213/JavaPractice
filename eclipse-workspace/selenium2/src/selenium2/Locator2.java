package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator2 {
	void login(int a,String b) {
		//System.out.println()
		String b1 = "rahul";
		String b2 = "rahulshettyacademy";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys());
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		Locator2 login = new Locator2();
		//driver.manage().window().maximize();
		login.login(12345678,"Amit@12345");
		
	}

	private static CharSequence String() {
		// TODO Auto-generated method stub
		return null;
	}

}
