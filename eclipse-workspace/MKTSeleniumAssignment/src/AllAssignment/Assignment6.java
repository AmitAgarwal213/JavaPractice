package AllAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment6 {
//Program to launch the google and click on Images link
	
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.linkText("Images")).click();
		driver.close();
	}
}
