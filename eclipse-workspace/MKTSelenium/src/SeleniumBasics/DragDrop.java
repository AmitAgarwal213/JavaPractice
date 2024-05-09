package SeleniumBasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement dragdrop= driver.findElement(By.id("div1"));
	WebElement dropdrag= 	driver.findElement(By.id("div1"));
	Actions a1= new Actions(driver);
		a1.dragAndDrop(dragdrop, dropdrag);
		//System.out.println(a1);
	
	}

}
