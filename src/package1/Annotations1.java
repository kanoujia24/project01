package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {
	By ShippingLocator=By.xpath("//a[text()='Shipping & Delivery']");//these xpath written here by creating there object so the in future 
	By ManagingLocator =By.xpath("//a[text()='Managing Your Account ']");//if any mistake thane fix here because finding in 
	By userNameLocator =By.id("twotabsearchtextbox");// whole program is difficult
	By customerLocator=By.xpath("//a[text()='Customer Service']");
	WebDriver driver;// it will be isntant variable for all @test

	@BeforeMethod
	public void browserLunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@AfterMethod
	public void browserClose() {
		driver.close();
	}

	@Test
	public void title() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Shopping"), "tittle is not expecte");
	}

	@Test
	public void verifyShippingDelivery() {
//		WebElement cc = driver.findElement(By.xpath("//a[text()='Customer Service']"));
//		cc.click();//these two line can write as well below line
		driver.findElement(customerLocator).click();
		WebElement ShippingDelivery= driver.findElement(ShippingLocator);//this is use to check that  in customerService
		Assert.assertTrue(ShippingDelivery.isDisplayed(), "cart in not displayed");//page Shipping & Delivery avialble so through wgich we can check
	}   
	@Test
	public void verifyManagingYourAccount() {
	 driver.findElement(customerLocator).click();
		WebElement ManagingYourAccount= driver.findElement( ManagingLocator );//this is use to check that  in customerService
		Assert.assertTrue(ManagingYourAccount.isDisplayed(), "cart in not displayed");//page Shipping & Delivery avialble so through wgich we can check
	}                                       //click on done or not

	@Test
	public void userName() {
		WebElement nm = driver.findElement(userNameLocator);
		nm.sendKeys("deepak");
		Assert.assertTrue(nm.isDisplayed(), "name not wrritten");
	}

}
