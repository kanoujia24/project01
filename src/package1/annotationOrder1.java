 package package1;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationOrder1 {
	WebDriver driver;

	@BeforeMethod
	public void browserLunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

	@AfterMethod
	public void After() {
		driver.quit();
		System.out.println("after method");
	}
	@BeforeClass
     public void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
    public void afterClass() {
		System.out.println("AfterClass");
	}
	@BeforeTest
    public void beforeTest() {
		System.out.println("before test");
	}
	@AfterTest
   public void afterTest() {
		System.out.println("After test");
	}
	@BeforeSuite
    public void beforeSuite() {
		System.out.println("Before Suite ");
	}
	@AfterSuite
   public void afterSuite() {
		System.out.println("After suite");
	}
	@Test(priority=1)//,invocationCount=5)//invocationCount is use to run as you time  required .
	public void firstmathed() {
		System.out.println("1 test mathed");//if you want to run mathed according to your priority then use PRIORITY attribute
		//Assert.assertTrue(false);
	}

	@Test(priority=2)//,dependsOnMethods="firstmathed")//if firstmathed() is failed then this mathe will not run
	public void secondmathed() {    //if firstmathed() is true/run this will also run because this one depends on firstmathed() mathe
		System.out.println("2 test mathed");
	}

	@Test(priority=3)//,enabled=false)//when there is same error in code, code does not running then use ENABLED attribute for not using the code
	public void thirdmathed() {
		System.out.println("3 test mathed");
	}

	@Test(priority=4)//,alwaysRun=true,expectedExceptions=NoSuchElementException.class)//in any condition u want to run any code then use ALWAYSRUN attribute
	public void fourthmathed() {//expectedExceptions attribute use when you any exception will come thwn u write the name of exception
		System.out.println("4 test mathed");//then excption will avoided and program will executed
	}

}
