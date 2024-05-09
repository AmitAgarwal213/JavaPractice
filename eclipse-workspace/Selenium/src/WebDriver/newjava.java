package WebDriver;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class newjava {
	public static void main(String[]arg) { 
	System.setProperty("Webdriver.Chrome.driver","C:\\Users\\AMIT AGARWAL\\Downloads\\chromedriver_win32.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://stackoverflow.com/");
}}
