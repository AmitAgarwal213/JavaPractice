package SeleniumBasics;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	// 1. Write A Code To Select Demo2 Using Select By Visible Text.
	public class Question1 {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://grotechminds.com/dropdown/");
			WebElement dd= driver.findElement(By.id("Choice1"));
			
			Select s1= new Select(dd);
			//s1.selectByVisibleText("Demo2");
			s1.selectByIndex(2);
			//dd.click();
}
}
