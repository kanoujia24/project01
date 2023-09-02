package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class timeWait1 {
	WebDriver driver;
	@BeforeTest
	public void broserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		}
	@Test
	public void searchBox() {
	WebElement searchBox=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	searchBox.sendKeys("deepak");
	Assert.assertTrue(searchBox.isDisplayed(),"cart is not clickable");
		
	}
	@Test
	public void Box() {
	WebElement Box=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	Box.clear();
	Assert.assertTrue(Box.isDisplayed(),"cart is not clickable");
	}

}
