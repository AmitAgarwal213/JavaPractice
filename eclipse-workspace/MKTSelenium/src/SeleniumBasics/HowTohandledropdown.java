package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowTohandledropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?");
		WebElement drop_down=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select"));
		//WebElement drop_down = driver.findElement(By.id("nav-search-dropdown-card"));
		
		Select s1= new Select(drop_down);
		s1.selectByVisibleText("Amazon Fresh");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag");
driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	
		
	}

}
