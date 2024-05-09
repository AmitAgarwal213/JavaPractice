package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List <WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println(AllLinks.size());
		for(int i=0;i<AllLinks.size()-1;i++) {
			WebElement a1= AllLinks.get(i);
			String url= a1.getText();
			System.out.println(url);
		}
		

	}

}
