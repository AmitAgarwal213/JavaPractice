package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotWithhiglightArea {

	public static void main(String[] args) throws IOException {
	EdgeDriver driver = new EdgeDriver();
	try {
		driver.get("https://www.naukri.com/");
		driver.findElement(By.className("nI-gNb-lg-rg__login")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Sign in with Google']")).click();
		TakesScreenshot b= driver;
		File Source = b.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\gfdgd.jpg");
		FileHandler.copy(Source, destination);
	}catch(Exception e) {
		e.printStackTrace();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", driver.findElement(By.xpath("//span[.='Sign in with Google']")));
		TakesScreenshot b= driver;
		File Source = b.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\gfdgd"+Math.random()+".jpg");
		FileHandler.copy(Source, destination);
}
}}
