//Write an Absolute xpath and relative xpath for the html file(shared my Manish) for all the fields
package AllAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/AMIT%20AGARWAL/Downloads/learningHTML1.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Amit Agarwal");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Amit@12334");
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("Amit");
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("Agarwal");
	driver.findElement(By.xpath("/html/body/input[4]")).click();
	
//	Select s1= new Select(radio);
//	s1.se
//								driver.findElement(By.xpath
//										driver.findElement(By.xpath
						
					//	Select S2 = new Select();
	}

}
