package TestCasess;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeSuite
	public void BS() {
		
	}
	@BeforeTest
	public void BT() {
	}
	@BeforeClass
	public void BC() {
	}
	@BeforeMethod
	public void BM() {

	}
	@Test
	public void test() {
		
	}
	@AfterMethod
	public void AM() {
	}
	@AfterClass
	public void AC() {
	}
	@AfterTest
	public void AT() {
	}}