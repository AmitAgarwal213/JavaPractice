package intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Writetestcase {
public static void main(String[]args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT AGARWAL\\Desktop\\Chrome\\chromedriver_win32 (2).exe");
	//ChromeDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new EdgeDriver();

	//new ChromeDriver();
	

	//WebDriver driver = new WebDriver();
	
	driver.get("https://webmail.fluper.in/");

}
}
